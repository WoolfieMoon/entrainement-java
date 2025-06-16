public class Pretre extends EntiteMagique implements Soigneur {

    public Pretre(String nom, int puissance) {
        super(nom, puissance);
    }

    public void soigner() {
        System.out.println(this.nom + " soigne ses alliés...");
    }

}
