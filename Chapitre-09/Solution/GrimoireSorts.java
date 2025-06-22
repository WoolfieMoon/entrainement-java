import java.util.HashMap;
import java.util.Map;

public class GrimoireSorts
{
    public static void main(String[] args)
    {
        // Exercice 1
        HashMap<String, String> sorts = new HashMap<>();
        sorts.put("Flamme","Inflige des dégâts de feu");
        sorts.put("Éclair","Frappe avec la foudre");
        sorts.put("Gel","Ralentit l’ennemi");
        for (Map.Entry<String, String> sort : sorts.entrySet())
        {
            System.out.println(sort.getKey() + " : " + sort.getValue());
        }

        // Exercice 2
        if (sorts.containsKey("Éclair"))
        {
            System.out.println("Effet du sort Éclair : " + sorts.get("Éclair"));
        }
        else
        {
            System.out.println("Sort inconnu.");
        }

        // Exercice 3
        sorts.replace("Flamme","Inflige de lourds dégâts de feu");
        for (Map.Entry<String, String> sort : sorts.entrySet())
        {
            System.out.println(sort.getKey() + " : " + sort.getValue());
        }

        // Exercice 4
        sorts.remove("Gel");
        for (Map.Entry<String, String> sort : sorts.entrySet())
        {
            System.out.println(sort.getKey() + " : " + sort.getValue());
        }

        // Exercice 5
        System.out.print("Sorts disponibles : ");
        for (Map.Entry<String, String> sort : sorts.entrySet())
        {
            System.out.print(sort.getKey() + " ");
        }
    }
}
