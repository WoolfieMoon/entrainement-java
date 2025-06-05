# Mini-projet – Le Grimoire du Savoir Runique

**Contexte narratif :**  
Le Haut Scriptorium te confie une mission sacrée : créer un **grimoire numérique** qui permet d’enregistrer, lire, filtrer et archiver les sortilèges d’Aleboréa. Ce grimoire doit être capable de manipuler les sorts comme s’ils étaient vivants.

---

## Objectif

Créer un programme qui :
- Enregistre une liste de sorts dans un fichier
- Affiche les sorts à la demande
- Recherche les sorts commençant par une lettre
- Génère une version propre et archivée

---

## Énoncé

1. Crée une classe `GrimoireRunique`.

2. Crée une méthode `enregistrerSorts(List<String> sorts)` qui écrit chaque sort dans `grimoire.txt`.

3. Dans `main`, crée une liste contenant :
   - `"Invisibilité"`
   - `"Invocation"`
   - `"Illusion"`
   - `"Explosion"`
   - `"Glaciation"`

4. Appelle `enregistrerSorts(...)`.

5. Crée une méthode `afficherGrimoire()` qui lit le fichier `grimoire.txt` et affiche toutes les lignes.

6. Crée une méthode `filtrerSortsParLettre(char lettre)` qui affiche uniquement les sorts commençant par cette lettre.

7. Crée une méthode `archiverMajuscules()` qui crée un fichier `grimoire_archivage.txt` avec tous les sorts en MAJUSCULES, sans doublon (utilise un `Set`).

---

## Résultat attendu

Sorts enregistrés dans grimoire.txt.

Contenu du grimoire :
Invisibilité
Invocation
Illusion
Explosion
Glaciation

Sorts commençant par I :
Invisibilité
Invocation
Illusion

Grimoire archivé avec succès.


---

**Objectif pédagogique :**
- Écriture et lecture de fichiers avec `FileWriter` / `BufferedReader`
- Manipulation de collections pour traiter le contenu
- Utilisation de `Set` pour filtrer les doublons
- Construction d’un mini-système d’archivage magique

