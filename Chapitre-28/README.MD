# Chapitre 28 – Les Fils d’Argent : Java et les bases de données avec JDBC

Sous les fondations du monde magique s’étendent des filaments d’argent : des lignes de données anciennes, conservées dans les Pierres-Mémoires. Tu vas apprendre à connecter Java à une base de données, lire, modifier, et manipuler ces données en temps réel.

**Objectifs pédagogiques**

Tu vas apprendre à :

    - Configurer une connexion à une base de données relationnelle

    - Utiliser JDBC pour exécuter des requêtes SQL depuis Java

    - Lire, insérer, modifier et supprimer des données avec PreparedStatement

    - Gérer les transactions et les erreurs de connexion

    - Modéliser des objets à partir de données (ResultSet)

    - Créer une application simple en Java avec persistance
    
# Exercice 1 – L’Ancrage des Pierres-Mémoires

**Contexte narratif :**  
Les anciennes Pierres-Mémoires ne peuvent être consultées qu’en établissant un **lien magique stable**. Tu dois ouvrir ce **canal d’accès aux données**.

---

## Objectif

Établir une **connexion JDBC** à une base de données SQLite (ou autre).

---

## Consignes

- Configure une base de données SQLite (ou H2, MySQL…)
- Crée une classe Java qui établit une connexion JDBC
- Affiche un message en cas de succès ou d’échec
- N’oublie pas de gérer proprement la fermeture de la connexion

# Exercice 2 – Les Premiers Fragments

**Contexte narratif :**  
Tu as trouvé un fragment de mémoire contenant des **noms d’artefacts**. Tu dois le lire avec précaution pour ne pas corrompre les lignes sacrées.

---

## Objectif

Lire et afficher les données d’une table avec JDBC.

---

## Consignes

- Crée une table (ex. `artefacts`) avec quelques données (via SQL)
- Utilise JDBC pour exécuter une requête `SELECT *`
- Parcours le `ResultSet` et affiche chaque ligne
- Gère correctement la connexion et les exceptions

# Exercice 3 – L’Offrande des Noms

**Contexte narratif :**  
Les mages ont demandé à consigner **un nouvel artefact** dans les archives. Tu dois insérer proprement ces données, sans faute rituelle.

---

## Objectif

Ajouter une **ligne de données** dans une table avec `PreparedStatement`.

---

## Consignes

- Demande à l’utilisateur les informations d’un nouvel artefact (nom, type…)
- Utilise `PreparedStatement` pour insérer les données dans la base
- Affiche un message de confirmation après l’ajout
- Vérifie que l’artefact est bien ajouté en consultant la table

# Exercice 4 – L’Erratum de Verra

**Contexte narratif :**  
Un scribe a mal recopié une ligne de mémoire. Tu dois **corriger l’erreur** et mettre à jour l’enregistrement dans la Pierre-Mémoire.

---

## Objectif

Modifier une entrée existante dans la base avec JDBC.

---

## Consignes

- Demande un identifiant ou un nom pour identifier la ligne à modifier
- Propose de changer un ou plusieurs champs
- Utilise `UPDATE` avec `PreparedStatement`
- Affiche un message si la ligne n’existe pas

# Exercice 5 – L’Oubli Volontaire

**Contexte narratif :**  
Parfois, certaines mémoires doivent être **effacées** pour éviter qu’elles ne tombent entre de mauvaises mains…

---

## Objectif

Supprimer une entrée de la base avec JDBC.

---

## Consignes

- Demande un critère (nom, ID…) pour identifier la ligne
- Utilise une requête `DELETE` sécurisée via `PreparedStatement`
- Affiche un message de confirmation ou d’erreur
- Vérifie que la suppression est effective

# Exercice 6 – La Galerie des Reliques

**Contexte narratif :**  
Les Maîtres-Arpenteurs souhaitent visualiser une **galerie complète** des artefacts triés par rareté. Tu dois leur fournir une **vue ordonnée**.

---

## Objectif

Exécuter une requête SQL avec **tri (ORDER BY)** et l’afficher.

---

## Consignes

- Exécute une requête `SELECT` avec `ORDER BY` sur un champ pertinent (ex. rareté, puissance…)
- Affiche le résultat sous forme de tableau lisible
- Permets à l’utilisateur de choisir le critère de tri

# Exercice 7 – Le Filtre élémentaire

**Contexte narratif :**  
Les Gardiens des Éléments veulent consulter **uniquement les artefacts liés à leur affinité**. Tu dois appliquer un **filtre magique**.

---

## Objectif

Utiliser une clause **`WHERE`** avec `PreparedStatement`.

---

## Consignes

- Demande à l’utilisateur un filtre (ex. élément = "Feu")
- Utilise une requête `SELECT` avec clause `WHERE`
- Affiche uniquement les résultats correspondant au filtre
- Gère les cas où aucun résultat n’est trouvé

# Exercice 8 – L’Énigme du Compteur

**Contexte narratif :**  
Combien d’artefacts possèdent l’attribut "légendaire" ? Tu dois **répondre précisément**, sans parcourir tout manuellement.

---

## Objectif

Faire une requête **`COUNT(*)`** avec JDBC.

---

## Consignes

- Exécute une requête `SELECT COUNT(*) FROM artefacts WHERE rarete = 'légendaire'`
- Affiche uniquement le nombre d’entrées correspondantes
- Permets à l’utilisateur de modifier le critère (`rarete`, `élément`, etc.)

# Exercice 9 – La Transaction interdite

**Contexte narratif :**  
Un transfert de mémoire critique doit être **réalisé sans erreur**. Si un seul fragment échoue, tout doit être annulé. Tu dois utiliser une **transaction magique**.

---

## Objectif

Utiliser les **transactions JDBC** avec `commit()` et `rollback()`.

---

## Consignes

- Crée deux insertions liées (ex. 2 artefacts ou 1 artefact + 1 log)
- Utilise `setAutoCommit(false)` et `commit()` à la fin
- Simule une erreur entre les deux pour tester `rollback()`
- Vérifie que **rien n’est inséré** en cas d’échec

# Exercice 10 – Le Tisseur d’Objets

**Contexte narratif :**  
Tu veux manipuler les artefacts en Java comme des objets vivants. Il faut donc **les modéliser proprement**, à partir de leur enregistrement.

---

## Objectif

Créer une **classe Java** représentant un enregistrement de la base (`Artefact`), et l’utiliser pour **remplir une liste**.

---

## Consignes

- Crée une classe `Artefact` avec les bons attributs
- Utilise une requête `SELECT` pour lire tous les artefacts
- Instancie un objet `Artefact` par ligne, et stocke-les dans une `ArrayList`
- Affiche ensuite les objets avec une boucle

