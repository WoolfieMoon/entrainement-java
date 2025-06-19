import java.io.*;

public class FiltreSorts {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("sorts.txt"));
            while (br.ready()) {
                String line = br.readLine();
                if (!line.startsWith("G")) {
                    continue;
                }
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
