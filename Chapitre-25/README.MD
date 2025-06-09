# Chapitre 25 – Les Reliques Réseau : introduction aux sockets et à la communication client/serveur en Java

Dans les profondeurs de la Nébuleuse Numérique, des mages télépathes échangent des informations via des reliques de communication. Grâce aux sockets magiques, tu vas découvrir comment établir une connexion entre deux entités distantes, envoyer et recevoir des flux d'information, et bâtir les bases d'un protocole de communication client/serveur.

**Objectifs pédagogiques**

Tu vas apprendre à :

    - Créer un serveur réseau avec ServerSocket

    - Établir une connexion cliente avec Socket

    - Échanger des messages texte ou binaires entre client et serveur

    - Lire et écrire sur les flux réseau (InputStream, OutputStream, BufferedReader, etc.)

    - Gérer plusieurs connexions avec threads serveur

    - Comprendre les principes de la communication TCP/IP
    
# Exercice 1 – L’Éveil du Canal

**Contexte narratif :**  
Tu actives pour la première fois une **relique de communication**. Elle doit écouter une connexion… et attendre patiemment qu’un mage l’active à distance.

---

## Objectif

Créer un **serveur simple** capable d’accepter une connexion entrante.

---

## Consignes

- Crée une classe serveur utilisant `ServerSocket`
- Elle doit écouter sur un port donné (ex. 5000)
- Affiche un message lorsqu’un client se connecte
- Ne traite encore aucune donnée, juste la connexion

# Exercice 2 – Le Voyageur de l’ombre

**Contexte narratif :**  
Un mage solitaire souhaite entrer en contact avec le serveur. Il ouvre un **canal client** et attend une réponse.

---

## Objectif

Créer un **client simple** capable de se connecter à un serveur local.

---

## Consignes

- Crée une classe cliente qui utilise un `Socket`
- Connecte-toi à `localhost` sur le port du serveur (ex. 5000)
- Une fois connecté, affiche un message de succès
- Laisse le programme ouvert après connexion

# Exercice 3 – Le Premier Message

**Contexte narratif :**  
Les deux entités sont liées. Il est temps de faire passer le **premier message magique** à travers le canal sacré.

---

## Objectif

Échanger un **message texte** entre le client et le serveur.

---

## Consignes

- Le client envoie un message texte au serveur (ex. “Salut, mage !”)
- Le serveur lit le message et l’affiche dans sa console
- Utilise `InputStreamReader` et `BufferedReader` pour lire
- Utilise `PrintWriter` ou `BufferedWriter` pour écrire

# Exercice 4 – L’Écho du Nexus

**Contexte narratif :**  
Le Nexus central renvoie chaque **message reçu** à son expéditeur. Un **écho magique** qui confirme le lien.

---

## Objectif

Créer un échange **aller-retour** entre client et serveur.

---

## Consignes

- Le client envoie un message
- Le serveur lit, puis répond avec un message modifié (ex. “Reçu : [message]”)
- Le client lit la réponse du serveur et l’affiche
- Utilise les bons flux de lecture/écriture des deux côtés

# Exercice 5 – La Transmission des Arcanes

**Contexte narratif :**  
Un texte ancien doit être envoyé via les reliques réseau. Le client expédie le contenu d’un fichier au serveur.

---

## Objectif

Envoyer le contenu d’un fichier texte via le réseau.

---

## Consignes

- Le client lit un fichier ligne par ligne
- Il envoie chaque ligne au serveur
- Le serveur écrit les lignes reçues dans un nouveau fichier
- Affiche un message de fin à la réception complète

# Exercice 6 – Le Dialogue continu

**Contexte narratif :**  
Le lien magique est stable, et les mages peuvent désormais **échanger des messages librement** tant que la connexion est active.

---

## Objectif

Permettre une **communication bidirectionnelle continue** entre client et serveur.

---

## Consignes

- Le client peut envoyer plusieurs messages à la suite
- Le serveur répond à chaque message reçu
- La communication s'arrête quand le client envoie "quitter"
- Affiche les messages reçus de chaque côté en temps réel

# Exercice 7 – Le Serviteur Multi-Canal

**Contexte narratif :**  
De nombreux mages veulent dialoguer avec le Nexus. Tu dois créer un **serveur capable de gérer plusieurs connexions en parallèle**.

---

## Objectif

Gérer **plusieurs clients simultanés** via des threads côté serveur.

---

## Consignes

- Le serveur accepte plusieurs connexions (2 ou plus)
- Chaque client est géré dans un `Thread` indépendant
- Le serveur doit rester disponible pendant qu’un client est actif
- Chaque message reçu est affiché avec le nom ou l’IP du client

# Exercice 8 – Le Répertoire magique

**Contexte narratif :**  
Un client demande la **liste des sorts disponibles**. Le serveur doit lui envoyer le contenu d’un dossier de sortilèges.

---

## Objectif

Envoyer une **liste de fichiers** à un client connecté.

---

## Consignes

- Le serveur lit tous les fichiers d’un dossier (`.txt` par exemple)
- Il envoie la liste (noms et tailles) au client
- Le client affiche cette liste de façon lisible

# Exercice 9 – Le Grimoire secret

**Contexte narratif :**  
Le client souhaite **télécharger un grimoire**. Le serveur l’envoie sous forme binaire, et le client le **sauvegarde localement**.

---

## Objectif

Transférer un **fichier binaire** du serveur au client.

---

## Consignes

- Le client demande un fichier précis (ex. `sort.dat`)
- Le serveur lit ce fichier et l’envoie sous forme binaire
- Le client reçoit les données et crée une copie locale
- Le fichier final doit être identique à l’original

# Exercice 10 – La Confrérie silencieuse

**Contexte narratif :**  
Plusieurs mages se connectent en secret. Le serveur agit comme **relais entre eux**, transmettant les messages aux autres.

---

## Objectif

Créer un **mini-système de chat** en ligne de commande.

---

## Consignes

- Le serveur accepte plusieurs clients
- Lorsqu’un client envoie un message, le serveur le retransmet à tous les autres
- Utilise des `threads` pour gérer les connexions
- Permets à chaque client d’écrire et recevoir en temps réel

