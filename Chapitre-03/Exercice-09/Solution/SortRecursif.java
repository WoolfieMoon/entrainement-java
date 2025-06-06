public class SortRecursif
{
    public static void main(String[] args)
    {
        int n = 5;
        int res = factorielle(n);
        System.out.println("Factorielle de " + n + " : " + res);
    }

    public static int factorielle(int n)
    {
        if (n <= 1)
        {
            return 1;
        }
        else
        {
            n = n * factorielle(n - 1);
            return n;
        }
    }
}
