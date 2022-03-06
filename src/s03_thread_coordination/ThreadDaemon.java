package s03_thread_coordination;

import java.math.BigInteger;

/**
 * Thread Termination & Daemon Threads
 */
public class ThreadDaemon {

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new LongComputationTask(new BigInteger("200"), new BigInteger("100000")));

        thread.setDaemon(true);
        //Thread.sleep(1000); //put main thread to sleep till we get result from daemon
        thread.start();
        //thread.interrupt();
        thread.join();
        System.out.println("main thread stopped");
    }

    private static class LongComputationTask implements Runnable {
        private BigInteger base;
        private BigInteger power;

        public LongComputationTask(BigInteger base, BigInteger power) {
            this.base = base;
            this.power = power;
        }

        @Override
        public void run() {
            System.out.println(base + "^" + power + " = " + pow(base, power));
        }

        private BigInteger pow(BigInteger base, BigInteger power) {
            BigInteger result = BigInteger.ONE;

            for (BigInteger i = BigInteger.ZERO; i.compareTo(power) != 0; i = i.add(BigInteger.ONE)) {
                result = result.multiply(base);
                if(Thread.interrupted()){
                    return BigInteger.ZERO;
                }
            }

            return result;
        }
    }
}
