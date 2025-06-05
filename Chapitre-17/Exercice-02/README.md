# Exercice 2 – Premier sort REST (Hello World)

**Contexte narratif :**  
Tu ouvres un **endroit magique** que d’autres mages peuvent invoquer à distance.

**Énoncé :**  
1. Crée une classe `SortController` annotée avec `@RestController`.  
2. Ajoute une méthode :
   ```java
   @GetMapping("/salutation")
   public String saluer() {
       return "✨ Salutations depuis le Grimoire !";
   }
3. Lance l’application et accède à http://localhost:8080/salutation pour tester.
