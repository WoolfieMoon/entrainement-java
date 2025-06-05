# Mini-projet – Le Codex Fragmenté

**Contexte narratif :**  
Un ancien Codex magique a été retrouvé, mais il est **divisé en multiples fragments textuels** et **artefacts binaires**. Tu es chargé de développer un **outil d’archiviste** permettant de **lire**, **fusionner**, **filtrer**, et **copier** les fragments dans un nouveau Codex restauré.

---

## Objectif

Créer une application Java console complète capable de :
- Lire, écrire, copier, et filtrer des fichiers texte
- Manipuler des fichiers binaires
- Gérer dynamiquement des chemins de fichiers et dossiers

---

## Fonctionnalités attendues

### 1. Lecture de fragments
- Lister tous les fichiers `.txt` dans un dossier donné
- Lire et afficher le contenu de chaque fichier
- Compter les lignes et caractères de chaque fragment

---

### 2. Fusion et reconstruction
- Permettre à l’utilisateur de **choisir plusieurs fichiers texte**
- Fusionner leur contenu dans un nouveau fichier `codex_reconstruit.txt`
- Ajouter un séparateur visuel entre les fragments fusionnés

---

### 3. Censure magique
- Lire le Codex reconstruit
- Supprimer ou remplacer certains **mots interdits**
- Sauvegarder le fichier censuré sous un nouveau nom (`codex_censuré.txt`)

---

### 4. Gestion de reliques binaires
- Copier un fichier binaire (ex. image `.png`, `.dat`, ou autre)
- Vérifier que la copie est identique à l’original (en taille)

---

### 5. Bonus (facultatif)
- Créer un fichier journal des actions de l’utilisateur
- Permettre l'ajout d’une **entrée quotidienne automatique** dans un fichier journal (`journal_du_codex.txt`)
- Générer un rapport global des opérations effectuées (fichiers traités, taille totale, mots censurés...)

---

## Contraintes

- Organisation claire des classes
- Tous les fichiers sont manipulés dynamiquement (pas de chemins codés en dur)
- Aucune perte de données acceptée
- Traitement robuste des erreurs d’entrée/sortie

---

## Objectif pédagogique

- Maîtriser la lecture, l’écriture et la copie de fichiers texte et binaires
- Gérer des entrées/sorties complexes dans une application
- Développer un outil utile, polyvalent et bien structuré

