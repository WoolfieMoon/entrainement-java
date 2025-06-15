public class Dragon extends Creature{

    protected int feu;

    public Dragon(String nom, int niveau, int feu) {
        super(nom, niveau);
        this.feu = feu;
    }

    public void afficher(){
        System.out.println("\uD83D\uDC09 Dragon : " + this.nom + " (Niveau " + this.niveau + ", Feu : " + this.feu +")");
    }

}
