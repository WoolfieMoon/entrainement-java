# Chapitre 30 – Le Rituel Final : projet libre et épreuve de maîtrise

Après des lunes d’entraînement, tu es prêt à accomplir le Rituel Final : une œuvre magique complète, née de ton imagination, rassemblant tout ce que tu as appris. C’est l’ultime épreuve des Arcanes Java, où tu n’es plus un apprenti… mais un créateur.

**Objectifs pédagogiques**

    - Réinvestir toutes les compétences acquises (Swing, JDBC, cryptographie, threads, JavaFX, architecture, etc.)

    - Créer une application Java complète et cohérente

    - Concevoir une interface graphique fluide

    - Organiser ton code comme un projet professionnel
    
# Projet Final – Le Sanctuaire des Arcanes

**Contexte narratif :**  
Le Sanctuaire des Arcanes est le cœur vivant du monde magique. C’est là que sont conservés tous les artefacts, créatures, grimoires, sorts et journaux de quête des siècles passés. Tu es désigné comme **l’Archiviste Suprême**, le seul autorisé à manipuler cette base de savoir… via une **interface magique avancée**. Ce sanctuaire doit être sécurisé, modulaire, interactif et persistant.

---

## Objectif

Développer une **application Java complète** réunissant tout ce que tu as appris, avec une **interface Swing multifenêtre** connectée à une base de données via JDBC, des **données sécurisées**, et une structure modulaire propre.

---

## Fonctionnalités principales

### 1. Authentification
- Lancement sur une fenêtre de connexion
- Mot de passe vérifié par **hachage SHA-256**
- Stockage chiffré des utilisateurs (AES ou simple hachage)

---

### 2. Tableau de bord (menu principal)
- Navigation vers plusieurs sections :
  - 📚 **Grimoires**
  - ⚗️ **Artefacts**
  - 🧙‍♂️ **Mages**
  - 🗺️ **Cartographie**
  - 📖 **Journal des quêtes**
  - ⚙️ **Paramètres**
- Chaque section a sa propre interface Swing

---

### 3. Gestion des données (JDBC)
- CRUD complet sur plusieurs entités :
  - `Artefact` : nom, type, rareté, pouvoir, propriétaire
  - `Mage` : nom, école, rang, statut (actif/déchu)
  - `Quête` : titre, description, statut, date
- Requêtes filtrées, triées, comptées

---

### 4. Interface (Swing ou JavaFX modulaire)
- Utilise `CardLayout`, `JTabbedPane` ou `JFrame` pour les sections
- Utilisation de `JDialog`, `JOptionPane` pour les actions critiques
- Transfert de données entre fenêtres (ex : affecter un artefact à un mage)

---

### 5. Sécurité & intégrité
- Hachage des mots de passe
- Option bonus : signature numérique des exports
- Sauvegarde automatique (fichiers `.txt`, `.json`, ou base)

---

### 6. Bonus (optionnel)
- 🎨 Thèmes visuels (mode sombre / clair)
- 🧠 Intelligence basique (ex. détection des quêtes liées à un artefact)
- 📤 Export CSV ou JSON
- 🔄 Multi-utilisateurs avec rôles (admin / lecteur)

---

## Contraintes

- Application **Java** complète
- Base de données avec **JDBC**
- Interface graphique en **Swing** (JavaFX en bonus si tu le souhaites)
- Code structuré (modèle MVC, DAO, services, UI)
- Aucun framework externe (hors JDBC / Java standard)

---

## Objectif pédagogique

- Regrouper toutes les compétences techniques de ton parcours
- Concevoir un logiciel cohérent, maintenable, modulable
- Gérer une **architecture complète**, avec IHM, persistance, logique et sécurité

---

## Conseil

Tu peux choisir d’**implémenter les modules un à un**, comme des extensions :
1. L’authentification
2. Le module des artefacts
3. Le module des quêtes
4. Le journal
5. L’export / import
6. Les options avancées

---

