public class MainProjet
{
    public static void main(String[] args)
    {
        EntiteMagique[] tab = new EntiteMagique[3];
        tab[0] = new Pretres("Elyndra", 60);
        tab[1] = new Guerrier("Ragnar", 85);
        tab[2] = new Paladins("Solenor", 95);

        for (EntiteMagique em : tab)
        {
            em.afficherInfos();
            if (em instanceof Combattants)
            {
                ((Combattants) em).attaquer();
            }
            if (em instanceof Soigneurs)
            {
                ((Soigneurs) em).soigner();
            }
        }
    }
}
