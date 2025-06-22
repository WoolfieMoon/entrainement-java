import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FiltreSorts
{
    public static void main(String[] args)
    {
        try(FileReader fileReader = new FileReader("sorts.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader))
        {
            String line = bufferedReader.readLine();
            while ((line = bufferedReader.readLine()) != null)
            {
                if (line.charAt(0) == 'G')
                {
                    System.out.println(line);
                }

            }
        }
        catch (IOException e)
        {
            System.out.println("Erreur de lecture : " + e.getMessage());
        }
    }
}

