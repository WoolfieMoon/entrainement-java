public class Main {
    public static void main(String[] args) {
        Creature[] creatures = new Creature[3];
        creatures[0] = new Loup("Férox", 6, 35);
        creatures[1] = new Dragon("Ignivar", 18, 90);
        creatures[2] = new Creature("Anonyme", 3);

        for (Creature creature : creatures) {
            creature.afficher();
        }
    }
}
