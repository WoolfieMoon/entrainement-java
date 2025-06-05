# Exercice 3 – L’incantation prioritaire

**Contexte narratif :**  
Certains sorts doivent s’exécuter **plus vite** que d’autres selon leur priorité magique.

**Énoncé :**  
1. Crée deux threads :
   - Un avec priorité minimale (`setPriority(1)`)
   - Un avec priorité maximale (`setPriority(10)`)
2. Les deux affichent respectivement `"Sort lent"` et `"Sort rapide"` 10 fois.  
3. Observe si les résultats montrent une différence d’exécution (elle n’est **pas garantie** en Java, mais c’est le but pédagogique).

