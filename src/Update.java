import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update {
    public static  void UpdateData(Connection connection
            , String name
            , String matkul
            , String email) throws SQLException {
        String sql = "UPDATE dosen SET matkul = ? , email = ? WHERE nama = ? ";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1,matkul);
            preparedStatement.setString(2,email);
            preparedStatement.setString(3,name);
            preparedStatement.executeUpdate();
            System.out.println("\n[System] Data berhasil diupdate!\n");
        }
    }
}
