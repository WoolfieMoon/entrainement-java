public class Pretres extends EntiteMagique implements Soigneurs
{
    public Pretres(String nom, int puissance) {
        super(nom, puissance);
    }

    @Override
    public void soigner()
    {
        System.out.println(this.nom + " soigne ses alliés...");
    }
}
