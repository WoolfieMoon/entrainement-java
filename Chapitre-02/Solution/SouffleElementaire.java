import java.util.Arrays;

public class SouffleElementaire {
    public static void main(String[] args) {
        String element = "glace";

        if (element.equals("feu")) {
            System.out.println("Un souffle de flammes embrase le champ de bataille !");
        } else if (element.equals("glace")) {
            System.out.println("Un vent gelé fige tout sur son passage...");
        } else if (element.equals("foudre")) {
            System.out.println("L’éclair jaillit, rapide comme la pensée !");
        } else {
            System.out.println("L’élément est inconnu, le sort échoue.");
        }
    }
}
