# Mini-projet – Le Grimoire Web de la Guilde

**Contexte narratif :**  
Les guildes du continent ont demandé l'ouverture d’un **portail web magique**, capable de gérer leurs sortilèges à distance. Grâce au pouvoir du Spring Boot, tu dois bâtir un **Grimoire RESTful** : une application web simple, mais puissante, permettant d’ajouter, consulter et supprimer des sorts via requêtes HTTP.

---

## Objectif

Créer une **application web REST avec Spring Boot** qui permet :
- D’enregistrer un sortilège (POST)
- D’afficher un sort par son identifiant (GET)
- De consulter tous les sorts enregistrés (GET)
- De supprimer un sort (DELETE)
- De stocker temporairement les sorts dans une mémoire en liste (pas de base de données)

---

## Fonctionnalités à implémenter

1. **Création d’un sort (POST)**  
   - Recevoir un sort au format JSON (nom et puissance)  
   - Rejeter les sorts de puissance trop faible (< 50) avec un message clair  
   - Ajouter un identifiant automatiquement à chaque sort accepté

2. **Affichage d’un sort par ID (GET)**  
   - Retourner les données du sort correspondant à l’ID fourni  
   - Retourner une erreur si aucun sort n’existe avec cet ID

3. **Liste complète des sorts (GET)**  
   - Retourner la liste de tous les sorts enregistrés depuis le démarrage

4. **Suppression d’un sort (DELETE)**  
   - Supprimer un sort en fonction de son ID  
   - Retourner un message clair si le sort n’existe pas

---

## Données attendues pour un sort

Chaque sort contient les propriétés suivantes :
- `id` (auto-incrémenté)
- `nom`
- `puissance`

---

## Requêtes à tester

- `POST /grimoires` → envoie un sort  
- `GET /grimoires` → récupère tous les sorts  
- `GET /grimoires/{id}` → récupère un sort précis  
- `DELETE /grimoires/{id}` → supprime un sort précis

---

## Contraintes

- Utiliser uniquement Spring Boot et une liste Java en mémoire (aucune base de données)  
- Utiliser des routes REST classiques  
- Structurer le projet de manière claire : service, contrôleur, modèle

---

## Bonus facultatifs

- Retourner des codes HTTP adaptés (200, 400, 404)  
- Ajouter une recherche par nom ou par puissance minimale  
- Ajouter un système de tri (par puissance, nom...)

---

## Objectif pédagogique

- Mettre en œuvre les bases de Spring Boot REST  
- Comprendre les interactions HTTP (GET, POST, DELETE)  
- Manipuler des données en mémoire et simuler une base temporaire  
- Structurer proprement les couches d’une mini-API REST

