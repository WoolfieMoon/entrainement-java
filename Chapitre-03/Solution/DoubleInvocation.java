public class DoubleInvocation
{
    public static void main(String[] args)
    {
        String concat1 = concatener("Feu", "Glace");
        String concat2 = concatener("Feu", "Glace", "Foudre");
        System.out.println(concat1 + "\n" + concat2);
    }

    public static String concatener(String a, String b)
    {
        return a + "+" + b;
    }

    public static String concatener(String a, String b, String c)
    {
        return a + "+" + b + "+" + c;
    }
}
