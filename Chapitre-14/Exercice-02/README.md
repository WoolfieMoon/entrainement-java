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

