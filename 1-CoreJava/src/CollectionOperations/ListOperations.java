package CollectionOperations;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListOperations {
    private static final Logger logger = LogManager.getLogger(ListOperations.class.getName());

    public void demonstrateListOperations() {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(3, "Charlie"));
        studentList.add(new Student(1, "Alice"));
        studentList.add(new Student(2, "Bob"));

        logger.info("Student List: " + studentList);

        studentList.remove(1);
        logger.info("After removing second student: " + studentList);

        studentList.set(1, new Student(3, "Eve"));
        logger.info("After updating second student: " + studentList);
    }

    public void sortPrimitiveList() {
        List<Integer> intList = new ArrayList<>();
        intList.add(5);
        intList.add(1);
        intList.add(4);
        intList.add(2);
        intList.add(3);

        logger.info("Original Integer List: " + intList);

        Collections.sort(intList);

        logger.info("Sorted Integer List: " + intList);
    }

    public void sortStudentListById() {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(3, "Charlie"));
        studentList.add(new Student(1, "Alice"));
        studentList.add(new Student(2, "Bob"));

        logger.info("Original Student List by ID: " + studentList);

        Collections.sort(studentList);

        logger.info("Sorted Student List by ID: " + studentList);
    }

    public void sortStudentListByName() {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(3, "Charlie"));
        studentList.add(new Student(1, "Alice"));
        studentList.add(new Student(2, "Bob"));

        logger.info("Original Student List by Name: " + studentList);

        Comparator<Student> nameComparator = new StudentNameComparator();
        Collections.sort(studentList, nameComparator);

        logger.info("Sorted Student List by Name: " + studentList);
    }
}
