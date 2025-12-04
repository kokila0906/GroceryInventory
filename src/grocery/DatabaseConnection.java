package grocery;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/grocerydb";
    private static final String USER = "root";   // change if needed
    private static final String PASS = "root";   // change if needed

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASS);
    }

    // Optional test
    public static void main(String[] args) {
        try (Connection conn = getConnection()) {
            System.out.println("✅ Connection Established!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
