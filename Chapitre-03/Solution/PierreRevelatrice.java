public class PierreRevelatrice
{
    public static void main(String[] args)
    {
        System.out.println("Le nombre est pair : " + estPaire(57));
    }

    public static boolean estPaire(int nombre)
    {
        return nombre % 2 == 0;
    }
}
