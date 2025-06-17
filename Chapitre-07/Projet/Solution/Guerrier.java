public class Guerrier extends EntiteMagique implements Combattants
{
    public Guerrier(String nom, int puissance)
    {
        super(nom, puissance);
    }

    @Override
    public void attaquer()
    {
        System.out.println(this.nom + " attaque avec sa hache runique !");
    }
}
