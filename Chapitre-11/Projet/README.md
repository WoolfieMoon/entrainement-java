# Mini-projet – Le Tombeau des Erreurs

**Contexte narratif :**  
Dans le légendaire **Tombeau des Erreurs**, reposent les traces des sorts interdits, des invocations ratées et des anomalies du passé. Tu es envoyé par le Conseil pour y concevoir un **grimoire sécurisé** capable d’encaisser toutes les fautes possibles sans exploser.

---

## Objectif

Créer une application robuste qui :
- Lit un fichier d’invocations
- Tente de les traiter une par une
- Gère les erreurs possibles (fichier absent, ligne vide, sort interdit, division par zéro...)
- Journalise les erreurs rencontrées dans un second fichier

---

## Énoncé

1. Crée une classe `TombeauErreurs`.

2. Dans un fichier `invocations.txt`, chaque ligne représente un sort à lancer :

Feu:10
Eau:0
:30
Interdit:50
Air:20


3. Crée une méthode `traiterInvocation(String ligne)` qui :
- Découpe la ligne par `:`  
- Si le nom ou la puissance est manquant, lève une `IllegalArgumentException`  
- Si le nom est `"Interdit"`, lève une `SecurityException`  
- Si la puissance est `0`, provoque une division par zéro  
- Sinon, affiche :  
  ```
  Sort lancé : <nom> (puissance <valeur>)
  ```

4. Dans `main` :
- Lis le fichier ligne par ligne  
- Pour chaque ligne, entoure l’appel à `traiterInvocation(...)` d’un `try-catch`  
- En cas d’erreur, écris le message d’erreur dans `erreurs.log`

---

## Résultat attendu

Sort lancé : Feu (puissance 10)
Erreur détectée : division par zéro pour Eau
Erreur détectée : ligne mal formée
Erreur détectée : sort interdit
Sort lancé : Air (puissance 20)


Et dans `erreurs.log` :

Invocation invalide (Eau:0) : / by zero
Invocation invalide (:30) : Valeur ou nom manquant
Invocation invalide (Interdit:50) : Sort interdit détecté


---

**Objectif pédagogique :**
- Utilisation avancée de `try-catch` avec plusieurs types d’exceptions  
- Lecture et traitement ligne par ligne de fichiers  
- Gestion propre des erreurs dans un fichier séparé  
- Sécurisation complète d’une logique métier face à l’imprévu


