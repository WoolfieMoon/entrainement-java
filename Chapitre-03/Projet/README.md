# Mini-projet – Le Grimoire d’Invocation

**Contexte narratif :**  
Tu arrives dans la Salle des Sceaux où se trouvent des grimoires scellés. Pour les ouvrir, il te faut créer une collection de sorts personnalisés. Chaque sort doit être invoqué avec des ingrédients et produire un effet. Seuls ceux capables de créer un grimoire organisé pourront accéder à la Bibliothèque Runique.

**Énoncé :**  
Crée une classe Java nommée `GrimoireInvocation` qui contient **plusieurs méthodes** pour simuler un petit système d’invocations. Voici les étapes :

### Étape 1 : Sorts élémentaires
1. Crée trois méthodes statiques :
   - `public static void sortFeu()` → affiche `"Tu invoques une boule de feu brûlante !"`.
   - `public static void sortGlace()` → affiche `"Un vent glacial surgit du néant..."`.
   - `public static void sortFoudre()` → affiche `"L’éclair frappe avec une puissance céleste !"`.
   
### Étape 2 : Méthode d’appel
2. Crée une méthode `public static void invoquer(String element)` qui appelle l’un des trois sorts ci-dessus selon le paramètre reçu (`"feu"`, `"glace"`, `"foudre"`).  
   - Si l’élément ne correspond à aucun des trois, affiche : `"Échec de l’invocation : élément inconnu."`.

### Étape 3 : Méthode principale
3. Dans `main`, appelle plusieurs invocations :
   - `invoquer("feu");`
   - `invoquer("glace");`
   - `invoquer("terre");` *(invalide)*
   - `invoquer("foudre");`

### Résultat attendu :

Tu invoques une boule de feu brûlante !
Un vent glacial surgit du néant...
Échec de l’invocation : élément inconnu.
L’éclair frappe avec une puissance céleste !


**Objectif pédagogique :**  
Tu maîtrises désormais les méthodes simples, les appels conditionnels, et la structuration du code. Ce projet t’entraîne à organiser tes sorts comme une vraie bibliothèque de fonctions.

