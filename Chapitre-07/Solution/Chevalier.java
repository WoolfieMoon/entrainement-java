public class Chevalier implements Combattant {

    public void attaquer() {
        System.out.println("Le Chevalier frappe avec son épée !");
    }

    public void seDefendre() {
        System.out.println("Le Chevalier lève son bouclier.");
    }

    public static void main(String[] args) {
        Chevalier chevalier = new Chevalier();
        chevalier.attaquer();
        chevalier.seDefendre();
    }
}
