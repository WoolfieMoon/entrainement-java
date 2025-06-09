# Mini-projet – Le Codex Relié

**Contexte narratif :**  
Les Reliques sacrées d’Argéal sont désormais trop nombreuses pour être consignées à la main. Tu es mandaté pour construire un **Codex Relié**, un grimoire interactif permettant de **créer, consulter, filtrer et modifier** des artefacts, avec **persistance des données** dans une base magique.

---

## Objectif

Créer une application console complète permettant de **gérer un catalogue d’artefacts magiques**, en utilisant **JDBC** et une **base de données relationnelle**.

---

## Fonctionnalités attendues

### 1. Structure de base
- Une base de données SQLite (ou autre) avec une table `artefacts`
- Les champs recommandés : `id`, `nom`, `type`, `element`, `rarete`, `puissance`, `protection`

---

### 2. Menu interactif
- Ajouter un artefact
- Supprimer un artefact
- Modifier un artefact existant
- Afficher tous les artefacts
- Filtrer par élément ou rareté
- Trier par puissance ou nom
- Compter les artefacts par type

---

### 3. Persistance
- Les opérations se font via des **requêtes SQL préparées**
- Toutes les modifications sont **persistées en base**
- L’application recharge les données à chaque lancement

---

### 4. Architecture recommandée
- Une classe `Artefact` pour représenter les objets
- Une classe `ArtefactDAO` pour les opérations SQL
- Une classe `CodexApp` pour la logique et l’IHM console

---

### 5. Bonus (facultatif)
- Ajouter une table `Familles` ou `Utilisateurs`
- Ajouter un mode "sauvegarde/export" (vers `.csv` ou `.json`)
- Utiliser un fichier de configuration pour la base (URL, nom…)

---

## Contraintes

- Application **console uniquement**
- JDBC pur (pas de frameworks comme Hibernate)
- Code clair, propre, modulaire

---

## Objectif pédagogique

- Maîtriser l’accès aux bases de données avec JDBC
- Structurer les interactions entre Java et SQL
- Appliquer les notions de DAO, transactions et mapping objet

