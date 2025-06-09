import java.awt.*;

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
        switch (element)
        {
            case "feu" -> sortFeu();
            case "glace" -> sortGlace();
            case "foudre" -> sortFoudre();
            default -> System.out.println("Échec de l’invocation : élément inconnu.");
        }
    }

    public static void sortFeu()
    {
        System.out.println("Tu invoques une boule de feu brûlante !");
    }

    public static void sortGlace()
    {
        System.out.println("Un vent glacial surgit du néant...");
    }

    public static void sortFoudre()
    {
        System.out.println("L’éclair frappe avec une puissance céleste !");
    }
}
