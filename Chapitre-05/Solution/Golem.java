public class Golem {

    String type;
    int puissance;

    Golem(String type, int puissance) {
        this.type = type;
        this.puissance = puissance;
    }

    public static void main(String[] args) {
        Golem golem = new Golem("Terre", 75);
        System.out.println("Golem de type : " + golem.type + ", puissance : " + golem.puissance);
    }

}
