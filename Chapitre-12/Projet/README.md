# Mini-projet – La Symphonie des Sorts

**Contexte narratif :**  
Au sommet de la **Tour de Verre**, un ancien rituel est sur le point d’être réactivé : la **Symphonie des Sorts**. Pour la première fois, plusieurs sorts doivent être lancés en parallèle avec précision, rythme, et coordination. Tu es chargé·e d’écrire ce chef-d’œuvre magique.

---

## Objectif

Créer un programme qui :
- Lance plusieurs sorts simultanément
- Affiche leur progression en parallèle
- Synchronise une fin de rituel coordonnée

---

## Énoncé

1. Crée une classe `SymphonieSorts`.

2. Crée une classe interne `SortEnChantement` qui implémente `Runnable`.  
   Elle reçoit un nom (`String`) et un délai (`int` millisecondes).  
   Dans `run()`, elle affiche 5 fois :

<nom> : phase <numéro>

avec un `sleep` du délai spécifié entre chaque.

3. Dans `main`, crée et démarre les sorts suivants :
- `"Feu"` avec délai 400 ms  
- `"Glace"` avec délai 600 ms  
- `"Éclair"` avec délai 300 ms

4. Chaque sort fonctionne dans son propre thread.

5. Une fois tous les sorts terminés, affiche :

🎇 Rituel terminé avec succès !


(Utilise `join()` pour attendre tous les threads)

---

## Exemple de sortie attendue

Feu : phase 1
Éclair : phase 1
Glace : phase 1
Éclair : phase 2
Feu : phase 2
Éclair : phase 3
...
🎇 Rituel terminé avec succès !

---

## Objectif pédagogique :
- Créer plusieurs threads avec des délais différents
- Utiliser des classes internes paramétrées
- Synchroniser la fin de plusieurs exécutions (`join`)
- Visualiser un traitement parallèle bien structuré

