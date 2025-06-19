import java.util.ArrayList;
import java.util.List;

public class RechercheRune
{
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<>();
        list.add("Feu");
        list.add("Eau");
        list.add("Terre");
        list.add("Air");
        chercherRune(list, "Feu");
        chercherRune(list, "Lumière");
    }

    public static void chercherRune(List<String> list, String cible)
    {
        boolean res = list.contains(cible);
        System.out.println("Rune trouvée : " + res);
    }
}
