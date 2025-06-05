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

