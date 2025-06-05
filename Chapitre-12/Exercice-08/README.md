# Exercice 8 – Le compteur des invocations

**Contexte narratif :**  
Tu veux exécuter un sort pendant qu’un **compteur parallèle** suit l’avancement.

**Énoncé :**  
1. Crée un thread `InvocationLente` qui affiche `"Incantation..."` 3 fois avec `sleep(1000)`.  
2. En parallèle, un thread `Compteur` affiche `"1..."`, `"2..."`, `"3..."` chaque seconde.  
3. Les deux s'exécutent en même temps.

