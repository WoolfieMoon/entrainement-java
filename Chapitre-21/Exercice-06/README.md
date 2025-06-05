# Exercice 6 – Le Grand Dictionnaire Runique

**Contexte narratif :**  
Une bibliothèque cachée contient une **carte des runes** (clé-valeur) permettant de retrouver n’importe quel sortilège. Tu vas devoir sauvegarder et restaurer cette **structure magique**.

---

## Objectif

Sérialiser et désérialiser une **HashMap** contenant des objets personnalisés.

---

## Consignes

- Crée une `HashMap<String, Sortilege>` :
  - La clé est le nom du sort
  - La valeur est l’objet `Sortilege`
- Sérialise-la dans un fichier `runes.dat`
- Désérialise-la dans un autre programme
- Affiche toutes les clés et les propriétés des sortilèges associés

