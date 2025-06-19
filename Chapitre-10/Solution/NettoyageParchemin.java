import java.io.*;

public class NettoyageParchemin {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("parchemin.txt"));
            FileWriter fw = new FileWriter("parchemin_nettoye.txt", true);

            while (br.ready()) {
                String line = br.readLine();
                if (line.isBlank()) {
                    continue;
                }
                fw.write(line + "\n");
            }
            fw.close();
            br.close();
            System.out.println("Parchemin nettoyé avec succès.");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
