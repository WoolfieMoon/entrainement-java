import java.sql.*;

public class PortailAuto {

    public static void main(String[] args) {
        String url = "jdbc:sqlite:grimoire.db";

        try (var con = DriverManager.getConnection(url)) {
            if (con == null) {
                System.out.println("Connection failed");
                return;
            }

            String query_create = "CREATE TABLE IF NOT EXISTS sorts (" +
                    "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                    "nom text NOT NULL," +
                    "puissance INTEGER NOT NULL" +
                    ");";



            Statement stmt = con.createStatement();
            stmt.executeUpdate(query_create);
            System.out.println("\uD83C\uDF00 Grimoire initialisé avec succès.");


        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

}
