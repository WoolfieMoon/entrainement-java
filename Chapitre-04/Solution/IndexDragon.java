public class IndexDragon {
    public static void main(String[] args) {
        String[] creatures = {"Gobelin", "Chauve-Souris", "Dragon", "Golem", "Spectre"};
        int indexDragon = -1;
        for(int index = 0; index < creatures.length; index++) {
            String creature = creatures[index];
            if(!creature.equals("Dragon")) {
                continue;
            }
            indexDragon = index;
            System.out.println("Dragon trouvé à l'indexDragon : " + indexDragon);
        }
        if(indexDragon == -1) {
            System.out.println("Le Dragon est introuvable dans cette dimension");
        }
    }
}
