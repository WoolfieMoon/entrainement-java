## Chapitre 3 – Les Runes de l’Invocation : méthodes et sorts personnalisés

Dans le Temple de l’Écho Profond, les mages ne répètent pas sans fin les mêmes incantations : ils les invoquent à volonté grâce aux méthodes. Ce chapitre t'apprend à créer tes propres sorts (méthodes), leur passer des ingrédients (paramètres), et récolter des effets (valeurs de retour).
# Exercice 1 – L’incantation fixe

**Contexte narratif :**  
Dans une salle silencieuse, tu grèves dans le marbre ta première incantation. Elle ne prend ni ingrédient, ni ne rend d’effet — elle **énonce simplement** un message magique à volonté.

**Énoncé :**  
Crée une classe Java nommée `IncantationFixe`.
1. Définis une méthode `public static void saluer()` qui affiche :

Salutations depuis le Temple de l’Écho Profond !

2. Dans `main`, appelle cette méthode une seule fois.
3. Le programme doit afficher ce message uniquement grâce à l’appel de méthode.

# Exercice 2 – Le messager mystique

**Contexte narratif :**  
Tu as appris à appeler un sort par son nom. Désormais, tu peux invoquer un message mystique **personnalisé** que tu passes à une créature à distance.

**Énoncé :**  
Crée une classe Java nommée `MessagerMystique`.
1. Définis une méthode `public static void envoyerMessage(String message)` qui affiche :

Message reçu : <message>

(où `<message>` est remplacé par le contenu passé en paramètre).
2. Dans `main`, appelle cette méthode avec le message suivant :  
   `"Les runes se réveillent..."`
3. Le programme doit afficher :
   Message reçu : Les runes se réveillent...

# Exercice 3 – La formule des forces

**Contexte narratif :**  
Pour invoquer un golem, il te faut combiner deux fragments de puissance. Crée un sort capable d’en calculer la force totale et de te la révéler.

**Énoncé :**  
Crée une classe Java nommée `FormuleDesForces`.
1. Définis une méthode `public static int additionner(int a, int b)` qui retourne la somme de `a` et `b`.
2. Dans `main`, appelle cette méthode avec les valeurs `17` et `25`, et stocke le résultat dans une variable `int`.
3. Affiche le message suivant avec la valeur obtenue :

Force totale invoquée : 42
# Exercice 4 – Le sortilège du miroir

**Contexte narratif :**  
Face au Miroir de Clarté, ton sort reflète le mot que tu y lances… à l’envers. Apprends à manipuler la magie des lettres pour retourner un message.

**Énoncé :**  
Crée une classe Java nommée `SortMiroir`.
1. Définis une méthode `public static String inverser(String mot)` qui retourne la chaîne inversée de `mot`.  
   *(Exemple : "lune" → "enul")*
2. Dans `main`, appelle cette méthode avec la valeur `"arcane"` et affiche le résultat retourné.
3. Le programme doit afficher :

Mot inversé : enacra

*(puisque "arcane" → "enacra")*
Astuce : utilise une boucle pour reconstruire le mot en sens inverse.

# Exercice 5 – La pierre révélatrice

**Contexte narratif :**  
La Pierre Révélatrice détecte si une rune numérique est **paire** ou **impaire**, et te dit la vérité sans faille. Apprends à invoquer ce verdict.

**Énoncé :**  
Crée une classe Java nommée `PierreRevelatrice`.
1. Définis une méthode `public static boolean estPaire(int nombre)` qui retourne `true` si le nombre est pair, `false` sinon.
2. Dans `main`, appelle cette méthode avec la valeur `57`, stocke le résultat dans une variable `boolean`, puis affiche :

Le nombre est pair : false

*(ou `true` selon le cas testé)*

# Exercice 6 – Le parchemin d’échos

**Contexte narratif :**  
Un ancien parchemin répète à haute voix chacun des éléments qu’on lui transmet. Tu dois créer un sort capable de lire chaque fragment d’un tableau d’énergie.

**Énoncé :**  
Crée une classe Java nommée `ParcheminEchos`.
1. Définis une méthode `public static void afficherElements(int[] tab)` qui affiche chaque élément du tableau sur une ligne.
2. Dans `main`, crée un tableau `int[] energies = {5, 8, 13, 21}`.
3. Appelle la méthode avec ce tableau.
4. Le programme doit afficher :

5
8
13
21
# Exercice 7 – La double invocation

**Contexte narratif :**  
Tu as trouvé deux fragments de sort qui s'assemblent différemment selon la formule. Apprends à créer plusieurs versions d’un sort avec des signatures différentes.

**Énoncé :**  
Crée une classe Java nommée `DoubleInvocation`.
1. Définis deux méthodes nommées `concatener` :
    - `public static String concatener(String a, String b)`
    - `public static String concatener(String a, String b, String c)`
2. Chaque méthode doit retourner la concaténation des chaînes passées.
3. Dans `main`, affiche les deux résultats suivants :

Feu+Glace
Feu+Glace+Foudre
# Exercice 8 – Le rituel combiné

**Contexte narratif :**  
Certaines invocations nécessitent plusieurs étapes successives. Tu dois créer un rituel composé de deux sorts : un pour augmenter la force, l’autre pour afficher la puissance finale.

**Énoncé :**  
Crée une classe Java nommée `RituelCombine`.
1. Définis deux méthodes :
    - `public static int amplifier(int base, int bonus)` → retourne la somme
    - `public static void afficherPuissance(int puissance)` → affiche :
      ```
      Puissance finale : <valeur>
      ```
2. Dans `main`, utilise `amplifier(30, 12)` puis appelle `afficherPuissance(...)` avec le résultat.
3. Le programme doit afficher :

Puissance finale : 42


# Exercice 9 – Le sort récursif

**Contexte narratif :**  
Un sort ancien permet de calculer des valeurs profondes par répétition magique. Tu vas créer un sort récursif pour invoquer la **factorielle** d’un nombre donné.

**Énoncé :**  
Crée une classe Java nommée `SortRecursif`.
1. Définis une méthode `public static int factorielle(int n)` qui retourne `1` si `n <= 1`, sinon `n * factorielle(n-1)`.
2. Dans `main`, appelle cette méthode avec `n = 5` et affiche :

Factorielle de 5 : 120
# Exercice 10 – Le sort interdit

**Contexte narratif :**  
Tu essayes d’invoquer un sort à travers un objet magique, mais la rune refuse : ce sort ne peut être invoqué que de manière **statique**. Tu dois comprendre et corriger l’erreur.

**Énoncé :**  
Crée une classe Java nommée `SortInterdit`.
1. Définis une méthode `public static void lancer()` qui affiche :

Le sort statique est lancé.

2. Dans `main`, appelle cette méthode **directement** via son nom (`lancer()`), sans créer d’objet.
3. Ne tente **pas** de faire `SortInterdit obj = new SortInterdit(); obj.lancer();` — ce serait une mauvaise pratique ici.

