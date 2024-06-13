package FileOperations;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        String filePath = "src\\FileOperations\\data.txt";
        String contentToWrite = "This is some sample content to write to the file.";

        // Write to file
        if (FileUtil.writeToFile(filePath, contentToWrite)) {
            logger.info("Successfully wrote content to file.");
        } else {
            logger.error("Error writing to file.");
        }

        // Read from file
        String content = FileUtil.readFile(filePath);
        if (content != null) {
            System.out.println("File Content:\n" + content);
        } else {
            logger.error("Error reading file.");
        }

        // Append to file
        String contentToAppend = "\nThis is appended content.";
        if (FileUtil.appendToFile(filePath, contentToAppend)) {
            logger.info("Successfully appended content to file.");
        } else {
            logger.error("Error appending to file.");
        }

        // Copy file
        String newFilePath = "src\\FileOperations\\data_copy.txt";
        if (FileUtil.copyFile(filePath, newFilePath)) {
            logger.info("Successfully copied file.");
        } else {
            logger.error("Error copying file.");
        }

        // **Optional: Delete file**
        // if (FileUtil.deleteFile(filePath)) {
        //     logger.info("Successfully deleted file: " + filePath);
        // } else {
        //     logger.error("Error deleting file: " + filePath);
        // }
    }
}