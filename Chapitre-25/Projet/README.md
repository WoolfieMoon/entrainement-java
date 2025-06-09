# Mini-projet – Le Relais des Sphères

**Contexte narratif :**  
Le **Relais des Sphères** est un ancien artefact de télécommunication entre royaumes magiques. Il permet aux mages de s’échanger des messages, des grimoires, ou même de collaborer à distance. Tu es chargé de **réactiver et sécuriser ce relais**, pour qu’il puisse accueillir plusieurs utilisateurs.

---

## Objectif

Créer une **application client/serveur complète**, capable de gérer plusieurs clients, avec **transmission de messages texte**, **transfert de fichiers**, et un **système de commande** minimaliste.

---

## Fonctionnalités attendues

### 1. Serveur central
- Accepte plusieurs clients en parallèle (multithreading)
- Affiche les connexions en temps réel
- Gère les commandes reçues :
  - `/msg` → message global à tous
  - `/list` → liste des utilisateurs connectés
  - `/file nomfichier` → demande de transfert de fichier

---

### 2. Clients multiples
- Se connectent au serveur et s’identifient (pseudo)
- Peuvent envoyer des messages normaux ou des commandes
- Peuvent recevoir des messages d’autres utilisateurs
- Peuvent télécharger des fichiers envoyés par le serveur

---

### 3. Transfert de fichiers
- Le serveur peut envoyer un fichier binaire à un client
- Le client choisit un fichier à télécharger depuis une liste
- Le fichier est transmis et sauvegardé localement

---

### 4. Sécurité et fiabilité
- Chaque communication est journalisée dans un fichier local (log)
- Le serveur gère proprement la déconnexion d’un client
- Le serveur ne se bloque jamais même en cas d’erreur

---

### 5. Bonus (facultatif)
- Ajoute une **authentification** simple au début de la connexion
- Permets le **transfert de fichiers entre clients** (en transit via serveur)
- Crée une **interface Swing simple** pour le client

---

## Contraintes

- Communication réseau via **sockets TCP**
- Utilisation de threads côté serveur pour chaque client
- Lecture/écriture via `BufferedReader`, `PrintWriter`, ou `DataStreams`
- Architecture claire et modulaire
- Pas de dépendance externe hors Java standard

---

## Objectif pédagogique

- Maîtriser le **modèle client/serveur**
- Gérer des connexions simultanées et la synchronisation
- Implémenter une **communication textuelle** et **binaire**
- Approfondir la gestion des flux réseau et des sockets

