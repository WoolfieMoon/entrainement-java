 # Mini-projet – Le Grimoire Interactif

**Contexte narratif :**  
Tu dois construire un **Grimoire Magique** permettant aux élèves de l’Académie d’écrire, déclencher, et visualiser leurs sortilèges en toute autonomie. Ce grimoire graphique sera leur premier outil d’entraînement en magie réactive.

---

## Objectif

Créer une interface Swing qui :
- Permet à l’utilisateur d’écrire un sort
- Le déclenche via un bouton
- Affiche dynamiquement le nom du sort invoqué
- Gère les erreurs (vide, caractères interdits)
- Propose un thème de couleur sélectionnable

---

## Énoncé

1. Crée une classe `GrimoireInteractif` qui hérite de `JFrame`.

2. Ajoute les éléments suivants :
   - Un `JTextField` (champ de saisie du sort)  
   - Un bouton `"Lancer le sort"`  
   - Un `JLabel` qui affichera le résultat  
   - Un `JComboBox` avec les thèmes : `"Clair"`, `"Sombre"`, `"Mystique"`  
   - Un `JPanel` principal pour changer de couleur selon le thème

3. Quand l’utilisateur clique sur `"Lancer le sort"` :
   - Si le champ est vide, affiche :
     ```
     ⚠️ Aucun sort saisi.
     ```
   - Sinon, affiche :
     ```
     ✨ Sort "<nom du sort>" lancé !
     ```

4. Quand l’utilisateur change le thème via le `JComboBox`, change la couleur de fond du panneau principal :
   - `"Clair"` → blanc  
   - `"Sombre"` → gris foncé  
   - `"Mystique"` → violet clair

5. Rends l’interface responsive, agréable à lire et bien centrée.

---

## Résultat visuel attendu (console + interface) :

- Interface :

Champ [_________]
[Lancer le sort]
Résultat : ✨ Sort "Illusion" lancé !
Thème : Mystique


- En cas de champ vide :

Résultat : ⚠️ Aucun sort saisi.


---

**Objectif pédagogique :**
- Créer une interface Swing complète
- Gérer des événements sur bouton, champ texte, et combo
- Réagir aux entrées utilisateur et personnaliser l’affichage
- Renforcer la logique d'interaction événementielle

