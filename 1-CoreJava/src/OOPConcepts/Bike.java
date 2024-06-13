package OOPConcepts;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// Bike class inherits from Vehicle
public class Bike extends Vehicle {

    // Logger to store logs instead of using System.out.print
    private static final Logger logger = LogManager.getLogger(Bike.class.getName());

    // Constructor to initialize the Bike object
    public Bike(String make, String model, int year) {
        super(make, model, year);
    }

    // Overriding the abstract method from Vehicle class
    @Override
    public void startEngine() {
        logger.info("Bike engine started: " + getMake() + " " + getModel());
    }
}
