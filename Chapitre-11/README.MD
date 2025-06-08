## Chapitre 11 – Les Pièges de l’Inconnu : exceptions et gestion des erreurs

Dans les Cavernes du Chaos, même les mages les plus expérimentés peuvent tomber dans un piège magique. Ces erreurs imprévues sont appelées exceptions. Grâce à la magie des try-catch, l’élève apprend à les prévoir, les contenir et parfois même les corriger au vol.

Dans ce chapitre, tu vas apprendre à :

    - Détecter et intercepter les erreurs (try, catch)

    - Créer tes propres sorts d’exception

    - Protéger ton code contre les effets secondaires et les bugs critiques
# Exercice 1 – Le piège de la division interdite

**Contexte narratif :**  
Un sort de division magique a échappé à tout contrôle : il tente de diviser par zéro. Tu dois protéger l’incantation pour éviter une explosion magique.

**Énoncé :**
1. Crée une classe `SortDivision`.
2. Dans `main`, déclare deux entiers `a = 10` et `b = 0`.
3. Utilise un `try-catch` pour tenter de faire `a / b`.
4. Si une exception est levée, affiche :

Erreur : division par zéro interdite par le Codex !
# Exercice 2 – L’appel à l’index maudit

**Contexte narratif :**  
Une rune invoque un sort à une position qui n’existe pas dans le grimoire. Il faut éviter ce débordement.

**Énoncé :**
1. Crée une classe `SortsIndex`.
2. Dans `main`, crée un tableau `String[] sorts = {"Feu", "Eau", "Terre"}`
3. Essaie d’accéder à `sorts[5]` dans un bloc `try`.
4. Si une exception est capturée, affiche :

Erreur : tentative d'accès à un sort inexistant.
# Exercice 3 – L’invocation protégée

**Contexte narratif :**  
Tu veux sécuriser une invocation en empêchant tout crash, même si une erreur apparaît.

**Énoncé :**
1. Crée une classe `InvocationProtegee`.
2. Dans `main`, entoure un code potentiellement risqué (division par zéro ou index hors limites) dans un `try`.
3. Ajoute un bloc `finally` qui affiche toujours :

L’invocation est terminée, quelle qu’en soit l’issue.
# Exercice 4 – La bibliothèque interdite

**Contexte narratif :**  
Tu dois ouvrir un vieux grimoire (fichier) interdit, mais il peut ne pas exister. Tu dois capter cette situation.

**Énoncé :**
1. Crée une classe `GrimoireOuverture`.
2. Utilise `BufferedReader` pour tenter d’ouvrir `grimoire_inexistant.txt`.
3. Utilise `try-catch` pour capturer `FileNotFoundException`.
4. Affiche :

Le grimoire est introuvable dans la bibliothèque.
# Exercice 5 – Le sort contrôlé

**Contexte narratif :**  
Tu vas créer une méthode qui lance un sort risqué et qui doit **provoquer une exception personnalisée** si une règle est enfreinte.

**Énoncé :**
1. Crée une classe `SortControle`.
2. Crée une méthode `lancerSort(String nom)` qui :
    - Lance une `IllegalArgumentException` si `nom` est vide ou null.
3. Dans `main`, appelle cette méthode avec une chaîne vide.
4. Capture l’exception et affiche :

Sort interdit : le nom du sort est obligatoire.
# Exercice 6 – Le bouclier des sorts sûrs

**Contexte narratif :**  
Un mage prudent encapsule ses sorts dans une méthode qui renvoie une **valeur sûre** même si une erreur se produit.

**Énoncé :**
1. Crée une classe `BouclierSort`.
2. Crée une méthode `diviser(int a, int b)` qui :
    - Retourne `a / b` normalement
    - Retourne `-1` en cas de division par zéro (utilise `try-catch`)
3. Dans `main`, teste `diviser(10, 2)` et `diviser(10, 0)`
4. Affiche :

Résultat 1 : 5
Résultat 2 : -1
# Exercice 7 – Le coffre protégé

**Contexte narratif :**  
Un coffre enchanté contient des objets magiques. Tu veux récupérer un objet à un **index précis**, sans provoquer de faille.

**Énoncé :**
1. Crée une classe `CoffreMagique`.
2. Crée une méthode `récupérerObjet(String[] objets, int index)` qui :
    - Renvoie l’objet à l’index donné
    - Si l’index est invalide, retourne `"Vide"`
3. Teste avec :
    - `{"Potion", "Anneau", "Épée"}`, index `1` → `"Anneau"`
    - Index `5` → `"Vide"`

# Exercice 8 – Le sort instable

**Contexte narratif :**  
Tu veux créer un sort spécial qui **lance une exception personnalisée** si sa puissance dépasse une limite.

**Énoncé :**
1. Crée une classe `SortInstable`.
2. Crée une méthode `lancerSort(String nom, int puissance)` qui :
    - Si puissance > 100, lance une `Exception` avec un message clair
    - Sinon, affiche que le sort est lancé
3. Dans `main`, appelle deux fois :
    - Une avec `"Explosion"`, puissance `90`
    - Une avec `"Destruction"`, puissance `120`
4. Résultat attendu :

Sort lancé : Explosion (90)
Exception : puissance trop élevée pour Destruction !
# Exercice 9 – Le testeur d’incantation

**Contexte narratif :**  
Le Conseil veut tester des incantations sans jamais que l’application ne plante. Tu vas **intercepter toutes les erreurs possibles**.

**Énoncé :**
1. Crée une classe `TesteurIncantation`.
2. Dans `main`, entoure un bloc `try` contenant une division par zéro, une lecture de tableau hors limites, et une méthode sur une variable `null`.
3. Utilise **plusieurs blocs `catch`** pour chaque exception :
    - `ArithmeticException`
    - `ArrayIndexOutOfBoundsException`
    - `NullPointerException`
4. Affiche un message différent pour chaque erreur capturée.

# Exercice 10 – L’épreuve du forgeron

**Contexte narratif :**  
Le forgeron royal lance un sort pour forger une arme, mais si la température est trop basse, il refuse de continuer.

**Énoncé :**
1. Crée une classe `ForgeronRoyal`.
2. Crée une méthode `forger(int temperature)` qui :
    - Lance une `IllegalStateException` si température < 800
    - Affiche `"Forge réussie à <temp> degrés"` sinon
3. Dans `main`, teste avec `700` et `900`
4. Résultat attendu :

Erreur : température insuffisante pour forger.
Forge réussie à 900 degrés
