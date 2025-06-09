public class RituelCombine {
    public static void main(String[] args) {
        afficherPuissance(amplifier(30, 12));
    }

    public static int amplifier(int base, int bonus) {
        return base + bonus;
    }

    public static void afficherPuissance(int puissance) {
        System.out.println("Puissance finale : "  + puissance);
    }
}
