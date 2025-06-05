# Exercice 9 – Création d’un service (classe métier)

**Contexte narratif :**  
Tu veux **séparer les responsabilités** : les sorts seront gérés par un **mage archiviste** (service).

**Énoncé :**  
1. Crée une classe `SortService` avec :
   - Une méthode `List<Sort> getAllSorts()`

2. Dans `SortController`, injecte `SortService` avec `@Autowired`  
3. La méthode `/grimoires` appelle désormais `getAllSorts()` du service

**But :**  
Appliquer la séparation Contrôleur / Service

