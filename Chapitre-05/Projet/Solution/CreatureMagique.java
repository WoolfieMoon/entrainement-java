public class CreatureMagique
{
    private String nom;
    private String espece;
    private int niveau;

    public CreatureMagique(String nom, String espece, int niveau)
    {
        this.nom = nom;
        this.espece = espece;
        this.niveau = niveau;
    }

    public void afficherFiche()
    {
        System.out.println("Nom : " + this.nom);
        System.out.println("Espèce : " + this.espece);
        System.out.println("Niveau : " + this.niveau);
    }
}
