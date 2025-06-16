public class Voleur implements Combattant {

    public void attaquer() {
        System.out.println("Le Voleur frappe dans l’ombre.");
    }

    public void seDefendre() {
        System.out.println("Le Voleur esquive habilement.");
    }

    public static void main(String[] args) {
        Voleur voleur = new Voleur();
        voleur.attaquer();
        voleur.seDefendre();
    }

}
