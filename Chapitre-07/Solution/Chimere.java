public class Chimere extends CreatureMystique implements Combattant{

    public Chimere(String nom) {
        super(nom);
    }

    public void utiliserPouvoir() {
        System.out.println("La Chimère rugit et déploie ses ailes !");
    }

    public void attaquer() {
        System.out.println("La Chimère griffe violemment !");
    }

    public void seDefendre() {
        System.out.println("La Chimère se replie dans la brume.");
    }

}
