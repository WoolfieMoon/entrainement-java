# Chapitre 26 – Les Enchâssements Temporels : planification et exécution différée en Java

Dans les cryptes du Temps figé, les mages ont appris à différer leurs sorts pour qu’ils se déclenchent automatiquement dans le futur, sans présence humaine. Grâce aux enchâssements temporels, tu vas apprendre à programmer des actions différées, périodiques ou planifiées.

**Objectifs pédagogiques**

Tu vas apprendre à :

    - Utiliser Timer et TimerTask pour des tâches simples

    - Planifier des exécutions différées ou répétées

    - Utiliser ScheduledExecutorService pour des tâches plus robustes

    - Gérer l’annulation et la replanification de tâches

    - Créer des rappels, des alarmes, ou des boucles de fond
    
# Exercice 1 – Le Déclencheur différé

**Contexte narratif :**  
Tu viens de créer une rune magique qui se déclenche… **5 secondes après l’incantation**. Tu dois l’armer correctement.

---

## Objectif

Exécuter une tâche **après un délai** à l’aide d’un `Timer`.

---

## Consignes

- Crée une classe qui utilise `java.util.Timer`
- Planifie une tâche (`TimerTask`) à exécuter après 5 secondes
- Affiche un message indiquant que la rune a été activée
- Le programme se termine après l’exécution de la tâche

# Exercice 2 – Le Tambour rituel

**Contexte narratif :**  
Les prêtres frappent un tambour magique toutes les **2 secondes**. Il doit résonner sans faute… jusqu’à ce qu’on l’interrompe.

---

## Objectif

Créer une **tâche répétitive** avec `Timer`.

---

## Consignes

- Crée une tâche qui affiche un battement toutes les 2 secondes
- La tâche se répète indéfiniment (ou pendant un temps limité)
- Utilise `scheduleAtFixedRate` ou `schedule` avec répétition
- Ajoute une option pour l’arrêter après X secondes

# Exercice 3 – Le Sablier inversé

**Contexte narratif :**  
Un sablier enchanté indique combien de temps il reste avant l’ouverture du portail. Tu dois afficher un **compte à rebours** chaque seconde.

---

## Objectif

Mettre en place un **compte à rebours temporel**.

---

## Consignes

- Crée une tâche planifiée répétée chaque seconde
- Affiche le nombre de secondes restantes (décrémentation)
- Le sablier démarre à 10 secondes et atteint 0
- Affiche un message final lorsque le temps est écoulé

# Exercice 4 – La Veille du Gardien

**Contexte narratif :**  
Le Gardien magique doit exécuter différentes tâches à des **moments précis**. Tu dois programmer chacune de ses actions comme un cycle.

---

## Objectif

Planifier **plusieurs tâches différées** avec `Timer`.

---

## Consignes

- Crée 3 tâches planifiées :
  - Une dans 2 secondes
  - Une dans 5 secondes
  - Une dans 7 secondes
- Chaque tâche affiche un message différent
- Toutes les tâches sont programmées dès le lancement du programme

# Exercice 5 – Le Cœur régulier

**Contexte narratif :**  
Tu entres dans un golem de pierre, dont le **cœur magique** bat à intervalles réguliers. Tu dois simuler son rythme avec précision.

---

## Objectif

Utiliser `ScheduledExecutorService` pour créer une tâche périodique.

---

## Consignes

- Crée un `ScheduledExecutorService` avec un seul thread
- Planifie une tâche répétée toutes les 3 secondes
- La tâche affiche "BOUM"
- Le programme s’arrête après un certain nombre de battements (ex. 5)

# Exercice 6 – L’Horloge oubliée

**Contexte narratif :**  
Une ancienne horloge magique a été retrouvée. Elle **réveille une tâche** à une heure fixe chaque jour. Tu dois recréer ce mécanisme.

---

## Objectif

Planifier une tâche à une **heure précise** avec `ScheduledExecutorService`.

---

## Consignes

- Crée une tâche qui doit s'exécuter à un moment précis (ex. 14h15)
- Calcule le **délai entre maintenant et l'heure cible**
- Utilise `schedule()` pour différer la tâche jusqu’à cette heure
- Affiche un message unique à l’heure exacte (pas de répétition ici)

# Exercice 7 – La Danse rythmique

**Contexte narratif :**  
Une danse magique ne peut commencer que **si tous les tambours sont synchronisés**. Tu dois créer un système où plusieurs rythmes démarrent exactement **au même moment**.

---

## Objectif

Planifier **plusieurs tâches** pour qu’elles commencent **ensemble**.

---

## Consignes

- Crée plusieurs `Runnable` représentant des tambours
- Programme-les pour tous démarrer au **même instant**
- Calcule les délais pour chaque tâche si besoin
- Vérifie que tous les messages apparaissent quasi simultanément

# Exercice 8 – L’Invocation conditionnelle

**Contexte narratif :**  
Un sort ne peut se déclencher **qu’après une autre tâche terminée**. Tu dois l’enchaîner automatiquement après la première.

---

## Objectif

Exécuter une tâche **en série** (enchaînement) après une autre.

---

## Consignes

- Crée une première tâche (ex. préparer un parchemin)
- Une fois terminée, une seconde tâche doit se déclencher (ex. lancer le sort)
- Utilise un `ScheduledExecutorService` ou une suite de `Runnable`
- Gère les dépendances **sans blocage**

# Exercice 9 – Le Cycle d’annulation

**Contexte narratif :**  
Une machine temporelle est en marche, mais doit pouvoir être **arrêtée à tout moment**. Tu dois ajouter un **interrupteur magique**.

---

## Objectif

Annuler une tâche planifiée ou répétitive.

---

## Consignes

- Crée une tâche qui s’exécute toutes les 2 secondes
- Affiche un message à chaque exécution
- Après 5 secondes, **annule la tâche**
- Utilise `Future<?>` pour pouvoir l’arrêter

# Exercice 10 – Le Jardin des Rappels

**Contexte narratif :**  
Un jardinier magique utilise une interface qui lui permet de planifier des **rappels personnalisés**. Tu dois créer cette **interface temporelle**.

---

## Objectif

Créer une application console permettant de planifier dynamiquement des tâches différées.

---

## Consignes

- L’utilisateur entre un message et un délai (en secondes)
- Chaque message est planifié pour s’afficher après le délai indiqué
- Plusieurs rappels peuvent être programmés simultanément
- L’application reste ouverte tant que l’utilisateur le souhaite

