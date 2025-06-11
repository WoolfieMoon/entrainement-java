public class Fontaine
{
    private double pureté;
    private int runes;

    public Fontaine(double pureté)
    {
        this.pureté = pureté;
    }

    public void calculerRunes()
    {
        this.runes = (int) (pureté*10);
    }

    public void afficherEtat()
    {
        System.out.println("Fontaine de pureté " + this.pureté + " contient " + this.runes + " runes.");
    }
}
