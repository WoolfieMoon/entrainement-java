public class ArtefactPuissant
{
    public static void main(String[] args)
    {
        int[] artefacts = {34, 67, 89, 23, 90, 58};
        int max = 0;
        for (int artefact : artefacts)
        {
            if (artefact > max)
            {
                max = artefact;
            }
        }
        System.out.println("Artefact le plus puissant : " + max);
    }
}
