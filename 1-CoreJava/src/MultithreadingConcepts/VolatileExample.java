package MultithreadingConcepts;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class VolatileExample {
    private static final Logger logger = LogManager.getLogger(VolatileExample.class.getName());

    private volatile boolean running = true;

    public void start() {
        Thread thread = new Thread(() -> {
            while (running) {
                logger.info("Thread is running...");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    logger.error("Thread interrupted.", e);
                }
            }
            logger.info("Thread has stopped.");
        });
        thread.start();
    }

    public void stop() {
        running = false;
        logger.info("Thread stop signal sent.");
    }
}
