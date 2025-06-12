public class Ombre {

    String nom;
    String type;

    Ombre(String nom, String type) {
        this.nom = nom;
        this.type = type;
    }

    public void afficherOmbre() {
        System.out.println("Ombre invoquée : " + this.nom + " de type " + this.type);
    }

    public static void main(String[] args) {
        Ombre ombre1 = new Ombre("Noctra", "Spectre");
        Ombre ombre2 = new Ombre("Velkan", "Banshee");
        ombre1.afficherOmbre();
        ombre2.afficherOmbre();
    }

}
