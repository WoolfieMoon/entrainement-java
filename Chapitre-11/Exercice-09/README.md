# Exercice 9 – Le testeur d’incantation

**Contexte narratif :**  
Le Conseil veut tester des incantations sans jamais que l’application ne plante. Tu vas **intercepter toutes les erreurs possibles**.

**Énoncé :**  
1. Crée une classe `TesteurIncantation`.  
2. Dans `main`, entoure un bloc `try` contenant une division par zéro, une lecture de tableau hors limites, et une méthode sur une variable `null`.  
3. Utilise **plusieurs blocs `catch`** pour chaque exception :  
   - `ArithmeticException`  
   - `ArrayIndexOutOfBoundsException`  
   - `NullPointerException`  
4. Affiche un message différent pour chaque erreur capturée.

