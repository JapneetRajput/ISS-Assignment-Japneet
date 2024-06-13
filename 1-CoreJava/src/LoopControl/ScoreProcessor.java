package LoopControl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// Class to process student scores
public class ScoreProcessor {

    private static final Logger logger = LogManager.getLogger(ScoreProcessor.class.getName());

    // Instance variable to store student scores
    private int[] studentScores;

    // Constructor to initialize the ScoreProcessor object with student scores
    public ScoreProcessor(int[] studentScores) {
        this.studentScores = studentScores;
    }

    // Method to process the scores
    public void processScores() {
        if (studentScores == null || studentScores.length == 0) {
            logger.error("No student scores provided.");
            return;
        }

        int totalScore = 0;
        int highestScore = Integer.MIN_VALUE;
        int lowestScore = Integer.MAX_VALUE;
        int passCount = 0;
        int failCount = 0;

        // Loop through the scores to calculate total, highest, lowest, pass, and fail counts
        for (int score : studentScores) {
            totalScore += score;

            if (score > highestScore) {
                highestScore = score;
            }

            if (score < lowestScore) {
                lowestScore = score;
            }

            if (score >= 50) {
                passCount++;
            } else {
                failCount++;
            }
        }

        // Calculate the average score
        double averageScore = (double) totalScore / studentScores.length;

        // Log the results
        logger.info("Average Score: " + averageScore);
        logger.info("Highest Score: " + highestScore);
        logger.info("Lowest Score: " + lowestScore);
        logger.info("Number of Students Passed: " + passCount);
        logger.info("Number of Students Failed: " + failCount);
    }
}
