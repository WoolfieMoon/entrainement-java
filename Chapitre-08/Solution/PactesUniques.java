import java.util.ArrayList;
import java.util.HashSet;

public class PactesUniques
{
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<>();
        list.add("Lumière");
        list.add("Ténèbres");
        list.add("Feu");
        list.add("Feu");
        list.add("Lumière");
        HashSet<String> uniqueList = new HashSet<>(list);
        for (String e : uniqueList)
        {
            System.out.print(e + " ");
        }

    }
}
