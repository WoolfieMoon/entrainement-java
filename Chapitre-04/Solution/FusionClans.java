public class FusionClans {
    public static void main(String[] args) {
        String[] clanA = {"Lame", "Écu", "Cape"};
        String[] clanB = {"Bague", "Anneau", "Talisman"};

        String[] fusion = new String[clanA.length + clanB.length];

        System.arraycopy(clanA, 0, fusion, 0, clanA.length);
        System.arraycopy(clanB, 0, fusion, clanA.length, clanB.length);

        for (String clan : fusion) {
            System.out.print(clan + " ");
        }
    }
}
