# Mini-projet – Le Grimoire du Multivers

**Contexte narratif :**  
L’Ordre des Sphères t’a confié une mission capitale : créer une **application console modulaire** capable de gérer tous les sorts connus du Multivers selon les règles strictes du **Modèle-Vue-Contrôleur (MVC)**.

---

## Objectif

Créer une application Java en console structurée en MVC permettant de :
- Ajouter, consulter et supprimer des sorts
- Afficher uniquement les sorts puissants
- Offrir un menu interactif clair
- Séparer proprement `modele`, `vue` et `controleur`

---

## Structure du projet

Crée trois packages :
- `modele` : contient `Sort`, `Grimoire`  
- `vue` : contient `VueMenu`, `VueGrimoire`  
- `controleur` : contient `GrimoireControleur`, qui fait le lien entre tout

---

## Fonctions obligatoires

Menu affiché au lancement :

=== Grimoire du Multivers ===

    1.Ajouter un sort

    2.Afficher tous les sorts

    3.Afficher les sorts puissants

    4.Supprimer un sort

    5.Quitter
    

### 1. Ajouter un sort
- Saisie nom et puissance
- Ajoute dans le grimoire
- Message : `✅ Sort ajouté.`

### 2. Afficher tous les sorts
- Affiche chaque sort sous forme :  

🔸 Éclair – Puissance : 90


### 3. Afficher les sorts puissants
- Seuil : puissance ≥ 80

### 4. Supprimer un sort
- Saisie du nom
- Retire du grimoire s’il existe
- Message : `❌ Sort supprimé.` ou `⚠️ Sort introuvable.`

### 5. Quitter
- Message de fin : `👋 Fermeture du grimoire.`

---

## Bonus possibles

- Confirmer la suppression avant exécution  
- Ajouter une sauvegarde des sorts dans un fichier (optionnel)

---

## Objectif pédagogique

- Structurer son code en MVC de manière rigoureuse  
- Gérer les interactions console proprement  
- Mettre en œuvre la séparation des responsabilités  
- Maîtriser un projet Java modulaire simple et propre

