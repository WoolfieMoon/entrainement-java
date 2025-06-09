# Mini-projet – L’Archiviste d’Âme

**Contexte narratif :**  
Dans la Haute Bibliothèque de Verra, l’**Archiviste d’Âme** est un outil sacré permettant de **consigner, visualiser et organiser** les sortilèges et artefacts des mages. Tu es chargé de créer cette interface, capable d’assurer une interaction claire, fluide, et structurée entre les utilisateurs et les données.

---

## Objectif

Créer une application graphique complète en Swing, organisée selon l’architecture **MVC**, permettant de gérer une **base de données locale de sortilèges ou objets magiques**.

---

## Fonctionnalités attendues

### 1. Interface utilisateur (Vue)
- Interface graphique agréable, structurée, sans surcharge
- Champs de saisie : nom, type, puissance, élément, rareté
- Boutons : Ajouter, Supprimer, Modifier, Rechercher, Réinitialiser
- Affichage sous forme de tableau (`JTable`) avec tri et filtre

---

### 2. Modèle de données (Modèle)
- Classe `Sortilege` avec tous les attributs nécessaires
- Liste observable stockant tous les objets
- Méthodes de manipulation : ajout, suppression, modification, filtrage

---

### 3. Contrôleur
- Gère tous les événements :
  - Clics sur les boutons
  - Sélection dans le tableau
  - Champs modifiés
- Connecte le modèle et la vue proprement

---

### 4. Fonctions supplémentaires
- Permet de sauvegarder et charger la liste depuis un fichier `.dat` ou `.txt`
- Affiche des messages d’erreur en cas de saisie incorrecte
- Utilise des `JOptionPane` pour les messages de confirmation/succès

---

### 5. Bonus (facultatif)
- Ajoute un **thème personnalisé** (couleurs, icônes)
- Ajoute un mode "lecture seule" pour les utilisateurs sans autorisation
- Ajoute un système de **connexion simple** (admin/utilisateur)

---

## Contraintes

- Architecture **MVC stricte**
- Interface fluide, sans blocage
- Code découpé et commenté proprement
- Aucun accès direct entre Vue et Modèle (toujours via le Contrôleur)

---

## Objectif pédagogique

- Maîtriser **Swing** pour la création d’interfaces robustes
- Mettre en œuvre une séparation propre **MVC**
- Gérer les événements utilisateurs de façon modulaire
- Offrir une **application complète, interactive et maintenable**

