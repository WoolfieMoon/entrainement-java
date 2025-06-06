public class SortMiroir
{
    public static void main(String[] args)
    {
        String reverse = inverser("arcane");
        System.out.println("Mot inversé : " + reverse);
    }

    public static String inverser(String mot)
    {
        String reverse = "";
        for (int i = mot.length()-1; i>=0; i--)
        {
            reverse = reverse + mot.charAt(i);
        }

        return reverse;
    }
}
