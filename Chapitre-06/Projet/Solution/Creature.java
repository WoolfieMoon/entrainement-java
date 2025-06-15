public class Creature {

    protected String nom;
    protected int niveau;

    public Creature(String nom, int niveau) {
        this.nom = nom;
        this.niveau = niveau;
    }

    public void afficher() {
        System.out.println("Créature : " + this.nom + " (Niveau " + this.niveau +")");
    }
}
