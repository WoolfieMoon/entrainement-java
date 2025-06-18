import java.util.HashMap;

public class GrimoireSorts {

    public static void main(String[] args) {
        HashMap<String, String> sorts = new HashMap<>();

        sorts.put("Flamme", "Inflige des dégâts de feu");
        sorts.put("Eclair", "Frappe avec la foudre");
        sorts.put("Gel", "Ralentit l’ennemi");

        for(String sort : sorts.keySet()){
            System.out.println(sort + " : " + sorts.get(sort));
        }

        System.out.println();

        if(sorts.containsKey("Eclair")){
            System.out.println("Effet du sort Eclair : " + sorts.get("Eclair"));
        } else {
            System.out.println("Sort inconnu.");
        }

        System.out.println();

        sorts.replace("Flamme", "Inflige de lourds dégâts de feu");

        for(String sort : sorts.keySet()){
            System.out.println(sort + " : " + sorts.get(sort));
        }

        System.out.println();

        sorts.remove("Gel");

        for(String sort : sorts.keySet()){
            System.out.println(sort + " : " + sorts.get(sort));
        }

        System.out.println();
        System.out.println("Sorts disponibles : ");
        for(String sort : sorts.keySet()){
            System.out.println(sort);
        }

    }

}
