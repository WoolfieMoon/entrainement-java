public class VerdictConseil {
    public static void main(String[] args) {
        boolean enigme1Reussie = true;
        boolean enigme2Reussie = true;
        boolean enigme3Reussie = false;

        if (!enigme1Reussie || !enigme2Reussie || !enigme3Reussie) {
            System.out.println("Le Conseil reste silencieux. Reviens mieux préparé.");
            return;
        }

        System.out.println("Le Conseil t’accorde le titre d’Héritier du Code.");
    }
}
