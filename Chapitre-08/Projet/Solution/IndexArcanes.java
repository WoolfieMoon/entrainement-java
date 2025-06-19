import java.util.*;

public class IndexArcanes
{
    public static void main(String[] args)
    {
        ArrayList<String> sorts = new ArrayList<>();
        sorts.add("Flamme");
        sorts.add("Eclair");
        sorts.add("Flamme");
        sorts.add("Gel");
        sorts.add("Vent");
        sorts.add("Gel");
        System.out.print("Sorts enregistrés : ");
        for (String s : sorts)
        {
            System.out.print( s + " ");
        }
        Collections.sort(sorts);
        System.out.print("\nSorts triés : ");
        for (String s : sorts)
        {
            System.out.print( s + " ");
        }
        HashSet<String> uniqueSorts = new HashSet<>(sorts);
        List<String> listSorted = new ArrayList<>(uniqueSorts);
        Collections.sort(listSorted);
        System.out.print("\nSorts uniques (par ordre alphabétique) : ");
        for (String s : listSorted)
        {
            System.out.print(s + " ");
        }

    }
}
