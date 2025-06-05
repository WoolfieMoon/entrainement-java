# Exercice 4 – Sort JSON (objet retourné)

**Contexte narratif :**  
Tu veux renvoyer un **sortilège** sous forme d’objet, pour que d’autres guildes puissent le lire via un portail standardisé.

**Énoncé :**  
1. Crée une classe `Sort` avec `nom` et `puissance`.  
2. Dans `SortController`, ajoute :
   ```java
   @GetMapping("/sort")
   public Sort donnerSort() {
       return new Sort("Éclair", 90);
   }
3. Lance l’app et accède à /sort
4. Résultat attendu :

{
  "nom": "Éclair",
  "puissance": 90
}
