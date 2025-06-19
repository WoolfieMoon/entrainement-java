import java.util.ArrayList;

public class ListeInvocations
{
    public static void main(String[] args)
    {
        // Exercice 1
        ArrayList<String> invocations = new ArrayList<>();
        invocations.add("Spectre");
        invocations.add("Golem");
        invocations.add("Sylphide");

        for (String invocation : invocations)
        {
            System.out.println("Invocation : " + invocation);
        }

        // Exercice 2
        invocations.add("Chimère");
        invocations.add("Dragon");
        invocations.remove("Golem");

        for (String invocation : invocations)
        {
            System.out.print(invocation + " ");
        }
    }
}
