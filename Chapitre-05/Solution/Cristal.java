public class Cristal {

    String couleur;
    int energie;

    Cristal(String couleur, int energie) {
        this.couleur = couleur;
        this.energie = energie;
    }

    public void decrire() {
        System.out.println("Cristal " + this.couleur + " contenant " + this.energie + " unités d'énergie");
    }

    public static void main(String[] args) {
        Cristal cristal = new Cristal("bleu", 120);
        cristal.decrire();
    }

}
