## Chapitre 16 – Les Secrets du Multivers : architecture multi-modules et MVC en Java

Dans les Sphères Fracturées du Multivers, chaque domaine magique est régi par un ordre distinct : les Contrôleurs, les Modèles, les Vues. Ce chapitre t’initie à une architecture claire et durable : le MVC (Model-View-Controller), idéale pour bâtir des applications bien structurées.

Tu vas apprendre à :

    - Séparer proprement ton code en modèle, vue et contrôleur

    - Créer des projets Java modulaires

    - Faire communiquer les différentes parties de ton application

    - Comprendre les principes de conception qui facilitent la maintenance et l’évolution
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

# Exercice 2 – Invocation depuis la vue

**Contexte narratif :**  
Dans le Multivers, les Vues ne lancent pas les sorts : elles **demandent** au contrôleur de le faire.

**Énoncé :**
1. Dans `vue`, crée une méthode `demanderSort()` qui appelle le contrôleur pour obtenir un sort.
2. Le contrôleur crée un sort et le renvoie à la vue.
3. La vue affiche ensuite le sort reçu avec `afficherSort(...)`.

**But :**  
Ne pas instancier `Sort` directement dans la vue.

# Exercice 3 – Interactivité magique (Scanner + MVC)

**Contexte narratif :**  
Tu veux laisser un utilisateur du Multivers entrer un sort par la console. Le contrôleur gère cette action.

**Énoncé :**
1. Dans la vue, utilise `Scanner` pour demander :
    - Le nom du sort
    - Sa puissance

2. Transmets ces valeurs au contrôleur.
3. Le contrôleur crée un `Sort` et le passe à la vue pour affichage.

**Exemple attendu :**

Entrez le nom du sort : Éclair
Entrez la puissance : 90
🧾 Sort : Éclair – Puissance : 90
# Exercice 4 – Mise à jour du modèle

**Contexte narratif :**  
Le contrôleur peut modifier les propriétés d’un sort, selon les décisions du Conseil.

**Énoncé :**
1. Dans `Sort`, ajoute des `getters` et `setters`.
2. Dans le contrôleur, modifie un sort existant (change nom ou puissance).
3. Affiche les nouvelles valeurs avec la vue.

**But pédagogique :**  
Faire le lien entre modèle modifié → vue mise à jour.

# Exercice 5 – Modèle avec logique magique

**Contexte narratif :**  
Certains sorts possèdent une **incantation spéciale** qui dépend de leur puissance.

**Énoncé :**
1. Dans `Sort`, ajoute une méthode `incanter()` qui retourne :
    - `"✨ Incantation majeure !"` si puissance ≥ 100
    - `"🔹 Incantation mineure."` sinon

2. La vue appelle cette méthode via le contrôleur et affiche la bonne incantation.

**Exemple :**

🧾 Sort : Flamme – Puissance : 120
✨ Incantation majeure !
# Exercice 6 – Répertoire des sorts (liste dans le modèle)

**Contexte narratif :**  
Le Multivers regorge de sortilèges. Il est temps de les regrouper dans un **grimoire centralisé**.

**Énoncé :**
1. Dans `modele`, crée une classe `Grimoire` contenant une `ArrayList<Sort>`.
2. Ajoute une méthode `ajouterSort(Sort s)` et `getTousLesSorts()`.

3. Le contrôleur ajoute plusieurs sorts dans le grimoire.
4. La vue les affiche tous dans une boucle :

🔸 Feu – 100
🔸 Soin – 45
🔸 Invisibilité – 60
# Exercice 7 – Filtrer les grands sorts

**Contexte narratif :**  
Les arcanes veulent afficher uniquement les **grands sorts** (puissance ≥ 80).

**Énoncé :**
1. Dans `Grimoire`, crée une méthode `getGrandsSorts()` qui retourne uniquement les sorts puissants.

2. La vue affiche cette liste via le contrôleur, comme :

🌟 Sorts puissants :
🔥 Feu (100)
⚡ Éclair (90)
# Exercice 8 – Suppression d’un sort

**Contexte narratif :**  
Un Conseil restreint a décidé de retirer un sort du grimoire.

**Énoncé :**
1. Dans `Grimoire`, ajoute une méthode `supprimerSort(String nom)`.
2. Le contrôleur appelle cette méthode avec un nom de sort saisi par l’utilisateur (via la vue).
3. La vue affiche un message :

❌ Sort 'Soin' supprimé.
# Exercice 9 – Navigation entre Vues (console)

**Contexte narratif :**  
Tu souhaites séparer l’affichage des **options** de celui des **sorts**. Tu vas simuler une navigation.

**Énoncé :**
1. Crée une `VueMenu` qui affiche :

   1.Voir les sorts

   2.Ajouter un sort

   3.Quitter


2. En fonction du choix, appelle la bonne méthode dans le contrôleur :
- Afficher tous les sorts
- Ajouter un sort via saisie
- Quitter le programme

3. Reviens au menu après chaque action.

# Exercice 10 – Utilisation de MVC dans une mini-app console

**Contexte narratif :**  
Tu rassembles tous tes savoirs pour créer un **mini-grimoire interactif** en console.

**Énoncé :**
1. Structure le projet avec MVC
2. Gère au moins ces actions :
    - Ajouter un sort
    - Afficher tous les sorts
    - Supprimer un sort par nom
    - Quitter

3. Gère les saisies proprement dans la vue
4. Affiche toujours un message de confirmation après chaque action

**But pédagogique :**  
MVC complet et fonctionnel, gestion console propre.

