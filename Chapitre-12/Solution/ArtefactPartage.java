public class ArtefactPartage {

    public synchronized void utiliser() {
        try {
            System.out.println("Sort lancé par " + Thread.currentThread().getName());
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

}
