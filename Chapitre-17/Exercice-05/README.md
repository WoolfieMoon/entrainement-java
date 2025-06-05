# Exercice 5 – Enregistrement de sort (POST JSON)

**Contexte narratif :**  
Les guildes veulent t’envoyer de nouveaux sorts pour qu’ils soient enregistrés dans ton Grimoire.

**Énoncé :**  
1. Dans `SortController`, ajoute :
   ```java
   @PostMapping("/sort")
   public String enregistrerSort(@RequestBody Sort sort) {
       return "📝 Sort reçu : " + sort.getNom() + " (" + sort.getPuissance() + ")";
   }
   
2. Envoie une requête POST avec Postman ou curl :

{
  "nom": "Feu",
  "puissance": 100
}

3. Résultat attendu :

📝 Sort reçu : Feu (100)
