public class ElixirSagesse {
    public static void main(String[] args) {
        double manaRune1 = 56.8;
        double manaRune2 = 42.4;

        double moyenneMana = (manaRune1 + manaRune2) / 2;

        System.out.println("Quantité moyenne de mana : " + Math.round(moyenneMana * 10.0) / 10.0);
    }
}
