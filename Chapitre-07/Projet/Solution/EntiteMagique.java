public abstract class EntiteMagique
{
    String nom;
    int puissance;

    public EntiteMagique(String nom, int puissance)
    {
        this.nom = nom;
        this.puissance = puissance;
    }

    public void afficherInfos()
    {
        System.out.println("Nom : " + nom);
        System.out.println("Puissance : " + puissance);
    }
}
