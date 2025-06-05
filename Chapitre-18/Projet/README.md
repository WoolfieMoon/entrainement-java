# Mini-projet – L’Arsenal du Conseil

**Contexte narratif :**  
Le Grand Conseil souhaite créer un **système complet de gestion des Reliques Magiques**. Tu es chargé de concevoir un **arsenal interactif** permettant d’enregistrer, afficher, trier, fusionner et activer les reliques de différentes natures, dans une architecture orientée objet propre et extensible.

---

## Objectif

Créer une application console Java qui gère un arsenal de reliques magiques en mettant en œuvre :

- Héritage et classes abstraites
- Interfaces multiples
- Polymorphisme
- Surcharge de méthodes
- Classes internes ou anonymes
- Tri d’objets

---

## Fonctionnalités à implémenter

### 1. Création et enregistrement de reliques

- Créer différents types de reliques (par sous-classes)
- Possibilité de les enregistrer dans une collection principale
- Certaines reliques peuvent être canalisables, défensives ou les deux

---

### 2. Activation polymorphe

- Chaque relique possède une méthode d’activation
- L’application doit pouvoir activer **toutes les reliques** à travers une boucle unique, en appelant leur comportement propre

---

### 3. Fusion de reliques

- Deux reliques peuvent être fusionnées pour en créer une nouvelle
- Cette nouvelle relique peut combiner nom, puissance, et capacités

---

### 4. Affichage complet de l’arsenal

- Liste toutes les reliques avec leurs propriétés détaillées
- Affiche leur type (canalisable, défensif, etc.)
- Affiche leur puissance et effet via `toString()`

---

### 5. Tri par puissance

- L’utilisateur peut afficher les reliques triées par ordre croissant ou décroissant de puissance

---

## Bonus (facultatif)

- Implémenter une interface graphique simple avec JavaFX
- Sauvegarder/charger l’arsenal depuis un fichier
- Ajouter une interface `Transportable` avec un poids, et un tri alternatif par légèreté

---

## Contraintes techniques

- Aucun code dupliqué : tu dois tirer parti de l’héritage et des interfaces
- Polymorphisme obligatoire pour les boucles d’activation
- Utilisation de `instanceof` ou de cast uniquement lorsqu’aucune autre solution n’est plus élégante

---

## Objectif pédagogique

- Consolider tous les acquis de la POO avancée en Java
- Construire un mini-système modulaire et propre
- Mettre en œuvre de manière concrète héritage, interfaces et polymorphisme dans un projet réaliste

