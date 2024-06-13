package JDBC;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.sql.SQLException;

public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) throws SQLException {

        // Create a record
        int rowsAffected = DatabaseUtil.createRecord("Japneet Rajput", "japneetrajput2804@gmail.com");
        if (rowsAffected > 0) {
            logger.info("Record created successfully!");
        }

        // Read a record
        String record = DatabaseUtil.readRecord(1); //
        logger.info("Record retrieved: " + record);

        // Update a record
        rowsAffected = DatabaseUtil.updateRecord(1, "Japneet Rajput", "japneetrajput2804@gmail.com"); //
        if (rowsAffected > 0) {
            logger.info("Record updated successfully!");
        } else {
            logger.error("Record update failed.");
        }

        // Delete a record (optional, uncomment if needed)
         int deletedRows = DatabaseUtil.deleteRecord(1); //
         if (deletedRows > 0) {
             logger.info("Record deleted successfully!");
         } else {
             logger.error("Record deletion failed.");
         }
    }
}
