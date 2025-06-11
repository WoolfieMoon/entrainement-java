public class Main
{
    public static void main(String[] args)
    {
        // Exercice 1
        Artefact artefact = new Artefact();
        artefact.setNom("Sceptre d'Émeraude");
        System.out.println("Nom de l'artefact : " + artefact.getNom());

        // Exercice 2
        Golem golem = new Golem("Terre", 75);
        System.out.println("Golem de type : " + golem.type + ", puissance : " + golem.puissance);

        // Exercice 3
        Heros heros = new Heros("Aëron", 30, 50);
        heros.afficherStats();

        // Exercice 4
        Familier familier = new Familier("Griffon");
        familier.crier();

        // Exercice 5
        Creature creature = new Creature("Sylphide", 3);
        creature.gagnerNiveau();
        creature.afficherNiveau();

        // Exercice 6
        Cristal cristal = new Cristal("bleu", 120);
        cristal.decrire();

        // Exercice 7
        LienMystique lien = new LienMystique("Mage Arken", "Dragon Céleste");
        lien.afficherLien();

        // Exercice 8
        Parchemin parchemin = new Parchemin("Invoque la lumière");
        parchemin.lire();

        // Exercice 9
        Ombre noctra = new Ombre("Noctra", "Spectre");
        Ombre velkan = new Ombre("Velkan", "Banshee");
        noctra.afficherOmbre();
        velkan.afficherOmbre();

        // Exercice 10
        Fontaine fontaine = new Fontaine(8.5);
        fontaine.calculerRunes();
        fontaine.afficherEtat();
    }
}
