# Exercice 5 – Le Parchemin de sauvegarde automatique

**Contexte narratif :**  
Les maîtres scribes veulent que chaque **action magique** soit automatiquement **sauvegardée**, pour que rien ne soit oublié dans les archives.

---

## Objectif

Créer une fonction réutilisable qui sauvegarde un objet automatiquement.

---

## Consignes

- Crée une méthode `sauvegarder(Object obj, String cheminFichier)`
- Cette méthode doit :
  - Créer le fichier si nécessaire
  - Sérialiser l’objet donné
  - Gérer les erreurs silencieusement
- Utilise-la pour sauvegarder plusieurs objets dans différents fichiers

