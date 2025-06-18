import java.util.*;

public class CodexSorcier {

    public static void main(String[] args) {
        HashMap<String, String> codex = new HashMap<>();
        codex.put("Eldros", "Pyromancien");
        codex.put("Lyana", "Hydromancienne");
        codex.put("Tharn", "Nécromancien");
        codex.put("Selmira", "Illusionniste");

        System.out.println("Codex actuel : ");
        for (String mage : codex.keySet()) {
            System.out.println(mage + " : " + codex.get(mage));
        }

        System.out.println();

        System.out.println("Recherche : ");
        chercherSorcier(codex, "Tharn");
        chercherSorcier(codex, "Zerath");

        System.out.println();

        System.out.println("Mages classés :");
        ArrayList<String> magesName = new ArrayList<>(codex.keySet());
        Collections.sort(magesName);
        for (String mage : magesName) {
            System.out.println(mage);
        }

    }

    public static void chercherSorcier(Map<String, String> codex, String nom) {
        if (!codex.containsKey(nom)) {
            System.out.println("Aucun sorcier nommé " + nom +".");
            return;
        }
        System.out.println("Spécialité de " + nom + " : " + codex.get(nom));
    }

}
