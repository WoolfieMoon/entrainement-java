import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CompteurLignes
{
    public static void main(String[] args)
    {
        int compteur = 0;

        try(FileReader fileReader = new FileReader("parchemin.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader))
        {
            String line;
            while ((line = bufferedReader.readLine()) != null)
            {
                compteur++;
            }
        }
        catch (IOException e)
        {
            System.out.println("Erreur de lecture : " + e.getMessage());
        }
        System.out.println("Nombres de lignes : " + compteur);
    }
}
