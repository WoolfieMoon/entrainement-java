# Exercice 2 – Invocation depuis la vue

**Contexte narratif :**  
Dans le Multivers, les Vues ne lancent pas les sorts : elles **demandent** au contrôleur de le faire.

**Énoncé :**  
1. Dans `vue`, crée une méthode `demanderSort()` qui appelle le contrôleur pour obtenir un sort.  
2. Le contrôleur crée un sort et le renvoie à la vue.  
3. La vue affiche ensuite le sort reçu avec `afficherSort(...)`.

**But :**  
Ne pas instancier `Sort` directement dans la vue.

