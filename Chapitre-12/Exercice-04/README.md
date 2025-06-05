# Exercice 4 – Le mage multitâche

**Contexte narratif :**  
Un mage veut lancer plusieurs sorts en série. Chacun dans un thread séparé.

**Énoncé :**  
1. Crée une méthode `lancerSort(String nom)` qui crée un thread anonyme affichant `nom` 5 fois avec pause.  
2. Dans `main`, appelle :
   - `lancerSort("Feu")`  
   - `lancerSort("Éclair")`  
   - `lancerSort("Soin")`
3. Les 3 sorts doivent s’exécuter en parallèle.

