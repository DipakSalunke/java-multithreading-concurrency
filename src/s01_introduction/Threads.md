##NEW
**public static final Thread.State NEW**  
Thread state for a thread which has not yet started.
##RUNNABLE
**public static final Thread.State RUNNABLE**  
Thread state for a runnable thread. A thread in the runnable state is executing in the Java virtual machine but it may be waiting for other resources from the operating system such as processor.
##BLOCKED
**public static final Thread.State BLOCKED**  
Thread state for a thread blocked waiting for a monitor lock. A thread in the blocked state is waiting for a monitor lock to enter a synchronized block/method or reenter a synchronized block/method after calling Object.wait.
##WAITING
**public static final Thread.State WAITING**  
Thread state for a waiting thread. A thread is in the waiting state due to calling one of the following methods:
Object.wait with no timeout  
Thread.join with no timeout  
LockSupport.park  
A thread in the waiting state is waiting for another thread to perform a particular action. For example, a thread that has called Object.wait() on an object is waiting for another thread to call Object.notify() or Object.notifyAll() on that object. A thread that has called Thread.join() is waiting for a specified thread to terminate.

##TIMED_WAITING
**public static final Thread.State TIMED_WAITING**  
Thread state for a waiting thread with a specified waiting time. A thread is in the timed waiting state due to calling one of the following methods with a specified positive waiting time:
Thread.sleep  
Object.wait with timeout  
Thread.join with timeout  
LockSupport.parkNanos  
LockSupport.parkUntil  

**##TERMINATED
public static final Thread.State TERMINATED**  
Thread state for a terminated thread. The thread has completed execution.  


##Linux 2.6 Completely Fair Scheduler

![](../../../../../AppData/Local/Temp/figure1.gif)