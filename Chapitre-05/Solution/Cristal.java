public class Cristal
{
    private String couleur;
    private int energie;

    public Cristal(String couleur, int energie)
    {
        this.couleur = couleur;
        this.energie = energie;
    }

    public void decrire()
    {
        System.out.println("Cristal " + this.couleur + " contenant " + this.energie + " unités d'énergie");
    }
}
