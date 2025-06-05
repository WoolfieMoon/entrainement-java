# Exercice 9 – Le verrou du chaos

**Contexte narratif :**  
Deux mages veulent lancer un sort **sur le même artefact**. Il faut protéger l’accès pour éviter des erreurs magiques.

**Énoncé :**  
1. Crée une classe `ArtefactPartage`.  
2. Elle possède une méthode `utiliser()` synchronisée, qui affiche `"Sort lancé par <nom du thread>"`.  
3. Crée deux threads appelant cette méthode.  
4. Grâce à `synchronized`, un seul mage peut l’utiliser à la fois.

