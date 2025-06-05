# Exercice 10 – Le polymorphe errant

**Contexte narratif :**  
Un être polymorphe voyage entre formes : tantôt gobelin, tantôt dragon, tantôt créature. Tu dois gérer une invocation changeante.

**Énoncé :**  
1. Crée une méthode `genererCreature(int code)` dans une classe `Invocation` qui retourne :
   - `code == 1` → une `Gobelin` `"Lurk"` niveau `3`, ruse `9`  
   - `code == 2` → un `Dragon` `"Pyron"` niveau `18`, feu `77`  
   - autre → `Creature` `"Inconnu"` niveau `1`  
2. Dans `main`, appelle trois fois la méthode avec les codes 1, 2, et 42.  
3. Pour chaque retour, appelle `afficher()`.

