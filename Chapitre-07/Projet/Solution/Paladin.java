public class Paladin extends EntiteMagique implements Combattant, Soigneur{

    public Paladin(String nom, int puissance) {
        super(nom, puissance);
    }

    public void attaquer() {
        System.out.println(this.nom + " attaque avec sa lame sacrée !");
    }

    public void soigner() {
        System.out.println(this.nom + " invoque une lumière curative !");
    }

}
