import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class IndexArcanes {

    public static void main(String[] args) {
        ArrayList<String> sorts = new ArrayList<String>();
        sorts.add("Flamme");
        sorts.add("Eclair");
        sorts.add("Flamme");
        sorts.add("Gel");
        sorts.add("Vent");
        sorts.add("Gel");

        System.out.println("Sorts enregistrés : ");
        for(String sort: sorts){
            System.out.println(sort);
        }

        System.out.println();

        Collections.sort(sorts);

        System.out.println("Sorts triés :");
        for(String sort: sorts){
            System.out.println(sort);
        }

        System.out.println();

        Set<String> sortUniques = new HashSet<>(sorts);
        System.out.println("Sorts uniques (par ordre alphabétique) :");
        for(String sort: sortUniques){
            System.out.println(sort);
        }

    }

}
