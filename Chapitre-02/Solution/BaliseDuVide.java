public class BaliseDuVide {
    public static void main(String[] args) {
        String motDePasse = "";

        if (motDePasse.isBlank()) {
            System.out.println("L’artefact siffle : mot de passe absent !");
            return;
        }

        System.out.println("L’artefact t’accepte comme utilisateur légitime.");
    }
}
