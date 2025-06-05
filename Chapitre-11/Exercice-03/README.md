# Exercice 3 – L’invocation protégée

**Contexte narratif :**  
Tu veux sécuriser une invocation en empêchant tout crash, même si une erreur apparaît.

**Énoncé :**  
1. Crée une classe `InvocationProtegee`.  
2. Dans `main`, entoure un code potentiellement risqué (division par zéro ou index hors limites) dans un `try`.  
3. Ajoute un bloc `finally` qui affiche toujours :  

L’invocation est terminée, quelle qu’en soit l’issue.
