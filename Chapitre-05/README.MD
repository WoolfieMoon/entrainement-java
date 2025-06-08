## Chapitre 5 – Les Runes Animées : initiation à la programmation orientée objet (POO)

Tu arrives dans la Salle des Entités Éveillées, un lieu où les runes ne sont plus figées : elles prennent vie. Ici, tu apprendras à créer tes propres types magiques : les classes. Tu y apprendras à définir des attributs, instancier des objets, et leur faire accomplir des actions via des méthodes.


# Exercice 1 – La création d’un artefact

**Contexte narratif :**  
Dans l’Atelier des Essences, tu façonnes ton premier artefact magique. Il ne parle pas encore, mais possède un **nom**.

**Énoncé :**  
Crée une classe Java nommée `Artefact`.
1. Ajoute un attribut `String nom`.
2. Dans la méthode `main` d’une classe `Main`, crée un objet `Artefact`.
3. Donne à `nom` la valeur `"Sceptre d'Émeraude"`.
4. Affiche le nom de l’artefact :

Nom de l’artefact : Sceptre d'Émeraude
# Exercice 2 – Le golem numéroté

**Contexte narratif :**  
Un vieux parchemin permet de créer un golem élémentaire à l’aide d’un **constructeur mystique**. Tu dois l’invoquer avec ses caractéristiques de base.

**Énoncé :**  
Crée une classe Java nommée `Golem`.
1. Ajoute deux attributs : `String type` et `int puissance`.
2. Ajoute un **constructeur** qui initialise ces deux attributs.
3. Dans la méthode `main` d’une classe `Main`, crée un objet `Golem` avec les valeurs `"Terre"` et `75`.
4. Affiche :

Golem de type : Terre, puissance : 75
# Exercice 3 – Le miroir des statistiques

**Contexte narratif :**  
Le miroir des héros montre leurs statistiques magiques. Tu dois créer une méthode spéciale dans ta classe pour les afficher clairement.

**Énoncé :**  
Crée une classe Java nommée `Heros`.
1. Ajoute les attributs `String nom`, `int force`, `int intelligence`.
2. Crée un constructeur pour les initialiser.
3. Crée une méthode `afficherStats()` qui affiche les trois valeurs, une par ligne.
4. Dans `main` d’une classe `Main`, crée un héros `"Aëron"` avec `force = 30`, `intelligence = 50`, puis appelle `afficherStats()`.
5. Sortie attendue :

Nom : Aëron
Force : 30
Intelligence : 50
# Exercice 4 – Le familier du mage

**Contexte narratif :**  
Chaque mage possède un familier lié à son âme. Tu vas créer cette créature magique, capable de **répondre par une action**.

**Énoncé :**  
Crée une classe Java nommée `Familier`.
1. Ajoute un attribut `String espece`.
2. Crée une méthode `crier()` qui affiche :

Le <espece> pousse un cri mystique !

(remplace `<espece>` par l’attribut réel)
3. Dans `main` d’une classe `Main`, crée un familier de type `"Griffon"` et appelle sa méthode `crier()`.
4. Résultat attendu :

Le Griffon pousse un cri mystique !
# Exercice 5 – L’élixir évolutif

**Contexte narratif :**  
L’élixir de croissance permet de faire progresser une entité magique. Tu dois créer un **sort d’évolution** qui modifie ses statistiques.

**Énoncé :**  
Crée une classe Java nommée `Creature`.
1. Attributs : `String nom`, `int niveau`.
2. Méthodes :
    - `gagnerNiveau()` → augmente le niveau de 1
    - `afficherNiveau()` → affiche `"Niveau actuel de <nom> : <niveau>"`
3. Dans `main` d’une classe `Main`, crée une créature `"Sylphide"` de niveau `3`, fais-lui gagner un niveau, puis affiche son niveau.
4. Résultat attendu :

Niveau actuel de Sylphide : 4
# Exercice 6 – Le cristal enchanté

**Contexte narratif :**  
Certains objets magiques sont plus complexes que d’autres. Tu dois créer un cristal qui possède **une méthode pour se décrire lui-même**.

**Énoncé :**  
Crée une classe Java nommée `Cristal`.
1. Attributs : `String couleur`, `int energie`.
2. Méthode `decrire()` qui affiche :

Cristal <couleur> contenant <energie> unités d'énergie.

3. Dans `main` d’une classe `Main`, crée un objet `Cristal` `"bleu"` avec `120` d’énergie, puis appelle `decrire()`.
4. Résultat attendu :

Cristal bleu contenant 120 unités d'énergie.
# Exercice 7 – Le lien de l’esprit

**Contexte narratif :**  
Un esprit peut être lié à un objet ou à un être vivant. Crée une classe **indépendante** qui représente un **lien mystique** entre deux entités.

**Énoncé :**  
Crée une classe Java nommée `LienMystique`.
1. Attributs : `String source`, `String cible`.
2. Méthode `afficherLien()` qui affiche :

Lien mystique entre <source> et <cible>

3. Dans `main` d’une classe `Main`, crée un lien `"Mage Arken"` → `"Dragon Céleste"` et affiche-le.
4. Résultat attendu :

Lien mystique entre Mage Arken et Dragon Céleste
# Exercice 8 – Le parchemin scellé

**Contexte narratif :**  
Un parchemin ancien est protégé par une **valeur secrète** qu’on ne peut lire qu’avec une méthode spéciale. Tu dois protéger l’accès à cette rune.

**Énoncé :**  
Crée une classe Java nommée `Parchemin`.
1. Attribut privé `String contenu`.
2. Constructeur qui initialise `contenu` (ex. `"Invoque la lumière"`).
3. Méthode publique `lire()` qui affiche :

Lecture du parchemin : <contenu>

4. Dans `main`, crée un `Parchemin` et appelle sa méthode `lire()`.
5. Résultat attendu :

Lecture du parchemin : Invoque la lumière
# Exercice 9 – L’invocateur d’ombres

**Contexte narratif :**  
L’Invocateur d’Ombres appelle des créatures du néant. Chacune possède un **nom** et un **type**. Tu dois créer plusieurs objets issus de la même classe.

**Énoncé :**  
Crée une classe Java nommée `Ombre`.
1. Attributs : `String nom`, `String type`.
2. Méthode `afficherOmbre()` qui affiche :

Ombre invoquée : <nom> de type <type>

3. Dans `main`, crée deux ombres :
- `"Noctra"`, `"Spectre"`
- `"Velkan"`, `"Banshee"`
4. Affiche leurs descriptions.
5. Résultat attendu :

Ombre invoquée : Noctra de type Spectre
Ombre invoquée : Velkan de type Banshee
# Exercice 10 – La fontaine des runes

**Contexte narratif :**  
Une fontaine ancienne contient un **nombre de runes** en fonction de la **pureté de l’eau**. Le calcul est automatique et doit être encapsulé dans une méthode.

**Énoncé :**  
Crée une classe Java nommée `Fontaine`.
1. Attributs : `double purete`, `int runes`.
2. Méthode `calculerRunes()` qui assigne à `runes` la valeur `(int)(purete * 10)`.
3. Méthode `afficherEtat()` qui affiche :

Fontaine de pureté <purete> contient <runes> runes.

4. Dans `main`, crée une fontaine avec pureté `8.5`, appelle `calculerRunes()`, puis `afficherEtat()`.
5. Résultat attendu :

Fontaine de pureté 8.5 contient 85 runes.
