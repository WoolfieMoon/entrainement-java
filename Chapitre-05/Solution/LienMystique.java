public class LienMystique
{
    private String source;
    private String cible;

    public LienMystique(String source, String cible)
    {
        this.source = source;
        this.cible = cible;
    }

    public void afficherLien()
    {
        System.out.println("Lien mystique entre " + this.source + " et " + this.cible);
    }
}
