public class SortsIndex {

    public static void main(String[] args) {
        String[] sorts = {"Feu", "Eau", "Terre"};
        try {
            System.out.println(sorts[5]);
        } catch (Exception e) {
            System.out.println("Erreur : tentative d'accès à un sort inexistant.");
        }
    }

}
