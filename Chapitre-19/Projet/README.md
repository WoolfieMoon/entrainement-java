# Mini-projet – L’Arène Éthérée

**Contexte narratif :**  
Bienvenue dans l’Arène Éthérée, un simulateur d’entraînement magique où les apprentis mages testent leurs capacités. Tu dois concevoir une **interface graphique complète**, fluide et réactive, pour permettre la gestion des invocations et des duels.

---

## Objectif

Créer une **application graphique JavaFX** complète avec :
- Organisation visuelle claire (layouts)
- Composants interactifs multiples
- Réactions aux actions utilisateur (clics, saisies, transferts)
- Utilisation d’un style CSS personnalisé

---

## Fonctionnalités attendues

### 1. Interface principale
- Un **titre** de l’application en haut
- Deux **listes** visibles côte à côte : une pour les créatures disponibles, une pour les créatures invoquées
- Une **barre d’énergie magique** indiquant la charge totale actuelle

---

### 2. Gestion des créatures
- Bouton pour **invoquer une créature** sélectionnée depuis la liste des disponibles
- Bouton pour **renvoyer** une créature invoquée
- Chaque créature a un **nom** et un **coût d’énergie**
- L’invocation **consomme de l’énergie** visible sur la barre magique

---

### 3. Énergie magique
- La **ProgressBar** représente une énergie de 100% au départ
- Chaque invocation réduit l’énergie selon le coût de la créature
- Empêche d’invoquer si l’énergie est insuffisante
- Permet de **recharger** l’énergie avec un bouton

---

### 4. Apparence personnalisée
- Appliquer un **fichier CSS externe**
  - Couleurs magiques
  - Boutons stylisés
  - Fond d’écran ou ambiance visuelle

---

### 5. Bonus (facultatif)
- Ajouter des **animations visuelles** (transition, effet lors de l’invocation)
- Permettre un **filtrage ou tri** des créatures disponibles
- Utiliser des **icônes ou images** pour illustrer les créatures

---

## Objectif pédagogique

- Maîtriser la création d’une interface graphique **moderne** et **interactive**
- Savoir structurer une application JavaFX propre
- Mettre en œuvre plusieurs **composants et événements**
- Utiliser la **séparation logique / présentation** via CSS

---

## Contraintes

- L’application doit être **claire, intuitive et stable**
- Aucune logique dans le `main` : organise ton code en classes propres
- Aucune dépendance extérieure : JavaFX seul, sans librairie externe

