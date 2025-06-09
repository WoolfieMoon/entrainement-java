public class SortRecursif {
    public static void main(String[] args) {
        int nombre = 5;
        System.out.println("Factorielle de " + nombre + " : " + factorielle(nombre));
    }

    public static int factorielle(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorielle(n - 1);
        }
    }
}
