import java.io.FileWriter;
import java.io.IOException;

public class SortsParchemin
{
    public static void main(String[] args)
    {
        try
        {
            FileWriter writer = new FileWriter("sorts.txt");
            writer.write("Flamme \n");
            writer.write("Éclair \n");
            writer.write("Gel \n");
            writer.write("Soin \n");
            writer.close();
            System.out.println("Les sorts ont bien été ajoutés");
        }
        catch (IOException e)
        {
            System.out.println("L'écriture n'a pas fonctionné : " + e.getMessage());
        }
    }
}
