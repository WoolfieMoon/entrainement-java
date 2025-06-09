public class CoffreRunique {
    public static void main(String[] args) {
        boolean aCle = true;
        boolean aBague = false;

        if (!aCle || !aBague) {
            System.out.println("Le coffre refuse de s’ouvrir, une magie t’en empêche.");
            return;
        }

        System.out.println("Le coffre s’ouvre et révèle un artefact ancien.");
    }
}
