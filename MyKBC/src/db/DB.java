package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DB {
    public void connectDatabase() {
        try {
            // Establishing connection to the database
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/kbc", "root", "root");
            
            // Creating a statement object
            Statement statement = connect.createStatement();
            
            // Perform database operations
            
            // Don't forget to close the connection when done
            // connect.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
