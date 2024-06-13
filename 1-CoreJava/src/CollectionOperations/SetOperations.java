package CollectionOperations;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashSet;
import java.util.Set;

public class SetOperations {
    // Logger to store logs instead of using System.out.print
    private static final Logger logger = LogManager.getLogger(SetOperations.class.getName());

    // Method to demonstrate operations on a Set of Students
    public void demonstrateSetOperations() {
        Set<Student> studentSet = new HashSet<>();
        studentSet.add(new Student(1, "Alice"));
        studentSet.add(new Student(2, "Bob"));
        studentSet.add(new Student(3, "Charlie"));
        studentSet.add(new Student(1, "Alice")); // Duplicate entry

        // Logging all students
        logger.info("Student Set: " + studentSet);

        // Removing a student
        studentSet.remove(new Student(2, "Bob"));
        logger.info("After removing Bob: " + studentSet);

        // Checking if a student is in the set
        boolean containsCharlie = studentSet.contains(new Student(3, "Charlie"));
        logger.info("Set contains Charlie: " + containsCharlie);
    }
}
