# Mini-projet – Le Coffre de Mémoire

**Contexte narratif :**  
Dans la Forteresse de Garde-Savoir, les mages consignes tous leurs artefacts, sortilèges, et secrets dans un **coffre protégé**. Tu es chargé de développer un système complet permettant d’**enregistrer**, **restaurer**, et **consulter** ces archives à tout moment.

---

## Objectif

Créer une **application Java console** capable de gérer un système de sauvegarde/restauration d’objets via la **sérialisation**, avec gestion d’erreurs et fichiers multiples.

---

## Fonctionnalités attendues

### 1. Création et enregistrement d’objets
- L’utilisateur peut créer des objets (ex. `Sortilege`, `Artefact`, etc.)
- Chaque objet peut être nommé et posséder des propriétés personnalisables
- L’objet peut être **sauvegardé** dans un fichier `.dat`

---

### 2. Restauration d’objets
- L’utilisateur choisit un fichier à restaurer
- Le contenu est lu et affiché avec ses attributs
- Gère tous les cas d’erreur : fichier absent, corrompu, classe inconnue

---

### 3. Sauvegarde de collections
- Permet de sauvegarder une **liste d’objets**
- Peut aussi sauvegarder une `Map` associant des noms à des objets
- Les collections peuvent être restaurées dans l’application

---

### 4. Interface utilitaire
- Menu texte :
  - Créer un objet
  - Sauvegarder un objet
  - Charger un objet
  - Sauvegarder une collection
  - Charger une collection
  - Quitter

---

### 5. Bonus (facultatif)
- Ajout d’un champ `transient` pour tester la confidentialité d’une propriété
- Compression des fichiers `.dat` avec `GZIPOutputStream`
- Affichage automatique de la **date de dernière sauvegarde**
- Implémentation d’une **interface `Sauvegardable`** propre

---

## Contraintes

- Aucun code dupliqué
- Sérialisation obligatoire pour tous les objets
- Organisation du code en plusieurs classes
- Affichage clair des erreurs, aucune exception non gérée

---

## Objectif pédagogique

- Maîtriser totalement la **sérialisation** en Java
- Créer un système réutilisable de sauvegarde/restauration
- Gérer des objets seuls ou groupés
- Renforcer ta capacité à structurer une mini-application

