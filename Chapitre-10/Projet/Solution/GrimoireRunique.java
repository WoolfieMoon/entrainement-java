import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class GrimoireRunique {

    public static void main(String[] args) {
        ArrayList<String> sorts = new ArrayList<>();
        sorts.add("Invisibilité");
        sorts.add("Invocation");
        sorts.add("Illusion");
        sorts.add("Explosion");
        sorts.add("Glaciation");

        enregistrerSorts(sorts);
        System.out.println();
        afficherGrimoire();
        System.out.println();
        filtrerSortsParLettre('I');
        System.out.println();
        archiverMajuscules();
    }

    public static void enregistrerSorts(List<String> sorts) {
        try {
            FileWriter fw = new FileWriter("grimoire.txt", true);
            for(String sort : sorts){
                fw.write(sort + "\n");
            }
            fw.close();
            System.out.println("Sorts enregistrés dans grimoire.txt.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void afficherGrimoire() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("grimoire.txt"));
            System.out.println("Contenu du grimoire :");
            while (br.ready()) {
                System.out.println(br.readLine());
            }
            br.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void filtrerSortsParLettre(char lettre) {
        try {
            System.out.println("Sorts commençant par " + lettre + " :");
            BufferedReader br = new BufferedReader(new FileReader("grimoire.txt"));
            while (br.ready()) {
               String line =  br.readLine();
               if (!line.startsWith(String.valueOf(lettre))) {
                   continue;
               }
               System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void archiverMajuscules() {
        try {
            FileWriter fw = new FileWriter("grimoire_archivage.txt", true);
            HashSet<String> sorts = new HashSet<>();
            BufferedReader br = new BufferedReader(new FileReader("grimoire.txt"));
            while (br.ready()) {
                sorts.add(br.readLine());
            }

            for(String sort : sorts){
                fw.write(sort + "\n");
            }

            fw.close();
            br.close();
            System.out.println("Grimoire archivé avec succès.");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
