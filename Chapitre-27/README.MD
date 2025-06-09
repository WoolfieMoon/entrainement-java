# Chapitre 27 – Les Enclaves Cryptées : introduction au chiffrement et à la sécurité en Java

Dans les confins des Enclaves, les mages conservent les plus sombres secrets dans des coffres scellés par cryptomagie. Grâce à l’art du chiffrement, tu vas apprendre à protéger tes données, à sécuriser les échanges, et à maîtriser les fondements de la cryptographie avec Java.

**Objectifs pédagogiques**

Tu vas apprendre à :

    - Utiliser les classes de la bibliothèque javax.crypto

    - Appliquer des algorithmes de chiffrement symétrique (comme AES)

    - Gérer des clés secrètes et des vecteurs d’initialisation (IV)

    - Effectuer du hachage sécurisé (SHA-256)

    - Implémenter un système de mot de passe chiffré

    - Comprendre les bases de la cryptographie asymétrique

# Exercice 1 – Le Grimoire scellé

**Contexte narratif :**  
Tu découvres un ancien grimoire… mais ses pages sont chiffrées. Seule une clé secrète permet de les lire. Tu dois reproduire cette magie de verrouillage.

---

## Objectif

Utiliser le chiffrement **symétrique** avec l’algorithme AES.

---

## Consignes

- Demande à l’utilisateur une phrase secrète
- Utilise cette phrase pour générer une **clé AES**
- Chiffre une chaîne de texte (ex. un message ou mot de passe)
- Affiche le texte chiffré sous forme lisible (Base64)

# Exercice 2 – L’Incantation déchiffrée

**Contexte narratif :**  
Une fois le sort lancé, il faut être capable de **relire l’incantation**. Tu dois donc restaurer le texte chiffré à son état original.

---

## Objectif

Déchiffrer un texte précédemment chiffré avec AES.

---

## Consignes

- Réutilise la même clé AES que dans l’exercice 1
- Demande une entrée chiffrée en Base64
- Déchiffre le message et affiche le texte d’origine
- Gère les erreurs de déchiffrement si la clé est incorrecte

# Exercice 3 – Le Sceau d’intégrité

**Contexte narratif :**  
Certains grimoires contiennent des **sceaux d’intégrité** : s’ils sont altérés, leur contenu est corrompu. Tu vas créer ce sceau via un **hachage magique**.

---

## Objectif

Créer une **empreinte numérique** d’un texte avec SHA-256.

---

## Consignes

- Demande un texte quelconque à l’utilisateur
- Calcule le **hachage SHA-256** de ce texte
- Affiche le résultat en hexadécimal
- Toute modification du texte doit changer l’empreinte

# Exercice 4 – Le Coffre des Mots de Passe

**Contexte narratif :**  
Un coffre ne s’ouvre que si le mot de passe fourni produit la **même empreinte** que celui d’origine. Tu dois vérifier l’accès par hachage.

---

## Objectif

Comparer deux hachages pour vérifier un mot de passe.

---

## Consignes

- Demande un mot de passe initial, puis stocke son SHA-256
- Demande ensuite une saisie utilisateur
- Recalcule son hachage et compare-le au premier
- Affiche si l’accès est autorisé ou refusé

# Exercice 5 – Le Message dans l’Enveloppe

**Contexte narratif :**  
Tu dois transmettre un message en toute sécurité, sous une **enveloppe cryptée**. Ton rôle est de construire cette enveloppe, puis de la décoder.

---

## Objectif

Combiner **chiffrement + encodage** pour simuler un envoi sécurisé.

---

## Consignes

- Crée une méthode qui :
  - Chiffre un message avec AES
  - Encode le résultat en Base64
- Puis une autre méthode qui :
  - Décode Base64
  - Déchiffre le message
- Vérifie que l’aller-retour préserve le contenu

# Exercice 6 – Le Dé à 2048 Faces

**Contexte narratif :**  
Un artefact puissant génère une **clé unique de 2048 bits**. Cette clé peut être utilisée pour établir un lien magique asymétrique entre deux entités.

---

## Objectif

Générer une **paire de clés RSA**.

---

## Consignes

- Utilise `KeyPairGenerator` pour créer une paire de clés RSA (2048 bits)
- Affiche la clé publique et privée sous forme encodée (Base64 ou hexadécimale)
- Vérifie que la génération fonctionne sans erreur

# Exercice 7 – L’Anneau du Chiffrement Public

**Contexte narratif :**  
L’Anneau permet de **chiffrer un message** avec une clé publique. Seul le possesseur de la **clé privée** peut le lire. Tu dois recréer cette barrière.

---

## Objectif

Utiliser la **clé publique RSA** pour chiffrer un message.

---

## Consignes

- Utilise la clé publique générée précédemment
- Chiffre un message court (ex. "Gloire à l’Ordre")
- Affiche le résultat en Base64
- Le texte doit être illisible sans la clé privée

# Exercice 8 – Le Miroir Privé

**Contexte narratif :**  
Le message chiffré est reçu. Tu dois maintenant utiliser la **clé privée** pour révéler le contenu et **vérifier son intégrité**.

---

## Objectif

Déchiffrer un message RSA avec une **clé privée**.

---

## Consignes

- Utilise la clé privée RSA correspondante
- Déchiffre le texte encodé en Base64 (issu de l’exercice précédent)
- Vérifie que le texte original est bien restitué
- Affiche un message d’erreur si la clé est incorrecte

# Exercice 9 – Le Parchemin de Signature

**Contexte narratif :**  
Les Grands Mages signent leurs parchemins avec leur **empreinte magique**. Tu vas apprendre à **signer numériquement** un message.

---

## Objectif

Créer une **signature numérique** d’un message avec RSA.

---

## Consignes

- Utilise la clé privée RSA pour signer un message (texte)
- Utilise l’objet `Signature` avec `SHA256withRSA`
- Affiche la signature en Base64
- Le message ne doit pas être modifiable sans invalider la signature

# Exercice 10 – Le Vérificateur du Conseil

**Contexte narratif :**  
Avant de valider un message, le Conseil des Mages vérifie la **signature numérique**. Tu dois construire le **outil de vérification** officiel.

---

## Objectif

Vérifier une signature numérique avec une **clé publique**.

---

## Consignes

- Utilise la clé publique RSA
- Vérifie la validité de la signature associée à un message
- Affiche si le message est authentique ou non
- Gère les cas où le message a été modifié

