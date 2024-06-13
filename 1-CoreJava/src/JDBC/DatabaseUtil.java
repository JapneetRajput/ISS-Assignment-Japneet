package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DatabaseUtil {

    public static Connection getConnection() throws SQLException {
        Properties connectionProperties = new Properties();

        connectionProperties.put("user", "arjun");
        connectionProperties.put("password", "arjun");

        String jdbcURL = "jdbc:mysql://localhost:3306/arjun";
        return DriverManager.getConnection(jdbcURL, connectionProperties);
    }

    public static int createRecord(String name, String email) throws SQLException {
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            connection = getConnection();

            String sql = "INSERT INTO people (name, email) VALUES (?, ?)";
            statement = connection.prepareStatement(sql);
            statement.setString(1, name);
            statement.setString(2, email);

            int rowsAffected = statement.executeUpdate();
            return rowsAffected;

        } finally {
            closeResources(connection, statement);
        }
    }

    public static String readRecord(int id) throws SQLException {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            connection = getConnection();

            String sql = "SELECT * FROM people WHERE id = ?";
            statement = connection.prepareStatement(sql);
            statement.setInt(1, id);

            resultSet = statement.executeQuery();

            if (resultSet.next()) {
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                return "ID: " + id + ", Name: " + name + ", Email: " + email;
            } else {
                return "Record not found.";
            }

        } finally {
            closeResources(connection, statement, resultSet);
        }
    }

    public static int updateRecord(int id, String name, String email) throws SQLException {
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            connection = getConnection();

            String sql = "UPDATE people SET name = ?, email = ? WHERE id = ?";
            statement = connection.prepareStatement(sql);
            statement.setString(1, name);
            statement.setString(2, email);
            statement.setInt(3, id);

            int rowsAffected = statement.executeUpdate();
            return rowsAffected;

        } finally {
            closeResources(connection, statement);
        }
    }

    public static int deleteRecord(int id) throws SQLException {
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            connection = getConnection();

            String sql = "DELETE FROM people WHERE id = ?";
            statement = connection.prepareStatement(sql);
            statement.setInt(1, id);

            int rowsAffected = statement.executeUpdate();
            return rowsAffected;

        } finally {
            closeResources(connection, statement);
        }
    }

    private static void closeResources(Connection connection, Statement statement, ResultSet resultSet) throws SQLException {
        if (resultSet != null) {
            resultSet.close();
        }
        if (statement != null) {
            statement.close();
        }
        if (connection != null) {
            connection.close();
        }
    }

    private static void closeResources(Connection connection, Statement statement) throws SQLException {
        closeResources(connection, statement, null);
    }
}
