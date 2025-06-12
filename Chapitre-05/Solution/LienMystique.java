public class LienMystique {

    String source;
    String cible;

    LienMystique(String source, String cible) {
        this.source = source;
        this.cible = cible;
    }

    public void afficherLien() {
        System.out.println("Lien mystique entre " + this.source + " et " + this.cible);
    }

    public static void main(String[] args) {
        LienMystique lien = new LienMystique("Mage Arken", "Dragon Céleste");
        lien.afficherLien();
    }

}
