public class TotalEveil {
    public static void main(String[] args) {
        int[] orbes = {10, 20, 30, 40, 50};
        int sum = 0;

        for (int orbe : orbes) {
            sum += orbe;
        }

        System.out.println("Énergie total : " + sum);
    }
}
