public class Loup extends Creature {

    protected int vitesse;

    public Loup(String nom, int niveau, int vitesse) {
        super(nom, niveau);
        this.vitesse = vitesse;
    }

    public void afficher() {
        System.out.println("\uD83D\uDC3A Loup : " + this.nom + " (Niveau " + this.niveau + ", Vitesse : " + this.vitesse + ")");
    }

}
