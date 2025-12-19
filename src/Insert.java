import java.sql.*;

public class Insert {
    public static void InsertData(String nama,
                                  String matkul,
                                  String email)
            throws SQLException {
        String urlPath = "jdbc:sqlite:C:/Users/Os 11/Documents/data.db";
        try (Connection connection = DriverManager.getConnection(urlPath)) {
            String sqlInsert = "INSERT INTO dosen (nama,matkul,email) VALUES (?,?,?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(sqlInsert)) {
                preparedStatement.setString(1, nama);
                preparedStatement.setString(2, matkul);
                preparedStatement.setString(3, email);
                preparedStatement.executeUpdate();
                System.out.println("\n[System] Data berhasil ditambahkan!\n");
            }
        }
    }
}
