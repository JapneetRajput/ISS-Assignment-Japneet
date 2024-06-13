package MultithreadingConcepts;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SimpleThread extends Thread {
    private static final Logger logger = LogManager.getLogger(SimpleThread.class.getName());

    private String threadName;

    public SimpleThread(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            logger.info(threadName + " - Count: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                logger.error(threadName + " interrupted.", e);
            }
        }
    }
}
