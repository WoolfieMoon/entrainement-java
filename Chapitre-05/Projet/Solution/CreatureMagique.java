public class CreatureMagique {

    String nom;
    String espece;
    int niveau;

    CreatureMagique(String nom, String espece, int niveau) {
        this.nom = nom;
        this.espece = espece;
        this.niveau = niveau;
    }

    public void afficherFiche() {
        System.out.println("Nom : " + this.nom);
        System.out.println("Espece : " + this.espece);
        System.out.println("Niveau : " + this.niveau);
    }

    public static void main(String[] args) {
        CreatureMagique[] tab = {
                new CreatureMagique("Lirien", "Sylphide", 12),
                new CreatureMagique("Braxor", "Golem", 20),
                new CreatureMagique("Nymis", "Chimère", 17),
        };

        for (CreatureMagique creatureMagique : tab) {
            creatureMagique.afficherFiche();
            System.out.println();
        }
    }
}
