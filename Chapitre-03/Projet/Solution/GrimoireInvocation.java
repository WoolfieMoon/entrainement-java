public class GrimoireInvocation
{
    public static void main(String[] args)
    {
        invoquer("feu");
        invoquer("glace");
        invoquer("terre");
        invoquer("foudre");
    }

    public static void invoquer(String element)
    {
        switch (element) {
            case "feu" -> sortFeu();
            case "glace" -> sortGlace();
            case "foudre" -> sortFoudre();
            default -> System.out.print("Échec de l’invocation : élément inconnu. ");
        }
    }

    public static void sortFeu()
    {
        System.out.print("Tu invoques une boule de feu brûlante ! ");
    }

    public static void sortGlace()
    {
        System.out.print("Un vent glacial surgit du néant... ");
    }

    public static void sortFoudre()
    {
        System.out.print("L’éclair frappe avec une puissance céleste ! ");
    }
}

