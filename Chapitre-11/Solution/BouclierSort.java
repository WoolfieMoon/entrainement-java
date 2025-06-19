public class BouclierSort {

    public static int diviser(int a, int b) {
        try {
            return a/b;
        } catch (ArithmeticException e) {
            return -1;
        }
    }

    public static void main(String[] args) {
        System.out.println(diviser(10, 2));
        System.out.println(diviser(10, 0));
    }

}
