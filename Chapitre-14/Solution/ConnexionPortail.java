import java.sql.*;
import java.util.HashMap;

public class ConnexionPortail {

    public static void main(String[] args) {
        String url = "jdbc:sqlite:grimoire.db";

        // Déclare la connexion en dehors pour y accéder partout
        try (Connection con = DriverManager.getConnection(url)) {
            if (con == null) {
                System.out.println("Connection failed");
                return;
            }

            System.out.println("✅ Portail magique ouvert !");

            String query_create = "CREATE TABLE IF NOT EXISTS sorts (" +
                    "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                    "nom text NOT NULL," +
                    "puissance INTEGER NOT NULL" +
                    ");";



            try (Statement stmt = con.createStatement()) {
                stmt.executeUpdate(query_create);
                System.out.println("✅ Table 'sorts' créée avec succès.");
            }

            String query_insert = "INSERT INTO sorts (nom, puissance) VALUES (?,?)";

            try (PreparedStatement pstmt  = con.prepareStatement(query_insert)) {
                HashMap<String, Integer> sorts = new HashMap<>() {
                    {
                        put("Éclair", 80);
                        put("Feu", 100);
                        put("Invisibilité", 60);
                    }
                };

                for (String key : sorts.keySet()) {
                    pstmt.setString(1, key);
                    pstmt.setInt(2, sorts.get(key));
                    if (pstmt.executeUpdate() != 0) {
                        System.out.println("✨ Sort '" + key + "' inséré avec succès.");
                    }

                }
            }

            String query_select = "SELECT * FROM sorts;";
            try (Statement stmt = con.createStatement()) {
                ResultSet rs = stmt.executeQuery(query_select);
                while (rs.next()) {
                    System.out.println("[" + rs.getInt("id") + "] " + rs.getString("nom") + " (" + rs.getInt("puissance") + ")");
                }
                rs.close();
            }

            String query_delete = "DELETE FROM sorts WHERE nom = ?";
            try (PreparedStatement pstmt = con.prepareStatement(query_delete)) {
                pstmt.setString(1, "Feu");
                if (pstmt.executeUpdate() != 0) {
                    System.out.println("❌ Sort 'Feu' supprimé du grimoire.");
                } else {
                    System.out.println("Aucun sort 'Feu' trouvé");
                }
            }

            String query_update = "UPDATE sorts SET puissance = ? WHERE nom = ?";
            try (PreparedStatement pstmt  = con.prepareStatement(query_update)) {
                pstmt.setInt(1, 95);
                pstmt.setString(2, "Éclair");
                if (pstmt.executeUpdate() != 0) {
                    System.out.println("\uD83D\uDD04 Sort 'Éclair' mis à jour.");
                }
            }

            String query_select_sort_puissant = "SELECT * FROM sorts ORDER BY puissance DESC";
            try (Statement stmt = con.createStatement()) {
                ResultSet rs = stmt.executeQuery(query_select_sort_puissant);
                while (rs.next()) {
                    System.out.println(rs.getString("nom") + " (" + rs.getInt("puissance") + ")");
                }
                rs.close();
            }

            String query_select_sort_like_vis = "SELECT * FROM sorts WHERE nom LIKE ?";
            try (PreparedStatement pstmt = con.prepareStatement(query_select_sort_like_vis)) {
                pstmt.setString(1, "%vis%");
                ResultSet rs = pstmt.executeQuery();
                while (rs.next()) {
                    System.out.println("Sort trouvé : " + rs.getString ("nom") + "(" + rs.getInt("puissance") + ")");
                }
                rs.close();
            }

            String query_count_sort = "SELECT COUNT(*) count FROM sorts";
            try (Statement stmt = con.createStatement()) {
                ResultSet rs = stmt.executeQuery(query_count_sort);
                if (rs.next()) {
                    System.out.println("📚 Nombre total de sorts : " + rs.getInt("count"));
                }
                rs.close();
            }

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
