package StringsAndArrays;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class StringOperations {

    // Logger to store logs instead of using System.out.print
    private static Logger logger = LogManager.getLogger(StringOperations.class.getName());

    // Method to reverse a string
    public String reverseString(String input) {
        logger.info("Reversing string: " + input);
        StringBuilder reversedString = new StringBuilder(input);
        return reversedString.reverse().toString();
    }

    // Method to count the number of vowels in a string
    public int countVowels(String input) {
        logger.info("Counting vowels in string: " + input);
        int count = 0;
        String vowels = "AEIOUaeiou";
        for (char ch : input.toCharArray()) {
            if (vowels.indexOf(ch) != -1) {
                count++;
            }
        }
        return count;
    }

    // Method to check if a string is a palindrome
    public boolean isPalindrome(String input) {
        logger.info("Checking if string is a palindrome: " + input);
        String reversedString = reverseString(input);
        return input.equals(reversedString);
    }

    // Method to concatenate two strings
    public String concatenateStrings(String str1, String str2) {
        logger.info("Concatenating strings: " + str1 + " and " + str2);
        return str1 + str2;
    }

    // Method to find a substring within a string
    public boolean containsSubstring(String mainString, String substring) {
        logger.info("Checking if '" + mainString + "' contains substring: " + substring);
        return mainString.contains(substring);
    }
}
