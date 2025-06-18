import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class RuneMax {

    public static void main(String[] args) {
        ArrayList<String> historique = new ArrayList<>();
        historique.add("Feu");
        historique.add("Eau");
        historique.add("Feu");
        historique.add("Terre");
        historique.add("Feu");
        historique.add("Eau");

        HashSet<String> elements = new HashSet<>(historique);
        ArrayList<String> uniqueRunes = new ArrayList<>(elements);

        int[] countElements = new int[elements.size()];

        for (String elem : historique) {
            if (elements.contains(elem)) {
                countElements[uniqueRunes.indexOf(elem)]++;
            }
        }

        int max = 0;
        String maxRune = "";

        for (int i = 0; i < countElements.length; i++) {
            if (countElements[i] > max) {
                max = countElements[i];
                maxRune = uniqueRunes.get(i);
            }
        }

        System.out.println("Rune la plus utilisée : " + maxRune + " (" + max + " fois)");
    }

}
