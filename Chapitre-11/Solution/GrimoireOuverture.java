import java.io.*;

public class GrimoireOuverture {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("test.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("Le grimoire est introuvable dans la bibliothèque.");
        }

    }

}
