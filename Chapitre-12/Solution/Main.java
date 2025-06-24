public class Main {

    public static void main(String[] args) {
        Thread thread1 = new Thread(new SortFeu());
        Thread thread2 = new Thread(new SortGlace());
        //thread1.start();
        //thread2.start();

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    for (int i = 0; i < 3; i++) {
                        System.out.println("Sort d'éclair temporaire !");
                        Thread.sleep(300);
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        try {
            //thread3.start();
            thread3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Thread thread4 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    for (int i = 0; i < 10; i++) {
                        System.out.println("Sort lent");
                        Thread.sleep(1000);
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        thread4.setPriority(1);

        Thread thread5 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    for (int i = 0; i < 10; i++) {
                        System.out.println("Sort rapide");
                        Thread.sleep(1000);
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        thread5.setPriority(10);

        //thread4.start();
        //thread5.start();

        //lancerSort("Feu");
        //lancerSort("Éclair");
        //lancerSort("Soin");

        Thread sortA = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    for (int i = 0; i < 5; i++) {
                        System.out.println("Sort A");
                        Thread.sleep(1000);
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread sortB = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    for (int i = 0; i < 5; i++) {
                        System.out.println("Sort B");
                        Thread.sleep(1000);
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        try {
            //sortA.start();
            sortA.join();
            //sortB.start();
            //sortB.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Thread horloge = new Thread(new HorlogeMagique());
       // horloge.start();

        /*
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Le mage lit");
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }*/

        Thread InvocationLente = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    for (int i = 0; i < 3; i++) {
                        System.out.println("Incantation...");
                        Thread.sleep(1000);
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread Compteur = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    int i = 1;
                    while (true) {
                        System.out.println(i + "...");
                        i++;
                        Thread.sleep(1000);
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        //InvocationLente.start();
        //Compteur.start();

        ArtefactPartage artefactPartage = new ArtefactPartage();


        Thread thread6 = new Thread(new Runnable() {
            @Override
            public void run() {
                artefactPartage.utiliser();
            }
        }, "Mage 1");

        Thread thread7 = new Thread(new Runnable() {
            @Override
            public void run() {
                artefactPartage.utiliser();
            }
        }, "Mage 2");

        //thread6.start();
        //thread7.start();

        for (int i = 0; i < 20; i++) {
            int finalI = i;
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Je suis Clone #" + finalI);
                }
            });
            thread.start();
        }
    }

    public static void lancerSort(String nom) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    for (int i = 0; i < 5; i++) {
                        System.out.println("Sort de " + nom + " lancer");
                        Thread.sleep(250);
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        thread.start();
    }

}
