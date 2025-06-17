public class Paladin implements Soigneur,Combattant
{
    @Override
    public void attaquer()
    {
        System.out.println("Le Paladin frappe avec sa lame bénie.");
    }

    @Override
    public void seDefendre()
    {
        System.out.println("Le Paladin invoque un bouclier sacré.");
    }

    @Override
    public void soigner()
    {
        System.out.println("Le Paladin récite une prière curative.");
    }
}
