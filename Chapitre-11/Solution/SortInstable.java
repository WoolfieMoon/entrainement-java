public class SortInstable {

    public static void lancerSort(String nom, int puissance) throws Exception {
        if (puissance > 100) {
            throw new Exception("Exception : puissance trop élevée pour Destruction !");
        }
        System.out.println("Sort lancé : " + nom + " (" + puissance + ")");
    }

    public static void main(String[] args) throws Exception {
        try {
            lancerSort("Explosion", 90);
            lancerSort("Destruction", 120);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

}
