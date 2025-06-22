import java.io.*;

public class NettoyageParchemin
{
    public static void main(String[] args)
    {
        try(FileReader fileReader = new FileReader("parchemin.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader))
        {
            String line;
            while ((line = bufferedReader.readLine()) != null && !line.isBlank())
            {
                try
                {
                    BufferedWriter out = new BufferedWriter(new FileWriter("parchemin_nettoye.txt", true));
                    out.write(line);
                    out.close();
                }
                catch (IOException e)
                {
                    System.out.println("L'ajout n'a pas fonctionné : " + e.getMessage());
                }
            }
            System.out.println("Parchemin nettoyé avec succès");
        }
        catch (IOException e)
        {
            System.out.println("Erreur de lecture : " + e.getMessage());
        }
    }
}
