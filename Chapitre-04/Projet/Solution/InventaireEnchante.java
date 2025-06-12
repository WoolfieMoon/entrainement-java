public class InventaireEnchante {
    public static void main(String[] args) {
        String[] inventaire = {"Bâton", "Potion", "Anneau", "Cape", "Rune"};

        for(int index = 0; index < inventaire.length; index++) {
            System.out.println("Objet " + (index + 1) + " : " + inventaire[index]);
        }

        inventaire[2] = "Amulette";
        System.out.println("\n --- Mise à jour de l’inventaire --- \n");

        for(int index = 0; index < inventaire.length; index++) {
            System.out.println("Objet " + (index + 1) + " : " + inventaire[index]);
        }
    }
}
