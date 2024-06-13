package OOPConcepts;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// Garage class to demonstrate polymorphism and encapsulation
public class Garage {

    // Logger to store logs instead of using System.out.print
    private static final Logger logger = LogManager.getLogger(Garage.class.getName());

    // Encapsulated list of vehicles
    private Vehicle[] vehicles;

    // Constructor to initialize the Garage object
    public Garage(Vehicle[] vehicles) {
        this.vehicles = vehicles;
    }

    // Method to start all vehicles in the garage (Polymorphism)
    public void startAllEngines() {
        for (Vehicle vehicle : vehicles) {
            vehicle.startEngine();
        }
    }

    // Method to perform service on all vehicles in the garage
    public void serviceAllVehicles(VehicleService[] services) {
        for (VehicleService service : services) {
            service.performService();
        }
    }
}
