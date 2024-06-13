package ExceptionHandling;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ExceptionHierarchyDemo {

    // Logger to store logs instead of using System.out.print
    private static final Logger logger = LogManager.getLogger(ExceptionHierarchyDemo.class.getName());

    // Method to demonstrate hierarchy of exceptions
    public void demonstrateHierarchy() {
        try {
            int[] numbers = new int[5];
            logger.info("Accessing out of bounds index");
            logger.info("Number: " + numbers[10]); // This will throw ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            logger.error("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (IndexOutOfBoundsException e) {
            logger.error("Caught IndexOutOfBoundsException: " + e.getMessage());
        } catch (Exception e) {
            logger.error("Caught Exception: " + e.getMessage());
        }
    }
}
