public class Voleur implements Combattant
{
    @Override
    public void attaquer()
    {
        System.out.println("Le Voleur frappe dans l'ombre.");
    }

    @Override
    public void seDefendre()
    {
        System.out.println("Le voleur esquive habilement");
    }
}
