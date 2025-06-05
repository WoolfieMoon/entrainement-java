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

