package s03_thread_coordination;

/**
 * Thread Termination & Daemon Threads

 */
public class ThreadTest {
    public static void main(String [] args) throws InterruptedException {
        Thread thread = new Thread(new BlockingTask());

        thread.start();
        Thread.sleep(2000);
        thread.interrupt();
    }

    private static class BlockingTask implements Runnable {

        @Override
        public void run() {
            //do things
            try {
                Thread.sleep(500000);
            } catch (InterruptedException e) {
                System.out.println("Exiting blocking thread");
            }
        }
    }
}
