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
        // Utilisation de StringBuilder car la concaténation de String dans une boucle crée un warning.
        StringBuilder strBuilder = new StringBuilder(reverse);
        for (int i = mot.length()-1; i>=0; i--)
        {
            strBuilder.append(mot.charAt(i));
        }
        reverse = strBuilder.toString();

        return reverse;
    }
}
