public class SortRecursif
{
    public static void main(String[] args)
    {
        int nb = 4;
        System.out.println("Factorielle de " + nb + " : " + factorielle(nb));
    }

    public static int factorielle(int n)
    {
        if (n <= 1)
        {
            return 1;
        }
        else
        {
            return n * factorielle(n - 1);
        }
    }
}
