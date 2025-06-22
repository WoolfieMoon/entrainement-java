import java.util.*;

public class CodexSorcier
{
    public static void main(String[] args)
    {
        HashMap<String, String> codex = new HashMap<>();
        codex.put("Eldros","Pyromancien");
        codex.put("Lyana","Hydromancienne");
        codex.put("Tharn","Nécromancien");
        codex.put("Selmira","Illusionniste");
        for (Map.Entry<String,String> mage : codex.entrySet())
        {
            System.out.println(mage.getKey() + " : " + mage.getValue());
        }
        chercherSorcier(codex, "Tharn");
        chercherSorcier(codex, "Zerath");
        List<String> magesTri = new ArrayList<>(codex.keySet());
        Collections.sort(magesTri);
        System.out.print("Mages classés : " );
        for (String mage : magesTri)
        {
            System.out.print(mage + " ");
        }
    }

    public static void chercherSorcier(Map<String, String> codex, String nom)
    {
        if (codex.containsKey(nom))
        {
            System.out.println("Spécialité de " + nom + " : " + codex.get(nom));
        }
        else
        {
            System.out.println("Aucun sorcier nommé " + nom);
        }
    }
}
