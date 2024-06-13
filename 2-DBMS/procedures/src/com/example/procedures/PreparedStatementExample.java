package com.example.procedures;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PreparedStatementExample {

    private static Logger logger = LogManager.getLogger(CallableStatementExample.class.getName());

    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establishing a connection
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/iss", "arjun", "arjun");

            // Preparing the statement
            String sql = "SELECT * FROM students WHERE major = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, "Computer Science"); // Assume major is "Computer Science" for this example

            // Executing the query
            rs = pstmt.executeQuery();

            // Processing the result set
            while (rs.next()) {
                int studentId = rs.getInt("student_id");
                String firstName = rs.getString("first_name");
                String lastName = rs.getString("last_name");
                String major = rs.getString("major");
                double gpa = rs.getDouble("gpa");

                logger.info("Student ID: " + studentId);
                logger.info("First Name: " + firstName);
                logger.info("Last Name: " + lastName);
                logger.info("Major: " + major);
                logger.info("GPA: " + gpa);
                logger.info("----------------------------");
            }
        } catch (ClassNotFoundException e) {
            logger.error("JDBC Driver not found: " + e.getMessage());
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (pstmt != null) pstmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
