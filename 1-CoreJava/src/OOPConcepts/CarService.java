package OOPConcepts;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// CarService implements VehicleService interface
public class CarService implements VehicleService {

    // Logger to store logs instead of using System.out.print
    private static final Logger logger = LogManager.getLogger(CarService.class.getName());

    private Vehicle vehicle;

    // Constructor to initialize the CarService object
    public CarService(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    // Implementing the performService method
    @Override
    public void performService() {
        logger.info("Performing service on car: " + vehicle.getMake() + " " + vehicle.getModel());
    }
}
