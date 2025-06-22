import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GrimoireRunique
{
    public static void main(String[] args)
    {
        ArrayList<String> sorts = new ArrayList<>();
        sorts.add("Invisibilité");
        sorts.add("Invocation");
        sorts.add("Illusion");
        sorts.add("Explosion");
        sorts.add("Glaciation");
        enregistrerSorts(sorts);
        afficherGrimoire();
        filtrerSortsParLettre('I');
        archiverMajuscules();
    }

    public static void enregistrerSorts(List<String> sorts)
    {
        try
        {
            BufferedWriter out = new BufferedWriter(new FileWriter("grimoire.txt", true));
            for (String sort : sorts)
            {
                out.write(sort + "\n");
            }
            out.close();
        }
        catch (IOException e)
        {
            System.out.println("L'ajout n'a pas fonctionné : " + e.getMessage());
        }
    }

    public static void afficherGrimoire()
    {
        System.out.print("Contenu du grimoire : ");
        try(FileReader fileReader = new FileReader("grimoire.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader))
        {
            String line;
            while ((line = bufferedReader.readLine()) != null)
            {
                System.out.print(line + " ");
            }
        }
        catch (IOException e)
        {
            System.out.println("Erreur de lecture : " + e.getMessage());
        }
    }

    public static void filtrerSortsParLettre(char lettre)
    {
        System.out.print("\nSorts commençant par " + lettre + " : ");
        try(FileReader fileReader = new FileReader("grimoire.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader))
        {
            String line = bufferedReader.readLine();
            while ((line = bufferedReader.readLine()) != null)
            {
                if (line.charAt(0) == lettre)
                {
                    System.out.print(line + " ");
                }

            }
        }
        catch (IOException e)
        {
            System.out.println("Erreur de lecture : " + e.getMessage());
        }
    }

    public static void archiverMajuscules()
    {
        try(FileReader fileReader = new FileReader("grimoire.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader))
        {
            String line;
            while ((line = bufferedReader.readLine()) != null)
            {
                try
                {
                    BufferedWriter out = new BufferedWriter(new FileWriter("grimoire_archivage.txt", true));
                    out.write(line.toUpperCase() + "\n");
                    out.close();
                }
                catch (IOException e)
                {
                    System.out.println("L'ajout n'a pas fonctionné : " + e.getMessage());
                }
            }
            System.out.println("\nGrimoire archivé avec succès.");
        }
        catch (IOException e)
        {
            System.out.println("Erreur de lecture : " + e.getMessage());
        }
    }
}
