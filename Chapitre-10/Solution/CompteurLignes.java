import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;

public class CompteurLignes {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("parchemin.txt"));
            System.out.println("Nombre de lignes : " + br.lines().count());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


}
