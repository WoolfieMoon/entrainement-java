public class AnalyseurMana {
    public static void main(String[] args) {
        int[] mana = {42, 56, 33, 78, 12, 91};
        for (int oneMana : mana) {
            if (oneMana < 50) {
                continue;
            }
            System.out.println("Réservoir valide : " + oneMana);
        }
    }
}
