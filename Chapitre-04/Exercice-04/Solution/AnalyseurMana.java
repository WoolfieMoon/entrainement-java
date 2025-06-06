public class AnalyseurMana
{
    public static void main(String[] args)
    {
        int[] mana = {42, 56, 33, 78, 12, 91};
        for (int reserve : mana)
        {
            if (reserve >= 50)
            {
                System.out.print("Réservoir valide : " + reserve + " ");
            }
        }
    }
}
