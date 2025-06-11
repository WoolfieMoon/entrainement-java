public class Ombre
{
    private String nom;
    private String type;

    public Ombre(String nom, String type)
    {
        this.nom = nom;
        this.type = type;
    }

    public void afficherOmbre()
    {
        System.out.println("Ombre invoquée : " + this.nom + " de type " + this.type);
    }
}
