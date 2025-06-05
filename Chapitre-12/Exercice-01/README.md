# Exercice 1 – Invocation double

**Contexte narratif :**  
Tu veux lancer deux sorts en même temps : l’un de feu, l’autre de glace. Chaque invocation doit pouvoir s’exécuter indépendamment de l’autre.

**Énoncé :**  
1. Crée une classe `SortFeu` qui implémente `Runnable`.  
   Dans `run()`, affiche 5 fois :

Sort de Feu lancé

avec `Thread.sleep(500)` entre chaque.

2. Crée une classe `SortGlace` de la même manière, qui affiche :

Sort de Glace lancé


3. Dans `main`, crée deux `Thread`, un pour chaque sort, et démarre-les avec `start()`.

4. Observe que les messages des deux sorts s’intercalent (exécution parallèle).

