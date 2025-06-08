## Chapitre 12 – Les Enchantements Parallèles : introduction aux threads

Dans la Tour des Reflets, les mages les plus puissants exécutent plusieurs incantations en parallèle, décuplant leur efficacité. Ces sorts simultanés sont réalisés grâce aux threads, de véritables filaments d’énergie indépendants.

Dans ce chapitre, tu vas apprendre à :

    - Créer et démarrer des threads

    - Comprendre les exécutions concurrentes

    - Utiliser Runnable et Thread

    - Observer les effets du parallélisme magique
# Exercice 1 – Invocation double

**Contexte narratif :**  
Tu veux lancer deux sorts en même temps : l’un de feu, l’autre de glace. Chaque invocation doit pouvoir s’exécuter indépendamment de l’autre.

**Énoncé :**
1. Crée une classe `SortFeu` qui implémente `Runnable`.  
   Dans `run()`, affiche 5 fois :

Sort de Feu lancé

avec `Thread.sleep(500)` entre chaque.

2. Crée une classe `SortGlace` de la même manière, qui affiche :

Sort de Glace lancé


3. Dans `main`, crée deux `Thread`, un pour chaque sort, et démarre-les avec `start()`.

4. Observe que les messages des deux sorts s’intercalent (exécution parallèle).

# Exercice 2 – Invocation anonyme

**Contexte narratif :**  
Pour les sorts temporaires, certains mages utilisent des **runes anonymes** à usage unique.

**Énoncé :**
1. Dans `main`, crée un `Thread` avec une classe anonyme `Runnable`.
2. Elle doit afficher :

Sort éclair temporaire !

3 fois avec `Thread.sleep(300)` entre chaque.
3. Démarre le thread et attends sa fin avec `join()`.

# Exercice 3 – L’incantation prioritaire

**Contexte narratif :**  
Certains sorts doivent s’exécuter **plus vite** que d’autres selon leur priorité magique.

**Énoncé :**
1. Crée deux threads :
    - Un avec priorité minimale (`setPriority(1)`)
    - Un avec priorité maximale (`setPriority(10)`)
2. Les deux affichent respectivement `"Sort lent"` et `"Sort rapide"` 10 fois.
3. Observe si les résultats montrent une différence d’exécution (elle n’est **pas garantie** en Java, mais c’est le but pédagogique).

# Exercice 4 – Le mage multitâche

**Contexte narratif :**  
Un mage veut lancer plusieurs sorts en série. Chacun dans un thread séparé.

**Énoncé :**
1. Crée une méthode `lancerSort(String nom)` qui crée un thread anonyme affichant `nom` 5 fois avec pause.
2. Dans `main`, appelle :
    - `lancerSort("Feu")`
    - `lancerSort("Éclair")`
    - `lancerSort("Soin")`
3. Les 3 sorts doivent s’exécuter en parallèle.

# Exercice 5 – L’incantation contrôlée

**Contexte narratif :**  
Tu veux attendre qu’un sort se termine avant d’en lancer un autre.

**Énoncé :**
1. Crée deux threads nommés `sortA` et `sortB`.
2. `sortA` affiche `"Sort A"` 5 fois, `sortB` affiche `"Sort B"` 5 fois.
3. Utilise `join()` pour que `sortB` ne commence qu’après la fin de `sortA`.

# Exercice 5 – L’incantation contrôlée

**Contexte narratif :**  
Tu veux attendre qu’un sort se termine avant d’en lancer un autre.

**Énoncé :**
1. Crée deux threads nommés `sortA` et `sortB`.
2. `sortA` affiche `"Sort A"` 5 fois, `sortB` affiche `"Sort B"` 5 fois.
3. Utilise `join()` pour que `sortB` ne commence qu’après la fin de `sortA`.

# Exercice 7 – L’horloge du mage

**Contexte narratif :**  
Un mage doit afficher une **heure magique** toutes les secondes, sans bloquer les autres actions.

**Énoncé :**
1. Crée une classe `HorlogeMagique` qui implémente `Runnable`.
2. Dans `run()`, affiche `"Tic magique..."` toutes les secondes pendant 5 secondes.
3. Démarre ce thread, et pendant ce temps, affiche aussi `"Le mage lit."` dans le `main`, toutes les 500 ms.
4. Les deux messages doivent apparaître **entrelacés**.

# Exercice 8 – Le compteur des invocations

**Contexte narratif :**  
Tu veux exécuter un sort pendant qu’un **compteur parallèle** suit l’avancement.

**Énoncé :**
1. Crée un thread `InvocationLente` qui affiche `"Incantation..."` 3 fois avec `sleep(1000)`.
2. En parallèle, un thread `Compteur` affiche `"1..."`, `"2..."`, `"3..."` chaque seconde.
3. Les deux s'exécutent en même temps.

# Exercice 9 – Le verrou du chaos

**Contexte narratif :**  
Deux mages veulent lancer un sort **sur le même artefact**. Il faut protéger l’accès pour éviter des erreurs magiques.

**Énoncé :**
1. Crée une classe `ArtefactPartage`.
2. Elle possède une méthode `utiliser()` synchronisée, qui affiche `"Sort lancé par <nom du thread>"`.
3. Crée deux threads appelant cette méthode.
4. Grâce à `synchronized`, un seul mage peut l’utiliser à la fois.

# Exercice 10 – L’armée de clones

**Contexte narratif :**  
Le mage Noir invoque **20 clones** qui s’exécutent tous en même temps, chacun criant leur nom.

**Énoncé :**
1. Crée une boucle dans `main` qui lance 20 threads.
2. Chaque thread affiche :

Je suis Clone #<numéro>

en utilisant la variable de boucle.
3. Utilise une copie locale de l’index dans le `Runnable` pour éviter les erreurs de capture.

