public class Guerrier extends EntiteMagique implements Combattant{

    public Guerrier(String nom, int puissance) {
        super(nom, puissance);
    }

    public void attaquer() {
        System.out.println(this.nom + " attaque avec sa hache runique !");
    }

}
