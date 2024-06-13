package com.example.procedures;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class CallableStatementExample {

    private static Logger logger = LogManager.getLogger(CallableStatementExample.class.getName());

    public static void main(String[] args) {
        Connection conn = null;
        CallableStatement cstmt = null;
        ResultSet rs = null;

        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establishing a connection
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/iss", "arjun", "arjun");

            // Preparing the callable statement
            cstmt = conn.prepareCall("{call getStudentEnrollments(?)}");
            cstmt.setInt(1, 1); // Assume student ID is 1 for this example

            // Executing the stored procedure
            rs = cstmt.executeQuery();

            // Processing the result set
            while (rs.next()) {
                int studentId = rs.getInt("student_id");
                String firstName = rs.getString("first_name");
                String lastName = rs.getString("last_name");
                String courseName = rs.getString("course_name");
                int credits = rs.getInt("credits");

                logger.info("Student ID: " + studentId);
                logger.info("First Name: " + firstName);
                logger.info("Last Name: " + lastName);
                logger.info("Course Name: " + courseName);
                logger.info("Credits: " + credits);
                logger.info("----------------------------");
            }
        } catch (ClassNotFoundException e) {
            logger.error("JDBC Driver not found: " + e.getMessage());
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (cstmt != null) cstmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
