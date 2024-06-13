package MultithreadingConcepts;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {
    private static final Logger logger = LogManager.getLogger(ThreadPoolExample.class.getName());

    public void executeTasks() {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for (int i = 1; i <= 5; i++) {
            int taskNumber = i;
            executorService.submit(() -> {
                logger.info("Task " + taskNumber + " is running.");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    logger.error("Task " + taskNumber + " interrupted.", e);
                }
                logger.info("Task " + taskNumber + " is completed.");
            });
        }

        executorService.shutdown();
    }
}
