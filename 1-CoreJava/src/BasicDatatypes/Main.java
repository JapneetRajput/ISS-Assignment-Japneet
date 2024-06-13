package BasicDatatypes;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    // Logger to store logs instead of using System.out.print
    private static Logger logger = LogManager.getLogger(Main.class.getName());

    public static void main(String[] args) {
        // Creating Car objects (Instances of the Car class)
        Car car1 = new Car("Toyota", "Corolla", 2015, 50000, false, 'B', 1.8f,
                123456789012345L, (byte)4, (short)5, "1HGCM82633A123456");
        Car car2 = new Car("Honda", "Civic", 2018, 30000, true, 'A', 2.0f,
                987654321098765L, (byte)4, (short)7, "1HGCM82633A654321");

        // Accessing the Car object's state and behavior using methods
        car1.displayCarDetails();
        car2.displayCarDetails();

        // Modifying the state of the Car object using methods
        car1.drive(100);
        car1.setMileage(50100);

        // Displaying the updated details
        logger.info("After driving:");
        car1.displayCarDetails();

        // Accessing the static method
        logger.info("Total number of cars: " + Car.getCarCount());
    }
}
