# Chapitre 6 – Les Lignées Magiques : héritage et polymorphisme (niveau 1)

Tu entres dans le Sanctuaire des Lignées, où résident les créatures originelles d’Aleboréa. Ici, tu découvriras le pouvoir de l’héritage : créer des classes parentes et des classes enfants, réutiliser et spécialiser les attributs et les sorts des anciens. Tu exploreras aussi les premiers effets du polymorphisme à travers des invocations partagées.

# Exercice 1 – La lignée de base

**Contexte narratif :**  
Tu commences à tracer une **lignée magique**. Tout commence avec une entité primordiale : la **créature**. Tu vas créer cette classe de base.

**Énoncé :**
1. Crée une classe `Creature` avec deux attributs :
    - `String nom`
    - `int niveau`
2. Ajoute un constructeur pour initialiser ces attributs.
3. Crée une méthode `afficher()` qui affiche :

Créature : <nom> (Niveau <niveau>)

4. Dans `main` d’une classe `Main`, instancie une `Creature` `"Mystik"` de niveau `10` et appelle sa méthode `afficher()`.

# Exercice 2 – Le gobelin de la vallée

**Contexte narratif :**  
Le gobelin descend d’une lignée commune, mais il possède sa propre ruse. Tu dois **hériter** des attributs de base tout en ajoutant un **trait unique**.

**Énoncé :**
1. Crée une classe `Gobelin` qui hérite de `Creature`.
2. Ajoute un attribut `int ruse`.
3. Crée un constructeur qui initialise `nom`, `niveau` et `ruse`, en utilisant `super(...)`.
4. Crée une méthode `afficherRuse()` qui affiche :

Ruse du gobelin : <valeur>

5. Dans `main`, crée un `Gobelin` nommé `"Truk"` niveau `5` avec ruse `12`, affiche ses informations de base puis sa ruse.

# Exercice 3 – Le dragon ancestral

**Contexte narratif :**  
Le **dragon** est une créature légendaire issue de la même lignée. Mais lui possède une puissance de feu dévastatrice. Il te faudra adapter son affichage.

**Énoncé :**
1. Crée une classe `Dragon` qui hérite de `Creature`.
2. Ajoute un attribut `int feu`.
3. Crée un constructeur complet avec `super(...)`.
4. Redéfinis la méthode `afficher()` pour qu’elle affiche :

🐉 Dragon : <nom> (Niveau <niveau>, Feu : <feu>)

5. Dans `main`, crée un `Dragon` `"Ignis"` de niveau `20`, feu `80`, et appelle `afficher()`.

# Exercice 4 – L’appel polymorphe

**Contexte narratif :**  
Tu peux invoquer des créatures sans toujours connaître leur espèce exacte. Ce sort d’**invocation polymorphe** permet d’appeler n’importe quelle créature.

**Énoncé :**
1. Reprends les classes `Creature`, `Gobelin` et `Dragon`.
2. Crée une méthode statique `invoquerCreature(Creature c)` qui appelle `c.afficher()`.
3. Dans `main`, crée un `Gobelin` et un `Dragon`, et appelle `invoquerCreature(...)` avec chacun.
4. Résultat attendu :

Créature : Truk (Niveau 5)
🐉 Dragon : Ignis (Niveau 20, Feu : 80)

*(si tu n’as pas redéfini `afficher()` dans `Gobelin`, il utilisera celle de `Creature`)*

# Exercice 5 – La ménagerie magique

**Contexte narratif :**  
Une volière mystique contient plusieurs créatures héritées de la même lignée. Tu dois les placer dans une **collection polymorphe** pour les afficher.

**Énoncé :**
1. Reprends les classes `Creature`, `Gobelin`, `Dragon`.
2. Dans `main`, crée un tableau `Creature[]` contenant :
    - Un `Gobelin` `"Grub"` niveau `4`, ruse `10`
    - Un `Dragon` `"Flamis"` niveau `18`, feu `60`
    - Un `Creature` `"Bête étrange"` niveau `7`
