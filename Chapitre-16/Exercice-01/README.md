# Exercice 1 – Découpage du savoir (structure MVC)

**Contexte narratif :**  
Les Anciens ont appris que pour stabiliser la magie, il faut séparer les rôles : un mage ne peut pas tout faire à la fois. C’est le fondement de l’**architecture MVC**.

**Énoncé :**  
1. Crée un projet Java avec trois packages :
   - `modele`
   - `vue`
   - `controleur`

2. Crée une classe `Sort` dans `modele` :
   - `String nom`
   - `int puissance`

3. Crée une classe `SortVue` dans `vue` qui :
   - Possède une méthode `afficherSort(Sort sort)`
   - Affiche :  
     ```
     🧾 Sort : <nom> – Puissance : <puissance>
     ```

4. Crée un `SortControleur` dans `controleur` qui :
   - Instancie un `Sort`  
   - Passe le sort à la vue pour affichage

