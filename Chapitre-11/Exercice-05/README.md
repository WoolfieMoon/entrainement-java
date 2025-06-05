# Exercice 5 – Le sort contrôlé

**Contexte narratif :**  
Tu vas créer une méthode qui lance un sort risqué et qui doit **provoquer une exception personnalisée** si une règle est enfreinte.

**Énoncé :**  
1. Crée une classe `SortControle`.  
2. Crée une méthode `lancerSort(String nom)` qui :
   - Lance une `IllegalArgumentException` si `nom` est vide ou null.
3. Dans `main`, appelle cette méthode avec une chaîne vide.  
4. Capture l’exception et affiche :

Sort interdit : le nom du sort est obligatoire.
