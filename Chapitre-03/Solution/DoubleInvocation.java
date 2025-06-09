public class DoubleInvocation {
    public static void main(String[] args) {
        String a = "Feu";
        String b = "Glace";
        String c = "Foudre";
        System.out.print(concatener(a, b) + " " + concatener(a, b, c));
    }

    public static String concatener(String a, String b) {
        return a + "+" + b;
    }

    public static String concatener(String a, String b, String c) {
        return a + "+" + b + "+" + c;
    }
}
