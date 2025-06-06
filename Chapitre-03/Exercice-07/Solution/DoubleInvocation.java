public class DoubleInvocation
{
    public static void main(String[] args)
    {
        System.out.println(concatener("Feu","Glace") + " " + concatener("Feu", "Glace", "Foudre"));
    }

    public static String concatener(String a, String b)
    {
       return a + '+' + b;
    }

    public static String concatener(String a, String b, String c)
    {
        return a + '+' + b + '+' + c;
    }
}
