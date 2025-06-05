# Exercice 8 – Le sort instable

**Contexte narratif :**  
Tu veux créer un sort spécial qui **lance une exception personnalisée** si sa puissance dépasse une limite.

**Énoncé :**  
1. Crée une classe `SortInstable`.  
2. Crée une méthode `lancerSort(String nom, int puissance)` qui :  
   - Si puissance > 100, lance une `Exception` avec un message clair  
   - Sinon, affiche que le sort est lancé  
3. Dans `main`, appelle deux fois :
   - Une avec `"Explosion"`, puissance `90`  
   - Une avec `"Destruction"`, puissance `120`
4. Résultat attendu :

Sort lancé : Explosion (90)
Exception : puissance trop élevée pour Destruction !
