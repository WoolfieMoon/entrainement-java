# Exercice 8 – Recherche magique par mot-clé

**Contexte narratif :**  
Un mage recherche tous les sorts contenant la **syllabe** `"vis"` (par exemple : `"Invisibilité"`).

**Énoncé :**  
1. Utilise un `LIKE` pour faire une recherche :

SELECT * FROM sorts WHERE nom LIKE '%vis%'

2. Affiche les résultats sous la forme :

Sort trouvé : Invisibilité (60)
