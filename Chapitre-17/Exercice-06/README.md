# Exercice 6 – Grimoire de sorts (liste de plusieurs objets)

**Contexte narratif :**  
Le Grimoire Web doit permettre de consulter une **liste complète** de sorts accessibles à distance.

**Énoncé :**  
1. Dans `SortController`, crée une méthode :
   ```java
   @GetMapping("/grimoires")
   public List<Sort> tousLesSorts() {
       return List.of(
           new Sort("Éclair", 90),
           new Sort("Feu", 100),
           new Sort("Invisibilité", 60)
       );
   }
2. Accède à http://localhost:8080/grimoires
3. Le JSON doit contenir un tableau d’objets sortilèges.
