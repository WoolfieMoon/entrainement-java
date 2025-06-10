public class InventaireEnchante
{
    public static void main(String[] args)
    {
        String[] inventaire = {"Bâton", "Potion", "Anneau", "Cape", "Rune"};
        showTab(inventaire);
        inventaire[2] = "Amulette";
        System.out.println("\n \n --- Mise à jour de l’inventaire --- \n");
        showTab(inventaire);
    }

    public static void showTab(String[] tab)
    {
        for (int i = 0; i < tab.length; i++)
        {
            System.out.print("Objet " + (i + 1) + " : " + tab[i] + " ");
        }
    }
}
