public class Heros {

    String nom;
    int force;
    int intelligence;

    Heros(String nom, int force, int intelligence) {
        this.nom = nom;
        this.force = force;
        this.intelligence = intelligence;
    }

    public void afficherStats() {
        System.out.println("Nom de l'artefact : " + nom);
        System.out.println("Force : " + force);
        System.out.println("Intelligence : " + intelligence);
    }

    public static void main(String[] args) {
        Heros hero = new Heros("Aëron", 30, 50);
        hero.afficherStats();
    }

}
