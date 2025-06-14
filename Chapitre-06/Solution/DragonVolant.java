public class DragonVolant extends Dragon
{
    private int altitude;
    public DragonVolant(String nom, int niveau, int feu, int altitude)
    {
        super(nom, niveau, feu);
        this.altitude = altitude;
    }

    public void afficher()
    {
        System.out.println("Dragon : " + nom + " (Niveau " + niveau + ", Feu " + feu + ", Altitude " + altitude + ")");
    }
}