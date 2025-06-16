public class Spectre extends CreatureMystique {

    public Spectre(String nom) {
        super(nom);
    }

    @Override
    public void utiliserPouvoir() {
        System.out.println("Le Spectre traverse les murs...");
    }
}
