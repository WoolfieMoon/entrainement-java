import java.util.ArrayList;

public class CompteurRunes {

    public static void main(String[] args) {
        ArrayList<String> historique = new ArrayList<>();

        historique.add("Feu");
        historique.add("Eau");
        historique.add("Eau");
        historique.add("Terre");
        historique.add("Feu");
        historique.add("Feu");
        historique.add("Air");

        System.out.println(historique.size());
    }

}
