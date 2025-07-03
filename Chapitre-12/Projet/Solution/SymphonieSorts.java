public class SymphonieSorts {

    public static class SortEnChantement implements Runnable {

        String nom;
        int delai;

        public SortEnChantement(String nom, int delai) {
            this.nom = nom;
            this.delai = delai;
        }

        @Override
        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println(this.nom + " : phase " + i);
                try {
                    Thread.sleep(this.delai);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public static void main(String[] args) {
        Thread feu = new Thread(new SortEnChantement("Feu", 400));
        Thread glace = new Thread(new SortEnChantement("Glace", 600));
        Thread eclair = new Thread(new SortEnChantement("Éclair", 300));


        feu.start();
        glace.start();
        eclair.start();

        try {
            feu.join();
            glace.join();
            eclair.join();
            System.out.println("\uD83C\uDF87 Rituel terminé avec succès !");

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}