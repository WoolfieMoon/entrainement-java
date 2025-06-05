# Exercice 4 – L’appel polymorphe

**Contexte narratif :**  
Tu peux invoquer des créatures sans toujours connaître leur espèce exacte. Ce sort d’**invocation polymorphe** permet d’appeler n’importe quelle créature.

**Énoncé :**  
1. Reprends les classes `Creature`, `Gobelin` et `Dragon`.  
2. Crée une méthode statique `invoquerCreature(Creature c)` qui appelle `c.afficher()`.  
3. Dans `main`, crée un `Gobelin` et un `Dragon`, et appelle `invoquerCreature(...)` avec chacun.  
4. Résultat attendu :

Créature : Truk (Niveau 5)
🐉 Dragon : Ignis (Niveau 20, Feu : 80)

*(si tu n’as pas redéfini `afficher()` dans `Gobelin`, il utilisera celle de `Creature`)*

