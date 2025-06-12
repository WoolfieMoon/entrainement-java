public class Fontaine {

    double purete;
    int runes;

    Fontaine(double purete) {
        this.purete = purete;
        this.runes = 0;
    }

    public void calculerRunes() {
        this.runes = (int) (this.purete * 10);
    }

    public void afficherEtat() {
        System.out.println("Fontaine de pureté " + this.purete + " contient " + this.runes + " runes");
    }


    public static void main(String[] args) {
        Fontaine fontaine = new Fontaine(8.5);
        fontaine.calculerRunes();
        fontaine.afficherEtat();
    }
}
