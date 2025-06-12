public class Familier {

    String espece;

    Familier(String espece) {
        this.espece = espece;
    }

    public void crier() {
        System.out.println("Le " + this.espece + " pousse un cri mystique");
    }

    public static void main(String[] args) {
        Familier familier = new Familier("Griffon");
        familier.crier();
    }

}
