import java.util.*;

public class RegistreMages
{
    public static void main(String[] args)
    {
        // Exercice 6 et 7
        HashMap<String, Integer> mages = new HashMap<>();
        mages.put("Arken",50);
        mages.put("Nyria",65);
        mages.put("Voldar",40);
        int puissanceTot = 0;
        for (Map.Entry<String, Integer> mage : mages.entrySet())
        {
            puissanceTot += mage.getValue();
            System.out.println(mage.getKey() + " : niveau " + mage.getValue());
        }
        int moyenne = Math.round((float) puissanceTot /mages.size());
        System.out.println("Niveau moyen : " + moyenne);

        // Exercice 8
        mages.remove("Voldar");
        for (Map.Entry<String, Integer> mage : mages.entrySet())
        {
            System.out.println(mage.getKey() + " : niveau " + mage.getValue());
        }

        // Exercice 9
        chercherMage(mages,"Nyria");
        chercherMage(mages,"Krayn");

        // Exercice 10
        List<String> magesTri = new ArrayList<>(mages.keySet());
        Collections.sort(magesTri);
        for (String mage : magesTri)
        {
            System.out.print(mage + " ");
        }
    }

    public static void chercherMage(HashMap<String, Integer> mages, String nom)
    {
        if (mages.containsKey(nom))
        {
            System.out.println("Niveau de " + nom + " : " + mages.get(nom));
        }
        else
        {
            System.out.println("Aucun mage nommé " + nom);
        }
    }
}
