## Chapitre 13 – Les Sorts Réactifs : programmation événementielle avec Swing

Dans la Salle des Portails Vivants, les sorts répondent non pas à des incantations directes… mais à des gestes, des clics, et des actions extérieures. C’est ici que la magie devient réactive, interactive : on entre dans le monde de l’événementiel.

Dans ce chapitre, tu vas apprendre à :

    - Créer une interface graphique simple avec Swing

    - Réagir à des événements (clics de bouton, saisies utilisateur)

    - Mettre à jour des éléments graphiques dynamiquement
# Exercice 1 – L’incantateur graphique

**Contexte narratif :**  
Tu veux créer une **fenêtre magique** dans laquelle s’ouvre le premier parchemin interactif.

**Énoncé :**
1. Crée une classe `FenetreMagique` qui hérite de `JFrame`.
2. Dans le constructeur, configure :
    - Un titre : `"Grimoire Interactif"`
    - Un bouton `"Lancer sort"`
3. Affiche un message dans la console quand on clique sur le bouton :

Sort lancé !

4. Rends la fenêtre visible.

# Exercice 2 – Le label enchanté

**Contexte narratif :**  
Tu veux qu’un **label** affiche un message mystique quand un bouton est invoqué.

**Énoncé :**
1. Crée une classe `SortAvecLabel`.
2. Crée un `JLabel` vide et un bouton `"Invoquer"`.
3. Quand on clique, affiche dans le label :

Invocation réussie !

4. Dispose les éléments dans la fenêtre.
# Exercice 3 – Le compteur d’âmes

**Contexte narratif :**  
Chaque clic sur un bouton capture une **âme magique**. Tu dois afficher le nombre total capturé.

**Énoncé :**
1. Crée une classe `CompteurAmes`.
2. Ajoute un label `"Âmes capturées : 0"` et un bouton `"Capturer"`.
3. À chaque clic, le compteur augmente de 1.
4. Mets à jour dynamiquement le texte du label.

# Exercice 4 – Le champ de sort

**Contexte narratif :**  
Un magicien tape une **formule magique** dans un champ, puis la valide pour la lancer.

**Énoncé :**
1. Crée une classe `ChampDeSort`.
2. Ajoute un `JTextField` et un bouton `"Lancer"`.
3. Quand on clique :
    - Récupère le texte du champ
    - Affiche dans un label : `"Sort : <texte saisi>"`
4. Le champ est vidé après validation.

# Exercice 5 – L’illusion à choix multiples

**Contexte narratif :**  
Un miroir magique propose **trois illusions**. L’utilisateur doit choisir une option dans une liste déroulante.

**Énoncé :**
1. Crée une classe `IllusionMultiple`.
2. Utilise un `JComboBox` avec :
    - `"Mirage"`
    - `"Fantôme"`
    - `"Double magique"`
3. Ajoute un bouton `"Projeter"`
4. Quand on clique, affiche dans un label :

Illusion choisie : <élément sélectionné>
# Exercice 6 – Le changement d’apparence

**Contexte narratif :**  
Un sort visuel change l’apparence de la fenêtre en fonction de l’humeur du mage.

**Énoncé :**
1. Crée une classe `SortApparence`.
2. Ajoute trois boutons :
    - `"Rouge"`
    - `"Bleu"`
    - `"Vert"`
3. Quand on clique sur un bouton, change la couleur de fond (`setBackground`) du `JPanel`.

# Exercice 7 – Le grimoire bavard

**Contexte narratif :**  
Tu parles à un grimoire enchanté, et il te **répète** ce que tu dis, mais avec une voix ancienne (tout en majuscules).

**Énoncé :**
1. Crée une classe `GrimoireBavard`.
2. Ajoute un champ de texte, un bouton `"Parler"`, et un label.
3. Quand on clique :
    - Récupère le texte
    - Affiche dans le label : `"<TEXTE EN MAJUSCULES>"`
4. Le champ est vidé.

# Exercice 8 – Le sort à minuterie

**Contexte narratif :**  
Certains sorts doivent attendre un certain **délai** avant d’agir. Tu veux simuler un effet retardé.

**Énoncé :**
1. Crée une classe `SortMinuterie`.
2. Ajoute un bouton `"Préparer sort"`
3. Quand on clique, affiche `"Préparation..."`, puis après 2 secondes :

💥 Sort lancé !

(Utilise `javax.swing.Timer`)

# Exercice 9 – Le panneau à familiers

**Contexte narratif :**  
Tu veux afficher dynamiquement un familier magique selon ce que l’élève choisit.

**Énoncé :**
1. Crée une classe `SelectionFamilier`.
2. Utilise une `JComboBox` avec :
    - `"Chouette"`
    - `"Dragonnet"`
    - `"Chat noir"`
3. Quand on change la sélection, mets à jour un `JLabel` avec :

Familier sélectionné : <nom>
# Exercice 10 – Le mot de passe sacré

**Contexte narratif :**  
Tu protèges l’accès à une rune. Le mot de passe doit être exact pour ouvrir le portail.

**Énoncé :**
1. Crée une classe `PortailSecret`.
2. Ajoute un `JPasswordField`, un bouton `"Ouvrir"`, et un label.
3. Si le mot de passe est `"azk4lth"`, affiche :

✅ Portail ouvert.

Sinon :

❌ Accès refusé.
