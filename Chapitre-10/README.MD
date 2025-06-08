## Chapitre 10 – Les Parchemins Éternels : lecture et écriture de fichiers texte

Dans les Archives du Souffle, les mages immortalisent leurs sorts et découvertes dans des parchemins enchantés. Ces artefacts permettent d’enregistrer, de relire et de modifier des données textuelles stockées dans des grimoires physiques.

Tu vas apprendre à :

    - Lire et écrire dans des fichiers texte

    - Gérer les fichiers ligne par ligne

    - Travailler avec les chemins et exceptions
# Exercice 1 – Inscription sur parchemin

**Contexte narratif :**  
Tu reçois une plume magique capable de graver dans un parchemin. Tu vas écrire une simple phrase dans un fichier texte.

**Énoncé :**
1. Crée une classe `ParcheminEcriture`.
2. Dans `main`, utilise `FileWriter` pour écrire la ligne suivante dans un fichier nommé `parchemin.txt` :

Ceci est le début du savoir ancien.

3. Ferme correctement le fichier.
4. Vérifie que le fichier a bien été créé avec le texte attendu.

# Exercice 2 – Lecture d’un ancien manuscrit

**Contexte narratif :**  
Un parchemin ancien a été découvert. Tu dois pouvoir **lire son contenu** ligne par ligne.

**Énoncé :**
1. Crée une classe `ParcheminLecture`.
2. Dans `main`, utilise `BufferedReader` pour lire le fichier `parchemin.txt`.
3. Affiche chaque ligne lue à la console.

# Exercice 3 – Ajout d’une annotation magique

**Contexte narratif :**  
Les mages souhaitent ajouter une **annotation supplémentaire** au parchemin déjà existant sans effacer l’ancien contenu.

**Énoncé :**
1. Reprends le fichier `parchemin.txt`.
2. Utilise `FileWriter` avec l’option **append** pour ajouter cette ligne :

Ceci est une annotation du Conseil.

3. Affiche dans la console :

Annotation ajoutée.
# Exercice 4 – Création d’un parchemin de sortilèges

**Contexte narratif :**  
Tu dois générer un parchemin contenant **plusieurs sortilèges**, chacun inscrit sur une ligne distincte.

**Énoncé :**
1. Crée une classe `SortsParchemin`.
2. Utilise `FileWriter` pour écrire dans un fichier `sorts.txt` les lignes suivantes :
    - Flamme
    - Éclair
    - Gel
    - Soin
3. Ferme correctement le fichier et affiche un message de confirmation.

# Exercice 5 – Lecture sélective des sortilèges

**Contexte narratif :**  
Tu veux relire un parchemin magique, mais uniquement afficher les sortilèges **commençant par une lettre spécifique**.

**Énoncé :**
1. Crée une classe `FiltreSorts`.
2. Utilise `BufferedReader` pour lire `sorts.txt`.
3. Affiche uniquement les lignes commençant par la lettre `G`.
4. Exemple de sortie :

Gel
# Exercice 6 – Archivage d’un grimoire

**Contexte narratif :**  
Tu dois sauvegarder dans un fichier les **descriptions** de plusieurs artefacts magiques obtenus au cours de ta quête.

**Énoncé :**
1. Crée une classe `ArchivageArtefacts`.
2. Crée une `ArrayList<String>` contenant :
    - "Amulette du Souffle"
    - "Cape des Ombres"
    - "Orbe de Vérité"
3. Écris chaque artefact dans un fichier `artefacts.txt`, un par ligne.
4. Affiche `Artefacts archivés.` une fois terminé.

# Exercice 7 – Comptage de lignes magiques

**Contexte narratif :**  
Tu veux savoir **combien de lignes** contient un ancien grimoire. Chaque ligne représente une invocation ancienne.

**Énoncé :**
1. Crée une classe `CompteurLignes`.
2. Lis le fichier `parchemin.txt`.
3. Compte le nombre total de lignes.
4. Affiche :

Nombre de lignes : <valeur>
# Exercice 8 – Transformation d’un parchemin

**Contexte narratif :**  
Tu dois lire un vieux parchemin et créer un **nouveau fichier** avec toutes les lignes en majuscules, pour le transmettre aux mages aveugles.

**Énoncé :**
1. Crée une classe `ParcheminMajuscule`.
2. Lis `sorts.txt` ligne par ligne.
3. Écris dans `sorts_maj.txt` les lignes converties en majuscules.
4. Exemple :

FLAMME
ÉCLAIR
GEL
SOIN
# Exercice 9 – Suppression de lignes vides

**Contexte narratif :**  
Un scribe maladroit a laissé des lignes vides dans un parchemin. Tu dois en produire une version **nettoyée**.

**Énoncé :**
1. Crée une classe `NettoyageParchemin`.
2. Lis le fichier `parchemin.txt`.
3. Écris dans un nouveau fichier `parchemin_nettoye.txt` uniquement les lignes non vides (`!line.isBlank()`).
4. Affiche `Parchemin nettoyé avec succès.`

# Exercice 10 – Fusion de deux parchemins

**Contexte narratif :**  
Deux parchemins perdus ont été retrouvés. Tu dois les réunir dans un **fichier commun**, dans l’ordre de lecture.

**Énoncé :**
1. Crée une classe `FusionParchemins`.
2. Lis `sorts.txt` et `artefacts.txt`.
3. Écris dans un nouveau fichier `grimoire_complet.txt` :
    - D’abord les sorts
    - Puis les artefacts
4. Affiche `Grimoire complet généré.`

