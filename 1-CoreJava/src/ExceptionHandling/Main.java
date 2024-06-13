package ExceptionHandling;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    // Logger to store logs instead of using System.out.print
    private static final Logger logger = LogManager.getLogger(Main.class.getName());

    public static void main(String[] args) {
        // Demonstrating exception hierarchy
        ExceptionHierarchyDemo hierarchyDemo = new ExceptionHierarchyDemo();
        hierarchyDemo.demonstrateHierarchy();

        // Demonstrating handling exceptions
        ExceptionHandlingDemo handlingDemo = new ExceptionHandlingDemo();
        handlingDemo.demonstrateHandling();

        // Demonstrating throw vs throws
        ThrowVsThrowsDemo throwVsThrowsDemo = new ThrowVsThrowsDemo();
        throwVsThrowsDemo.demonstrateThrowVsThrows();
    }
}
