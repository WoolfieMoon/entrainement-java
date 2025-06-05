# Exercice 10 – Base temporaire en mémoire

**Contexte narratif :**  
Tu veux **stocker temporairement** les sorts envoyés pour les restituer plus tard.

**Énoncé :**  
1. Dans `SortService`, crée une `List<Sort>` en tant qu’attribut  
2. Ajoute une méthode `addSort(Sort s)` et une méthode `getAllSorts()`  
3. Le `POST /sort` ajoute un sort à la liste  
4. Le `GET /grimoires` retourne tous les sorts enregistrés depuis le démarrage

**Attention :**  
Les données sont perdues si on redémarre, car il s'agit d'une mémoire **transitoire**

