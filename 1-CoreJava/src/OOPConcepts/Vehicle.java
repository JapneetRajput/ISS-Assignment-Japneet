package OOPConcepts;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// Abstract class Vehicle
public abstract class Vehicle {

    // Logger to store logs instead of using System.out.print
    private static final Logger logger = LogManager.getLogger(Vehicle.class.getName());

    // Instance variables (Encapsulation)
    private String make;
    private String model;
    private int year;

    // Constructor to initialize the Vehicle object
    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Getter methods
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    // Abstract method to be implemented by subclasses
    public abstract void startEngine();

    // Method to display vehicle details
    public void displayVehicleDetails() {
        logger.info("Vehicle Make: " + make);
        logger.info("Vehicle Model: " + model);
        logger.info("Vehicle Year: " + year);
    }
}
