package MultithreadingConcepts;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ThreadSafeExample {
    private static final Logger logger = LogManager.getLogger(ThreadSafeExample.class.getName());

    private int counter = 0;

    public void incrementInstanceVariable() {
        synchronized (this) {
            counter++;
            logger.info("Counter (Instance): " + counter);
        }
    }

    public void incrementLocalVariable() {
        int localCounter = 0;
        for (int i = 0; i < 5; i++) {
            localCounter++;
            logger.info("Counter (Local): " + localCounter);
        }
    }
}
