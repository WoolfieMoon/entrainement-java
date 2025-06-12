public class Creature {

    String nom;
    int niveau;

    Creature(String nom, int niveau) {
        this.nom = nom;
        this.niveau = niveau;
    }

    public void gagnerNiveau() {
        this.niveau++;
    }

    public void afficherNiveau() {
        System.out.println("Niveau actuel de " + this.nom + " : " + this.niveau);
    }

    public static void main(String[] args) {
        Creature creature = new Creature("Sylphide", 3);
        creature.gagnerNiveau();
        creature.afficherNiveau();
    }

}
