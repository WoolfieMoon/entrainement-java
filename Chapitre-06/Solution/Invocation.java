public class Invocation {

    protected int code;

    public Invocation(int code) {
        this.code = code;
    }

    public Creature genererCreature() {
        Creature creature = null;
        switch (this.code) {
            case 1:
                creature = new Gobelin("Lurk", 3, 9);
                break;
            case 2:
                creature = new Dragon("Pyron", 18, 77);
                break;
            default:
                creature = new Creature("Inconnu", 1);
                break;
        }
        return creature;
    }
}
