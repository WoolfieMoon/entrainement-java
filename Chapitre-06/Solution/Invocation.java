public interface Invocation
{
    public static Creature genererCreature(int code)
    {
        switch (code)
        {
            case 1 -> {
                return new Gobelin("Lurk", 3, 9);
            }
            case 2 -> {
                return new Dragon("Pyro", 18, 77);
            }
            default -> {
                return new Creature("Inconnu", 1);
            }
        }
    }
}

