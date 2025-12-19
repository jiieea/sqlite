import java.sql.*;

public class Delete {
    public static void DeleteData(String name , Connection connection)  {
        try  {
            String sqlStr = "DELETE FROM dosen WHERE nama = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sqlStr);
            preparedStatement.setString(1,name);
            if(preparedStatement.executeUpdate() > 0) {
                System.out.println("data deleted successfully");
            }else {
                System.out.println("data failed to delete");
            }
        }catch (Exception e ) {
            System.err.println(e.getMessage());
        }
    }
}
