import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ParcheminEcriture {

    public static void main(String[] args) {

        try {
            FileWriter fw = new FileWriter("parchemin.txt");
            fw.write("Ceci est le début du savoir ancien.\n");
            fw.close();

            BufferedReader br = new BufferedReader(new FileReader("parchemin.txt"));
            while (br.ready()) {
                System.out.println(br.readLine());
            }
            br.close();

            fw = new FileWriter("parchemin.txt",  true);
            fw.write("Ceci est une annotation du Conseil.\n");
            fw.close();
            System.out.println("Annotation ajoutée.");

            br = new BufferedReader(new FileReader("parchemin.txt"));
            while (br.ready()) {
                System.out.println(br.readLine());
            }
            br.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
