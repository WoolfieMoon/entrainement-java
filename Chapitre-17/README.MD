## Chapitre 17 – Les Arcanes du Web : introduction à Java Spring Boot

Au cœur des Citadelles Reliées, les mages les plus avancés ne se contentent plus de lancer des sorts dans le vide : ils les exposent sous forme de portails web. Grâce à l’art ancien du Spring Boot, tu vas apprendre à bâtir des services REST, les publier, et permettre aux autres guildes de les invoquer à distance.

Dans ce chapitre, tu vas apprendre à :

    - Créer un projet Spring Boot simple avec Maven

    - Définir un contrôleur REST (@RestController)

    - Répondre à des requêtes HTTP (GET, POST, etc.)

    - Tester tes endpoints dans un navigateur ou avec Postman
# Exercice 1 – L’invocation du projet magique (création Spring Boot)

**Contexte narratif :**  
Le grimoire numérique de la guilde doit maintenant être **accessible depuis le réseau magique**. Pour cela, tu vas invoquer les fondations d’un projet Spring Boot.

**Énoncé :**
1. Crée un projet Spring Boot avec Maven (en ligne ou avec IntelliJ/STS).
2. Nomme le projet `grimoire-web`.
3. Ajoute la dépendance `spring-boot-starter-web`.
4. Lance l’application et affiche dans la console :

🌀 Le portail du Grimoire est ouvert.
# Exercice 2 – Premier sort REST (Hello World)

**Contexte narratif :**  
Tu ouvres un **endroit magique** que d’autres mages peuvent invoquer à distance.

**Énoncé :**
1. Crée une classe `SortController` annotée avec `@RestController`.
2. Ajoute une méthode :
   ```java
   @GetMapping("/salutation")
   public String saluer() {
       return "✨ Salutations depuis le Grimoire !";
   }
3. Lance l’application et accède à http://localhost:8080/salutation pour tester.
# Exercice 3 – Sort avec paramètre

**Contexte narratif :**  
Un mage peut maintenant invoquer un sort avec son nom pour une réponse personnalisée.

**Énoncé :**
1. Dans `SortController`, ajoute :
   ```java
   @GetMapping("/saluer/{nom}")
   public String saluerMage(@PathVariable String nom) {
       return "Bienvenue, " + nom + " !";
   }
2. Accède à http://localhost:8080/saluer/Kaelis

3. Le résultat doit être :

Bienvenue, Kaelis !
# Exercice 4 – Sort JSON (objet retourné)

**Contexte narratif :**  
Tu veux renvoyer un **sortilège** sous forme d’objet, pour que d’autres guildes puissent le lire via un portail standardisé.

**Énoncé :**
1. Crée une classe `Sort` avec `nom` et `puissance`.
2. Dans `SortController`, ajoute :
   ```java
   @GetMapping("/sort")
   public Sort donnerSort() {
       return new Sort("Éclair", 90);
   }
3. Lance l’app et accède à /sort
4. Résultat attendu :

{
"nom": "Éclair",
"puissance": 90
}
# Exercice 5 – Enregistrement de sort (POST JSON)

**Contexte narratif :**  
Les guildes veulent t’envoyer de nouveaux sorts pour qu’ils soient enregistrés dans ton Grimoire.

**Énoncé :**
1. Dans `SortController`, ajoute :
   ```java
   @PostMapping("/sort")
   public String enregistrerSort(@RequestBody Sort sort) {
       return "📝 Sort reçu : " + sort.getNom() + " (" + sort.getPuissance() + ")";
   }

2. Envoie une requête POST avec Postman ou curl :

{
"nom": "Feu",
"puissance": 100
}

3. Résultat attendu :

📝 Sort reçu : Feu (100)
# Exercice 6 – Grimoire de sorts (liste de plusieurs objets)

**Contexte narratif :**  
Le Grimoire Web doit permettre de consulter une **liste complète** de sorts accessibles à distance.

