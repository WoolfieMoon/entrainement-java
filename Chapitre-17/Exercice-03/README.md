# Exercice 3 – Sort avec paramètre

**Contexte narratif :**  
Un mage peut maintenant invoquer un sort avec son nom pour une réponse personnalisée.

**Énoncé :**  
1. Dans `SortController`, ajoute :
   ```java
   @GetMapping("/saluer/{nom}")
   public String saluerMage(@PathVariable String nom) {
       return "Bienvenue, " + nom + " !";
   }
2. Accède à http://localhost:8080/saluer/Kaelis

3. Le résultat doit être :

Bienvenue, Kaelis !
