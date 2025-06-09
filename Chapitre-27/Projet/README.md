# Mini-projet – Le Coffre de l’Archimage

**Contexte narratif :**  
Dans les ruines de l’Académie d’Argom, un **coffre crypté** renferme les artefacts les plus dangereux. Seul un mage habilité, possédant le bon mot de passe ou la bonne clé, peut y accéder. Tu es chargé de recréer ce **coffre numérique scellé**, capable de stocker et protéger des données secrètes.

---

## Objectif

Créer une application console sécurisée permettant :
- de **chiffrer** et **stocker** des fichiers confidentiels
- de les **déverrouiller** après authentification
- et de **vérifier leur intégrité et leur authenticité**

---

## Fonctionnalités attendues

### 1. Système d’authentification
- Saisie d’un **mot de passe maître**
- Le mot de passe est **haché (SHA-256)** et comparé à celui enregistré
- L’utilisateur est refusé après plusieurs essais

---

### 2. Stockage de fichiers confidentiels
- L’utilisateur peut **chiffrer** un fichier avec AES (clé dérivée du mot de passe)
- Le fichier chiffré est sauvegardé dans un dossier sécurisé
- Affichage d’une **empreinte SHA-256** du fichier original

---

### 3. Déchiffrement sécurisé
- Le fichier peut être **déchiffré** uniquement si :
  - L’utilisateur saisit le bon mot de passe
  - Le fichier n’a pas été modifié
- Le système vérifie l’empreinte avant déchiffrement

---

### 4. Signatures (Bonus)
- Possibilité de **signer un fichier** avec RSA (clé privée)
- Et de **vérifier la signature** avec la clé publique
- Permet de garantir que le fichier provient du bon utilisateur

---

## Contraintes

- Aucune donnée ne doit être stockée en clair
- Utilisation de Java standard (`javax.crypto`, `MessageDigest`, `Signature`, etc.)
- Code clair, découpé, sécurisé (pas de divulgation d’erreurs sensibles)

---

## Objectif pédagogique

- Maîtriser le **chiffrement symétrique** (AES) et le **hachage sécurisé**
- Implémenter un système **d’accès protégé et contrôlé**
- Comprendre la notion de **signature et de vérification**
- Concevoir une mini-application de **coffre-fort numérique sécurisé**

