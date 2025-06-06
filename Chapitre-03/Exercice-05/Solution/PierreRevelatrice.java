public class PierreRevelatrice
{
    public static void main(String[] args)
    {
        boolean res = estPaire(57);
        System.out.println("Le nombre est pair : " + res);
    }

    public static boolean estPaire(int nombre)
    {
        return nombre % 2 == 0;
    }
}
