package ru.petsinbloom.demofx.Models;
import java.sql.*;

public class DatabaseDriver {
    private Connection connection;

    public DatabaseDriver() {

        try{
            // Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            this.connection = DriverManager.getConnection("jdbc:sqlserver://localhost;instanceName=SQLSERVER2017;databaseName=msc;encrypt=true;trustServerCertificate=true", "sa", "admin");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    // Client section
    public ResultSet getClientData (String pAddress, String password) throws SQLException {
        Statement statement;
        ResultSet resultSet = null;
        try{
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM clients WHERE address = '" + pAddress + "'");
        }catch(SQLException e){
            e.printStackTrace();
        }
        return resultSet;
    }

    // Admin section

    // Utility methods

}
