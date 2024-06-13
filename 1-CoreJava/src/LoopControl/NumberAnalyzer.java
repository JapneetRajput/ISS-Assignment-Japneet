package LoopControl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// Class to analyze numbers
public class NumberAnalyzer {

    private static final Logger logger = LogManager.getLogger(NumberAnalyzer.class.getName());

    // Instance variable to store numbers
    private int[] numbers;

    // Constructor to initialize the NumberAnalyzer object with numbers
    public NumberAnalyzer(int[] numbers) {
        this.numbers = numbers;
    }

    // Method to analyze the numbers
    public void analyzeNumbers() {
        if (numbers == null || numbers.length == 0) {
            logger.error("No numbers provided.");
            return;
        }

        // Loop through the numbers using a for loop
        for (int number : numbers) {
            // Determine if the number is even or odd
            if (number % 2 == 0) {
                logger.info(number + " is even.");
            } else {
                logger.info(number + " is odd.");
            }

            // Check if the number is prime
            if (isPrime(number)) {
                logger.info(number + " is a prime number.");
            } else {
                logger.info(number + " is not a prime number.");
            }

            // Calculate the factorial of the number using a while loop
            logger.info("Factorial of " + number + " is " + factorial(number) + ".");
        }
    }

    // Method to check if a number is prime
    private boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Method to calculate the factorial of a number
    private long factorial(int number) {
        long result = 1;
        int i = number;

        // Using a do-while loop to calculate factorial
        do {
            result *= i;
            i--;
        } while (i > 0);

        return result;
    }
}
