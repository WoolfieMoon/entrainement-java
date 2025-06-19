public class ForgeronRoyal {

    public static void forger(int temperature) {
        if (temperature < 800) {
            throw new IllegalStateException("Erreur : température insuffisante pour forger.");
        }
        System.out.println("Forge réussie à " + temperature + " degrés");
    }

    public static void main(String[] args) {
        forger(700 );
        forger(900);
    }

}
