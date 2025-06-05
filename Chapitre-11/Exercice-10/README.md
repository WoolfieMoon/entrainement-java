# Exercice 10 – L’épreuve du forgeron

**Contexte narratif :**  
Le forgeron royal lance un sort pour forger une arme, mais si la température est trop basse, il refuse de continuer.

**Énoncé :**  
1. Crée une classe `ForgeronRoyal`.  
2. Crée une méthode `forger(int temperature)` qui :  
   - Lance une `IllegalStateException` si température < 800  
   - Affiche `"Forge réussie à <temp> degrés"` sinon  
3. Dans `main`, teste avec `700` et `900`
4. Résultat attendu :

Erreur : température insuffisante pour forger.
Forge réussie à 900 degrés
