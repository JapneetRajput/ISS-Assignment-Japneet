package BasicsOfJava;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// Class definition
public class Car {

    // Logger to store logs instead of using System.out.print
    private static Logger logger = LogManager.getLogger(Car.class.getName());

    // Instance variables (State)
    // These variables store the state of the Car object
    private String make;
    private String model;
    private int year;
    private double mileage;

    // Constructor to initialize the Car object
    // Constructor is a special method used to create and initialize objects
    public Car(String make, String model, int year, double mileage) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
    }

    // Getter methods to access the instance variables
    // These methods provide a way to retrieve the state of the object
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getMileage() {
        return mileage;
    }

    // Setter methods to modify the instance variables
    // These methods provide a way to change the state of the object
    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    // Method to display car details (Behavior)
    // This method defines a behavior of the Car class to display its details
    public void displayCarDetails() {
        logger.info("Car Make: " + make);
        logger.info("Car Model: " + model);
        logger.info("Car Year: " + year);
        logger.error("Car Mileage: " + mileage);  // Logging mileage as an error for demonstration
    }

    // Method to simulate driving the car (Behavior)
    // This method defines a behavior of the Car class to simulate driving and update the mileage
    public void drive(double distance) {
        logger.info("Driving " + distance + " miles...");
        mileage += distance;
    }
}
