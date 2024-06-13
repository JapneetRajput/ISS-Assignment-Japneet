package OOPConcepts;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// Car class inherits from Vehicle
public class Car extends Vehicle {

    // Logger to store logs instead of using System.out.print
    private static final Logger logger = LogManager.getLogger(Car.class.getName());

    // Constructor to initialize the Car object
    public Car(String make, String model, int year) {
        super(make, model, year);
    }

    // Overriding the abstract method from Vehicle class
    @Override
    public void startEngine() {
        logger.info("Car engine started: " + getMake() + " " + getModel());
    }
}
