# Exercice 10 – Le sort interdit

**Contexte narratif :**  
Tu essayes d’invoquer un sort à travers un objet magique, mais la rune refuse : ce sort ne peut être invoqué que de manière **statique**. Tu dois comprendre et corriger l’erreur.

**Énoncé :**  
Crée une classe Java nommée `SortInterdit`.  
1. Définis une méthode `public static void lancer()` qui affiche :

Le sort statique est lancé.

2. Dans `main`, appelle cette méthode **directement** via son nom (`lancer()`), sans créer d’objet.  
3. Ne tente **pas** de faire `SortInterdit obj = new SortInterdit(); obj.lancer();` — ce serait une mauvaise pratique ici.

