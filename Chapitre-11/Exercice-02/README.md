# Exercice 2 – L’appel à l’index maudit

**Contexte narratif :**  
Une rune invoque un sort à une position qui n’existe pas dans le grimoire. Il faut éviter ce débordement.

**Énoncé :**  
1. Crée une classe `SortsIndex`.  
2. Dans `main`, crée un tableau `String[] sorts = {"Feu", "Eau", "Terre"}`  
3. Essaie d’accéder à `sorts[5]` dans un bloc `try`.  
4. Si une exception est capturée, affiche :  

Erreur : tentative d'accès à un sort inexistant.
