public class Parchemin {

    String contenu;

    Parchemin(String contenu) {
        this.contenu = contenu;
    }

    public void lire() {
        System.out.println("Lecture du parchemin : " + this.contenu);
    }

    public static void main(String[] args) {
        Parchemin parchemin = new Parchemin("Invoque la lumière");
        parchemin.lire();
    }

}
