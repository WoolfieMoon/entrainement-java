public class Main {
    public static void main(String[] args) {
        Creature mystik = new Creature("Mystik", 10);
        Gobelin truk = new Gobelin("Truk", 5, 12);
        Dragon ignis =  new Dragon("Ignis", 20, 80);
        DragonVolant skyrend = new DragonVolant("Skyrend", 22, 90, 3000);
        mystik.afficher();
        truk.afficher();
        truk.afficherRuse();
        ignis.afficher();

        System.out.println();

        invoquerCreature(truk);
        invoquerCreature(ignis);

        System.out.println();

        Creature[] lesCreatures = new Creature[3];

        lesCreatures[0] = new Gobelin("Grub", 4, 10);
        lesCreatures[1] = new Dragon("Flamis", 18, 60);
        lesCreatures[2] = new Creature("Bête étrange", 7);

        for (Creature creature : lesCreatures) {
            creature.afficher();
        }

        System.out.println();

        skyrend.afficher();

        System.out.println();

        for (Creature creature : lesCreatures) {
            if(!(creature instanceof Dragon dragon)) {
                System.out.println(creature.nom);
                continue;
            }
            System.out.println("Feu du dragon : " + dragon.feu);
        }

        System.out.println();

        for (Creature creature : lesCreatures) {
            System.out.println(creature.nom + " est une instance de : " + creature.getClass().getSimpleName());
        }

        System.out.println();

        for (Creature creature : lesCreatures) {
            creature.parler();
        }

        System.out.println();

        Invocation gobelin = new Invocation(1);
        gobelin.genererCreature().afficher();

        Invocation dragon = new Invocation(2);
        dragon.genererCreature().afficher();

        Invocation creature = new Invocation(42);
        creature.genererCreature().afficher();

        System.out.println();
    }

    public static void invoquerCreature(Creature c) {
        c.afficher();
    }
}
