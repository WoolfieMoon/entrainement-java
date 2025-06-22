import java.io.*;

public class ParcheminMajuscule
{
    public static void main(String[] args)
    {
        try(FileReader fileReader = new FileReader("sorts.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader))
        {
            String line;
            while ((line = bufferedReader.readLine()) != null)
            {
                try
                {
                    BufferedWriter out = new BufferedWriter(new FileWriter("sorts_maj.txt", true));
                    out.write(line.toUpperCase());
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
