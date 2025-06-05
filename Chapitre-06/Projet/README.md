# Mini-projet – Le Grand Appel des Créatures

**Contexte narratif :**  
Le Conseil d’Aleboréa doit préparer la grande invocation pour défendre le royaume. On te confie la mission de construire un système capable de gérer **plusieurs types de créatures**, grâce à l’héritage et au polymorphisme. Seules les créatures héritant de la **classe ancestrale `Creature`** pourront être invoquées dans le rituel.

---

## Objectif

Créer plusieurs classes qui héritent de `Creature`, et les manipuler ensemble grâce à une collection polymorphe.

---

## Énoncé

1. Crée une **classe de base** `Creature` avec :
   - Attributs : `String nom`, `int niveau`
   - Méthode : `afficher()` qui affiche :  
     ```
     Créature : <nom> (Niveau <niveau>)
     ```

2. Crée deux **classes héritées** :
   - `Loup` : ajoute un attribut `int vitesse` et redéfinis `afficher()` pour afficher :  
     ```
     🐺 Loup : <nom> (Niveau <niveau>, Vitesse : <vitesse>)
     ```
   - `Dragon` : ajoute un attribut `int feu` et redéfinis `afficher()` pour afficher :  
     ```
     🐉 Dragon : <nom> (Niveau <niveau>, Feu : <feu>)
     ```

3. Dans une classe `Main` :
   - Crée un tableau ou une liste `Creature[]` contenant :  
     - Un `Loup` `"Férox"`, niveau `6`, vitesse `35`  
     - Un `Dragon` `"Ignivar"`, niveau `18`, feu `90`  
     - Un `Creature` `"Anonyme"`, niveau `3`

4. Parcours le tableau et appelle `afficher()` sur chaque créature.

---

## Résultat attendu :

🐺 Loup : Férox (Niveau 6, Vitesse : 35)
🐉 Dragon : Ignivar (Niveau 18, Feu : 90)
Créature : Anonyme (Niveau 3)


---

**Objectif pédagogique :**  
- Mettre en place une hiérarchie de classes
- Utiliser `super(...)` dans les constructeurs
- Pratiquer le polymorphisme à travers un tableau de type parent
- Redéfinir (`override`) une méthode dans les classes filles

