package MultithreadingConcepts;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class.getName());

    public static void main(String[] args) {
        // Demonstrating basic threading
        SimpleThread thread1 = new SimpleThread("Thread-1");
        SimpleThread thread2 = new SimpleThread("Thread-2");
        thread1.start();
        thread2.start();

        // Demonstrating thread pool executor
        ThreadPoolExample threadPoolExample = new ThreadPoolExample();
        threadPoolExample.executeTasks();

        // Demonstrating volatile keyword usage
        VolatileExample volatileExample = new VolatileExample();
        volatileExample.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            logger.error("Main thread interrupted.", e);
        }
        volatileExample.stop();

        // Demonstrating thread safety with instance and local variables
        ThreadSafeExample threadSafeExample = new ThreadSafeExample();
        Thread instanceThread1 = new Thread(threadSafeExample::incrementInstanceVariable, "InstanceThread-1");
        Thread instanceThread2 = new Thread(threadSafeExample::incrementInstanceVariable, "InstanceThread-2");
        instanceThread1.start();
        instanceThread2.start();

        Thread localThread1 = new Thread(threadSafeExample::incrementLocalVariable, "LocalThread-1");
        Thread localThread2 = new Thread(threadSafeExample::incrementLocalVariable, "LocalThread-2");
        localThread1.start();
        localThread2.start();

        // Demonstrating method and block synchronization
        SynchronizationExample synchronizationExample = new SynchronizationExample();
        Thread syncMethodThread1 = new Thread(() -> synchronizationExample.synchronizedMethod("SyncMethodThread-1"));
        Thread syncMethodThread2 = new Thread(() -> synchronizationExample.synchronizedMethod("SyncMethodThread-2"));
        syncMethodThread1.start();
        syncMethodThread2.start();

        Thread syncBlockThread1 = new Thread(() -> synchronizationExample.synchronizedBlock("SyncBlockThread-1"));
        Thread syncBlockThread2 = new Thread(() -> synchronizationExample.synchronizedBlock("SyncBlockThread-2"));
        syncBlockThread1.start();
        syncBlockThread2.start();
    }
}
