package ExceptionHandling;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ExceptionHandlingDemo {

    // Logger to store logs instead of using System.out.print
    private static final Logger logger = LogManager.getLogger(ExceptionHandlingDemo.class.getName());

    // Method to demonstrate handling exceptions
    public void demonstrateHandling() {
        try {
            int result = divide(10, 0); // This will throw ArithmeticException
            logger.info("Result: " + result);
        } catch (ArithmeticException e) {
            logger.error("Caught ArithmeticException: " + e.getMessage());
        } finally {
            logger.info("Finally block executed");
        }
    }

    // Method to divide two numbers
    private int divide(int a, int b) {
        return a / b;
    }
}
