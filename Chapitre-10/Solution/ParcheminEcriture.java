import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ParcheminEcriture
{
    public static void main(String[] args)
    {
        // Exercice 1
        try
        {
            FileWriter writer = new FileWriter("parchemin.txt");
            writer.write("Ceci est le début du savoir ancien.\n");
            writer.close();
        }
        catch (IOException e)
        {
            System.out.println("L'écriture n'a pas fonctionné : " + e.getMessage());
        }

        // Exercice 3
        try
        {
            BufferedWriter out = new BufferedWriter(new FileWriter("parchemin.txt", true));
            out.write("Ceci est une annotation du Conseil.");
            out.close();
        }
        catch (IOException e)
        {
            System.out.println("L'ajout n'a pas fonctionné : " + e.getMessage());
        }
    }
}
