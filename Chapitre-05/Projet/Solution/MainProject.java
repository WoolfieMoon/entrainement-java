public class MainProject
{
    public static void main(String[] args)
    {
        CreatureMagique[] tab = new CreatureMagique[3];
        tab[0] = new CreatureMagique("Lirien", "Sylphide", 12);
        tab[1] = new CreatureMagique("Braxor", "Golem", 20);
        tab[2] = new CreatureMagique("Nymis", "Chimère", 17);

        for (CreatureMagique creature : tab)
        {
            creature.afficherFiche();
        }
    }
}
