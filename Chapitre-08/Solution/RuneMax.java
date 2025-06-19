import java.util.*;

public class RuneMax
{
    public static void main(String[] args)
    {
        ArrayList<String> historique = new ArrayList<>();
        historique.add("Feu");
        historique.add("Eau");
        historique.add("Feu");
        historique.add("Terre");
        historique.add("Feu");
        historique.add("Eau");

        HashSet<String> elements = new HashSet<>(historique);
        int[] compteurs = new int[elements.size()];

        for (String e : historique)
        {
            int i = 0;
            for (String uniqueE : elements)
            {
                if (e.equals(uniqueE))
                {
                    compteurs[i]++;
                }
                i++;
            }
        }
        int max = 0, indexMax = 0;
        for (int i = 0; i < compteurs.length; i++)
        {
            if (compteurs[i]>max)
            {
                indexMax = i;
                max = compteurs[i];
            }
        }

        String res = "";
        int i = 0;
        for (String uniqueE : elements)
        {
            if (i == indexMax)
            {
                res = uniqueE;
                break;
            }
            i++;
        }
        System.out.println("Rune la plus utilisée : " + res + " (" + max + " fois)");
    }
}
