import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PactesUniques {

    public static void main(String[] args) {
        List<String> pactes =  new ArrayList<>();
        pactes.add("Lumière");
        pactes.add("Ténèbres");
        pactes.add("Feu");
        pactes.add("Feu");
        pactes.add("Lumière");
        Set<String> pactesUniques = new HashSet<>(pactes);
        for(String pacte : pactesUniques){
            System.out.println(pacte);
        }
    }

}
