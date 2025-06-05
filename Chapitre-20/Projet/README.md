# Mini-projet – Le Chronogramme d’Éternité

**Contexte narratif :**  
Dans la bibliothèque du Temps Profond, les Maîtres Archivistes enregistrent les événements magiques selon un **système temporel précis**. Tu dois construire un **Chronogramme**, un outil capable d’enregistrer, afficher et manipuler les événements dans le flux du temps.

---

## Objectif

Créer une application Java console permettant de **gérer un historique magique** d’événements datés, en utilisant les fonctionnalités de la bibliothèque `java.time`.

---

## Fonctionnalités attendues

### 1. Enregistrement d’un événement
- L’utilisateur saisit :
  - Un **nom d’événement**
  - Une **date** (via saisie utilisateur ou automatique)
- Chaque événement est stocké dans une liste avec son nom et sa date

---

### 2. Affichage de l’historique
- Affiche tous les événements enregistrés, triés par date croissante
- Format d’affichage personnalisé avec `DateTimeFormatter` :
  - Exemple : `⏳ [14 juin 1358] Apparition de la Lame Sélène`

---

### 3. Recherche temporelle
- L’utilisateur peut saisir une date :
  - Pour **voir les événements précédents**
  - Pour **voir les événements futurs**
- Affiche uniquement les événements qui répondent au critère

---

### 4. Analyse temporelle
- Sélectionne deux événements et calcule :
  - Le **nombre de jours** entre eux
  - Le **nombre d’années/mois/jours** avec `Period`
- Affiche le résultat dans un style lisible :
  - Exemple : `↔️ 2 ans, 3 mois et 14 jours entre les deux événements.`

---

### 5. Bonus (facultatif)
- Exporter l’historique dans un fichier texte
- Ajouter une commande “Aujourd’hui” pour insérer automatiquement la date du jour
- Intégrer des événements cycliques (anniversaires, célébrations…)

---

## Objectif pédagogique

- Maîtriser les classes `LocalDate`, `Period`, `ChronoUnit`, `DateTimeFormatter`
- Comprendre les comparaisons, tris et manipulations de dates
- Créer un petit outil fonctionnel orienté **gestion temporelle**

