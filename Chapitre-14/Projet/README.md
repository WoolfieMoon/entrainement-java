# Mini-projet – Le Grimoire des Maîtres

**Contexte narratif :**  
Le Conseil Supérieur veut archiver les sorts utilisés par ses maîtres mages. Ce grimoire doit permettre d’enregistrer, consulter, filtrer et modifier les sortilèges de chaque mage à tout moment, via une interface simple en console.

---

## Objectif

Créer une base SQLite et un programme Java permettant :
- La création automatique de la base et des tables
- L’ajout de nouveaux sortilèges
- Lister tous les sorts
- Rechercher les sorts d’un mage
- Mettre à jour la puissance d’un sort
- Supprimer un sort

---

## Structure de la table

Table : `sorts_maitres`
- `id` INTEGER PRIMARY KEY AUTOINCREMENT  
- `mage` TEXT NOT NULL  
- `nom` TEXT NOT NULL  
- `puissance` INTEGER NOT NULL

---

## Interface console (menu)

Au démarrage, affiche le menu suivant :

=== Grimoire des Maîtres ===

    1.Ajouter un sort

    2.Voir tous les sorts

    3.Rechercher les sorts d’un mage

    4.Modifier la puissance d’un sort

    5.Supprimer un sort

    6.Quitter
    

Chaque choix déclenche l’action correspondante, avec saisie via `Scanner`.

---

## Comportements attendus

**1. Ajouter un sort**  
- Demande le nom du mage, du sort et sa puissance  
- Insère la ligne dans la table

**2. Voir tous les sorts**  
- Affiche :

[ID] Mage : Kaelis | Sort : Flamme (90)


**3. Rechercher les sorts d’un mage**  
- Demande le nom du mage  
- Affiche tous les sorts associés

**4. Modifier la puissance d’un sort**  
- Demande l’`ID` du sort à modifier  
- Demande la nouvelle puissance  
- Met à jour la base

**5. Supprimer un sort**  
- Demande l’ID du sort  
- Supprime la ligne de la table

**6. Quitter**  
- Ferme proprement la connexion et termine l’exécution

---

## Objectif pédagogique :
- Utiliser JDBC pour une base de données SQLite
- Gérer toutes les opérations CRUD
- Créer une interface console interactive
- Structurer proprement l’accès aux données

