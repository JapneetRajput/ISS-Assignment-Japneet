package LoopControl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    // Logger to store logs instead of using System.out.print
    private static final Logger logger = LogManager.getLogger(Main.class.getName());

    public static void main(String[] args) {
        // Array of student scores
        int[] studentScores = {85, 78, 92, 45, 67, 88, 76, 59, 90, 40, 55};

        // Process the scores
        ScoreProcessor scoreProcessor = new ScoreProcessor(studentScores);
        scoreProcessor.processScores();

        // Array of numbers to analyze
        int[] numbers = {2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Analyze the numbers
        NumberAnalyzer numberAnalyzer = new NumberAnalyzer(numbers);
        numberAnalyzer.analyzeNumbers();
    }
}
