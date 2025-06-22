import java.io.*;

public class FusionParchemins
{
    public static void main(String[] args)
    {
        copierFichier("sorts.txt", "grimoire_complet.txt");
        copierFichier("artefacts.txt", "grimoire_complet.txt");
        System.out.println("Grimoire complet généré");
    }

    public static void copierFichier(String source, String dest)
    {
        try(FileReader fileReader = new FileReader(source);
            BufferedReader bufferedReader = new BufferedReader(fileReader))
        {
            String line;
            while ((line = bufferedReader.readLine()) != null)
            {
                try
                {
                    BufferedWriter out = new BufferedWriter(new FileWriter(dest, true));
                    out.write(line + "\n");
                    out.close();
                }
                catch (IOException e)
                {
                    System.out.println("L'ajout n'a pas fonctionné : " + e.getMessage());
                }
            }
        }
        catch (IOException e)
        {
            System.out.println("Erreur de lecture : " + e.getMessage());
        }
    }
}
