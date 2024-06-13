package ExceptionHandling;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ThrowVsThrowsDemo {

    // Logger to store logs instead of using System.out.print
    private static final Logger logger = LogManager.getLogger(ThrowVsThrowsDemo.class.getName());

    // Method to demonstrate throw vs throws
    public void demonstrateThrowVsThrows() {
        try {
            validateAge(15); // This will throw CustomException
        } catch (CustomException e) {
            logger.error("Caught CustomException: " + e.getMessage());
        }
    }

    // Method to validate age, throws CustomException if age is less than 18
    private void validateAge(int age) throws CustomException {
        if (age < 18) {
            throw new CustomException("Age must be at least 18");
        }
        logger.info("Age is valid");
    }
}
