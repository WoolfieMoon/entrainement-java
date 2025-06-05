# Mini-projet – Le Bestiaire d’Aleboréa

**Contexte narratif :**  
Dans la **Salle des Créatures Ancestrales**, tu es chargé·e de constituer un **bestiaire magique** pour le Conseil. Chaque créature est une entité vivante avec un nom, une espèce et un niveau. Le grimoire final devra afficher les informations de chaque être invoqué.

---

## Objectif

Créer une classe `CreatureMagique`, et une autre classe `Main` pour instancier plusieurs créatures et afficher leur description.

---

## Énoncé

1. Crée une classe `CreatureMagique` avec :
   - Attributs :
     - `String nom`
     - `String espece`
     - `int niveau`
   - Constructeur permettant d’initialiser les trois attributs.
   - Méthode `afficherFiche()` qui affiche :
     ```
     Nom : <nom>
     Espèce : <espece>
     Niveau : <niveau>
     ```

2. Dans la classe `Main` :
   - Crée un tableau de 3 objets `CreatureMagique` avec des valeurs différentes.  
   - Pour chaque créature du tableau, appelle la méthode `afficherFiche()`.

---

## Exemple attendu :

Nom : Lirien
Espèce : Sylphide
Niveau : 12

Nom : Braxor
Espèce : Golem
Niveau : 20

Nom : Nymis
Espèce : Chimère
Niveau : 17

---

**Objectif pédagogique :**  
Ce projet t’entraîne à :
- Créer une classe avec attributs et constructeur
- Manipuler un tableau d’objets
- Utiliser des méthodes d’instance pour afficher des données

Une fois terminé, tu pourras avancer vers les héritages, polymorphismes et interfaces des chapitres suivants.

