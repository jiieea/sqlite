import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class Display {
    public static void displayTable(Connection conn) throws SQLException {
        System.out.println("\n--- DATA DOSEN TERBARU ---");
        System.out.printf("| %-20s | %-15s | %-25s |\n", "NAMA", "MATKUL", "EMAIL");
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM dosen");
        while (rs.next()) {
            System.out.printf("| %-20s | %-15s | %-25s |\n",
                    rs.getString("nama"), rs.getString("matkul"), rs.getString("email"));
        }
    }
}
