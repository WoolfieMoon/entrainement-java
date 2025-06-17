public abstract class CreatureMystique
{
    private String nom;

    public CreatureMystique(String nom)
    {
        this.nom = nom;
    }

    public abstract void utiliserPouvoir();

    public void afficherNom()
    {
        System.out.println(this.getClass().getSimpleName() + " : " + this.nom);
    }
}
