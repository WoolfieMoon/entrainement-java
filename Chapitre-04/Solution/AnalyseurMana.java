public class AnalyseurMana
{
    public static void main(String[] args)
    {
        int[] mana = {42, 56, 33, 78, 12, 91};
        for (int tank : mana)
        {
            if (tank >= 50)
            {
                System.out.println("Réservoir valide : " + tank);
            }
        }
    }
}
