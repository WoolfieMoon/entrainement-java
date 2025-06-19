public class InvocationProtegee {

    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
            System.out.println(a/b);
        } catch (Exception e) {
            System.out.println("Erreur : division par zéro interdite par le Codex !");
        } finally{
            System.out.println("L’invocation est terminée, quelle qu’en soit l’issue.");
        }
    }

}
