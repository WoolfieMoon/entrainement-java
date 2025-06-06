public class IndexDragon
{
    public static void main(String[] args)
    {
        String[] creatures = {"Gobelin", "Chauve-Souris", "Dragon", "Golem", "Spectre"};
        boolean trouve = false;
        for (int i = 0; i < creatures.length; i++)
        {
            if(creatures[i].equals("Dragon"))
            {
                trouve = true;
                System.out.println("Dragon trouvé à l'index : " + i);
            }
        }

        if (!trouve)
        {
            System.out.println("Le Dragon est introuvable dans cette dimension.");
        }
    }
}
