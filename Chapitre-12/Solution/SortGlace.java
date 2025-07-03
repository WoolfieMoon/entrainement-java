public class SortGlace implements Runnable{


    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println("Sort de " + this.getClass().getSimpleName() + " lancé");
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
