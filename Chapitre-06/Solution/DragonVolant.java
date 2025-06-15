public class DragonVolant extends Dragon {

    protected int altitude;

    public DragonVolant(String nom, int niveau, int feu, int altitude) {
        super(nom, niveau, feu);
        this.altitude = altitude;
    }

    public void afficher() {
        System.out.println("\uD83D\uDC09 Dragon Volant : " + nom + " (Niveau " + niveau + ", Feu : " + feu + ", Altitude : " + altitude + " )");
    }

}
