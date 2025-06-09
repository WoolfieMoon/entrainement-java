public class AccesCiteElevee {
    public static void main(String[] args) {
        int niveau = 12;
        String objet = "Amulette Céleste";
        String alignement = "loyal";

        if (niveau < 10 || !objet.equals("Amulette Céleste") || !alignement.equals("loyal")) {
            System.out.println("Le Gardien t’arrête. Tu n’as pas encore prouvé ta valeur.");
            return;
        }

        System.out.println("Le Gardien s’écarte. Tu peux entrer dans la Cité Élevée.");
    }
}
