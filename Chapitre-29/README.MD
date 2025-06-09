# Chapitre 29 – Les Portails Multiples : multifenêtrage et navigation avec Java Swing

Dans les tours anciennes, les mages circulaient entre pièces enchantées en franchissant des portails interconnectés. Aujourd’hui, tu apprendras à créer des interfaces multi-fenêtres, à naviguer entre elles, et à gérer les données partagées entre différents écrans dans ton application Swing.

**Objectifs pédagogiques**

Tu vas apprendre à :

    - Créer plusieurs fenêtres Swing reliées entre elles

    - Naviguer entre des interfaces (fenêtres ou panels)

    - Passer des données d’une fenêtre à une autre

    - Créer un système de menu principal → fenêtres secondaires

    - Gérer les fenêtres modales et les dialogues (JDialog, JOptionPane)

    - Réorganiser l’affichage avec des CardLayout, JTabbedPane ou plusieurs JFrame
    
# Exercice 1 – Le Portail initial

**Contexte narratif :**  
Tu es face à un portail magique qui ouvre une **seconde salle**. Un clic suffit à l’activer… si tu parviens à le maîtriser.

---

## Objectif

Créer une **deuxième fenêtre Swing** qui s’ouvre depuis la première.

---

## Consignes

- Crée une interface principale (`JFrame`) avec un bouton "Ouvrir Portail"
- Lorsqu’on clique, une **nouvelle fenêtre (`JFrame`)** s’ouvre
- La première fenêtre reste ouverte
- La seconde peut contenir un simple message

# Exercice 2 – Le Passage Sélectif

**Contexte narratif :**  
Certains portails ne s’activent que selon des **critères précis**. Il faut parfois entrer une formule pour qu’ils s’ouvrent correctement.

---

## Objectif

Passer une **valeur saisie** d’une fenêtre à une autre.

---

## Consignes

- Dans la première fenêtre, ajoute un champ de texte (`JTextField`)
- Lorsque l’utilisateur clique sur "Transmettre", ouvre une nouvelle fenêtre
- La seconde fenêtre doit afficher la **valeur saisie**
- Utilise un constructeur ou une méthode pour transmettre la donnée

# Exercice 3 – Le Retour de la Salle Miroir

**Contexte narratif :**  
Un miroir magique affiche des **données à modifier**. Une fois validées, elles sont **renvoyées** à la pièce d’origine, mise à jour.

---

## Objectif

Permettre à une seconde fenêtre de **modifier les données** affichées dans la première.

---

## Consignes

- La première fenêtre contient un label avec un texte
- En cliquant sur un bouton, une **deuxième fenêtre s’ouvre avec un champ d’édition**
- L’utilisateur modifie le texte et clique sur "Valider"
- La première fenêtre **met à jour son contenu** en conséquence

# Exercice 4 – La Salle des Dialogues

**Contexte narratif :**  
Un gardien te pose une question à travers un petit portail suspendu. Il s’agit d’un **dialogue rapide** qui décide de la suite du parcours.

---

## Objectif

Utiliser un **`JOptionPane`** pour créer des dialogues modaux.

---

## Consignes

- Crée un bouton "Parler au Gardien"
- Lorsqu’on clique, un `JOptionPane.showInputDialog` s’affiche
- Le texte saisi est affiché ensuite dans un `JLabel`
- Bonus : utilise `showConfirmDialog` pour poser une question "Oui / Non"

# Exercice 5 – Le Livre à Onglets

**Contexte narratif :**  
Dans la bibliothèque d’Énalith, chaque grimoire possède plusieurs **sections navigables**. Tu dois créer ce système de **navigation par onglets**.

---

## Objectif

Utiliser un **`JTabbedPane`** avec plusieurs vues.

---

## Consignes

- Crée une fenêtre avec un `JTabbedPane` contenant 3 onglets
- Chaque onglet affiche un `JPanel` différent (avec texte ou bouton)
- Permets à l’utilisateur de naviguer librement entre eux
- Donne un titre et une icône différente à chaque onglet (optionnel)

# Exercice 6 – Le Passage Conditionnel

**Contexte narratif :**  
Certains portails ne peuvent être franchis que **si une énigme est résolue**. Si l’utilisateur échoue, la pièce suivante reste inaccessible.

---

## Objectif

Créer une **logique conditionnelle** avant d’ouvrir une nouvelle fenêtre.

---

## Consignes

- Dans la fenêtre principale, affiche une question (ex. "Combien font 3 + 4 ?")
- Si la réponse est correcte, ouvre une nouvelle fenêtre
- Sinon, affiche un message d’erreur
- Utilise un champ texte + un bouton "Valider"

# Exercice 7 – Le Portail Réversible

**Contexte narratif :**  
Certains portails peuvent être **fermés et réouverts à volonté**, sans jamais créer de doubles. Un seul passage à la fois doit exister.

---

## Objectif

Ouvrir une **fenêtre secondaire unique**, sans créer de doublon.

---

## Consignes

- Clique sur un bouton "Accéder à la salle"
- Ouvre une fenêtre secondaire si elle n’est pas déjà ouverte
- Si elle est déjà visible, **la ramener au premier plan**
- La fermeture doit permettre de la rouvrir plus tard

# Exercice 8 – La Traversée des Cartes

**Contexte narratif :**  
Une salle est capable de **changer de forme** sans changer d’espace. Tu dois créer un système où les **vues sont changées dynamiquement**.

---

## Objectif

Utiliser un **`CardLayout`** pour basculer entre plusieurs panneaux.

---

## Consignes

- Crée une fenêtre contenant un `CardLayout`
- Ajoute 2 ou 3 panneaux différents (avec contenus variés)
- Affiche des boutons permettant de naviguer entre ces panneaux
- Les composants restent dans **la même fenêtre**

# Exercice 9 – L’Accès Maître

**Contexte narratif :**  
Pour franchir un certain portail, il faut **s’authentifier** avec un mot de passe magique. Sinon, la salle refuse de s’ouvrir.

---

## Objectif

Créer une fenêtre d’authentification simple avant d’accéder à l’interface principale.

---

## Consignes

- Affiche une **fenêtre de login** (avec `JTextField` et `JPasswordField`)
- Si le mot de passe est correct, ouvre l’interface principale
- Sinon, affiche un message d’erreur
- Bonus : autoriser 3 essais maximum

# Exercice 10 – Le Navigateur d’Univers

**Contexte narratif :**  
Tu as conçu une **application complète** permettant de naviguer entre plusieurs royaumes (interfaces), chacun avec ses propres composants.

---

## Objectif

Créer une application Swing avec **menu de navigation** et plusieurs fenêtres liées.

---

## Consignes

- Crée un menu principal avec des boutons : "Bibliothèque", "Inventaire", "Carte", "Quitter"
- Chaque bouton ouvre une **nouvelle fenêtre thématique**
- Les fenêtres peuvent être indépendantes ou modales
- Permets de **retourner au menu principal** depuis chaque sous-fenêtre

