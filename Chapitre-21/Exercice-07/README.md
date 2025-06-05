# Exercice 7 – Les Reliques Corrompues

**Contexte narratif :**  
Une relique ancienne n’a pas été sauvegardée correctement. Tu dois **gérer l’échec de lecture** sans faire planter ton programme.

---

## Objectif

Traiter proprement les erreurs lors de la lecture de fichiers corrompus.

---

## Consignes

- Essaie de désérialiser un fichier vide ou inexistant
- Utilise un bloc `try-catch` pour gérer :
  - `FileNotFoundException`
  - `IOException`
  - `ClassNotFoundException`
- Affiche un message personnalisé pour chaque cas
- Garde ton programme fonctionnel même en cas d’erreur

