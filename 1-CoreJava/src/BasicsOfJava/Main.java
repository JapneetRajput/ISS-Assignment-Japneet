package BasicsOfJava;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    // Logger to store logs instead of using System.out.print
    private static Logger logger = LogManager.getLogger(Main.class.getName());

    public static void main(String[] args) {
        // Creating a Car object (Instance of the Car class)
        Car myCar = new Car("Toyota", "Corolla", 2015, 50000);

        // Accessing the Car object's state and behavior using methods
        myCar.displayCarDetails();

        // Modifying the state of the Car object using methods
        myCar.drive(100);
        myCar.setMileage(50100);

        // Displaying the updated state of the Car object
        logger.info("After driving:");
        myCar.displayCarDetails();
    }
}
