## Chapitre 21 – Les Archives Cryptées : introduction à la sérialisation et à la sauvegarde de données en Java

Dans les cryptes profondes de la Citadelle-Mémoire, les arcanistes préservent les savoirs dans des archives cryptées. Grâce à la sérialisation, tu vas apprendre à sauvegarder des objets Java dans des fichiers, les restaurer plus tard, et manipuler des données persistantes comme un maître du savoir.

**Objectifs pédagogiques**

Tu vas apprendre à :

    - Sérialiser et désérialiser des objets Java avec ObjectOutputStream et ObjectInputStream

    - Sauvegarder des données dans des fichiers .dat

    - Gérer les erreurs de lecture/écriture

    - Appliquer le mot-clé transient sur les données sensibles ou inutiles
# Exercice 1 – La Clé du Savoir figé

**Contexte narratif :**  
Un vieux grimoire contient un artefact : la **clé de sérialisation**. Elle permet d’**enfermer un objet** dans un cristal temporel (fichier) pour le réutiliser plus tard.

---

## Objectif

Découvrir la sérialisation en Java en sauvegardant un **objet simple dans un fichier**.

---

## Consignes

- Crée une classe `Sortilege` avec un nom et une puissance
- Rends-la sérialisable (implémente l’interface `Serializable`)
- Instancie un objet `Sortilege`
- Sérialise cet objet dans un fichier nommé `sortilege.dat`
- Vérifie que le fichier est bien créé

# Exercice 2 – L’Éveil des Archives

**Contexte narratif :**  
Tu retrouves un **fichier ancien**, et tu veux ramener à la vie l’objet magique qu’il contient.

---

## Objectif

Lire un fichier contenant un objet sérialisé et **le restaurer** dans ton programme.

---

## Consignes

- Reprends l’objet `Sortilege` sauvegardé dans l’exercice précédent
- Désérialise l’objet depuis le fichier
- Affiche ses attributs pour prouver qu’il a été bien restauré
- Gère les exceptions de lecture ou d’objet non trouvé

# Exercice 3 – La Bibliothèque figée

**Contexte narratif :**  
Tu dois stocker une **collection entière** de sortilèges dans une bibliothèque scellée. Elle doit pouvoir être exportée d’un seul geste, et restaurée plus tard en bloc.

---

## Objectif

Sérialiser une **liste d’objets** et la sauvegarder.

---

## Consignes

- Crée plusieurs objets `Sortilege` et ajoute-les à une `ArrayList`
- Sérialise cette liste dans un fichier `bibliotheque.dat`
- Crée un autre programme (ou redémarre le tien) et restaure la liste
- Affiche tous les sortilèges chargés depuis le fichier

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

# Exercice 7 – Les Reliques Corrompues

**Contexte narratif :**  
Une relique ancienne n’a pas été sauvegardée correctement. Tu dois **gérer l’échec de lecture** sans faire planter ton programme.

---

## Objectif

Traiter proprement les erreurs lors de la lecture de fichiers corrompus.

---

## Consignes

- Essaie de désérialiser un fichier vide ou inexistant
- Utilise un bloc `try-catch` pour gérer :
    - `FileNotFoundException`
    - `IOException`
    - `ClassNotFoundException`
- Affiche un message personnalisé pour chaque cas
- Garde ton programme fonctionnel même en cas d’erreur

# Exercice 8 – La Réincarnation des Objets

**Contexte narratif :**  
Chaque objet peut être **sauvé et restauré** autant de fois que nécessaire. Tu veux créer une **interface commune** pour tous les objets sauvegardables.

---

## Objectif

Factoriser la sérialisation à l’aide d’une **interface** ou d’une **classe générique**.

---

## Consignes

- Crée une interface `Sauvegardable`
- Ajoute une méthode `sauvegarder(String chemin)` à implémenter
- Crée une classe `GestionnaireDeSauvegarde` avec une méthode statique :
    - `static void sauvegarder(Sauvegardable obj, String chemin)`
- Utilise ce système avec au moins deux classes différentes

# Exercice 9 – L’Archive multiple

**Contexte narratif :**  
Tu dois sauvegarder **plusieurs objets** différents (de classes différentes) dans le **même fichier**, puis les restaurer tous dans l’ordre.

---

## Objectif

Sérialiser plusieurs objets successivement dans un seul fichier, puis les relire.

---

## Consignes

- Crée au moins deux objets de types différents (ex. `Sortilege`, `Artefact`)
- Sérialise-les tous dans un seul fichier `multi.dat`
- Désérialise-les **dans l’ordre exact** dans un autre programme
- Affiche leurs propriétés pour vérifier que tout est intact

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

