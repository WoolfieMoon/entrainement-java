# Exercice 4 – La créature incomplète

**Contexte narratif :**  
Tu découvres une créature **encore inachevée** : on connaît son nom, mais pas encore sa façon d’attaquer. Tu dois créer une **classe abstraite**.

**Énoncé :**  
1. Crée une classe abstraite `CreatureMystique` avec :
   - Attribut `String nom`
   - Constructeur pour l’initialiser
   - Méthode `void afficherNom()` → affiche : `"Créature : <nom>"`
   - Méthode abstraite `void utiliserPouvoir()`
2. Crée une classe `Spectre` qui hérite de `CreatureMystique`.  
3. Implémente `utiliserPouvoir()` pour afficher : `"Le Spectre traverse les murs..."`  
4. Dans `main`, crée un `Spectre` `"Nox"`, appelle `afficherNom()` et `utiliserPouvoir()`.

