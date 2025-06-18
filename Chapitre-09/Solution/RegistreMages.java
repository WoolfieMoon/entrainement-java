import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class RegistreMages {

    public static void main(String[] args) {
        HashMap<String, Integer> mages = new HashMap<>();
        mages.put("Arken", 50);
        mages.put("Nyria", 65);
        mages.put("Voldar", 40);

        for(String mage : mages.keySet()) {
            System.out.println(mage + " : Niveau " + mages.get(mage));
        }

        System.out.println();

        double avg = 0;
        for (Integer level : mages.values()) {
            avg += level;
        }
        avg /= mages.size();

        System.out.println("Niveau moyen : " + (int) Math.ceil(avg));

        System.out.println();

        mages.remove("Voldar");

        for(String mage : mages.keySet()) {
            System.out.println(mage + " : Niveau " + mages.get(mage));
        }

        System.out.println();

        chercherMage(mages, "Nyria");
        chercherMage(mages, "Krayn");

        System.out.println();

        List<String> magesNames = new ArrayList<>(mages.keySet());
        Collections.sort(magesNames);

        for(String mage : magesNames) {
            System.out.println(mage);
        }
    }

    public static void chercherMage(HashMap<String, Integer> mages, String nom) {
        if (!mages.containsKey(nom)) {
            System.out.println("Aucun mage nommé " + nom + ".");
            return;
        }
        System.out.println("Niveau de " + nom + " : " + mages.get(nom));
    }

}
