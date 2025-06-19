import java.io.*;

public class ParcheminMajuscule {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("sorts.txt"));
            FileWriter fw = new FileWriter("sorts_maj.txt", true);

            while (br.ready()) {
                fw.write(br.readLine().toUpperCase() + "\n");
            }
            fw.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
