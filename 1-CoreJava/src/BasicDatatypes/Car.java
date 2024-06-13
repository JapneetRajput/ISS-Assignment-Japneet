package BasicDatatypes;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// Class definition
public class Car {

    // Logger to store logs instead of using System.out.print
    private static Logger logger = LogManager.getLogger(Car.class.getName());

    // Instance variables (State)
    // Basic data types
    private String make;
    private String model;
    private int year;
    private double mileage;
    private boolean isElectric;
    private char energyRating;
    private float engineCapacity;
    private long serialNumber;
    private byte numberOfDoors;
    private short warrantyYears;

    // Final variable (cannot be changed once assigned)
    private final String VIN;

    // Static variable (class variable shared by all instances)
    private static int carCount = 0;

    // Constructor to initialize the Car object
    // Constructor is a special method used to create and initialize objects
    public Car(String make, String model, int year, double mileage, boolean isElectric,
               char energyRating, float engineCapacity, long serialNumber,
               byte numberOfDoors, short warrantyYears, String VIN) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
        this.isElectric = isElectric;
        this.energyRating = energyRating;
        this.engineCapacity = engineCapacity;
        this.serialNumber = serialNumber;
        this.numberOfDoors = numberOfDoors;
        this.warrantyYears = warrantyYears;
        this.VIN = VIN;
        carCount++;
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

    public boolean isElectric() {
        return isElectric;
    }

    public char getEnergyRating() {
        return energyRating;
    }

    public float getEngineCapacity() {
        return engineCapacity;
    }

    public long getSerialNumber() {
        return serialNumber;
    }

    public byte getNumberOfDoors() {
        return numberOfDoors;
    }

    public short getWarrantyYears() {
        return warrantyYears;
    }

    public String getVIN() {
        return VIN;
    }

    // Setter methods to modify the instance variables
    // These methods provide a way to change the state of the object
    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public void setEngineCapacity(float engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    // Method to display car details (Behavior)
    // This method defines a behavior of the Car class to display its details
    public void displayCarDetails() {
        logger.info("Car Make: " + make);
        logger.info("Car Model: " + model);
        logger.info("Car Year: " + year);
        logger.info("Car Mileage: " + mileage);
        logger.info("Car is Electric: " + isElectric);
        logger.info("Car Energy Rating: " + energyRating);
        logger.info("Car Engine Capacity: " + engineCapacity + "L");
        logger.info("Car Serial Number: " + serialNumber);
        logger.info("Car Number of Doors: " + numberOfDoors);
        logger.info("Car Warranty Years: " + warrantyYears);
        logger.info("Car VIN: " + VIN);
    }

    // Method to simulate driving the car (Behavior)
    // This method defines a behavior of the Car class to simulate driving and update the mileage
    public void drive(double distance) {
        logger.info("Driving " + distance + " miles...");
        mileage += distance;
    }

    // Static method to get the car count
    // This method provides a way to access the class variable carCount
    public static int getCarCount() {
        return carCount;
    }
}
