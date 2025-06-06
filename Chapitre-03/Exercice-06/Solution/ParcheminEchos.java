public class ParcheminEchos
{
    public static void main(String[] args)
    {
        int[] energies = {5, 8, 13, 21};
        afficherElements(energies);
    }

    public static void afficherElements(int[] tab)
    {
        for (int nb : tab)
        {
            System.out.print(" " + nb);
        }
    }
}
