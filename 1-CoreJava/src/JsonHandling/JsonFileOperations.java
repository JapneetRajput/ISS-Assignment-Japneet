package JsonHandling;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;

public class JsonFileOperations {
    private static final Logger logger = LogManager.getLogger(JsonFileOperations.class.getName());
    private static final ObjectMapper objectMapper = new ObjectMapper();

    public void writeStudentToFile(Student student, String filePath) {
        try {
            objectMapper.writeValue(new File(filePath), student);
            logger.info("Student data written to file: " + filePath);
        } catch (IOException e) {
            logger.error("Error writing student data to file: " + filePath, e);
        }
    }

    public Student readStudentFromFile(String filePath) {
        try {
            Student student = objectMapper.readValue(new File(filePath), Student.class);
            logger.info("Student data read from file: " + student);
            return student;
        } catch (IOException e) {
            logger.error("Error reading student data from file: " + filePath, e);
            return null;
        }
    }
}
