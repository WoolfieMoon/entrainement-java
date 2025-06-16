public abstract class CreatureMystique {

    String nom;

    public CreatureMystique(String nom) {
        this.nom = nom;
    }

    public void afficherNom() {
        System.out.println("Créature : " + this.nom);
    }

    public abstract void utiliserPouvoir();

}
