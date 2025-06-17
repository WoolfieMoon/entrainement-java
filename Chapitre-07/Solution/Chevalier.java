public class Chevalier implements Combattant
{
    @Override
    public void attaquer()
    {
        System.out.println("Le chevalier frappe avec son épée !");
    }

    @Override
    public void seDefendre()
    {
        System.out.println("Le chevalier lève son bouclier.");
    }
}
