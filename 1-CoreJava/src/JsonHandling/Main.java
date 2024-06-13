package JsonHandling;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class.getName());

    public static void main(String[] args) {
        try {
            // Creating a Student object
            Student student = new Student(2, "Japneet Rajput", 22);

            // JSON file operations
            JsonFileOperations jsonFileOperations = new JsonFileOperations();
            String filePath = "student.json";

            // Writing student object to JSON file
            jsonFileOperations.writeStudentToFile(student, filePath);

            // Reading student object from JSON file
            Student readStudent = jsonFileOperations.readStudentFromFile(filePath);

            // JSON string operations
            JsonStringOperations jsonStringOperations = new JsonStringOperations();

            // Converting student object to JSON string
            String jsonString = jsonStringOperations.convertStudentToJsonString(student);

            // Parsing JSON string to student object
            Student parsedStudent = jsonStringOperations.parseJsonStringToStudent(jsonString);

        } catch (Exception e) {
            logger.error("An unexpected error occurred", e);
        }
    }
}
