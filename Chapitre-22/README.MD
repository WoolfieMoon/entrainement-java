## Chapitre 22 – Les Reliquaires des Dimensions : manipulation de fichiers texte et binaires en Java

Dans les salles oubliées du temple de Verdanthys, les reliquaires dimensionnels contiennent des fragments de texte, de formules ou d’artefacts sous forme brute. À l’aide des flux mystiques (FileReader, BufferedWriter, FileInputStream, etc.), les archivistes manipulent les fichiers texte et binaires, les modifient, les lisent, les copient… Ton tour est venu d’ouvrir ces coffres.

**Objectifs pédagogiques**

Tu vas apprendre à :

    Lire et écrire dans des fichiers texte

    Lire et écrire dans des fichiers binaires

    Utiliser FileReader, BufferedReader, FileWriter, BufferedWriter

    Utiliser FileInputStream et FileOutputStream

    Manipuler les chemins, créer ou vérifier des fichiers

    Traiter proprement les flux avec try-with-resources
# Exercice 1 – Le Parchemin d’écriture

**Contexte narratif :**  
Tu dois inscrire une formule magique sur un **parchemin de texte brut**. Ce texte pourra ensuite être lu par d'autres mages.

---

## Objectif

Écrire une chaîne de texte dans un fichier `.txt`.

---

## Consignes

- Crée un fichier `formule.txt`
- Écris plusieurs lignes dans ce fichier (au moins 3)
- Utilise un `FileWriter` et/ou `BufferedWriter`
- Ferme proprement le flux ou utilise `try-with-resources`
- Vérifie que le fichier a bien été créé et complété

# Exercice 2 – La Lecture du Codex

**Contexte narratif :**  
Tu ouvres un ancien **codex** pour lire les secrets qu’il contient. Mais le texte est ancien, et tu dois le lire ligne par ligne.

---

## Objectif

Lire un fichier texte ligne par ligne et afficher le contenu.

---

## Consignes

- Lis le fichier `formule.txt` de l’exercice précédent
- Utilise un `BufferedReader`
- Affiche chaque ligne dans la console
- Compte et affiche le nombre total de lignes lues

# Exercice 3 – Le Double de l’Artefact

**Contexte narratif :**  
Tu dois copier un **artefact de connaissance** dans un autre reliquaire. Ce double pourra être transmis à d'autres mages.

---

## Objectif

Copier le contenu d’un fichier texte dans un autre.

---

## Consignes

- Lis un fichier texte source (`formule.txt`)
- Crée un fichier destination (`copie_formule.txt`)
- Copie chaque ligne du premier fichier vers le second
- Vérifie que les deux fichiers contiennent exactement le même texte

# Exercice 4 – Les Fragments binaires

**Contexte narratif :**  
Un objet magique a été scellé sous forme **binaire**. Pour le dupliquer, il te faut manipuler les flux de **données brutes**.

---

## Objectif

Lire un fichier binaire et en faire une copie exacte.

---

## Consignes

- Prends un fichier binaire existant (ex. image `.jpg`, `.png`, ou `.dat`)
- Lis-le avec un `FileInputStream`
- Écris-le dans un nouveau fichier avec `FileOutputStream`
- Vérifie que la copie est identique à l’original

# Exercice 5 – Le Compteur de glyphes

**Contexte narratif :**  
Tu trouves un parchemin très ancien. Tu veux **compter combien de caractères mystiques** y sont gravés.

---

## Objectif

Lire un fichier caractère par caractère et compter tous les symboles.

---

## Consignes

- Lis un fichier texte lettre par lettre (caractère par caractère)
- Compte :
    - Le nombre total de caractères
    - Le nombre de lettres (exclure les espaces ou sauts de ligne)
- Affiche les résultats de façon lisible

# Exercice 6 – Le Grimoire de fusion

**Contexte narratif :**  
Deux fragments de grimoire ont été retrouvés. Tu dois les **fusionner dans un même parchemin**, dans l’ordre choisi par l’archiviste.

---

## Objectif

Fusionner le contenu de deux fichiers texte dans un seul fichier.

---

## Consignes

- Crée deux fichiers texte contenant chacun quelques lignes (`fragment1.txt`, `fragment2.txt`)
- Lis les deux fichiers
- Crée un troisième fichier (`fusion.txt`) contenant :
    - Le contenu de `fragment1.txt`
    - Puis celui de `fragment2.txt`
- Chaque ligne doit rester dans l’ordre et lisible

# Exercice 7 – L’Encre interdite

**Contexte narratif :**  
Certains mots dans un texte sont **interdits**. Tu dois créer un **filtre magique** qui censure les passages sensibles du parchemin.

---

## Objectif

Lire un fichier et réécrire son contenu en censurant des mots clés.

---

## Consignes

- Crée un fichier texte avec un paragraphe contenant plusieurs mots
- Lis ce fichier ligne par ligne
- Remplace certains mots définis dans une liste (ex. "feu", "sang") par "****"
- Écris le résultat filtré dans un nouveau fichier (`censuré.txt`)

# Exercice 8 – Le Journal du mage

**Contexte narratif :**  
Le mage veut écrire un **journal quotidien**, chaque jour ajoutant une ligne sans effacer les anciennes. C’est un fichier qui **s’enrichit avec le temps**.

---

## Objectif

Ajouter du texte à la fin d’un fichier sans effacer son contenu.

---

## Consignes

- Ouvre un fichier `journal.txt` en mode ajout (`append`)
- Ajoute une ligne contenant la date du jour et un texte court
- Relance ton programme plusieurs fois pour enrichir le fichier
- Vérifie que les anciennes lignes sont conservées

# Exercice 9 – L’Extraction des glyphes

**Contexte narratif :**  
Un texte contient de nombreuses informations, mais tu veux **extraire uniquement certaines lignes** ou caractères spéciaux.

---

## Objectif

Filtrer le contenu d’un fichier pour n’en conserver qu’une partie.

---

## Consignes

- Lis un fichier texte ligne par ligne
- Ne conserve que les lignes contenant un mot-clé (ex. "portail")
- Écris ces lignes filtrées dans un nouveau fichier
- Bonus : extrais aussi tous les chiffres présents dans ces lignes

# Exercice 10 – Le Scanner de Reliques

**Contexte narratif :**  
Tu veux explorer un dossier d’archives pour lister tous les **fichiers magiques** (par exemple `.txt` ou `.dat`) qu’il contient.

---

## Objectif

Scanner un répertoire local pour lister des fichiers selon des critères.

---

## Consignes

- Crée un dossier contenant plusieurs fichiers de différents types
- Parcours ce dossier avec la classe `File`
- Liste tous les fichiers `.txt` uniquement
- Affiche :
    - Leur nom
    - Leur taille en octets
    - Leur date de dernière modification

