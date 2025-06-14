public class Main implements Invocation
{
    public static void main(String[] args)
    {
        // Exercice 1
        Creature creature = new Creature("Mystik",10);
        creature.afficher();

        // Exercice 2
        Gobelin gobelin = new Gobelin("Truk", 5, 12);
        gobelin.afficher();
        gobelin.afficherRuse();

        // Exercice 3
        Dragon dragon = new Dragon("Ignis",20,80);
        dragon.afficher();

        // Exercice 4
        gobelin.invoquerCreature(gobelin);
        dragon.invoquerCreature(dragon);

        // Exercice 5
        Creature[] tab = new Creature[3];
        tab[0] = new Gobelin("Grub", 4, 10);
        tab[1] = new Dragon("Flamis", 18,60);
        tab[2] = new Creature("Bête étrange", 7);
        for (Creature c : tab)
        {
            c.afficher();
        }

        // Exercice 6
        DragonVolant dragonVolant = new DragonVolant("Skyrend", 22, 90, 3000);
        dragonVolant.afficher();

        // Exercice 7
        for (Creature c : tab)
        {
            if (c instanceof Dragon)
            {
                c = (Dragon) c;
                System.out.println("Feu du dragon : " + ((Dragon) c).feu);
            }
            else
            {
                System.out.println("Nom : " + c.nom);
            }
        }

        // Exercice 8
        for (Creature c : tab)
        {
            System.out.println(c.nom + " est une instance de : " + c.getClass().getSimpleName());
        }

        // Exercice 9
        for (Creature c : tab)
        {
            c.parler();
        }

        // Exercice 10
        Creature c1 = Invocation.genererCreature(1);
        c1.afficher();
        Creature c2 = Invocation.genererCreature(2);
        c2.afficher();
        Creature c3 = Invocation.genererCreature(42);
        c3.afficher();
    }
}
