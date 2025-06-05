# Exercice 10 – Le Grimoire compressé

**Contexte narratif :**  
Les archives deviennent trop lourdes. Le maître archiviste t’apprend à **compresser les données** avant de les sauvegarder, grâce à la magie des flux enchaînés.

---

## Objectif

Utiliser les **streams de compression** avec la sérialisation.

---

## Consignes

- Sérialise un objet Java en utilisant un `GZIPOutputStream`
- Sauvegarde-le dans un fichier `.gz`
- Désérialise ensuite l’objet depuis ce fichier
- Vérifie que les données ont bien été compressées et restaurées

