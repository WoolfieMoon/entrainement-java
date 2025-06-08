## Chapitre 14 – Les Portails de Données : JDBC et base de données

Au fond du Temple des Archives Perdues, se trouvent des portails vers des mondes persistants. Ces portails, appelés bases de données, permettent aux mages de stocker et retrouver leurs connaissances à travers les âges. Grâce à la magie du JDBC, tu apprendras à les invoquer.

Dans ce chapitre, tu vas apprendre à :

    - Te connecter à une base de données SQLite avec JDBC

    - Créer des tables magiques (grimoire, élèves, artefacts…)

    - Insérer, lire, mettre à jour et supprimer des données

    - Gérer les exceptions liées à la persistance magique
# Exercice 1 – Ouverture du portail magique (connexion JDBC)

**Contexte narratif :**  
Tu as découvert un ancien **portail de savoir** : une base de données. Pour la première fois, tu vas établir un **lien mystique** avec elle.

**Énoncé :**
1. Crée une classe `ConnexionPortail`.
2. Connecte-toi à une base SQLite nommée `grimoire.db`.
3. Affiche dans la console :

✅ Portail magique ouvert !

4. N’oublie pas de fermer la connexion correctement à la fin.

**Remarques techniques :**
- Utilise le driver `org.sqlite.JDBC`
- Chaîne de connexion : `jdbc:sqlite:grimoire.db`

# Exercice 2 – Création de la table des sorts

**Contexte narratif :**  
Tu veux créer une **table de sortilèges** qui pourra enregistrer les incantations utilisées au fil du temps.

**Énoncé :**
1. Dans la base `grimoire.db`, crée une table `sorts` avec :
    - `id` (entier, clé primaire, auto-incrémenté)
    - `nom` (texte)
    - `puissance` (entier)
2. Affiche :

✅ Table 'sorts' créée avec succès.


**Conseils :**
- Utilise `Statement` et `executeUpdate(...)`
- Vérifie que la table n’est pas recréée si elle existe

# Exercice 3 – Insertion de sortilèges

**Contexte narratif :**  
Les mages ont retrouvé une liste de sorts qu’il faut **consigner dans le grimoire central**.

**Énoncé :**
1. Ajoute dans la table `sorts` :
    - `"Éclair"`, 80
    - `"Feu"`, 100
    - `"Invisibilité"`, 60
2. Utilise une `PreparedStatement` pour sécuriser les insertions.
3. Affiche :

✨ Sort "<nom>" inséré avec succès.
# Exercice 4 – Lecture des sorts stockés

**Contexte narratif :**  
Tu veux afficher la **liste complète** des sortilèges enregistrés dans la base.

**Énoncé :**
1. Utilise un `SELECT * FROM sorts`
2. Affiche chaque ligne ainsi :

[ID] Éclair (80)

3. N’oublie pas de fermer le `ResultSet` et la connexion.

# Exercice 5 – Suppression d’un sort interdit

**Contexte narratif :**  
Le Conseil a décidé d’effacer toute trace du sort `"Feu"` jugé trop dangereux.

**Énoncé :**
1. Supprime de la table `sorts` tous les sorts dont `nom = 'Feu'`.
2. Affiche :

❌ Sort 'Feu' supprimé du grimoire.

3. Vérifie le nombre de lignes supprimées et affiche un message adapté si aucun sort n’a été trouvé.

# Exercice 6 – Mise à jour d’un sortilège

**Contexte narratif :**  
Le sort `"Éclair"` a été **renforcé**. Il faut mettre à jour sa **puissance magique** dans le grimoire.

**Énoncé :**
1. Mets à jour le sort `"Éclair"` pour que sa puissance passe de 80 à 95.
2. Affiche :

🔄 Sort 'Éclair' mis à jour.

3. Vérifie le nombre de lignes affectées pour confirmer la modification.

# Exercice 7 – Tri des sortilèges par puissance

**Contexte narratif :**  
Les archivistes veulent connaître les sorts **les plus puissants** enregistrés à ce jour.

**Énoncé :**
1. Fais un `SELECT * FROM sorts ORDER BY puissance DESC`
2. Affiche les sorts du plus puissant au moins puissant :

Feu (100)
Éclair (95)
Invisibilité (60)
# Exercice 8 – Recherche magique par mot-clé

**Contexte narratif :**  
Un mage recherche tous les sorts contenant la **syllabe** `"vis"` (par exemple : `"Invisibilité"`).

**Énoncé :**
1. Utilise un `LIKE` pour faire une recherche :

SELECT * FROM sorts WHERE nom LIKE '%vis%'

2. Affiche les résultats sous la forme :

Sort trouvé : Invisibilité (60)
# Exercice 9 – Comptage des sorts enregistrés

**Contexte narratif :**  
Le Conseil veut connaître le **nombre total** de sortilèges consignés dans la base.

**Énoncé :**
1. Utilise :

SELECT COUNT(*) FROM sorts

2. Affiche :

📚 Nombre total de sorts : <valeur>
# Exercice 10 – Création automatique de la base

**Contexte narratif :**  
À l’ouverture du portail, la **base doit se créer si elle n’existe pas**, avec la table déjà prête à l’emploi.

**Énoncé :**
1. Crée une classe `PortailAuto`.
2. À l’exécution :
    - Crée `grimoire.db` si elle n’existe pas
    - Crée la table `sorts` si elle est absente
3. Affiche :

🌀 Grimoire initialisé avec succès.

4. Tu peux utiliser `IF NOT EXISTS` dans la requête SQL.

