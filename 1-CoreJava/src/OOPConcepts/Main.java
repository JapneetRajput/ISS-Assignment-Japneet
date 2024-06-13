package OOPConcepts;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    // Logger to store logs instead of using System.out.print
    private static final Logger logger = LogManager.getLogger(Main.class.getName());

    public static void main(String[] args) {
        // Create instances of Car and Bike
        Vehicle car = new Car("Toyota", "Corolla", 2020);
        Vehicle bike = new Bike("Yamaha", "MT-07", 2019);

        // Display details of vehicles
        car.displayVehicleDetails();
        bike.displayVehicleDetails();

        // Start engines (Polymorphism)
        car.startEngine();
        bike.startEngine();

        // Create array of vehicles
        Vehicle[] vehicles = {car, bike};

        // Create Garage instance
        Garage garage = new Garage(vehicles);

        // Start all engines in the garage
        garage.startAllEngines();

        // Create service instances
        VehicleService carService = new CarService(car);
        VehicleService bikeService = new CarService(bike);

        // Create array of services
        VehicleService[] services = {carService, bikeService};

        // Perform service on all vehicles in the garage
        garage.serviceAllVehicles(services);
    }
}
