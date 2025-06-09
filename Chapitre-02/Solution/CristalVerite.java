public class CristalVerite {
    public static void main(String[] args) {
        int mana = 120;
        int niveau = 4;

        if (mana < 100 || niveau < 5) {
            System.out.println("Le cristal ne réagit pas à ta présence.");
            return;
        }

        System.out.println("Le cristal s’illumine d’une lumière pure.");
    }
}
