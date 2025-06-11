public class Parchemin
{
    private String contenu;

    public Parchemin(String contenu)
    {
        this.contenu = contenu;
    }

    public void lire()
    {
        System.out.println("Lecture du parchemin : " + this.contenu);
    }
}
