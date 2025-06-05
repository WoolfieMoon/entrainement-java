# Mini-projet – Le Canal des Mages

**Contexte narratif :**  
Un grand rituel est en préparation : chaque guilde doit **envoyer son message** au Conseil via un **canal magique sécurisé**. Ce canal prend la forme d’un **serveur** capable de recevoir les messages de chaque guilde et de leur répondre. Le but : établir une **communication bidirectionnelle** robuste et interactive.

---

## Objectif

Créer une application client/serveur en Java qui :
- Accepte plusieurs connexions séquentielles
- Permet aux clients d’envoyer leur nom et un message
- Le serveur affiche le tout dans sa console
- Le serveur répond à chaque guilde avec un message personnalisé

---

## Énoncé

1. Crée une classe `ServeurCanal`.  
   - Elle écoute sur le port `6000`  
   - À chaque connexion :
     - Lit deux lignes :
       - Ligne 1 : nom du mage
       - Ligne 2 : message magique
     - Affiche dans la console :
       ```
       📜 Message de <nom> : <message>
       ```
     - Envoie une réponse :
       ```
       🔮 Conseil : Message reçu, <nom>.
       ```
     - Puis ferme la connexion

2. Crée une classe `ClientGuilde`.  
   - Demande à l’utilisateur de saisir son nom et son message dans la console (`Scanner`)  
   - Envoie les deux lignes au serveur  
   - Attend la réponse et l’affiche

---

## Exemple d'exécution

**Console serveur :**

📜 Message de Eldrien : Nous sommes prêts pour le rituel.
📜 Message de Thaliel : Les artefacts sont sécurisés.


**Console client :**

Nom du mage : Eldrien
Message magique : Nous sommes prêts pour le rituel.
🔮 Conseil : Message reçu, Eldrien.


---

## Bonus possible :
- Ajouter une date/heure d’envoi dans le serveur  
- Écrire tous les messages dans un fichier `journal.txt`  
- Autoriser plusieurs clients en parallèle via `Thread` (niveau avancé)

---

## Objectif pédagogique :
- Créer une communication réseau avec `Socket` / `ServerSocket`  
- Gérer flux texte avec `BufferedReader` et `PrintWriter`  
- Construire une interaction bidirectionnelle propre  
- Mettre en place un protocole simple basé sur les lignes

