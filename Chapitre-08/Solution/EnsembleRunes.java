import java.util.HashSet;

public class EnsembleRunes
{
    public static void main(String[] args)
    {
        HashSet<String> runes = new HashSet<>();
        runes.add("Feu");
        runes.add("Eau");
        runes.add("Terre");
        runes.add("Feu");
        runes.add("Air");
        for (String rune : runes)
        {
            System.out.print(rune + " ");
        }
    }
}
