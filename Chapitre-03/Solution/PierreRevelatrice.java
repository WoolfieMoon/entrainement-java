public class PierreRevelatrice {
    public static void main(String[] args) {
        boolean resulat = estPaire(57);
        System.out.println("Le nombre est pair : " + resulat);
    }

    public static boolean estPaire(int nombre) {
        return nombre % 2 == 0;
    }
}
