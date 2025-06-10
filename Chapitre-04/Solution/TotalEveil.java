public class TotalEveil
{
    public static void main(String[] args)
    {
        int[] orbes = {10, 20, 30, 40, 50};
        int total = 0 ;
        for (int orbe : orbes)
        {
            total += orbe;
        }
        System.out.println("Énergie totale : " + total);
    }
}
