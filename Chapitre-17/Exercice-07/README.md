# Exercice 7 – Accès aux sorts par ID (paramètre dans URL)

**Contexte narratif :**  
Chaque sort est maintenant **identifié par un numéro** dans le Grimoire central.

**Énoncé :**  
1. Crée une méthode dans `SortController` :
   ```java
   @GetMapping("/sort/{id}")
   public Sort getSortById(@PathVariable int id) {
       List<Sort> sorts = List.of(
           new Sort("Éclair", 90),
           new Sort("Feu", 100),
           new Sort("Invisibilité", 60)
       );
       return sorts.get(id);
   }
   
2. Accède à /sort/0, /sort/1 etc.
3. Chaque appel retourne un objet JSON différent.
