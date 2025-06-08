## Chapitre 2 – Les Runes de Flux : conditions et embranchements.

Dans ce chapitre, tu quittes la Tour des Échos pour explorer la Caverne des Chemins Multiples, un lieu mystique où chaque incantation change le cours des événements. Tu vas apprendre à faire des choix avec if, else if, et else — des runes essentielles pour décider du destin du code.
# Exercice 1 – La porte de niveau

**Contexte narratif :**  
À l’entrée de la Caverne des Chemins Multiples se dresse une ancienne porte runique. Elle ne s’ouvre que si le niveau de l’aventurier est supérieur ou égal à 10.

**Énoncé :**  
Crée une classe Java nommée `PorteRunique` avec la méthode `main`.
1. Déclare une variable `int niveau` et initialise-la à 12.
2. Utilise une condition `if` pour vérifier si le niveau est supérieur ou égal à 10.
3. Si c’est vrai, affiche :

La porte s’ouvre dans un grondement ancien...

4. Sinon, affiche :

La porte reste scellée, insensible à ta présence.

# Exercice 2 – L’orbe de jugement

**Contexte narratif :**  
L’orbe de jugement magique révèle si un aventurier est apte à recevoir une bénédiction. Il faut au moins 50 points de sagesse ou plus pour être jugé digne.

**Énoncé :**  
Crée une classe Java nommée `OrbeDeJugement` avec la méthode `main`.
1. Déclare une variable `int sagesse` et initialise-la à 37.
2. Si la sagesse est supérieure ou égale à 50, affiche :

L’orbe brille : tu es digne.

3. Sinon, affiche :

L’orbe s’éteint : encore trop jeune pour cette magie.
# Exercice 3 – Le cristal des trois voies

**Contexte narratif :**  
Tu arrives devant un cristal qui change de couleur selon ton affinité magique. Il peut devenir rouge, bleu ou vert, selon ta spécialité : feu, eau ou terre.

**Énoncé :**  
Crée une classe Java nommée `CristalAffinite` avec la méthode `main`.
1. Déclare une variable `String affinite` et initialise-la à `"eau"`.
2. Utilise une structure `if - else if - else` pour afficher l’un des messages suivants :
    - Si `"feu"` :
      ```
      Le cristal flamboie d’un rouge ardent !
      ```
    - Si `"eau"` :
      ```
      Le cristal luit d’un bleu apaisant.
      ```
    - Sinon :
      ```
      Le cristal verdit comme la mousse ancienne.
      ```

# Exercice 4 – Le coffre du double sceau

**Contexte narratif :**  
Un coffre magique n’accepte que ceux qui possèdent à la fois une **clé dorée** et une **bague d’onyx**. Sans l’un ou l’autre, le coffre te rejette.

**Énoncé :**  
Crée une classe Java nommée `CoffreRunique` avec la méthode `main`.
1. Déclare deux variables `boolean` : `aCle` (true) et `aBague` (false).
2. Si le joueur a **les deux**, affiche :

Le coffre s’ouvre et révèle un artefact ancien.

3. Sinon, affiche :

Le coffre refuse de s’ouvrir, une magie t’en empêche.
# Exercice 5 – Le miroir du doute

**Contexte narratif :**  
Un miroir ancien te questionne : **as-tu le courage ou la sagesse ?** Si tu as au moins l’un des deux, il te laisse passer. Sinon, il te fait rebrousser chemin.

**Énoncé :**  
Crée une classe Java nommée `MiroirDuDoute` avec la méthode `main`.
1. Déclare deux variables `boolean` : `aCourage` (false) et `aSagesse` (true).
2. Si l’un **ou** l’autre est vrai, affiche :

Le miroir s’incline et te laisse passer.

3. Sinon, affiche :

Le miroir reflète ton indécision. Tu dois revenir plus tard.
# Exercice 6 – Le cristal de vérité

**Contexte narratif :**  
Un cristal magique ne peut être activé que si le héros possède **au moins 100 points de mana** **et** est au niveau **supérieur ou égal à 5**. Sinon, il reste terne.

**Énoncé :**  
Crée une classe Java nommée `CristalVerite` avec la méthode `main`.
1. Déclare deux variables :
    - `int mana` = 120
    - `int niveau` = 4
2. Si les deux conditions sont remplies, affiche :

Le cristal s’illumine d’une lumière pure.

3. Sinon, affiche :

Le cristal ne réagit pas à ta présence.
# Exercice 7 – L’épreuve du dragon

**Contexte narratif :**  
Un vieux dragon juge les aventuriers selon leur force. Il accepte ceux dont la force est **au moins de 70**, mais repousse ceux **au-dessus de 150**, les jugeant dangereux. Les autres sont considérés "acceptables".

**Énoncé :**  
Crée une classe Java nommée `EpreuveDragon` avec la méthode `main`.
1. Déclare une variable `int force` = 160
2. Utilise une structure `if - else if - else` pour afficher :
    - Si force >= 150 :
      ```
      Le dragon te craint et te demande de partir.
      ```
    - Si force >= 70 :
      ```
      Le dragon incline la tête : tu es digne.
      ```
    - Sinon :
      ```
      Le dragon ne te remarque même pas.
      ```

# Exercice 8 – Le souffle élémentaire

**Contexte narratif :**  
Tu veux lancer un sort élémentaire. Le joueur choisit un élément (`"feu"`, `"glace"`, ou `"foudre"`). Tu dois afficher un message spécifique selon l’élément choisi. Si l’élément est inconnu, tu lances un avertissement.

**Énoncé :**  
Crée une classe Java nommée `SouffleElementaire` avec la méthode `main`.
1. Déclare une variable `String element` = `"glace"`
2. Utilise `if - else if - else` pour afficher :
    - `"feu"` :
      ```
      Un souffle de flammes embrase le champ de bataille !
      ```
    - `"glace"` :
      ```
      Un vent gelé fige tout sur son passage...
      ```
    - `"foudre"` :
      ```
      L’éclair jaillit, rapide comme la pensée !
      ```
    - Autre :
      ```
      L’élément est inconnu, le sort échoue.
      ```

# Exercice 9 – La balise du vide

**Contexte narratif :**  
Un ancien artefact contient un mot de passe magique. Mais si ce mot de passe est vide (`""`), l’artefact refuse de fonctionner et émet un cri strident.

**Énoncé :**  
Crée une classe Java nommée `BaliseDuVide` avec la méthode `main`.
1. Déclare une variable `String motDePasse` = `""`
2. Si le mot de passe est vide, affiche :

L’artefact siffle : mot de passe absent !

3. Sinon, affiche :

L’artefact t’accepte comme utilisateur légitime.

Astuce : utilise `motDePasse.equals("")` ou `motDePasse.isEmpty()` pour la vérification.  


# Exercice 10 – Le verdict du conseil

**Contexte narratif :**  
Le Grand Conseil d’Aleboréa te posera trois questions cruciales. Si tu as **toutes les réponses justes**, alors tu obtiens le **titre d’Héritier du Code**.

**Énoncé :**  
Crée une classe Java nommée `VerdictConseil` avec la méthode `main`.
1. Déclare trois variables `boolean` :
    - `enigme1Reussie = true`
    - `enigme2Reussie = true`
    - `enigme3Reussie = false`
2. Si les trois sont `true`, affiche :

Le Conseil t’accorde le titre d’Héritier du Code.

3. Sinon, affiche :

Le Conseil reste silencieux. Reviens mieux préparé.

Utilise une seule condition combinée avec `&&`.  


