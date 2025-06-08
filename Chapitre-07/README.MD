## Chapitre 7 – Les Runes du Pacte : interfaces et classes abstraites

Dans les Salles du Pacte Éternel, les entités magiques signent des contrats runiques : elles promettent d’accomplir certaines actions en échange de pouvoir. Ces pactes sont représentés par les interfaces. D’autres êtres reçoivent une forme incomplète, une essence définie mais non concrète : ce sont les classes abstraites.

Tu vas découvrir comment faire respecter un comportement commun à des classes différentes, tout en utilisant l’héritage multiple par contrat (interfaces), ainsi que les classes abstraites pour poser des bases solides.
# Exercice 1 – Le pacte du combattant

**Contexte narratif :**  
Dans la Crypte des Serments, les guerriers signent le Pacte du Combattant : ils promettent de savoir **attaquer** et **se défendre**.

**Énoncé :**
1. Crée une interface `Combattant` avec deux méthodes :
    - `void attaquer();`
    - `void seDefendre();`
2. Crée une classe `Chevalier` qui implémente `Combattant`.
3. Implémente les méthodes pour afficher :
    - `attaquer()` : `"Le Chevalier frappe avec son épée !"`.
    - `seDefendre()` : `"Le Chevalier lève son bouclier."`.
4. Dans `main`, crée un `Chevalier` et appelle ses deux méthodes.

# Exercice 2 – Le pacte du voleur

**Contexte narratif :**  
Un voleur n’a pas le même style qu’un chevalier, mais il a signé le même pacte. Il doit aussi savoir attaquer et se défendre, mais différemment.

**Énoncé :**
1. Reprends l’interface `Combattant`.
2. Crée une classe `Voleur` qui l’implémente.
3. Implémente les méthodes :
    - `attaquer()` : `"Le Voleur frappe dans l’ombre."`
    - `seDefendre()` : `"Le Voleur esquive habilement."`
4. Dans `main`, instancie un `Voleur` et appelle ses deux méthodes.

# Exercice 3 – L’arène polymorphe

**Contexte narratif :**  
Dans l’arène d’Aleboréa, tous ceux qui ont signé le pacte peuvent être invoqués pour combattre. Peu importe leur classe, **ils sont tous des `Combattant`**.

**Énoncé :**
1. Reprends `Chevalier` et `Voleur` qui implémentent `Combattant`.
2. Dans `main`, crée un tableau `Combattant[]` contenant un chevalier et un voleur.
3. Parcours le tableau et appelle `attaquer()` et `seDefendre()` sur chaque élément.
4. Tu dois obtenir les messages propres à chaque classe.

# Exercice 4 – La créature incomplète

**Contexte narratif :**  
Tu découvres une créature **encore inachevée** : on connaît son nom, mais pas encore sa façon d’attaquer. Tu dois créer une **classe abstraite**.

**Énoncé :**
1. Crée une classe abstraite `CreatureMystique` avec :
    - Attribut `String nom`
    - Constructeur pour l’initialiser
    - Méthode `void afficherNom()` → affiche : `"Créature : <nom>"`
    - Méthode abstraite `void utiliserPouvoir()`
2. Crée une classe `Spectre` qui hérite de `CreatureMystique`.
3. Implémente `utiliserPouvoir()` pour afficher : `"Le Spectre traverse les murs..."`
4. Dans `main`, crée un `Spectre` `"Nox"`, appelle `afficherNom()` et `utiliserPouvoir()`.

# Exercice 5 – L’esprit multiple

**Contexte narratif :**  
Certaines entités sont à la fois des **créatures mystiques** et des **combattants**. Elles héritent d’une **forme abstraite** et signent un **pacte** en parallèle.

