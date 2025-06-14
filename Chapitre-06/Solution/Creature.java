public class Creature
{
    String nom;
    int niveau;

    public Creature(String nom, int niveau)
    {
        this.nom = nom;
        this.niveau = niveau;
    }

    public void afficher()
    {
        System.out.println("Créature : " + nom + " (Niveau " + niveau + ")");
    }

    public void invoquerCreature(Creature c)
    {
        c.afficher();
    }

    public void parler()
    {
        System.out.println(nom + " dit : Je suis une créature d’Aleboréa.");
    }
}