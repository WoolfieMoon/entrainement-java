# Mini-projet – L’Inventaire Enchanté

**Contexte narratif :**  
Tu viens de franchir les Portes d’Ébene et accèdes au **Sanctuaire des Objets Oubliés**. Là, tu trouves une ancienne interface magique qui te permet de gérer un **inventaire d’objets enchantés**. Tu dois coder ce système rudimentaire d’inventaire pour poursuivre ton périple.

---

## Objectif

Créer une application console simple qui :
- Stocke des objets dans un tableau de type `String`
- Affiche les objets un par un
- Permet de remplacer un objet par un autre
- Affiche à nouveau l’inventaire mis à jour

---

## Énoncé

Crée une classe Java nommée `InventaireEnchante` avec la méthode `main`.

### Étape 1 – Déclaration de l’inventaire
1. Crée un tableau `String[] inventaire` contenant 5 objets :

{"Bâton", "Potion", "Anneau", "Cape", "Rune"}


### Étape 2 – Affichage initial
2. Affiche tous les objets du tableau, un par un, sous cette forme :

Objet 1 : Bâton
Objet 2 : Potion
Objet 3 : Anneau
...


### Étape 3 – Modification
3. Change l’objet en **position 3** (l’indice 2) pour `"Amulette"`.

### Étape 4 – Affichage final
4. Affiche de nouveau l’inventaire modifié, sous la même forme qu’à l’étape 2.

---

## Résultat attendu

Objet 1 : Bâton
Objet 2 : Potion
Objet 3 : Anneau
Objet 4 : Cape
Objet 5 : Rune

--- Mise à jour de l’inventaire ---

Objet 1 : Bâton
Objet 2 : Potion
Objet 3 : Amulette
Objet 4 : Cape
Objet 5 : Rune

---

**Objectif pédagogique :**  
Ce projet t'apprend à manipuler un tableau de chaînes, à accéder à des indices précis, à modifier une valeur et à afficher un état lisible du tableau.  

