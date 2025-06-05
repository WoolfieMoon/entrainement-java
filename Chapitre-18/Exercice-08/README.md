# Exercice 8 – L’épreuve des Interfaces multiples

**Contexte narratif :**  
Certaines reliques appartiennent à plusieurs ordres à la fois. Par exemple, une **relique défensive** peut aussi être **canalisable**. Il faut qu’elle puisse répondre à plusieurs normes à la fois.

---

## Objectif

Utiliser **plusieurs interfaces** dans une même classe.

---

## Consignes

- Crée une seconde interface `Defensif` avec une méthode `proteger()`
- Crée une classe de relique qui implémente **à la fois** `Canalisable` et `Defensif`
- Crée un programme test qui :
  - Parcourt une liste de reliques
  - Invoque `canaliser()` si possible
  - Invoque `proteger()` si applicable

