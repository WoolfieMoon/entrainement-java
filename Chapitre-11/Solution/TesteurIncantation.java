public class TesteurIncantation {

    public static void main(String[] args) {
        try {
            System.out.println(1/0);
        } catch (ArithmeticException e) {
            System.out.println("Impossible de diviser par 0");
        }

        try {
            String[] test = new String[10];
            System.out.println(test[test.length]);
        }  catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("L'index n'est pas dans le tableau");
        }

        try {
            feur(null);
        } catch (NullPointerException e) {
            System.out.println("La paramètre ne doit pas etre null");
        }
    }

    public static void feur(String test) {
        System.out.println(test.toUpperCase());
    }

}
