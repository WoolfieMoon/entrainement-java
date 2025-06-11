public class Heros
{
    private String nom;
    private int force;
    private int intelligence;

    public Heros(String nom, int force, int intelligence)
    {
        this.nom = nom;
        this.force = force;
        this.intelligence = intelligence;
    }

    public void afficherStats()
    {
        System.out.println("Nom : " + this.nom);
        System.out.println("Force : " + this.force);
        System.out.println("Intelligence : " + this.intelligence);
    }
}
