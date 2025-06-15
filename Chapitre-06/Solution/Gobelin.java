public class Gobelin extends Creature {

    protected int ruse;

    public Gobelin(String nom, int niveau, int ruse) {
        super(nom, niveau);
        this.ruse = ruse;
    }

    public void afficherRuse() {
        System.out.println("Ruse du gobelin : " + ruse);
    }

}
