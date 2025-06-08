## Chapitre 4 – Les Runes de la Série : tableaux à une dimension

Dans la Galerie des Séries Sacrées, les mages manipulent des séquences d’objets, de noms, de chiffres. Chaque fragment est lié à un autre dans une trame invisible : les tableaux. Ce chapitre te permet de créer, parcourir et manipuler des tableaux (arrays) pour stocker des séries de données magiques.
# Exercice 1 – Les cristaux en série

**Contexte narratif :**  
Dans l’Antichambre des Résonances, tu récupères cinq cristaux magiques. Tu dois enregistrer leurs puissances dans un grimoire ordonné pour que leur vibration puisse être analysée.

**Énoncé :**  
Crée une classe Java nommée `CristauxEnSerie`.
1. Déclare un tableau `int[] puissances = {12, 7, 23, 5, 19}`.
2. Affiche chaque valeur du tableau sur une ligne, en utilisant une boucle `for`.
3. Le programme doit produire :

12
7
23
5
19
# Exercice 2 – L’inventaire du voyageur

**Contexte narratif :**  
Le voyageur runique transporte avec lui des objets magiques. Tu dois créer un tableau listant ces objets et les afficher dans l’ordre.

**Énoncé :**  
Crée une classe Java nommée `InventaireVoyageur`.
1. Déclare un tableau `String[] objets = {"Cape", "Baguette", "Potion", "Carte", "Clé"}`.
2. Utilise une boucle `for` pour afficher chaque objet avec le préfixe suivant :

Objet : <nom>

3. Exemple de sortie :

Objet : Cape
Objet : Baguette
...
# Exercice 3 – L’amplificateur magique

**Contexte narratif :**  
Une machine ancienne permet d’amplifier l’énergie des fragments stockés dans un tableau. Tu dois augmenter chaque valeur de 10 et afficher le nouveau résultat.

**Énoncé :**  
Crée une classe Java nommée `AmplificateurMagique`.
1. Déclare un tableau `int[] fragments = {4, 9, 14, 2}`.
2. Parcours le tableau avec une boucle `for` et, pour chaque élément, affiche :

Nouvelle puissance : <valeur + 10>

3. Le tableau d’origine ne doit pas être modifié.

# Exercice 4 – L’analyseur de mana

**Contexte narratif :**  
Tu dois détecter quels réservoirs de mana contiennent **au moins 50 unités** pour les connecter au réseau magique d’urgence.

**Énoncé :**  
Crée une classe Java nommée `AnalyseurMana`.
1. Déclare un tableau `int[] mana = {42, 56, 33, 78, 12, 91}`.
2. Affiche uniquement les valeurs supérieures ou égales à 50, précédées de :

Réservoir valide : <valeur>

3. Exemple attendu :

Réservoir valide : 56
Réservoir valide : 78
Réservoir valide : 91
# Exercice 5 – L’index du dragon

**Contexte narratif :**  
Un dragon ancien est lié à une rune dans un tableau de noms. Tu dois retrouver son **index** dans la liste des créatures pour connaître sa position sur le plan astral.

**Énoncé :**  
Crée une classe Java nommée `IndexDragon`.
1. Déclare un tableau `String[] creatures = {"Gobelin", "Chauve-Souris", "Dragon", "Golem", "Spectre"}`.
2. Parcours le tableau avec une boucle `for` pour trouver `"Dragon"` et affiche :

Dragon trouvé à l’index : <position>

3. Si `"Dragon"` n’est pas trouvé, affiche :

Le Dragon est introuvable dans cette dimension.
# Exercice 6 – Le miroir des fragments

**Contexte narratif :**  
Dans le Temple du Reflet, tu dois **afficher les puissances magiques à l’envers**, comme si tu les observais dans un miroir d’obsidienne.

**Énoncé :**  
Crée une classe Java nommée `MiroirFragments`.
1. Déclare un tableau `int[] fragments = {3, 6, 9, 12, 15}`.
2. Utilise une boucle `for` en partant de la fin du tableau pour afficher chaque valeur.
3. Exemple attendu :

15
12
9
6
3
# Exercice 7 – Le total de l’éveil

**Contexte narratif :**  
Un autel magique s’active uniquement si tu lui donnes l’**énergie totale** des cinq orbes élémentaires réunies. Additionne les puissances pour éveiller le cercle.

**Énoncé :**  
Crée une classe Java nommée `TotalEveil`.
1. Déclare un tableau `int[] orbes = {10, 20, 30, 40, 50}`.
2. Calcule la somme de tous les éléments du tableau.
3. Affiche :

Énergie totale : 150
# Exercice 8 – La rune du plus puissant

**Contexte narratif :**  
Le Conseil des Mages veut identifier **le plus puissant** artefact contenu dans un tableau pour le placer au cœur du rituel de défense.

**Énoncé :**  
Crée une classe Java nommée `ArtefactPuissant`.
1. Déclare un tableau `int[] artefacts = {34, 67, 89, 23, 90, 58}`.
2. Trouve la valeur maximale du tableau.
3. Affiche :

Artefact le plus puissant : 90
# Exercice 9 – Le doublement de puissance

**Contexte narratif :**  
Tu veux amplifier temporairement les runes de puissance en **doublant leur effet** sans altérer l’original. Affiche les puissances doublées.

**Énoncé :**  
Crée une classe Java nommée `DoublePuissance`.
1. Déclare un tableau `int[] runes = {5, 10, 15, 20}`.
2. Affiche pour chaque élément sa version multipliée par 2, sur une ligne chacun.
3. Exemple attendu :

10
20
30
40
# Exercice 10 – La fusion des clans

**Contexte narratif :**  
Deux anciens clans te donnent chacun une série d’artefacts. Tu dois créer une nouvelle série **fusionnée** qui contiendra **tous** les éléments des deux.

**Énoncé :**  
Crée une classe Java nommée `FusionClans`.
1. Déclare deux tableaux :
    - `String[] clanA = {"Lame", "Écu", "Cape"}`
    - `String[] clanB = {"Bague", "Anneau", "Talisman"}`
2. Crée un troisième tableau `String[] fusion` contenant les éléments de `clanA` suivis de ceux de `clanB`.
3. Affiche chaque élément de `fusion` sur une ligne.
4. Exemple attendu :

Lame
Écu
Cape
Bague
Anneau
Talisman