**Énoncé :**
1. Reprends `CreatureMystique` (abstraite) et l’interface `Combattant`.
2. Crée une classe `Chimere` qui hérite de `CreatureMystique` et implémente `Combattant`.
3. Attributs : `int force`.
4. Implémente :
    - `utiliserPouvoir()` : `"La Chimère rugit et déploie ses ailes !"`.
    - `attaquer()` : `"La Chimère griffe violemment !"`.
    - `seDefendre()` : `"La Chimère se replie dans la brume."`.
5. Dans `main`, instancie une `Chimere` `"Korga"` et appelle les trois méthodes.

# Exercice 6 – L’archiviste des pactes

**Contexte narratif :**  
Un ancien archiviste répertorie toutes les entités ayant signé un pacte. Peu lui importe leur espèce : s’ils sont `Combattant`, ils doivent être référencés.

**Énoncé :**
1. Reprends l’interface `Combattant`, les classes `Chevalier`, `Voleur` et `Chimere`.
2. Dans `main`, crée une méthode `referencer(Combattant c)` qui affiche :

Entité référencée : <nom de la classe>

*(utilise `c.getClass().getSimpleName()`)*
3. Crée une instance de chaque classe, puis passe-les à `referencer(...)`.


# Exercice 7 – L’épreuve du pacte oublié

**Contexte narratif :**  
Une entité a été invoquée, mais ne semble pas respecter le pacte. Le Conseil souhaite vérifier si elle est bien `Combattant`.

**Énoncé :**
1. Dans `main`, instancie un `Chevalier`, un `Voleur` et un `Spectre`.
2. Parcours-les dans un tableau d’`Object[]`.
3. Pour chaque objet, vérifie s’il est un `Combattant` avec `instanceof`.
4. Si oui, appelle `attaquer()`. Sinon, affiche :

Cette entité n’a signé aucun pacte de combat.
# Exercice 8 – Le pacte de soin

**Contexte narratif :**  
Certaines entités ne combattent pas, mais **soignent**. Tu dois créer une **interface de soin** et des entités qui la respectent.

**Énoncé :**
1. Crée une interface `Soigneur` avec la méthode `void soigner();`
2. Crée une classe `Pretre` qui implémente `Soigneur`, avec :
    - `soigner()` : `"Le Prêtre invoque une aura régénératrice."`
3. Crée une classe `Druide` qui implémente aussi `Soigneur`, avec :
    - `soigner()` : `"Le Druide libère l’énergie des racines."`
4. Dans `main`, instancie les deux et appelle leur méthode.

# Exercice 9 – Le double serment

**Contexte narratif :**  
Un ancien héros a signé **deux pactes** : celui du combat et celui du soin. Tu dois gérer ce cas spécial de **multi-interfaces**.

**Énoncé :**
1. Reprends les interfaces `Combattant` et `Soigneur`.
2. Crée une classe `Paladin` qui implémente les deux interfaces.
3. Implémente les trois méthodes :
    - `attaquer()` : `"Le Paladin frappe avec sa lame bénie."`
    - `seDefendre()` : `"Le Paladin invoque un bouclier sacré."`
    - `soigner()` : `"Le Paladin récite une prière curative."`
4. Dans `main`, crée un `Paladin` et appelle ses méthodes.

# Exercice 10 – Le grimoire des entités

**Contexte narratif :**  
Tu dois construire un **grimoire polymorphe** qui contient des `Combattant`, des `Soigneur`, ou même les deux. À chaque page, tu dois reconnaître l’entité et déclencher ses capacités.

**Énoncé :**
1. Reprends toutes les interfaces et classes précédentes.
2. Dans `main`, crée un tableau `Object[]` avec :
    - Un `Voleur`, un `Pretre`, un `Paladin`
3. Parcours le tableau.
4. Pour chaque élément :
    - S’il est un `Combattant`, appelle `attaquer()`
    - S’il est un `Soigneur`, appelle `soigner()`
    - Affiche aussi le nom de la classe avec `getClass().getSimpleName()`
5. Exemple attendu :

Voleur attaque
Classe : Voleur

Prêtre soigne
Classe : Pretre

Paladin attaque
Paladin soigne
Classe : Paladin
