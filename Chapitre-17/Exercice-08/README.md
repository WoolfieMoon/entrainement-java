# Exercice 8 – Réponses magiques conditionnelles

**Contexte narratif :**  
Certains sortilèges envoyés à travers le portail sont **trop faibles** pour être enregistrés dans le Grimoire. Le système doit **les refuser** et avertir le mage expéditeur.

---

## Objectif

Créer une route `POST` qui :
- Reçoit un `Sort` en JSON
- Vérifie la puissance du sort
- Retourne une réponse texte différente selon la puissance

---

## Énoncé technique

1. Dans `SortController`, ajoute la méthode suivante :
   ```java
   @PostMapping("/sort-verification")
   public String verifierSort(@RequestBody Sort sort) {
       if (sort.getPuissance() < 50) {
           return "⚠️ Ce sort est trop faible.";
       } else {
           return "✅ Sort enregistré avec succès.";
       }
   }

2. Envoie une requête POST à /sort-verification avec ce JSON :

{
  "nom": "Illusion",
  "puissance": 30
}

Réponse attendue :

⚠️ Ce sort est trop faible.

3. Envoie ensuite : 

{
  "nom": "Explosion",
  "puissance": 95
}

Réponse attendue :

✅ Sort enregistré avec succès.

4. Remplace la méthode par un ResponseEntity<String> pour renvoyer un code HTTP spécifique :

@PostMapping("/sort-verification")
public ResponseEntity<String> verifierSort(@RequestBody Sort sort) {
    if (sort.getPuissance() < 50) {
        return ResponseEntity.badRequest().body("⚠️ Ce sort est trop faible.");
    } else {
        return ResponseEntity.ok("✅ Sort enregistré avec succès.");
    }
}

