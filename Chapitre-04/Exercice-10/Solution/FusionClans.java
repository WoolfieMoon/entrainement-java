import java.util.stream.Stream;

public class FusionClans
{
    public static void main(String[] args)
    {
        String[] clanA = {"Lame", "Écu", "Cape"};
        String[] clanB = {"Bague", "Anneau", "Talisman"};

        Stream<String> stream1 = Stream.of(clanA);
        Stream<String> stream2 = Stream.of(clanB);

        /* La méthode la plus simple est la suivante :

        Stream<String> fusion = Stream.concat(stream1, stream2);
        fusion.forEach(System.out::println);

        Cependant il est spécifiquement demandé que fusion soit un tableau et pas un Stream donc :
         */

        Stream<String> streamFusion = Stream.concat(stream1, stream2);
        String[] fusion = streamFusion.toArray(String[]::new);

        for (String element : fusion)
        {
            System.out.println(element);
        }


    }
}
