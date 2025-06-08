## Chapitre 9 – Les Tomes des Clés : Maps et dictionnaires magiques

Dans les Tomes des Clés, chaque mot magique ouvre une signification unique. Ces grimoires relient une clé à une valeur – exactement comme les Maps en Java. Tu vas apprendre à créer des dictionnaires magiques, à lire et modifier leurs pages, et à retrouver une valeur à partir de son mot secret.

Tu travailleras avec les structures comme HashMap, qui te permettront d’associer des éléments (par exemple un nom de rune à son effet, un nom de mage à son niveau...).
# Exercice 1 – Le grimoire des sorts

**Contexte narratif :**  
Chaque sort possède une incantation unique. Tu vas créer un dictionnaire magique pour associer chaque **nom de sort** à son **effet**.

**Énoncé :**
1. Crée une classe `GrimoireSorts`.
2. Dans `main`, crée une `HashMap<String, String>` nommée `sorts`.
3. Ajoute les paires suivantes :
    - `"Flamme"` → `"Inflige des dégâts de feu"`
    - `"Éclair"` → `"Frappe avec la foudre"`
    - `"Gel"` → `"Ralentit l’ennemi"`
4. Affiche chaque sort avec sa description :

Flamme : Inflige des dégâts de feu
Éclair : Frappe avec la foudre
Gel : Ralentit l’ennemi
# Exercice 2 – La lecture d’un effet

**Contexte narratif :**  
Un élève veut savoir ce que fait le sort `"Éclair"`. Tu dois pouvoir accéder rapidement à la **valeur** d'une **clé**.

**Énoncé :**
1. Reprends la `HashMap` de l’exercice 1.
2. Affiche uniquement l’effet du sort `"Éclair"` :

Effet du sort Éclair : Frappe avec la foudre

3. Si la clé n’existe pas, affiche :

Sort inconnu.
# Exercice 3 – Mise à jour d’un tome

**Contexte narratif :**  
Un maître du feu met à jour le sort `"Flamme"` pour qu’il soit plus puissant. Tu dois modifier la **valeur associée à une clé**.

**Énoncé :**
1. Reprends la `HashMap` `sorts`.
2. Remplace la description du sort `"Flamme"` par : `"Inflige de lourds dégâts de feu"`.
3. Affiche à nouveau le dictionnaire complet.

# Exercice 4 – La suppression d’un sort oublié

**Contexte narratif :**  
Le sort `"Gel"` est interdit par le Conseil. Il doit être supprimé du grimoire.

**Énoncé :**
1. Supprime la clé `"Gel"` de la `HashMap`.
2. Affiche à nouveau les sorts restants.
3. Résultat attendu :

Flamme : Inflige de lourds dégâts de feu
Éclair : Frappe avec la foudre
# Exercice 5 – La liste des sorts disponibles

**Contexte narratif :**  
Tu dois afficher uniquement la **liste des incantations disponibles** dans le grimoire, sans leurs effets.

**Énoncé :**
1. Reprends la `HashMap<String, String>` `sorts`.
2. Parcours et affiche uniquement les **clés** :

Sorts disponibles :
Flamme
Éclair
# Exercice 6 – Le registre des mages

**Contexte narratif :**  
Le Conseil tient à jour un registre des **mages** et de leur **niveau magique**. Tu dois construire ce registre.

**Énoncé :**
1. Crée une classe `RegistreMages`.
2. Dans `main`, crée une `HashMap<String, Integer>` nommée `mages`.
3. Ajoute les paires :
    - `"Arken"` → `50`
    - `"Nyria"` → `65`
    - `"Voldar"` → `40`
4. Affiche chaque mage avec son niveau :

Arken : niveau 50
Nyria : niveau 65
Voldar : niveau 40
# Exercice 7 – La moyenne magique

**Contexte narratif :**  
Tu dois calculer la **moyenne des niveaux** de tous les mages inscrits dans le registre.

**Énoncé :**
1. Reprends la `HashMap<String, Integer>` `mages`.
2. Calcule la somme des niveaux.
3. Affiche la moyenne (arrondie à l’entier) :

Niveau moyen : 52
# Exercice 8 – Le mage disparu

**Contexte narratif :**  
Un mage du registre est tombé dans l’oubli. Tu dois le retirer du dictionnaire magique.

**Énoncé :**
1. Supprime `"Voldar"` de la `HashMap` `mages`.
2. Affiche à nouveau les noms et niveaux restants.

# Exercice 9 – Le chercheur de mage

**Contexte narratif :**  
Tu dois écrire une méthode pour rechercher un mage spécifique et obtenir son niveau, ou savoir s’il est introuvable.

**Énoncé :**
1. Crée une méthode `chercherMage(HashMap<String, Integer> mages, String nom)`
2. Elle affiche :
    - Si le nom est trouvé : `"Niveau de <nom> : <niveau>"`
    - Sinon : `"Aucun mage nommé <nom>."`
3. Dans `main`, teste avec `"Nyria"` et `"Krayn"`.

# Exercice 10 – L’archiviste des noms

**Contexte narratif :**  
L’archiviste veut une **liste alphabétique** de tous les noms de mages dans le registre.

**Énoncé :**
1. Reprends la `HashMap<String, Integer>` `mages`.
2. Récupère l’ensemble des clés avec `keySet()`.
3. Convertis-le en `List<String>` et trie la liste.
4. Affiche chaque nom dans l’ordre :

Arken
Nyria
