public class Chimere extends CreatureMystique implements Combattant
{
    private int force;

    public Chimere(String nom)
    {
        super(nom);
    }

    @Override
    public void utiliserPouvoir()
    {
        System.out.println("La Chimère rugit et déploie ses ailes !");
    }

    @Override
    public void attaquer()
    {
        System.out.println("La Chimère griffe violemment !");
    }

    @Override
    public void seDefendre()
    {
        System.out.println("La chimère se replie dans la brume.");
    }
}
