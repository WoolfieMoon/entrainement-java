import java.sql.*;
import java.util.Scanner;

public class SortsMaitre {

    private static final String table_name = "sorts_maitres";

    private static Connection conn = null;

    private static boolean initDB() {
        String url = "jdbc:sqlite:database.db";

        try {
            conn = DriverManager.getConnection(url);
            if (conn == null) {
                return false;
            }

            String qInitTable = "CREATE TABLE IF NOT EXISTS " + table_name + " (" +
                    "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                    "mage TEXT NOT NULL," +
                    "nom TEXT NOT NULL," +
                    "puissance INTEGER NOT NULL" +
                    ");";

            try (Statement stmt = conn.createStatement()) {
                stmt.executeUpdate(qInitTable);
            }

            return true;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private static void showMenu() {
        System.out.println("1.Ajouter un sort\n" +
                "\n" +
                "2.Voir tous les sorts\n" +
                "\n" +
                "3.Rechercher les sorts d’un mage\n" +
                "\n" +
                "4.Modifier la puissance d’un sort\n" +
                "\n" +
                "5.Supprimer un sort\n" +
                "\n" +
                "6.Quitter");
    }

    private static boolean insertSorts(String mage, String nom, int puissance) {
        String query = "INSERT INTO " + table_name + " (mage, nom, puissance) VALUES (?, ?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, mage);
            pstmt.setString(2, nom);
            pstmt.setInt(3, puissance);
            return pstmt.executeUpdate() != 0;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private static void selectSorts() {
        String query = "SELECT * FROM " + table_name;
        try (Statement stmt = conn.createStatement()) {
            ResultSet rs =  stmt.executeQuery(query);
            while (rs.next()) {
                System.out.println("[" + rs.getInt("id") + "] " +
                        "Mage : " + rs.getString("mage") + " | " +
                        "Sort : " + rs.getString("nom") + " (" +
                        rs.getInt("puissance") + ")");
            }
            rs.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private static void getSortsFromMage(String mage) {
        String query = "SELECT * FROM " + table_name + " WHERE mage = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1,  mage);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("nom") + " (" + rs.getInt("puissance") + ")");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private static boolean updatePuissanceSort(int id, int puissance) {
        String query = "UPDATE " + table_name + " SET puissance = ? WHERE id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setInt(1, puissance);
            pstmt.setInt(2, id);
            return pstmt.executeUpdate() != 0;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private static boolean deleteSort(int id) {
        String query = "DELETE FROM " + table_name + " WHERE id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setInt(1, id);
            return pstmt.executeUpdate() != 0;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private static boolean handleChoice() {
        System.out.print("Option : ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        String mage = "";
        int id = -1;
        int puissance = -1;

        switch (choice) {
            case 1:
                System.out.println("1.Ajouter un sort");
                System.out.print("Veuillez entrer le nom du mage : ");
                mage = sc.next();
                System.out.print("Veuillez entrer le nom du sort : ");
                String nom = sc.next();
                System.out.print("Veuillez entrer la puissance du sort : ");
                puissance = sc.nextInt();
                if (insertSorts(mage, nom, puissance)) {
                    System.out.println("Le sort " + nom + " a bien été ajouté !");
                } else {
                    System.out.println("Erreur !");
                }
                break;

            case 2:
                System.out.println("2.Voir tous les sorts");
                selectSorts();
                break;

            case 3:
                System.out.println("3.Rechercher les sorts d’un mage");
                System.out.print("Veuillez entrer le nom du mage : ");
                mage = sc.next();
                getSortsFromMage(mage);
                break;

            case 4:
                System.out.println("4.Modifier la puissance d’un sort");
                System.out.print("Veuillez entrer l'id du sort : ");
                id = sc.nextInt();
                System.out.print("Veuillez entrer la puissance du sort : ");
                puissance = sc.nextInt();
                if (updatePuissanceSort(id, puissance)) {
                    System.out.println("Le sort n°" + id + " a bien été modifié");
                } else  {
                    System.out.println("Erreur !");
                }
                break;

            case 5:
                System.out.println("5.Supprimer un sort");
                System.out.print("Veuillez entrer l'id du sort : ");
                id = sc.nextInt();
                if (deleteSort(id)) {
                    System.out.println("Le sort n°" + id + " a bien été supprimé");
                } else {
                    System.out.println("Erreur !");
                }
                break;

            case 6:
                System.out.println("6.Quitter");
                System.out.println("Aurevoir !");
                return false;

            default:
                System.out.println("Choix inconnu !");
                break;
        }
        return true;
    }

    public static void main(String[] args) throws InterruptedException {
        if (!initDB()) {
            System.out.println("Impossible d'ouvrir la base de données");
            return;
        }

        do {
            Thread.sleep(1000);
            showMenu();
        } while (handleChoice());

        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
