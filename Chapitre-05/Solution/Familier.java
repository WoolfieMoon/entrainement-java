public class Familier
{
    private String espece;

    public Familier(String espece)
    {
        this.espece = espece;
    }

    public void crier()
    {
        System.out.println("Le " + this.espece + " pousse un cri mystique !");
    }
}
