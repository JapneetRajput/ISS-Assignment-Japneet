package StringsAndArrays;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class ArrayOperations {

    // Logger to store logs instead of using System.out.print
    private static Logger logger = LogManager.getLogger(ArrayOperations.class.getName());

    // Method to find the maximum value in an array
    public int findMax(int[] array) {
        logger.info("Finding maximum value in array: " + Arrays.toString(array));
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // Method to find the minimum value in an array
    public int findMin(int[] array) {
        logger.info("Finding minimum value in array: " + Arrays.toString(array));
        int min = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    // Method to calculate the average of values in an array
    public double calculateAverage(int[] array) {
        logger.info("Calculating average of array: " + Arrays.toString(array));
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (double) sum / array.length;
    }

    // Method to search for an element in an array
    public boolean searchElement(int[] array, int element) {
        logger.info("Searching for element " + element + " in array: " + Arrays.toString(array));
        for (int num : array) {
            if (num == element) {
                return true;
            }
        }
        return false;
    }

    // Method to sort an array
    public int[] sortArray(int[] array) {
        logger.info("Sorting array: " + Arrays.toString(array));
        int[] sortedArray = Arrays.copyOf(array, array.length);
        Arrays.sort(sortedArray);
        return sortedArray;
    }
}
