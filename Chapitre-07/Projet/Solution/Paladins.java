public class Paladins extends EntiteMagique implements Combattants,Soigneurs
{
    public Paladins(String nom, int puissance) {
        super(nom, puissance);
    }

    @Override
    public void attaquer()
    {
        System.out.println(this.nom + " attaque avec sa lame sacrée !");
    }

    @Override
    public void soigner()
    {
        System.out.println(this.nom + " invoque une lumière curative !");
    }
}
