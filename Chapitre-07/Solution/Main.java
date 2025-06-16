public class Main {

    public static void referencer(Combattant c) {
        System.out.println("Entité référencée : " + c.getClass().getSimpleName());
    }

    public static void main(String[] args) {
        Combattant[] Combatant = new Combattant[2];
        Combatant[0] = new Chevalier();
        Combatant[1] = new Voleur();

        for (Combattant combattant : Combatant) {
            combattant.attaquer();
            combattant.seDefendre();
        }

        System.out.println();

        Spectre nox = new Spectre("nox");
        nox.afficherNom();
        nox.utiliserPouvoir();

        System.out.println();

        Chimere korga = new Chimere("korga");
        korga.utiliserPouvoir();
        korga.attaquer();
        korga.seDefendre();

        System.out.println();

        Chevalier chevalier = new Chevalier();
        Voleur voleur = new Voleur();

        referencer(chevalier);
        referencer(voleur);
        referencer(korga);

        System.out.println();

        Object[] objects = new Object[3];
        objects[0] = chevalier;
        objects[1] = voleur;
        objects[2] = nox;

        for (Object object : objects) {
            if (!(object instanceof Combattant combattant)) {
                System.out.println("Cette entité n’a signé aucun pacte de combat.");
                continue;
            }
            combattant.attaquer();
        }

        System.out.println();

        Pretre pretre = new Pretre();
        Druide druide = new Druide();

        pretre.soigner();
        druide.soigner();

        System.out.println();

        Paladin paladin = new Paladin();

        paladin.attaquer();
        paladin.seDefendre();
        paladin.soigner();

        System.out.println();

        Object[] objects1 = new Object[3];
        objects1[0] = voleur;
        objects1[1] = pretre;
        objects1[2] = paladin;
        for (Object object : objects1) {
            if (object instanceof Combattant combattant) {
                combattant.attaquer();
            }
            if (object instanceof Soigneur soigneur) {
                soigneur.soigner();
            }
            System.out.println("Classe : " + object.getClass().getSimpleName());
        }

    }
}
