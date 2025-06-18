import java.util.ArrayList;
import java.util.List;

public class RechercheRune {

    public static void main(String[] args) {
        ArrayList<String> runes = new ArrayList<>();

        runes.add("Feu");
        runes.add("Eau");
        runes.add("Terre");
        runes.add("Air");

        System.out.println("Rune trouvée : " + chercherRune(runes, "Feu"));
        System.out.println("Rune trouvée : " + chercherRune(runes, "Lumière"));
    }

    public static boolean chercherRune(List<String> liste, String cible) {
        return liste.contains(cible);
    }

}
