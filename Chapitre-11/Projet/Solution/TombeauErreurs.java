import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TombeauErreurs {

    public static void main(String[] args) {
        try {
            /*
            FileWriter fw = new FileWriter("invocations.txt", true);

            fw.write("Feu:10\n");
            fw.write("Eau:0\n");
            fw.write(":30\n");
            fw.write("Interdit:50\n");
            fw.write("Air:20\n");

            fw.close();
             */
            BufferedReader br = new BufferedReader(new FileReader("invocations.txt"));
            while(br.ready()){
                try {
                    traiterInvocation(br.readLine());
                } catch (Exception e) {
                    try {
                        FileWriter fw = new FileWriter("erreurs.log", true);
                        fw.write(e.getMessage() + "\n");
                        fw.close();
                    } catch (IOException ex) {
                        System.out.println(ex.getMessage());
                    }

                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void traiterInvocation(String ligne) {
        String[] myArray = ligne.split("[:]");
        String sort = myArray[0];
        int puissance = Integer.parseInt(myArray[1]);
        if (sort.isBlank() || puissance < 0) {
            throw  new IllegalArgumentException("Erreur détectée : ligne mal formée");
        }
        if (sort.equals("Interdit")) {
            throw new SecurityException("Erreur détectée : sort interdit");
        }
        if (puissance == 0) {
            throw new ArithmeticException("Erreur détectée : division par zéro pour " + myArray[0]);
        }
        System.out.println("Sort lancé : " + myArray[0] + " (puissance " + myArray[1] + ")");

    }

}
