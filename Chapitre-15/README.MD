##  Chapitre 15 – Les Guildes distribuées : communication réseau en Java

Dans les Terres Brisées, les guildes magiques sont dispersées. Pour communiquer, elles utilisent les Cristaux de Transmission – une forme ancienne de réseau magique. Grâce à la magie des sockets, ces guildes peuvent échanger messages et informations en temps réel.

Dans ce chapitre, tu vas apprendre à :

    - Créer un serveur et un client en Java avec Socket et ServerSocket

    - Envoyer et recevoir des messages en texte

    - Gérer les flux réseau (InputStream, OutputStream)

    - Concevoir une communication bidirectionnelle
# Exercice 1 – Premier lien magique (serveur simple)

**Contexte narratif :**  
Tu ouvres un **portail de communication** pour permettre à d'autres mages de t’envoyer un message.

**Énoncé :**
1. Crée une classe `ServeurMagique`.
2. Écoute sur le port `5000` via un `ServerSocket`.
3. Accepte une connexion.
4. Lis un message texte envoyé par le client.
5. Affiche dans la console :

📩 Message reçu : <message>

6. Ferme les flux et la connexion proprement.

# Exercice 2 – L’émetteur de sort (client simple)

**Contexte narratif :**  
Tu veux envoyer un **sort de contact** à un autre mage via le réseau magique.

**Énoncé :**
1. Crée une classe `ClientMagique`.
2. Connecte-toi à `localhost` sur le port `5000`.
3. Envoie le message :

Salutations du mage Elion.

4. Ferme la connexion proprement.

**Remarque :**  
Lance d’abord le serveur de l’exercice 1 avant ce client.

# Exercice 3 – Réception améliorée (lecture ligne)

**Contexte narratif :**  
Ton cristal est maintenant capable de lire **plusieurs lignes** d’un message magique.

**Énoncé :**
1. Modifie `ServeurMagique` pour lire le message ligne par ligne via `BufferedReader`.
2. Continue jusqu’à ce que le client ferme la connexion.
3. Affiche chaque ligne reçue avec :

✉️ <ligne>
# Exercice 4 – Réponse magique (serveur qui répond)

**Contexte narratif :**  
Tu veux que le serveur **réponde** après avoir reçu un sort, comme un écho magique.

**Énoncé :**
1. Dans `ServeurMagique`, lis une ligne.
2. Réponds avec :

Bien reçu, mage.

3. Le client doit lire cette réponse et l’afficher dans sa console.

# Exercice 5 – Dialogue entre deux mages

**Contexte narratif :**  
Deux mages veulent discuter via un **canal magique** bidirectionnel.

**Énoncé :**
1. Le serveur lit un message, puis répond.
2. Le client envoie un message, puis lit la réponse.
3. Affiche dans le client :

Réponse du cristal : Bien reçu, mage.

4. Utilise `BufferedReader` et `PrintWriter` des deux côtés.

# Exercice 6 – Le cristal répétiteur (serveur echo en boucle)

**Contexte narratif :**  
Un cristal magique répète chaque incantation reçue, jusqu’à ce qu’on lui dise `"FIN"`.

**Énoncé :**
1. Le serveur reste actif après chaque message reçu.
2. Il répond toujours :

Vous avez dit : <message>

3. Il s’arrête si le client envoie `"FIN"`.
4. Le client peut donc envoyer plusieurs messages à la suite.

# Exercice 7 – Le serveur éternel

**Contexte narratif :**  
Un cristal plus avancé peut écouter plusieurs mages (un à la fois) sans jamais s’arrêter.

**Énoncé :**
1. Le serveur écoute en boucle.
2. À chaque connexion :
    - Il lit un message
    - Répond
    - Ferme la connexion
3. Puis il recommence.
4. Il ne s'arrête jamais tant qu’on ne tue pas le processus manuellement.

# Exercice 8 – Canal de noms de sorts

**Contexte narratif :**  
Un canal magique enregistre tous les sorts envoyés par les mages et les affiche à la réception.

**Énoncé :**
1. Le client demande à l’utilisateur de saisir un nom de sort dans la console (`Scanner`).
2. Il envoie ce nom au serveur.
3. Le serveur affiche :

Sort reçu : <nom>

4. Tu peux tester plusieurs fois avec des clients différents.

# Exercice 9 – Multiclient (version simple, séquentielle)

**Contexte narratif :**  
Un cristal gère une **file** de mages voulant s’exprimer les uns après les autres.

**Énoncé :**
1. Le serveur doit accepter plusieurs connexions **séquentielles**.
2. À chaque connexion :
    - Il lit un message
    - Répond `"Sort reçu avec succès."`
3. Il reste toujours actif.

**Remarque :**  
Chaque client devra se connecter après que le précédent ait terminé.

# Exercice 10 – Envoi de réponse personnalisée

**Contexte narratif :**  
Le cristal devine l’origine du message et personnalise sa réponse.

**Énoncé :**
1. Le client envoie : `"Je suis le mage <nom>."`
2. Le serveur lit la ligne et extrait le nom du mage.
3. Il répond :

Bienvenue, <nom>. Le Conseil t’écoute.

4. Exemple :

Bienvenue, Kaelis. Le Conseil t’écoute.
