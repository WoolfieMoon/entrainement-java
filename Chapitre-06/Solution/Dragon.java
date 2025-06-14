public class Dragon extends Creature {
    int feu;

    public Dragon(String nom, int niveau, int feu)
    {
        super(nom, niveau);
        this.feu = feu;
    }

    public void afficher()
    {
        System.out.println("Dragon : " + nom + " (Niveau " + niveau + ", Feu " + feu + ")");
    }

}