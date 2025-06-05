# Mini-projet – L’Ordre des Pactes Éternels

**Contexte narratif :**  
Tu es convoqué par le Haut Conseil d’Aleboréa pour constituer l’Ordre des Pactes Éternels : une organisation regroupant toutes les entités qui ont signé un ou plusieurs pactes runiques. Tu devras gérer **des entités différentes**, aux rôles multiples, grâce à **l’utilisation d’interfaces** et **de classes abstraites**.

---

## Objectif

- Créer une **hiérarchie polymorphe** d’entités magiques
- Gérer différents comportements selon les **pactes** signés
- Identifier dynamiquement ce que chaque entité sait faire

---

## Énoncé

1. Crée les **interfaces** suivantes :
   - `Combattant` avec : `void attaquer();`  
   - `Soigneur` avec : `void soigner();`  

2. Crée une **classe abstraite** `EntiteMagique` avec :
   - Attributs : `String nom`, `int puissance`
   - Constructeur pour les initialiser
   - Méthode : `void afficherInfos()` qui affiche :
     ```
     Nom : <nom>
     Puissance : <puissance>
     ```

3. Crée les **classes concrètes** :
   - `Pretre` (hérite de `EntiteMagique`, implémente `Soigneur`)  
   - `Guerrier` (hérite de `EntiteMagique`, implémente `Combattant`)  
   - `Paladin` (hérite de `EntiteMagique`, implémente `Combattant` et `Soigneur`)  

4. Implémente dans chaque classe les méthodes nécessaires (`attaquer()`, `soigner()`).

5. Dans la classe `Main` :
   - Crée un tableau `EntiteMagique[]` contenant un `Pretre`, un `Guerrier`, un `Paladin`  
   - Pour chaque entité :
     - Appelle `afficherInfos()`
     - Si l’entité est `Combattant`, appelle `attaquer()`
     - Si elle est `Soigneur`, appelle `soigner()`

---

## Exemple attendu :

Nom : Elyndra
Puissance : 60
Elyndra soigne ses alliés...

Nom : Ragnar
Puissance : 85
Ragnar attaque avec sa hache runique !

Nom : Solenor
Puissance : 95
Solenor attaque avec sa lame sacrée !
Solenor invoque une lumière curative !

---

**Objectif pédagogique :**  
Tu combines ici tous les concepts du chapitre :  
- Création d'interfaces et de classes abstraites  
- Implémentation multiple  
- Parcours polymorphe  
- Détection dynamique de comportement (`instanceof`)  

