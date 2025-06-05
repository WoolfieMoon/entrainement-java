# Mini-projet – L’Index des Arcanes

**Contexte narratif :**  
Dans la Grande Bibliothèque d’Aleboréa, tu es chargé·e de tenir à jour **l’Index des Arcanes** : une base de données des **sorts magiques** lancés par les mages. Tu devras stocker, trier, rechercher et épurer les doublons parmi les invocations.

---

## Objectif

Créer un programme qui :
- Enregistre des sorts dans une collection
- Permet d’ajouter et de supprimer des sorts
- Trie les sorts
- Affiche uniquement les sorts uniques

---

## Énoncé

1. Crée une classe `IndexArcanes` contenant la méthode `main`.

2. Crée une `ArrayList<String>` nommée `sorts` avec les éléments suivants :  
   `"Flamme"`, `"Éclair"`, `"Flamme"`, `"Gel"`, `"Vent"`, `"Gel"`

3. Affiche tous les sorts enregistrés :

Sorts enregistrés :
Flamme
Éclair
Flamme
Gel
Vent
Gel


4. Trie la liste avec `Collections.sort(...)` et affiche-la.

5. Transforme la liste triée en un `Set<String>` pour éliminer les doublons, et affiche :

Sorts uniques (par ordre alphabétique) :
Éclair
Flamme
Gel
Vent

---

## Résultat attendu :

Sorts enregistrés :
Flamme
Éclair
Flamme
Gel
Vent
Gel

Sorts triés :
Éclair
Flamme
Flamme
Gel
Gel
Vent

Sorts uniques (par ordre alphabétique) :
Éclair
Flamme
Gel
Vent

---

**Objectif pédagogique :**
- Utiliser `ArrayList` et `HashSet`
- Trier une liste avec `Collections.sort`
- Éliminer les doublons avec un `Set`
- Afficher proprement des collections dynamiques

