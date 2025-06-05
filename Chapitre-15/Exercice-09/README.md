# Exercice 9 – Multiclient (version simple, séquentielle)

**Contexte narratif :**  
Un cristal gère une **file** de mages voulant s’exprimer les uns après les autres.

**Énoncé :**  
1. Le serveur doit accepter plusieurs connexions **séquentielles**.  
2. À chaque connexion :
   - Il lit un message  
   - Répond `"Sort reçu avec succès."`  
3. Il reste toujours actif.

**Remarque :**  
Chaque client devra se connecter après que le précédent ait terminé.

