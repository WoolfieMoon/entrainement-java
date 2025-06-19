import java.io.*;

public class FusionParchemins {

    public static void main(String[] args) {
        try {
            BufferedReader sorts = new BufferedReader(new FileReader("sorts.txt"));
            BufferedReader parchemin = new BufferedReader(new FileReader("parchemin.txt"));
            FileWriter fw = new FileWriter("grimoire_complet.txt", true);

            while (sorts.ready()) {
                fw.write(sorts.readLine() + "\n");
            }

            while (parchemin.ready()) {
                fw.write(parchemin.readLine() + "\n");
            }

            fw.close();
            System.out.println("Grimoire complet généré.");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}