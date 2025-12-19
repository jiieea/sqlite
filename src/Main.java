import java.sql.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String url = "jdbc:sqlite:C:/Users/Os 11/Documents/data.db";
        try (Connection conn = DriverManager.getConnection(url);
             Scanner input = new Scanner(System.in)) {

            System.out.println("1. Insert | 2. Update | 3. Delete | 4. View");
            System.out.print("Pilih menu: ");
            int choice = input.nextInt();
            input.nextLine();

            if (choice == 1) {
                System.out.print("Nama: "); String n = input.nextLine();
                System.out.print("Matkul: "); String m = input.nextLine();
                System.out.print("Email: "); String e = input.nextLine();
                Insert.InsertData(n,m,e);
            }
            else if (choice == 2) {
                System.out.print("Nama yang akan diupdate: ");
                String targetName = input.nextLine();
                System.out.print("Matkul Baru: ");
                String newM = input.nextLine();
                System.out.print("Email Baru: ");
                String newE = input.nextLine();
        Update.UpdateData(conn,targetName,newM,newE);
            }
            else if (choice == 3) {
                System.out.print("Nama yang akan dihapus: ");
                String targetName = input.nextLine();

                Delete.DeleteData(targetName, conn);
            }

            // Always show the table at the end to see changes
            Display.displayTable(conn);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}