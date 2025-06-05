# Mini-projet – Le Codex des Sorciers

**Contexte narratif :**  
Dans les profondeurs de la Tour d’Émeraude repose le **Codex des Sorciers**, un livre sacré recensant tous les mages d’Aleboréa ainsi que leurs spécialités et puissances. Le Haut Conseil te confie la tâche de développer une version numérique de ce codex.

---

## Objectif

Créer une application console qui :
- Associe chaque nom de mage à sa spécialité
- Permet de rechercher un mage
- Trie les mages par nom
- Affiche proprement l’ensemble du registre

---

## Énoncé

1. Crée une classe `CodexSorcier` avec une méthode `main`.

2. Dans `main`, crée une `HashMap<String, String>` nommée `codex`.  
   Ajoute les mages suivants :
   - `"Eldros"` → `"Pyromancien"`
   - `"Lyana"` → `"Hydromancienne"`
   - `"Tharn"` → `"Nécromancien"`
   - `"Selmira"` → `"Illusionniste"`

3. Affiche tous les mages et leur spécialité, sous cette forme :

Eldros : Pyromancien
Lyana : Hydromancienne
...


4. Crée une méthode `chercherSorcier(Map<String, String> codex, String nom)` qui :
- Affiche : `"Spécialité de <nom> : <spécialité>"` si trouvé
- Sinon : `"Aucun sorcier nommé <nom>."`

5. Dans `main`, appelle cette méthode avec :
- `"Tharn"`
- `"Zerath"`

6. Trie les noms des mages par ordre alphabétique et affiche-les.

---

## Résultat attendu

Codex actuel :
Eldros : Pyromancien
Lyana : Hydromancienne
Tharn : Nécromancien
Selmira : Illusionniste

Recherche :
Spécialité de Tharn : Nécromancien
Aucun sorcier nommé Zerath.

Mages classés :
Eldros
Lyana
Selmira
Tharn

---

**Objectif pédagogique :**
- Manipuler `HashMap` avec clés et valeurs
- Rechercher une clé avec sécurité
- Trier les clés d’une map
- Consolider l’usage des maps dans une application complète

