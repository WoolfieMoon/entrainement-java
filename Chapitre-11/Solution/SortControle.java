public class SortControle {

    public static void lancerSort(String nom) {
        if (nom == null ||  nom.isBlank()) {
            throw new IllegalArgumentException();
        }
        System.out.println(nom);
    }

    public static void main(String[] args) {
        try {
            lancerSort("");
        } catch (IllegalArgumentException e) {
            System.out.println("Sort interdit : le nom du sort est obligatoire.");
        }
    }

}
