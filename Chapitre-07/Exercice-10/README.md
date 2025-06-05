# Exercice 10 – Le grimoire des entités

**Contexte narratif :**  
Tu dois construire un **grimoire polymorphe** qui contient des `Combattant`, des `Soigneur`, ou même les deux. À chaque page, tu dois reconnaître l’entité et déclencher ses capacités.

**Énoncé :**  
1. Reprends toutes les interfaces et classes précédentes.  
2. Dans `main`, crée un tableau `Object[]` avec :
   - Un `Voleur`, un `Pretre`, un `Paladin`  
3. Parcours le tableau.  
4. Pour chaque élément :
   - S’il est un `Combattant`, appelle `attaquer()`  
   - S’il est un `Soigneur`, appelle `soigner()`  
   - Affiche aussi le nom de la classe avec `getClass().getSimpleName()`  
5. Exemple attendu :

Voleur attaque
Classe : Voleur

Prêtre soigne
Classe : Pretre

Paladin attaque
Paladin soigne
Classe : Paladin
