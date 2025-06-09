# Chapitre 24 – Les Interfaces d’Âme : interfaces graphiques avancées avec Swing et MVC

Dans les temples technomagiques, les anciens ont appris à lier l’âme du mage à des interfaces visuelles. Grâce à l’art des Interfaces d’Âme, tu découvriras comment créer des interfaces Swing complexes, séparer proprement la logique avec le modèle MVC, et offrir une expérience utilisateur fluide et structurée.

**Objectifs pédagogiques**

Tu vas apprendre à :

    - Créer des interfaces graphiques complètes avec Swing

    - Organiser ton code selon le Modèle-Vue-Contrôleur (MVC)

    - Séparer clairement la logique métier, l’affichage, et les événements

    - Ajouter des composants dynamiques (listes, menus, boutons…)

    - Gérer l’interaction utilisateur de manière fluide

# Exercice 1 – Le Miroir du Conjurateur

**Contexte narratif :**  
Tu as trouvé un miroir magique qui reflète… des **messages texte** ! Mais il te faut encore l’activer et en faire une **interface graphique**.

---

## Objectif

Créer une première interface Swing avec un champ de texte et un bouton.

---

## Consignes

- Crée une fenêtre Swing avec :
  - Un champ de saisie (`JTextField`)
  - Un bouton (`JButton`)
  - Une zone de sortie (`JLabel`)
- Quand on clique sur le bouton, le texte saisi est affiché dans la zone de sortie
- Gère l’affichage proprement (layout, taille, fermeture…)

# Exercice 2 – L’Autel des Noms

**Contexte narratif :**  
Les mages inscrivent leurs noms sur un **autel sacré**. À chaque ajout, le nom apparaît dans une **liste mystique**.

---

## Objectif

Gérer une liste dynamique de données dans une interface Swing.

---

## Consignes

- Crée une interface avec :
  - Un champ de saisie (`JTextField`)
  - Un bouton "Ajouter"
  - Une `JList` affichant les noms ajoutés
- Chaque clic sur "Ajouter" ajoute le nom à la liste
- Gère les cas d’oubli ou doublon avec un message

# Exercice 3 – Le Sélecteur d’Essence

**Contexte narratif :**  
Un cristal contient plusieurs **essences magiques**. Tu dois permettre à l’utilisateur d’en choisir une, et de révéler sa **propriété**.

---

## Objectif

Créer une interface avec une **liste déroulante** et un affichage dynamique.

---

## Consignes

- Utilise une `JComboBox` pour afficher plusieurs essences
- Lorsqu’une essence est sélectionnée, affiche une description dans un `JLabel`
- Ajoute au moins 5 choix possibles

# Exercice 4 – Le Grimoire en trois couches

**Contexte narratif :**  
Ton grimoire magique est mal rangé ! Tu dois appliquer une **structure MVC** pour séparer sa logique, sa présentation et ses actions.

---

## Objectif

Créer une application Swing en suivant le **Modèle-Vue-Contrôleur (MVC)**.

---

## Consignes

- Crée trois classes :
  - `SortModel` : contient une liste de sortilèges et les méthodes pour y accéder
  - `SortView` : contient l’interface Swing
  - `SortController` : connecte les actions utilisateur au modèle
- L’interface doit permettre d’ajouter et de lister des sortilèges

# Exercice 5 – Le Catalyseur de Formulaires

**Contexte narratif :**  
Tu conçois un **formulaire magique** que les novices devront remplir. Tu dois valider les champs avant d’envoyer le formulaire à la Tour.

---

## Objectif

Créer un formulaire avec **validation de champs**.

---

## Consignes

- Crée un formulaire avec :
  - Nom (`JTextField`)
  - Âge (`JTextField`)
  - École magique (`JComboBox`)
  - Bouton "Envoyer"
- Valide que :
  - Aucun champ n’est vide
  - L’âge est bien un nombre
- Affiche un message de succès ou d’erreur

# Exercice 6 – L’Enchanteur des Couleurs

**Contexte narratif :**  
Tu travailles sur une **interface chromatique** permettant de modifier la couleur d’un champ magique. Ton sort modifie l’apparence de composants à la volée.

---

## Objectif

Changer dynamiquement les couleurs d’un composant avec Swing.

---

## Consignes

- Crée une fenêtre avec :
  - Un panneau principal
  - Trois boutons : "Rouge", "Vert", "Bleu"
- Chaque bouton change la couleur de fond du panneau principal
- Ajoute une animation ou un message lorsque la couleur change

# Exercice 7 – Le Tri des Arcanes

**Contexte narratif :**  
Tu dois gérer un **tableau d’arcanes** et les trier selon leur puissance. Ce tableau doit être interactif, triable, et lisible.

---

## Objectif

Utiliser un `JTable` pour afficher des données et gérer le tri.

---

## Consignes

- Crée un tableau avec plusieurs colonnes :
  - Nom, Élément, Puissance
- Affiche au moins 10 lignes d’objets
- Permets le tri par colonne (via `TableRowSorter`)
- Bonus : ajoute un filtre par élément magique via un champ texte

# Exercice 8 – L’Horloge du Sanctuaire

**Contexte narratif :**  
Le Sanctuaire t’a confié la garde du **temps magique**. Tu dois afficher une horloge en direct sur une interface mystique.

---

## Objectif

Mettre à jour une interface Swing **en temps réel** avec un `Timer`.

---

## Consignes

- Affiche l’heure actuelle dans un `JLabel`
- Mets à jour l’affichage toutes les secondes
- Utilise un `javax.swing.Timer`
- L’interface doit toujours rester réactive pendant l’horloge

# Exercice 9 – La Connexion des Apprentis

**Contexte narratif :**  
Tu crées une **interface de connexion** pour restreindre l’accès à la bibliothèque magique. Seuls les apprentis reconnus peuvent y entrer.

---

## Objectif

Créer une interface avec authentification simple.

---

## Consignes

- Formulaire avec champ utilisateur et mot de passe (`JPasswordField`)
- Vérifie si les identifiants correspondent à une liste enregistrée
- Affiche un message d’erreur ou de succès
- Sépare l’interface (Vue), la vérification (Modèle), et l’action (Contrôleur)

# Exercice 10 – L’Éditeur de Parchemins

**Contexte narratif :**  
Tu conçois un **éditeur de texte magique** pour créer et sauvegarder des parchemins personnalisés.

---

## Objectif

Créer une interface avec zone de texte, chargement et sauvegarde de fichiers.

---

## Consignes

- Crée une interface avec :
  - Une `JTextArea`
  - Un menu "Fichier" avec "Ouvrir" et "Sauvegarder"
- Permets de charger un fichier `.txt` dans la zone de texte
- Permets de sauvegarder son contenu
- Gère les erreurs (fichier introuvable, accès refusé…)

