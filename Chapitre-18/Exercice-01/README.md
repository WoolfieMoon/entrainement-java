# Exercice 1 – La Relique de base

**Contexte narratif :**  
Tu as découvert une relique magique oubliée. Tous les artefacts enchantés partagent des propriétés communes : un nom et une puissance brute. Tu vas créer une **classe de base abstraite** qui servira de modèle à toutes les reliques.

---

## Objectif

Créer une classe abstraite représentant une **Relique** dotée de propriétés de base.  
Cette classe servira à construire d'autres types de reliques dans les prochains exercices.

---

## Consignes

- Crée une classe abstraite `Relique`
- Elle doit posséder :
  - Un nom
  - Une puissance
- Elle doit obliger ses sous-classes à définir une méthode spéciale d’activation nommée `activer()`
- Crée au moins une sous-classe concrète (`Amulette`, `Talisman`…) qui hérite de `Relique`
- Instancie-la et affiche ses propriétés ainsi que le résultat de son activation

