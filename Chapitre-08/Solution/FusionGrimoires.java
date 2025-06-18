import java.util.ArrayList;

public class FusionGrimoires {

    public static void main(String[] args) {
        ArrayList<String> grimoire1 = new ArrayList<>();
        grimoire1.add("Feu");
        grimoire1.add("Eau");
        ArrayList<String> grimoire2 = new ArrayList<>();
        grimoire2.add("Terre");
        grimoire2.add("Air");
        ArrayList<String> grimoireFusionne = new ArrayList<>();
        grimoireFusionne.addAll(grimoire1);
        grimoireFusionne.addAll(grimoire2);
        for(String grimoire : grimoireFusionne) {
            System.out.println(grimoire);
        }
    }

}
