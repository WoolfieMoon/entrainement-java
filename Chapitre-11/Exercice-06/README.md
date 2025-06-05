# Exercice 6 – Le bouclier des sorts sûrs

**Contexte narratif :**  
Un mage prudent encapsule ses sorts dans une méthode qui renvoie une **valeur sûre** même si une erreur se produit.

**Énoncé :**  
1. Crée une classe `BouclierSort`.  
2. Crée une méthode `diviser(int a, int b)` qui :
   - Retourne `a / b` normalement  
   - Retourne `-1` en cas de division par zéro (utilise `try-catch`)  
3. Dans `main`, teste `diviser(10, 2)` et `diviser(10, 0)`  
4. Affiche :

Résultat 1 : 5
Résultat 2 : -1
