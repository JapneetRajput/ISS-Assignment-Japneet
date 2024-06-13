package CollectionOperations;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.Map;

public class MapOperations {
    // Logger to store logs instead of using System.out.print
    private static final Logger logger = LogManager.getLogger(MapOperations.class.getName());

    // Method to demonstrate operations on a Map of Students
    public void demonstrateMapOperations() {
        Map<Student, Student> studentMap = new HashMap<>();
        Student student1 = new Student(1, "Alice");
        Student student2 = new Student(2, "Bob");
        Student student3 = new Student(3, "Charlie");

        studentMap.put(student1, student2); // Alice is paired with Bob
        studentMap.put(student2, student3); // Bob is paired with Charlie

        // Logging all entries in the map
        logger.info("Student Map: " + studentMap);

        // Getting a value from the map
        Student partnerOfAlice = studentMap.get(student1);
        logger.info("Partner of Alice: " + partnerOfAlice);

        // Removing an entry from the map
        studentMap.remove(student2);
        logger.info("After removing Bob's entry: " + studentMap);

        // Checking if a key is in the map
        boolean containsAlice = studentMap.containsKey(student1);
        logger.info("Map contains Alice: " + containsAlice);
    }
}
