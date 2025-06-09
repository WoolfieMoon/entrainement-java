# Mini-projet – Le Codex du Temps

**Contexte narratif :**  
Dans le Sanctuaire d’Horam, un **Codex du Temps** permet aux mages d’enregistrer des sorts et de les déclencher **plus tard**, selon un moment précis ou à intervalles réguliers. Ton rôle est de recréer cet artefact pour que chaque sort inscrit **soit exécuté en différé, automatiquement et fidèlement**.

---

## Objectif

Créer une **application console** qui permet d’enregistrer des tâches (sorts) planifiées, avec exécution différée ou périodique, et une interface d’administration simple.

---

## Fonctionnalités attendues

### 1. Saisie des sortilèges
- L’utilisateur peut enregistrer un sort avec :
  - Un **nom**
  - Un **message associé**
  - Un **délai** (ex. “dans 10 secondes”) ou un **intervalle régulier** (ex. “toutes les 5 secondes”)
- Chaque sort est stocké dans une liste interne

---

### 2. Planification des exécutions
- Chaque sort est automatiquement programmé selon son mode :
  - Une seule exécution après un certain délai (`schedule`)
  - Ou répétée à intervalles (`scheduleAtFixedRate`)
- Affichage automatique du message du sort à l’heure voulue

---

### 3. Interface de contrôle
- Possibilité de :
  - Lister les sorts programmés
  - Annuler un sort programmé (avant son exécution)
  - Annuler **tous les sorts en cours**
  - Quitter l’application en arrêtant tous les timers

---

### 4. Robustesse
- Chaque tâche programmée est liée à une entrée dans la liste
- Les tâches annulées n’exécutent rien
- Le programme continue à accepter des entrées tant qu’il est actif

---

### 5. Bonus (facultatif)
- Affiche l’heure exacte d’exécution de chaque sort planifié
- Permet la sauvegarde/restauration des sorts dans un fichier
- Ajoute des **catégories de sorts** (ex. "attaque", "défense", "soin")

---

## Contraintes

- Utilisation de `ScheduledExecutorService`
- Architecture claire avec au moins deux classes (`Sort`, `Planificateur`)
- Bonne gestion des `Future<?>` pour annuler les tâches
- Interface en console simple mais propre

---

## Objectif pédagogique

- Apprendre à gérer dynamiquement des tâches planifiées
- Créer un système **interactif et asynchrone**
- Maîtriser les mécanismes d’exécution différée et répétée en Java
- Gérer les annulations, les flux utilisateur et la persistance

