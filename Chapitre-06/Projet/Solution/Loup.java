public class Loup extends Creature
{
    private int vitesse;

    public Loup(String nom, int niveau, int vitesse)
    {
        super(nom, niveau);
        this.vitesse = vitesse;
    }

    public void afficher()
    {
        System.out.println("Dragon : " + nom + " (Niveau " + niveau + ", Vitesse " + vitesse + ")");
    }

}
