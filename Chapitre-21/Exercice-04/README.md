# Exercice 4 – L’Encre invisible

**Contexte narratif :**  
Certains secrets ne doivent jamais être révélés. Une propriété d’objet peut être marquée d’**encre invisible** pour ne pas être sauvegardée.

---

## Objectif

Utiliser le mot-clé `transient` pour **empêcher la sérialisation** d’un champ.

---

## Consignes

- Ajoute un champ `motDePasse` à la classe `Sortilege`
- Marque ce champ comme `transient`
- Sérialise un sort avec un mot de passe
- Désérialise-le ensuite et vérifie que le mot de passe est `null`
- Explique pourquoi le champ n’a pas été conservé

