public class Main {
    public static void main(String[] args) {
        EntiteMagique[] entiteMagiques = new EntiteMagique[3];
        entiteMagiques[0] = new Pretre("Elyndra", 60);
        entiteMagiques[1] = new Guerrier("Ragnar", 85);
        entiteMagiques[2] = new Paladin("Solenor", 95);

        for (EntiteMagique entiteMagique : entiteMagiques) {
            entiteMagique.afficherInfos();
            if (entiteMagique instanceof Combattant combattant) {
                combattant.attaquer();
            }
            if (entiteMagique instanceof Soigneur soigneur) {
                soigneur.soigner();
            }
        }
    }
}
