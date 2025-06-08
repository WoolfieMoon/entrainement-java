## Chapitre 8 – Les Reliquaires Sacrés : collections, listes et ensembles

Dans les Archives d’Argent, les mages stockent et manipulent des collections d’objets magiques. Ces reliquaires enchantés permettent d’ajouter, de trier, de retirer, ou de rechercher rapidement dans des Listes, des Ensembles, et d’autres structures plus intelligentes qu’un simple tableau.

Tu vas apprendre à utiliser les collections Java de base (ArrayList, HashSet) et à mieux gérer des groupes d’objets dynamiques.
# Exercice 1 – La liste des invocations

**Contexte narratif :**  
Tu dois tenir à jour une liste magique des invocations récentes. Elle doit pouvoir s’agrandir, afficher son contenu et être consultée par le Conseil.

**Énoncé :**
1. Crée une classe `ListeInvocations`.
2. Dans `main`, crée une `ArrayList<String>` nommée `invocations`.
3. Ajoute les éléments suivants à la liste : `"Spectre"`, `"Golem"`, `"Sylphide"`.
4. Affiche tous les éléments avec une boucle `for`.
5. Résultat attendu :

Invocation : Spectre
Invocation : Golem
Invocation : Sylphide
# Exercice 2 – La liste évolutive

**Contexte narratif :**  
Certaines invocations sont annulées, d’autres ajoutées en urgence. La liste doit pouvoir être modifiée en direct.

**Énoncé :**
1. Reprends la classe `ListeInvocations`.
2. Ajoute à la fin `"Chimère"` et `"Dragon"`.
3. Supprime `"Golem"` de la liste.
4. Affiche tous les éléments restants.
5. Résultat attendu :

Spectre
Sylphide
Chimère
Dragon
# Exercice 3 – L’ensemble des runes uniques

**Contexte narratif :**  
Les runes collectées par les élèves ne doivent pas être en double. Tu vas utiliser une **structure sans doublon**.

**Énoncé :**
1. Crée une classe `EnsembleRunes`.
2. Dans `main`, crée un `HashSet<String>` nommé `runes`.
3. Ajoute les éléments : `"Feu"`, `"Eau"`, `"Terre"`, `"Feu"`, `"Air"`.
4. Affiche les éléments du set.
5. Résultat attendu (ordre quelconque, sans doublons) :

Feu
Eau
Terre
Air
# Exercice 4 – Le compteur magique

**Contexte narratif :**  
Chaque fois qu’une rune est utilisée, elle est enregistrée. Tu dois pouvoir compter le **nombre total d’invocations**.

**Énoncé :**
1. Crée une classe `CompteurRunes`.
2. Dans `main`, crée une `ArrayList<String>` nommée `historique`.
3. Ajoute 7 fois des noms de runes : `"Feu"`, `"Eau"`, `"Eau"`, `"Terre"`, `"Feu"`, `"Feu"`, `"Air"`.
4. Affiche le nombre d’éléments dans la liste :

Nombre total de runes utilisées : 7

# Exercice 5 – La recherche dans le grimoire

**Contexte narratif :**  
Le grimoire magique permet de rechercher si une rune a déjà été utilisée. Tu dois écrire une fonction de **vérification**.

**Énoncé :**
1. Crée une classe `RechercheRune`.
2. Dans `main`, crée une `ArrayList<String>` avec les runes suivantes :  
   `"Feu"`, `"Eau"`, `"Terre"`, `"Air"`
3. Crée une méthode `chercherRune(List<String> liste, String cible)` qui retourne `true` si la rune est présente.
4. Teste la méthode avec `"Feu"` (doit retourner `true`) et `"Lumière"` (doit retourner `false`).
5. Affiche les résultats :

Rune trouvée : true
Rune trouvée : false
# Exercice 6 – La fusion des grimoires

**Contexte narratif :**  
Deux anciens grimoires magiques doivent être réunis. Tu dois fusionner leur contenu dans un seul tome sans perdre d’informations.

**Énoncé :**
1. Crée une classe `FusionGrimoires`.
2. Dans `main`, crée deux `ArrayList<String>` :
    - `grimoire1` : `"Feu"`, `"Eau"`
    - `grimoire2` : `"Terre"`, `"Air"`
3. Fusionne les deux listes dans une nouvelle liste `grimoireFusionne`.
4. Affiche tous les éléments de `grimoireFusionne`.
5. Résultat attendu :

Feu
Eau
Terre
Air
# Exercice 7 – Le filtre des runes interdites

**Contexte narratif :**  
Le Conseil interdit certaines runes. Tu dois retirer les éléments interdits de la liste.

**Énoncé :**
1. Crée une classe `FiltreRunes`.
2. Dans `main`, crée une `ArrayList<String>` nommée `runes` contenant :  
   `"Feu"`, `"Ténèbres"`, `"Eau"`, `"Chaos"`, `"Air"`
3. Supprime `"Ténèbres"` et `"Chaos"` de la liste.
4. Affiche les runes restantes :

Feu
Eau
Air
# Exercice 8 – La rune la plus utilisée

**Contexte narratif :**  
Parmi toutes les utilisations de runes, tu dois trouver celle qui a été invoquée **le plus souvent**.

**Énoncé :**
1. Crée une classe `RuneMax`.
2. Dans `main`, crée une `ArrayList<String>` nommée `historique` avec les valeurs :  
   `"Feu"`, `"Eau"`, `"Feu"`, `"Terre"`, `"Feu"`, `"Eau"`
3. Calcule combien de fois chaque rune apparaît.
4. Affiche la rune la plus utilisée et son nombre d’apparitions :

Rune la plus utilisée : Feu (3 fois)
# Exercice 9 – L’ordre des invocations

**Contexte narratif :**  
Les invocations doivent suivre un ordre strict. Tu dois afficher la liste dans l’ordre alphabétique.

**Énoncé :**
1. Crée une classe `TriInvocations`.
2. Dans `main`, crée une `ArrayList<String>` nommée `invocations` contenant :  
   `"Chimère"`, `"Spectre"`, `"Golem"`, `"Ange"`
3. Trie la liste avec `Collections.sort(...)`.
4. Affiche chaque élément trié.
5. Résultat attendu :

Ange
Chimère
Golem
Spectre
# Exercice 10 – L’ensemble des pactes uniques

**Contexte narratif :**  
Les pactes signés par les mages doivent être **uniques**, mais certains doublons se sont glissés. Tu dois épurer l’ensemble.

**Énoncé :**
1. Crée une classe `PactesUniques`.
2. Dans `main`, crée une `List<String>` contenant :  
   `"Lumière"`, `"Ténèbres"`, `"Feu"`, `"Feu"`, `"Lumière"`
3. Transforme la liste en un `Set<String>` pour éliminer les doublons.
4. Affiche chaque pacte unique.
5. Résultat attendu :

Lumière
Ténèbres
Feu

*(ordre non garanti, car c’est un Set)*

