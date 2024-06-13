package JsonHandling;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;

public class JsonStringOperations {
    private static final Logger logger = LogManager.getLogger(JsonStringOperations.class.getName());
    private static final ObjectMapper objectMapper = new ObjectMapper();

    public String convertStudentToJsonString(Student student) {
        try {
            String jsonString = objectMapper.writeValueAsString(student);
            logger.info("Converted student to JSON string: " + jsonString);
            return jsonString;
        } catch (JsonProcessingException e) {
            logger.error("Error converting student to JSON string", e);
            return null;
        }
    }

    public Student parseJsonStringToStudent(String jsonString) {
        try {
            Student student = objectMapper.readValue(jsonString, Student.class);
            logger.info("Parsed JSON string to student: " + student);
            return student;
        } catch (IOException e) {
            logger.error("Error parsing JSON string to student", e);
            return null;
        }
    }
}
