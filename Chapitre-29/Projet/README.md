# Mini-projet – Le Grimoire des Portails

**Contexte narratif :**  
Le Grimoire des Portails est un ancien ouvrage interactif, capable d’ouvrir plusieurs **sections enchantées** : carte du royaume, journal de quêtes, inventaire, bestiaire… Tu es chargé de **recréer ce grimoire en Java Swing**, sous forme d’une application à **plusieurs fenêtres ou vues navigables**.

---

## Objectif

Créer une **application graphique multifenêtres** avec navigation fluide, transmission de données entre vues et organisation modulaire.

---

## Fonctionnalités attendues

### 1. Interface principale (Menu)
- Contient des boutons pour accéder à différentes sections :
  - Carte
  - Inventaire
  - Journal de quêtes
  - Bestiaire
  - Quitter
- Peut être un `JFrame` avec `CardLayout` ou des sous-fenêtres (`JFrame`, `JDialog`)

---

### 2. Section Inventaire
- Affiche une **liste d’objets** (armures, potions…)
- Permet d’ajouter/supprimer un objet
- Les objets sont transmis à d’autres vues si besoin (ex. sélection pour un combat)

---

### 3. Section Journal de quêtes
- Affiche une **liste de quêtes** avec état (en cours, terminée)
- Permet d’en ajouter une nouvelle ou de modifier l’état
- Données partagées entre les vues (ex. victoire dans bestiaire → termine une quête)

---

### 4. Section Carte
- Affiche une carte fictive (ou un dessin simplifié)
- Permet de cliquer sur des zones pour changer de vue
- Affiche des informations contextuelles

---

### 5. Section Bestiaire
- Liste des créatures rencontrées
- Permet d’ajouter un monstre vaincu, avec description
- Utilise éventuellement un `JTabbedPane` ou `JScrollPane`

---

### 6. Navigation et organisation
- Boutons de retour vers le menu principal dans chaque vue
- Possibilité de **passer des données** entre les sections (ex. ajout à l’inventaire depuis le bestiaire)
- Fermeture propre de l’application

---

## Bonus (facultatif)
- Ajoute une **fenêtre d’authentification** avant l’accès au grimoire
- Ajoute une **sauvegarde automatique** dans un fichier texte ou `.json`
- Ajoute des **icônes et couleurs personnalisées**

---

## Contraintes

- Interface réalisée uniquement avec **Java Swing**
- Navigation claire, intuitive
- Code organisé : une classe par vue au minimum
- Aucun framework externe requis

---

## Objectif pédagogique

- Gérer des interfaces Swing complexes avec navigation
- Manipuler des données entre plusieurs vues
- Structurer un projet Swing de manière professionnelle

