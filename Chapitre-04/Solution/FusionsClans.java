import java.util.stream.Stream;

public class FusionsClans
{
    public static void main(String[] args)
    {
        String[] clanA = {"Lame", "Écu", "Cape"};
        String[] clanB = {"Bague", "Anneau", "Talisman"};
        String[] fusion = Stream.of(clanA,clanB).flatMap(Stream::of).toArray(String[]::new);
        for (String item : fusion)
        {
            System.out.println(item);
        }
    }
}
