## Chapitre 1
Dans les **Plaines de l’Éveil**, le jeune apprenti découvre les premiers artefacts magiques. Ces épreuves représentent les bases de la magie logique : variables, opérations simples, conditions et boucles élémentaires.
# Exercice 1 – Le sort d’accueil

**Contexte narratif :**  
Tu pénètres pour la première fois dans la grande salle de la Tour des Échos. L’Archimage t’ordonne de lancer un sort d’accueil pour annoncer ta venue à tout Aleboréa.

**Énoncé :**  
Crée une classe Java nommée `HelloAleborea` contenant la méthode `main`. Dans cette méthode, affiche exactement la ligne suivante à la console :

Bienvenue dans le royaume d'Aleboréa !

Veille à respecter la casse (majuscules/minuscules) et l’apostrophe.  
# Exercice 2 – Le sceau des runes élémentaires

**Contexte narratif :**  
Dans la Salle des Premières Runes, tu dois graver sur un parchemin magique toutes les variables de base pour invoquer les éléments d’Aleboréa. Cela t’aidera à préparer tes sorts élémentaires.

**Énoncé :**  
Crée une classe Java nommée `SceauElementaire` avec la méthode `main`. Dans `main` :
1. Déclare une variable `int` nommée `pointsDeVie` et initialise-la à 100.
2. Déclare une variable `double` nommée `quantiteDeMana` et initialise-la à 75.5.
3. Déclare une variable `char` nommée `symboleRune` et initialise-la au caractère `'✦'`.
4. Déclare une variable `String` nommée `nomSceau` et initialise-la à `"RuneDeFeu"`.
5. Affiche à l’écran, ligne par ligne :

Points de vie : 100
Quantité de mana : 75.5
Symbole de la rune : ✦
Nom du sceau : RuneDeFeu

Veille à ce que chaque instruction `System.out.println` corresponde exactement au format ci-dessus.  

# Exercice 3 – Union des parchemins

**Contexte narratif :**  
Un scribe t’a confié deux parchemins distincts : l’un porte un prénom, l’autre un nom de famille. Tu dois les assembler pour connaître l’identité complète du héros, afin que l’Oracle puisse prononcer la prophétie.

**Énoncé :**  
Crée une classe Java nommée `AssembleNomHero` avec la méthode `main`. Dans `main` :
1. Déclare deux variables `String` : `prenom` avec la valeur `"Elynn"` et `nomFamille` avec la valeur `"Luminis"`.
2. Concatène ces deux variables, séparées par un espace, et stocke le résultat dans une troisième variable `String` nommée `nomComplet`.
3. Affiche à la console :

Identité du héros : Elynn Luminis

(en insérant la variable `nomComplet`).  

# Exercice 4 – L’arithmagie du forgeron

**Contexte narratif :**  
Au Mont Calculemur, le forgeron magique te demande d’additionner la force et l’agilité du héros pour évaluer la puissance totale de son marteau enchanté. Sans cette valeur, il ne pourra pas forger l’arme.

**Énoncé :**  
Crée une classe Java nommée `PuissanceDuMarteau` avec la méthode `main`. Dans `main` :
1. Déclare deux variables `int` : `force` à 23 et `agilite` à 17.
2. Calcule la somme des deux dans une variable `int` nommée `puissanceTotale`.
3. Affiche exactement :

Puissance totale du marteau : 40

(en insérant la variable `puissanceTotale`).  

# Exercice 5 – L’élixir de sagesse

**Contexte narratif :**  
Dans la Forêt des Âmes Sages, on te remet deux fioles mesurant la mana extraite de runes anciennes. Tu dois calculer leur moyenne pour préparer l’élixir de sagesse, essentiel pour franchir les portes de la Clairière.

**Énoncé :**  
Crée une classe Java nommée `ElixirSagesse` avec la méthode `main`. Dans `main` :
1. Déclare deux variables `double` : `manaRune1` à 56.8 et `manaRune2` à 42.4.
2. Calcule la moyenne dans une variable `double` `moyenneMana`.
3. Affiche exactement :

Quantité moyenne de mana : 49.6

(en arrondissant exactement à une décimale, via le calcul direct). 
# Exercice 6 – L’énigme du caractère sacré

**Contexte narratif :**  
La grande porte de cristal ne s’ouvrira que si tu révèles le caractère sacré qu’elle protège. Ce caractère est transmis par un ancien esprit codé dans les runes. Seul le bon caractère pourra déverrouiller la porte.

**Énoncé :**  
Crée une classe Java nommée `CaractereSacré` avec la méthode `main`. Dans `main` :
1. Déclare une variable `char` nommée `caractereSacré` valant `'Ω'`.
2. Affiche exactement :

Le caractère sacré est : Ω

(en utilisant `System.out.println`).  
# Exercice 7 – Sort de conversion binaire

**Contexte narratif :**  
Le Spectre des Bits t’ordonne de révéler la forme binaire d’un nombre mystique : 42. Sans cette information, le passage vers la cryptomine reste scellé et tu ne pourras pas continuer ta quête.

**Énoncé :**  
Crée une classe Java nommée `BinaireMystique` avec la méthode `main`. Dans `main` :
1. Déclare une variable `int` `nombreMystique` initialisée à 42.
2. Utilise `Integer.toBinaryString(nombreMystique)` pour obtenir sa représentation binaire, et stocke-la dans une variable `String` `binaire`.
3. Affiche exactement :

42 en binaire : 101010

(en insérant la variable `binaire`).  

# Exercice 8 – Le gardien boolean

**Contexte narratif :**  
Un Gardien invisible bloque la route vers la cité perdue. Il ne laisse passer que ceux dont la mission est validée. Sa validation est représentée par une vérité magique (`true` ou `false`). Seule une valeur `true` lui prouvera que tu as accompli la tâche.

**Énoncé :**  
Crée une classe Java nommée `GardienInvisible` avec la méthode `main`. Dans `main` :
1. Déclare une variable `boolean` nommée `missionValidee` et assigne-lui la valeur `true`.
2. Affiche exactement :

Accès autorisé : true

(en insérant la variable `missionValidee`).  

# Exercice 9 – Le parchemin commenté

**Contexte narratif :**  
Dans la bibliothèque oubliée, chaque code est enrichi de commentaires anciens qui racontent l’histoire des sortilèges. Tu dois écrire un parchemin Java en y ajoutant un commentaire qui explique son fonctionnement pour que les futurs apprentis comprennent.

**Énoncé :**  
Crée une classe Java nommée `ParcheminCommente` avec la méthode `main`. Dans `main` :
1. Ajoute un commentaire Java (`//`) juste avant la ligne `public static void main`, expliquant brièvement “Point d’entrée du parchemin”.
2. Dans la méthode `main`, écris une instruction qui affiche :

Étudier les runes, c'est essentiel !

3. Assure-toi que le commentaire apparaît correctement au-dessus de la ligne `public static void main`.  

# Exercice 10 – L’énonciateur de choix

**Contexte narratif :**  
L’Oracle de la Clairvoyance te donne un menu gravé sur une stèle antique. Tu dois simplement afficher trois choix pour la prochaine grande quête : “Commencer la quête”, “Charger la partie”, “Quitter”. Il n’y a pas encore d’interaction, uniquement l’affichage.

**Énoncé :**  
Crée une classe Java nommée `MenuOracle` avec la méthode `main`. Dans `main` :
1. Affiche exactement, ligne par ligne :

    1. Commencer la quête
    2. Charger la partie
    3. Quitter

Aucune saisie de l’utilisateur n’est requise ici : il s’agit uniquement d’afficher le menu statique.  

