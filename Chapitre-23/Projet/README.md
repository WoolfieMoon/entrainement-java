# Mini-projet – Le Cœur Synchronique

**Contexte narratif :**  
Dans les profondeurs de la Tour Oblique bat le **Cœur Synchronique**, une source magique instable qui nécessite la coordination de multiples invocateurs. Si les actions ne sont pas parfaitement orchestrées, le cœur explose. À toi de construire un **système multithread sécurisé**, où chaque mage remplit son rôle sans entrer en conflit.

---

## Objectif

Créer une **application console multithread** complexe simulant un système où plusieurs entités interagissent en parallèle, avec gestion des synchronisations, verrouillages, files et exécuteurs.

---

## Fonctionnalités attendues

### 1. Création des rôles
- Plusieurs classes de mages :
  - **Chargement** : alimente le cœur en énergie magique
  - **Stabilisation** : surveille le flux pour éviter les surcharges
  - **Extraction** : récupère l’énergie stabilisée pour usage
- Chaque rôle tourne dans un **thread indépendant**

---

### 2. File d’énergie magique
- Utilise une `BlockingQueue` pour faire transiter l’énergie
- Le thread de chargement y ajoute des fragments d’énergie
- Le stabilisateur lit et approuve (ou rejette) les fragments
- L’extracteur consomme les fragments valides

---

### 3. Sécurité du cœur
- Toute surcharge ou désynchronisation déclenche une **alerte**
- Implémente un **système de log** sécurisé (verrouillé) qui affiche :
  - L’état actuel du cœur
  - Les fragments actifs
  - Les anomalies détectées

---

### 4. Utilisation avancée
- Utilise au choix :
  - `synchronized`
  - `ReentrantLock`
  - `ExecutorService`
  - `CountDownLatch` ou `CyclicBarrier` pour démarrage commun
- Assure-toi que le système peut tourner **en continu** ou pendant un temps défini

---

### 5. Bonus (facultatif)
- Ajoute un **tableau de bord** en console (interface texte actualisée)
- Permets l’arrêt et redémarrage du cœur
- Ajoute une option pour **injecter une erreur manuellement** (test)

---

## Contraintes

- Aucun accès concurrent non protégé
- Flux clairs entre les rôles
- Arrêt propre et sécurisé des threads
- Code modulaire (au moins 3 classes différentes)

---

## Objectif pédagogique

- Maîtriser les **bases du multithreading** et des synchronisations
- Comprendre les flux de travail entre threads
- Utiliser efficacement les outils de la **concurrence Java**
- Simuler un **système parallèle robuste et interactif**

