public class MainProjet
{
    public static void main(String[] args)
    {
        Creature[] tab = new Creature[3];
        tab[0] = new Loup("Férox", 6, 35);
        tab[1] = new Dragon("Ignivar", 18,90);
        tab[2] = new Creature("Anonyme", 3);
        for (Creature c : tab)
        {
            c.afficher();
        }
    }
}
