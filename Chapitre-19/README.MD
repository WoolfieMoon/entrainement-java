## Chapitre 19 – Les Arènes Virtuelles : introduction à JavaFX pour interfaces graphiques

Dans les Arènes Virtuelles, les mages ne se battent plus avec des épées, mais avec des interfaces animées. Les fenêtres, les boutons, les effets visuels sont devenus de puissants outils dans les affrontements modernes. Grâce à JavaFX, tu vas apprendre à créer des interfaces graphiques riches et interactives, prêtes pour affronter les foules numériques.

**Objectifs pédagogiques**

Tu vas apprendre à :

    - Créer une fenêtre JavaFX avec scène et stage

    - Ajouter des boutons, labels, champs de texte

    - Réagir aux événements utilisateur

    - Organiser ton interface avec des layouts (VBox, HBox, BorderPane...)

    - Appliquer des styles CSS à ton interface
# Exercice 1 – L’entrée dans l’Arène

**Contexte narratif :**  
Le portail des Arènes s’ouvre. Tu dois faire apparaître ta **première interface JavaFX**, une simple fenêtre vide : la scène de combat est dressée.

---

## Objectif

Créer une **application JavaFX minimale** qui affiche une fenêtre avec un titre personnalisé.

---

## Consignes

- Crée une classe qui lance une application JavaFX
- Configure la fenêtre avec un titre évocateur de ton choix
- Affiche une scène vide avec une taille fixe (ex. 600x400)
- Vérifie que l’application s’exécute sans erreur

# Exercice 2 – La pierre d’interaction

**Contexte narratif :**  
Une **pierre runique** est posée au centre de l’arène. Un clic sur elle libère une étincelle magique. Tu vas créer ton **premier bouton interactif**.

---

## Objectif

Créer un **bouton** dans une interface JavaFX qui affiche un message dans la console quand on clique dessus.

---

## Consignes

- Ajoute un `Button` à ta scène
- Écris une action à exécuter lors du clic (par exemple afficher un message dans la console)
- Place le bouton au centre avec un layout simple (`VBox` par exemple)
- Teste l’application et vérifie que le message s’affiche au clic

# Exercice 3 – Le miroir magique

**Contexte narratif :**  
Un **miroir magique** révèle ton nom lorsque tu le regardes. Il te faut maintenant une **zone de texte** pour saisir ton nom, et un bouton pour l’afficher.

---

## Objectif

Créer une interface avec un **champ de texte** et un **label** mis à jour dynamiquement après un clic.

---

## Consignes

- Ajoute un `TextField` pour saisir un nom
- Ajoute un `Button` nommé "Révéler"
- Ajoute un `Label` vide
- Lors du clic sur le bouton, le `Label` doit afficher :  
  `👁‍🗨 Bonjour, <nom saisi> !`

# Exercice 4 – L’armement de la scène

**Contexte narratif :**  
Tu dois préparer ton **interface de combat** avec plusieurs éléments bien placés. Pour cela, tu dois apprendre à organiser visuellement l’espace avec des **layouts**.

---

## Objectif

Utiliser des **layouts JavaFX** (`VBox`, `HBox`, `BorderPane`) pour organiser une interface graphique propre.

---

## Consignes

- Crée une interface avec :
    - En haut : un `Label` (titre de la scène)
    - Au centre : un `TextField` + `Button`
    - En bas : un `Label` pour afficher un message

- Utilise des conteneurs adaptés pour placer ces éléments (un `BorderPane` avec un `HBox` ou `VBox`)
- Le tout doit être centré et lisible

# Exercice 5 – Apparence enchantée (style CSS)

**Contexte narratif :**  
Tu reçois un **parchemin d’enchantement visuel**. Il te permet de modifier l’apparence de l’interface avec des effets élégants. L’arène doit impressionner.

---

## Objectif

Appliquer un **style CSS personnalisé** à ton application JavaFX.

---

## Consignes

- Crée un fichier CSS et attache-le à ta scène
- Applique un style :
    - Boutons avec une couleur de fond personnalisée
    - Labels avec une police stylisée ou taille modifiée
    - Fond de la scène différent (sombre, magique, etc.)

- L’apparence doit évoquer un univers **fantastique** ou **surnaturel**

# Exercice 6 – L’autel des messages

**Contexte narratif :**  
Un **autel mystique** permet d’envoyer des messages dans l’arène. Chaque invocation déclenche l’affichage d’un nouveau message dans la mémoire du sanctuaire.

---

## Objectif

Créer un système qui **affiche dynamiquement une liste de messages** envoyés par l’utilisateur.

---

## Consignes

- Ajoute un champ de texte et un bouton "Envoyer"
- Lors d’un clic, le message saisi s’ajoute à une **liste visible à l’écran**
- La liste doit s’agrandir à chaque message ajouté
- Utilise un composant adapté pour lister plusieurs lignes (par exemple une `ListView`)

# Exercice 7 – La forge du compteur

**Contexte narratif :**  
Tu dois créer un **compteur magique** qui peut être augmenté ou réduit à volonté, comme une forge d’énergie.

---

## Objectif

Créer une interface avec deux boutons (+ et –) et un affichage dynamique du **compteur**.

---

## Consignes

- Affiche un chiffre au centre de l’interface (commence à 0)
- Ajoute deux boutons : "Invoquer +" et "Invoquer –"
- Le clic sur chaque bouton augmente ou diminue le compteur affiché
- Le chiffre doit se mettre à jour en temps réel

# Exercice 8 – La balance des éléments

**Contexte narratif :**  
Un artefact affiche visuellement la **quantité de pouvoir** que tu canalises. Tu vas représenter cette énergie à l’aide d’une **barre magique**.

---

## Objectif

Utiliser une **ProgressBar** pour afficher un niveau d’énergie ou de remplissage.

---

## Consignes

- Ajoute une `ProgressBar` à ton interface
- Ajoute deux boutons : "Canaliser" (+10%) et "Dissiper" (–10%)
- La barre doit refléter l’état d’énergie actuel
- Empêche le dépassement des bornes (0 à 100%)

# Exercice 9 – La détection de sort

**Contexte narratif :**  
Tu veux détecter quand un mage **appuie sur une touche magique**. Chaque caractère entré est enregistré dans un grimoire secret.

---

## Objectif

Détecter les **événements clavier** dans une interface JavaFX.

---

## Consignes

- Ajoute une zone de texte ou écoute la scène entière
- À chaque pression de touche, affiche le caractère dans un label ou une liste
- Tu peux aussi compter combien de lettres ont été saisies
- Bonus : ignorer certaines touches comme Entrée, Shift, etc.

# Exercice 10 – Le duel des listes enchantées

**Contexte narratif :**  
Deux invocateurs s’affrontent. Chacun possède une **liste de créatures**. Ils peuvent déplacer des invocations d’une arène à l’autre.

---

## Objectif

Créer une interface avec **deux listes interactives** et permettre le **transfert d’éléments** entre elles.

---

## Consignes

- Crée deux listes visibles côte à côte (ListView, ou autre)
- Ajoute des boutons : "→ Transférer" et "← Renvoyer"
- Le clic sur un bouton déplace l’élément sélectionné d’une liste à l’autre
- Gère les cas où aucun élément n’est sélectionné

