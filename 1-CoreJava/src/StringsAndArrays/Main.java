package StringsAndArrays;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    // Logger to store logs instead of using System.out.print
    private static Logger logger = LogManager.getLogger(Main.class.getName());

    public static void main(String[] args) {
        // Creating objects of StringOperations and ArrayOperations classes
        StringOperations stringOps = new StringOperations();
        ArrayOperations arrayOps = new ArrayOperations();

        // String operations
        String testString = "HelloWorld";
        logger.info("Original String: " + testString);
        logger.info("Reversed String: " + stringOps.reverseString(testString));
        logger.info("Number of Vowels: " + stringOps.countVowels(testString));
        logger.info("Is Palindrome: " + stringOps.isPalindrome(testString));
        logger.info("Concatenated String: " + stringOps.concatenateStrings(testString, "123"));
        logger.info("Contains 'World': " + stringOps.containsSubstring(testString, "World"));

        // Array operations
        int[] testArray = {10, 5, 3, 9, 2};
        logger.info("Original Array: " + java.util.Arrays.toString(testArray));
        logger.info("Maximum Value: " + arrayOps.findMax(testArray));
        logger.info("Minimum Value: " + arrayOps.findMin(testArray));
        logger.info("Average Value: " + arrayOps.calculateAverage(testArray));
        logger.info("Contains 9: " + arrayOps.searchElement(testArray, 9));
        logger.info("Sorted Array: " + java.util.Arrays.toString(arrayOps.sortArray(testArray)));
    }
}
