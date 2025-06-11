public class Creature
{
    private String nom;
    private int niveau;

    public Creature(String nom, int niveau)
    {
        this.nom = nom;
        this.niveau = niveau;
    }

    public void gagnerNiveau()
    {
        this.niveau++;
    }

    public void afficherNiveau()
    {
        System.out.println("Niveau actuel de " + this.nom + " : " + this.niveau);
    }
}