3. Parcours le tableau et appelle `afficher()` sur chaque élément.
4. Résultat attendu :

Créature : Grub (Niveau 4)
🐉 Dragon : Flamis (Niveau 18, Feu : 60)
Créature : Bête étrange (Niveau 7)

# Exercice 6 – L’ombre et l’héritage

**Contexte narratif :**  
Un mage noir a forgé une nouvelle créature à partir du dragon, mais elle ne se déplace que dans les cieux. Tu vas créer une **sous-classe de sous-classe**.

**Énoncé :**
1. Reprends la classe `Dragon`.
2. Crée une classe `DragonVolant` qui hérite de `Dragon`.
3. Ajoute un attribut `int altitude`.
4. Redéfinis la méthode `afficher()` pour afficher :

🐲 DragonVolant : <nom> (Niveau <niveau>, Feu : <feu>, Altitude : <altitude>)

5. Dans `main`, instancie un `DragonVolant` `"Skyrend"` niveau `22`, feu `90`, altitude `3000` et affiche-le.

# Exercice 7 – L’invocation contrôlée

**Contexte narratif :**  
Tu veux pouvoir invoquer n’importe quel descendant d’une créature et afficher ses **détails** uniquement s’il s’agit d’un dragon.

**Énoncé :**
1. Reprends les classes `Creature` et `Dragon`.
2. Dans `main`, crée un tableau `Creature[]` avec des `Creature`, `Gobelin`, et `Dragon`.
3. Pour chaque élément, vérifie avec `instanceof` si c’est un `Dragon`.
4. Si oui, cast-le en `Dragon` et affiche `"Feu du dragon : <valeur>"`.
5. Sinon, affiche juste son nom.

# Exercice 8 – Le parchemin de lignée

**Contexte narratif :**  
Le vieux parchemin magique écrit automatiquement le **type exact** d'une créature invoquée. Tu dois utiliser le **nom de classe** réel à l’exécution.

**Énoncé :**
1. Reprends `Creature`, `Gobelin`, `Dragon`.
2. Dans `main`, instancie une créature de chaque type.
3. Pour chacune, affiche :

nom est une instance de : nom de la classe

4. Exemple :

Truk est une instance de : Gobelin
Ignis est une instance de : Dragon

5. Utilise `.getClass().getSimpleName()` pour obtenir le nom dynamique.

# Exercice 9 – La voix de l’ancêtre

**Contexte narratif :**  
Toutes les créatures descendent d’un ancêtre qui possédait une **capacité de base** : parler. Même les descendants doivent pouvoir utiliser ce pouvoir hérité.

**Énoncé :**
1. Ajoute une méthode `parler()` à la classe `Creature` qui affiche :

nom dit : Je suis une créature d’Aleboréa.

2. Ne redéfinis pas cette méthode dans les sous-classes.
3. Dans `main`, appelle `parler()` sur des instances de `Gobelin`, `Dragon` et `Creature`.
4. Résultat attendu :

Truk dit : Je suis une créature d’Aleboréa.
Ignis dit : Je suis une créature d’Aleboréa.
Mystik dit : Je suis une créature d’Aleboréa.

# Exercice 10 – Le polymorphe errant

**Contexte narratif :**  
Un être polymorphe voyage entre formes : tantôt gobelin, tantôt dragon, tantôt créature. Tu dois gérer une invocation changeante.

**Énoncé :**
1. Crée une méthode `genererCreature(int code)` dans une classe `Invocation` qui retourne :
    - `code == 1` → une `Gobelin` `"Lurk"` niveau `3`, ruse `9`
    - `code == 2` → un `Dragon` `"Pyron"` niveau `18`, feu `77`
    - autre → `Creature` `"Inconnu"` niveau `1`
2. Dans `main`, appelle trois fois la méthode avec les codes 1, 2, et 42.
3. Pour chaque retour, appelle `afficher()`.
