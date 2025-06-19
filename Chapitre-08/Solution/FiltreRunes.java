import java.util.ArrayList;

public class FiltreRunes
{
    public static void main(String[] args)
    {
        ArrayList<String> runes = new ArrayList<>();
        runes.add("Feu");
        runes.add("Ténèbres");
        runes.add("Eau");
        runes.add("Chaos");
        runes.add("Air");
        runes.remove("Ténèbres");
        runes.remove("Chaos");
        for (String e : runes)
        {
            System.out.print(e + " ");
        }
    }
}
