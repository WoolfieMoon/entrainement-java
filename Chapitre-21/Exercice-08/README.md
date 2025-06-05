# Exercice 8 – La Réincarnation des Objets

**Contexte narratif :**  
Chaque objet peut être **sauvé et restauré** autant de fois que nécessaire. Tu veux créer une **interface commune** pour tous les objets sauvegardables.

---

## Objectif

Factoriser la sérialisation à l’aide d’une **interface** ou d’une **classe générique**.

---

## Consignes

- Crée une interface `Sauvegardable`
- Ajoute une méthode `sauvegarder(String chemin)` à implémenter
- Crée une classe `GestionnaireDeSauvegarde` avec une méthode statique :
  - `static void sauvegarder(Sauvegardable obj, String chemin)`
- Utilise ce système avec au moins deux classes différentes

