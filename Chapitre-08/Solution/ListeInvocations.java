import java.util.ArrayList;

public class ListeInvocations {

    public static void main(String[] args) {
        ArrayList<String> invocations = new ArrayList<>();
        invocations.add("Spectre");
        invocations.add("Golem");
        invocations.add("Sylphide");

        for (String invocation : invocations) {
            System.out.println("Invocation : " + invocation);
        }

        System.out.println();

        invocations.add("Chimère");
        invocations.add("Dragon");
        invocations.remove("Golem");

        for (String invocation : invocations) {
            System.out.println("Invocation : " + invocation);
        }
    }

}
