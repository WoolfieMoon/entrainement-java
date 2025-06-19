import java.io.FileWriter;
import java.io.IOException;

public class SortsParchemin {

    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("sorts.txt", true);
            fw.write("Flamme\n");
            fw.write("Éclair\n");
            fw.write("Gel\n");
            fw.write("Soin\n");
            fw.close();
            System.out.println("Les sorts ont été ajoutés !");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}
