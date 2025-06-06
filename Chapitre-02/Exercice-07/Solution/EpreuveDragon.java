public class EpreuveDragon
{
    public static void main(String[] args)
    {
        int force = 160;
        if (force >= 150)
        {
            System.out.println("Le dragon te craint et te demande de partir.");
        }
        else if (force >= 70)
        {
            System.out.println("Le dragon incline la tête : tu es digne.");
        }
        else
        {
            System.out.println("Le dragon ne te remarque même pas.");
        }
    }
}
