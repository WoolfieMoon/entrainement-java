import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ArchivageArtefacts
{
    public static void main(String[] args)
    {
        ArrayList<String> artefacts = new ArrayList<>();
        artefacts.add("Amulette du Souffle");
        artefacts.add("Cape des Ombres");
        artefacts.add("Orbe de Vérité");
        try
        {
            BufferedWriter out = new BufferedWriter(new FileWriter("artefacts.txt", true));
            for (String artefact : artefacts)
            {
                out.write(artefact+"\n");
            }
            out.close();
            System.out.println("Artefacts archivés");
        }
        catch (IOException e)
        {
            System.out.println("L'ajout n'a pas fonctionné : " + e.getMessage());
        }
    }
}
