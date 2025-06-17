public class Main
{
    public static void main(String[] args)
    {
        // Exercice 1
        Chevalier chevalier = new Chevalier();
        chevalier.attaquer();
        chevalier.seDefendre();

        // Exercice 2
        Voleur voleur = new Voleur();
        voleur.attaquer();
        voleur.seDefendre();

        // Exercice 3
        Combattant[] tab = new Combattant[2];
        tab[0] = new Chevalier();
        tab[1] = new Voleur();
        for (Combattant combattant : tab)
        {
            combattant.attaquer();
            combattant.seDefendre();
        }

        // Exercice 4
        Spectre spectre = new Spectre("Nox");
        spectre.afficherNom();
        spectre.utiliserPouvoir();

        // Exercice 5
        Chimere chimere = new Chimere("Korga");
        chimere.utiliserPouvoir();
        chimere.attaquer();
        chimere.seDefendre();

        // Exercice 6
        Combattant[] tab2 = new Combattant[3];
        tab2[0] = new Chevalier();
        tab2[1] = new Voleur();
        tab2[2] = chimere;
        for (Combattant c : tab2)
        {
            referencer(c);
        }

        // Exercice 7
        Object[] tab3 = new Object[3];
        tab3[0] = new Chevalier();
        tab3[1] = new Voleur();
        tab3[2] = new Spectre("Spectrum");
        for (Object obj : tab3)
        {
            if (obj instanceof Combattant)
            {
                ((Combattant) obj).attaquer();
            }
            else
            {
                System.out.println("Cette entité n’a signé aucun pacte de combat.");
            }
        }

        // Exercice 8
        Pretre pretre = new Pretre();
        pretre.soigner();
        Druide druide = new Druide();
        druide.soigner();

        // Exercice 9
        Paladin paladin = new Paladin();
        paladin.attaquer();
        paladin.seDefendre();
        paladin.soigner();

        // Exercice 10
        Object[] tab4 = new Object[3];
        tab4[0] = voleur;
        tab4[1] = pretre;
        tab4[2] = paladin;
        for (Object obj : tab4)
        {
            if (obj instanceof Combattant)
            {
                System.out.println(obj.getClass().getSimpleName());
                ((Combattant) obj).attaquer();
            }
            if (obj instanceof Soigneur)
            {
                System.out.println(obj.getClass().getSimpleName());
                ((Soigneur) obj).soigner();
            }
        }


    }

    public static void referencer(Combattant c)
    {
        System.out.println("utilise " + c.getClass().getSimpleName());
    }
}
