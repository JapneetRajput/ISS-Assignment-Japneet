package FileOperations;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FileUtil {

    private static final Logger logger = LogManager.getLogger(FileUtil.class);

    public static String readFile(String filePath) {
        StringBuilder content = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
            logger.info("Successfully read file: " + filePath);
            return content.toString().trim(); // Remove trailing newline

        } catch (IOException e) {
            logger.error("Error reading file: " + e.getMessage());
            return null;
        }
    }

    public static boolean writeToFile(String filePath, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(content);
            logger.info("Successfully wrote content to file: " + filePath);
            return true;

        } catch (IOException e) {
            logger.error("Error writing to file: " + e.getMessage());
            return false;
        }
    }

    public static boolean appendToFile(String filePath, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) { // Append mode
            writer.write(content);
            logger.info("Successfully appended content to file: " + filePath);
            return true;

        } catch (IOException e) {
            logger.error("Error appending to file: " + e.getMessage());
            return false;
        }
    }

    public static boolean copyFile(String sourcePath, String destinationPath) {
        try {
            Files.copy(Paths.get(sourcePath), Paths.get(destinationPath));
            logger.info("Successfully copied file: " + sourcePath + " to " + destinationPath);
            return true;
        } catch (IOException e) {
            logger.error("Error copying file: " + e.getMessage());
            return false;
        }
    }

    public static boolean deleteFile(String filePath) {
        try {
            Files.delete(Paths.get(filePath));
            logger.info("Successfully deleted file: " + filePath);
            return true;
        } catch (IOException e) {
            logger.error("Error deleting file: " + e.getMessage());
            return false;
        }
    }
}
