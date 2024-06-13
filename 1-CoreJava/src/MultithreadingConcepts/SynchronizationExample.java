package MultithreadingConcepts;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SynchronizationExample {
    private static final Logger logger = LogManager.getLogger(SynchronizationExample.class.getName());

    public synchronized void synchronizedMethod(String threadName) {
        for (int i = 1; i <= 5; i++) {
            logger.info(threadName + " - synchronizedMethod: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                logger.error(threadName + " interrupted in synchronizedMethod.", e);
            }
        }
    }

    public void synchronizedBlock(String threadName) {
        synchronized (this) {
            for (int i = 1; i <= 5; i++) {
                logger.info(threadName + " - synchronizedBlock: " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    logger.error(threadName + " interrupted in synchronizedBlock.", e);
                }
            }
        }
    }
}
