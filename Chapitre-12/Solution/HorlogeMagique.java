public class HorlogeMagique implements Runnable {

    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Tic magique...");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