**Énoncé :**
1. Dans `SortController`, crée une méthode :
   ```java
   @GetMapping("/grimoires")
   public List<Sort> tousLesSorts() {
       return List.of(
           new Sort("Éclair", 90),
           new Sort("Feu", 100),
           new Sort("Invisibilité", 60)
       );
   }
2. Accède à http://localhost:8080/grimoires
3. Le JSON doit contenir un tableau d’objets sortilèges.
# Exercice 7 – Accès aux sorts par ID (paramètre dans URL)

**Contexte narratif :**  
Chaque sort est maintenant **identifié par un numéro** dans le Grimoire central.

**Énoncé :**
1. Crée une méthode dans `SortController` :
   ```java
   @GetMapping("/sort/{id}")
   public Sort getSortById(@PathVariable int id) {
       List<Sort> sorts = List.of(
           new Sort("Éclair", 90),
           new Sort("Feu", 100),
           new Sort("Invisibilité", 60)
       );
       return sorts.get(id);
   }

2. Accède à /sort/0, /sort/1 etc.
3. Chaque appel retourne un objet JSON différent.
# Exercice 8 – Réponses magiques conditionnelles

**Contexte narratif :**  
Certains sortilèges envoyés à travers le portail sont **trop faibles** pour être enregistrés dans le Grimoire. Le système doit **les refuser** et avertir le mage expéditeur.

---

## Objectif

Créer une route `POST` qui :
- Reçoit un `Sort` en JSON
- Vérifie la puissance du sort
- Retourne une réponse texte différente selon la puissance

---

## Énoncé technique

1. Dans `SortController`, ajoute la méthode suivante :
   ```java
   @PostMapping("/sort-verification")
   public String verifierSort(@RequestBody Sort sort) {
       if (sort.getPuissance() < 50) {
           return "⚠️ Ce sort est trop faible.";
       } else {
           return "✅ Sort enregistré avec succès.";
       }
   }

2. Envoie une requête POST à /sort-verification avec ce JSON :

{
"nom": "Illusion",
"puissance": 30
}

Réponse attendue :

⚠️ Ce sort est trop faible.

3. Envoie ensuite :

{
"nom": "Explosion",
"puissance": 95
}

Réponse attendue :

✅ Sort enregistré avec succès.

4. Remplace la méthode par un ResponseEntity<String> pour renvoyer un code HTTP spécifique :

@PostMapping("/sort-verification")
public ResponseEntity<String> verifierSort(@RequestBody Sort sort) {
if (sort.getPuissance() < 50) {
return ResponseEntity.badRequest().body("⚠️ Ce sort est trop faible.");
} else {
return ResponseEntity.ok("✅ Sort enregistré avec succès.");
}
}

# Exercice 9 – Création d’un service (classe métier)

**Contexte narratif :**  
Tu veux **séparer les responsabilités** : les sorts seront gérés par un **mage archiviste** (service).

**Énoncé :**
1. Crée une classe `SortService` avec :
    - Une méthode `List<Sort> getAllSorts()`

2. Dans `SortController`, injecte `SortService` avec `@Autowired`
3. La méthode `/grimoires` appelle désormais `getAllSorts()` du service

**But :**  
Appliquer la séparation Contrôleur / Service

# Exercice 10 – Base temporaire en mémoire

**Contexte narratif :**  
Tu veux **stocker temporairement** les sorts envoyés pour les restituer plus tard.

**Énoncé :**
1. Dans `SortService`, crée une `List<Sort>` en tant qu’attribut
2. Ajoute une méthode `addSort(Sort s)` et une méthode `getAllSorts()`
3. Le `POST /sort` ajoute un sort à la liste
4. Le `GET /grimoires` retourne tous les sorts enregistrés depuis le démarrage

**Attention :**  
Les données sont perdues si on redémarre, car il s'agit d'une mémoire **transitoire**

