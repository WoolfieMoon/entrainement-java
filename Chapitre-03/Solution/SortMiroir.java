public class SortMiroir
{
    public static void main(String[] args)
    {
        System.out.println("Mot inversé : " +  inverser("arcane"));
    }

    public static String inverser(String mot)
    {
        String reverse = "";
        for (int i = mot.length() - 1; i >= 0; i--)
        {
            reverse = reverse + mot.charAt(i);
        }
        return reverse;
    }
}

