import java.util.ArrayList;

public class CoffreMagique {

    public static String recupererObjet(String[] objets, int index) {
        try {
            return objets[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            return "Vide";
        }
    }

    public static void main(String[] args) {
        String[] objets = new String[] {"Potion", "Anneau", "Épée"};
        System.out.println(recupererObjet(objets, 1));
        System.out.println(recupererObjet(objets, 5));
    }

}
