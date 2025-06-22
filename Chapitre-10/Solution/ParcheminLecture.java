import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ParcheminLecture
{
    public static void main(String[] args)
    {
        try(FileReader fileReader = new FileReader("parchemin.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader))
        {
            String line;
            while ((line = bufferedReader.readLine()) != null)
            {
                System.out.println(line);
            }
        }
        catch (IOException e)
        {
            System.out.println("Erreur de lecture : " + e.getMessage());
        }
    }
}
