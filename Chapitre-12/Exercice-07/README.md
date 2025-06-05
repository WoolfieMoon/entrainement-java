# Exercice 7 – L’horloge du mage

**Contexte narratif :**  
Un mage doit afficher une **heure magique** toutes les secondes, sans bloquer les autres actions.

**Énoncé :**  
1. Crée une classe `HorlogeMagique` qui implémente `Runnable`.  
2. Dans `run()`, affiche `"Tic magique..."` toutes les secondes pendant 5 secondes.  
3. Démarre ce thread, et pendant ce temps, affiche aussi `"Le mage lit."` dans le `main`, toutes les 500 ms.  
4. Les deux messages doivent apparaître **entrelacés**.

