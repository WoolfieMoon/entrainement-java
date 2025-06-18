import java.util.ArrayList;
import java.util.Collections;

public class TriInvocations {

    public static void main(String[] args) {
        ArrayList<String> invocations = new ArrayList<>();
        invocations.add("Chimère");
        invocations.add("Spectre");
        invocations.add("Golem");
        invocations.add("Ange");
        Collections.sort(invocations);
        for (String invocation : invocations) {
            System.out.println(invocation);
        }

    }

}
