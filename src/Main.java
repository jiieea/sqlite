import java.sql.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Step 1: Program Started");
        try {
            Class.forName("org.sqlite.JDBC");
            Connection connection = DriverManager.getConnection("jdbc:sqlite:C:/Users/Os 11/Documents/data.db");
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery("SELECT * FROM mahasiswa");

            while(result.next()) {
                System.out.println(result.getString("nama"));
            }
        } catch (Exception e) {
            System.out.println("GENERAL ERROR: " + e.getMessage());
            e.printStackTrace();
        }
    }
}