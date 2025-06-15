public class Creature {
    protected String nom;
    protected int niveau;

    Creature(String nom, int niveau) {
        this.nom = nom;
        this.niveau = niveau;
    }

    public void afficher() {
        System.out.println("Créature : " + nom + " (Niveau " + niveau + ")");
    }

    public void parler() {
        System.out.println(this.nom + " dit : Je suis une créature d’Aleboréa.");
    }
}
