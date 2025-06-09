# Chapitre 23 - Les Conjurations Parallèles : introduction au multithreading en Java

**Objectifs pédagogiques**

Tu vas apprendre à :

    - Créer et exécuter des threads en Java

    - Utiliser l’interface Runnable et la classe Thread

    - Démarrer plusieurs threads en parallèle

    - Synchroniser des blocs de code avec synchronized

    - Comprendre les risques de conditions de course

    - Introduire les executors pour une gestion avancée
    
# Exercice 1 – L’Invocation multiple

**Contexte narratif :**  
Dans la salle des Échos, tu dois lancer **plusieurs sorts à la fois**. Chaque invocation doit prononcer une formule en parallèle des autres.

---

## Objectif

Créer et exécuter **plusieurs threads** simples avec `Thread` ou `Runnable`.

---

## Consignes

- Crée une classe qui implémente `Runnable`
- Dans la méthode `run()`, affiche un message unique plusieurs fois
- Instancie et démarre **au moins 3 threads différents**
- Observe l’exécution parallèle (les messages se mélangent)

# Exercice 2 – Le Sablier Dérobé

**Contexte narratif :**  
Certains sorts prennent plus de temps. Tu dois créer un **thread avec temporisation** pour simuler une incantation lente.

---

## Objectif

Utiliser `Thread.sleep()` dans un thread pour introduire un délai.

---

## Consignes

- Crée un thread qui affiche un message, attend 2 secondes, puis affiche un autre message
- Démarre ce thread depuis la méthode principale
- Vérifie que le programme continue à s’exécuter en parallèle pendant ce temps

# Exercice 3 – Le Miroir de Conflit

**Contexte narratif :**  
Deux mages tentent d’écrire en même temps dans le même **grimoire**. Sans précaution, les symboles se mélangent. Tu dois éviter ce **conflit magique**.

---

## Objectif

Comprendre les problèmes de **concurrence** sur une ressource partagée.

---

## Consignes

- Crée une classe `Grimoire` avec une méthode `ajouterSymbole()`
- Lance plusieurs threads qui appellent cette méthode simultanément
- Sans synchronisation, observe les résultats incohérents
- Ajoute le mot-clé `synchronized` et vérifie la différence

# Exercice 4 – Le Rituel synchronisé

**Contexte narratif :**  
Pour ouvrir un portail, plusieurs invocateurs doivent agir **dans un ordre précis**. Ils ne doivent pas se gêner. Tu vas apprendre la **synchronisation magique**.

---

## Objectif

Synchroniser l’accès à une **section critique** dans un objet partagé.

---

## Consignes

- Crée une méthode partagée dans une classe appelée par plusieurs threads
- Protège cette méthode avec un bloc `synchronized`
- Affiche le nom du thread à chaque accès
- Vérifie que les threads n’entrent **jamais en même temps**

# Exercice 5 – Le Chœur des Conjurateurs

**Contexte narratif :**  
Tu veux gérer un **groupe de mages** qui exécutent leurs sorts à l’appel d’un chef d’orchestre. Le **conjurateur principal** doit attendre que tous les autres aient fini.

---

## Objectif

Attendre la fin de plusieurs threads avant de continuer.

---

## Consignes

- Lance plusieurs threads exécutant chacun une tâche simple
- Utilise `join()` pour attendre que tous les threads soient terminés
- Après leur fin, affiche un message final (“Tous les sortilèges sont lancés.”)

# Exercice 6 – Le Duel d’Incantations

**Contexte narratif :**  
Deux mages s’affrontent en lançant chacun **100 incantations** le plus vite possible. Le duel est serré : qui finira le premier ?

---

## Objectif

Mesurer la **durée d’exécution** de plusieurs threads et les comparer.

---

## Consignes

- Crée deux threads exécutant une boucle de 100 affichages
- Chronomètre le début et la fin de chaque thread (en millis)
- Compare les temps d’exécution
- Affiche le nom du "vainqueur" (le thread le plus rapide)

# Exercice 7 – Le Cristal Maître

**Contexte narratif :**  
Un **objet unique** (le Cristal Maître) doit être manipulé par un seul invocateur à la fois. Tu dois garantir une **sécurité absolue** d’accès.

---

## Objectif

Utiliser un **verrou explicite** (`ReentrantLock`) pour protéger une ressource.

---

## Consignes

- Crée une classe contenant un champ partagé
- Protége l’accès à ce champ avec un `ReentrantLock`
- Lance plusieurs threads modifiant ce champ
- Vérifie que les accès sont bien exclusifs

# Exercice 8 – Le Déclencheur de Portail

**Contexte narratif :**  
Une salle attend que **5 mages aient complété leur rituel** avant d’ouvrir le portail. Aucun ne peut passer avant la synchronisation complète.

---

## Objectif

Utiliser une **barrière de synchronisation** (`CyclicBarrier`).

---

## Consignes

- Crée une barrière pour 5 threads avec un `Runnable` déclenché à la fin
- Lance 5 threads qui s’y attendent
- Affiche un message commun une fois la barrière franchie
- Vérifie que l’action finale ne s’exécute qu’une seule fois

# Exercice 9 – Le Fileur de Manas

**Contexte narratif :**  
Tu veux créer une **file d’attente magique** dans laquelle plusieurs mages placent leur énergie, et un seul la consomme pour créer un artefact.

---

## Objectif

Utiliser une **BlockingQueue** pour gérer une file sécurisée entre threads.

---

## Consignes

- Crée une `BlockingQueue<String>`
- Lance plusieurs producteurs qui y ajoutent des "manas"
- Lance un consommateur qui les récupère un par un
- Synchronise le tout correctement

# Exercice 10 – L’Orchestre des Exécuteurs

**Contexte narratif :**  
Les Maîtres Archimages veulent répartir les tâches entre plusieurs **exécuteurs automatiques**. Tu dois construire un **pool de sortilèges**.

---

## Objectif

Utiliser un **ExecutorService** pour exécuter plusieurs tâches de façon structurée.

---

## Consignes

- Crée un `ExecutorService` avec un pool fixe (3 threads)
- Soumets-lui plusieurs tâches (au moins 6)
- Chaque tâche affiche un message avec son numéro
- Termine proprement le pool à la fin

