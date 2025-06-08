## Chapitre 18 – Les Reliques Animées : programmation orientée objet avancée (héritage, polymorphisme, interfaces)

Dans les profondeurs du Temple d’Arkanis, certaines reliques anciennes ont acquis une vie propre. Chacune agit selon des règles uniques : certaines peuvent être invoquées, d’autres protégées, d’autres encore obéissent à des ordres abstraits… Ce mystère s’explique par la magie des classes abstraites, de l’héritage, du polymorphisme, et des interfaces.

**Objectifs pédagogiques**

Tu vas apprendre à :

    - Utiliser des classes abstraites et les surcharger

    - Définir des interfaces et les faire implémenter

    - Mettre en place un polymorphisme propre

    - Structurer un code orienté objet avancé
# Exercice 1 – La Relique de base

**Contexte narratif :**  
Tu as découvert une relique magique oubliée. Tous les artefacts enchantés partagent des propriétés communes : un nom et une puissance brute. Tu vas créer une **classe de base abstraite** qui servira de modèle à toutes les reliques.

---

## Objectif

Créer une classe abstraite représentant une **Relique** dotée de propriétés de base.  
Cette classe servira à construire d'autres types de reliques dans les prochains exercices.

---

## Consignes

- Crée une classe abstraite `Relique`
- Elle doit posséder :
    - Un nom
    - Une puissance
- Elle doit obliger ses sous-classes à définir une méthode spéciale d’activation nommée `activer()`
- Crée au moins une sous-classe concrète (`Amulette`, `Talisman`…) qui hérite de `Relique`
- Instancie-la et affiche ses propriétés ainsi que le résultat de son activation

# Exercice 2 – Invocation polymorphe

**Contexte narratif :**  
Tu as réuni plusieurs reliques dans ton sac de mage. Elles réagissent toutes à la commande `activer()`, mais leur effet dépend de leur nature propre. Il est temps d’utiliser le **polymorphisme**.

---

## Objectif

Utiliser une liste de reliques différentes et les activer **polymorphiquement** via une même méthode.

---

## Consignes

- Reprends la classe `Relique` abstraite et deux sous-classes distinctes
- Crée une liste d’objets de type `Relique` contenant plusieurs instances différentes
- Parcours cette liste et appelle la méthode `activer()` sur chaque élément
- Affiche le nom de chaque relique et son effet magique retourné par `activer()`

# Exercice 3 – Interface : Canalisable

**Contexte narratif :**  
Certaines reliques peuvent être **canalisées** par les mages, amplifiant temporairement leur effet. Cette capacité est distincte de leur activation de base.

---

## Objectif

Créer une **interface** représentant une capacité spécifique, puis la faire implémenter par certaines reliques.

---

## Consignes

- Crée une interface `Canalisable` avec une méthode `canaliser()`
- Fais en sorte que **seules certaines** reliques implémentent cette interface
- Dans un programme principal, crée plusieurs reliques
- Si une relique est canalisable, appelle sa méthode `canaliser()` et affiche son effet spécial

# Exercice 4 – La commande de l’Ordre

**Contexte narratif :**  
L’Ordre des Maîtres veut imposer une norme : toute relique utilisée au sein du Conseil doit pouvoir fournir une **description** lisible.

---

## Objectif

Utiliser la méthode `toString()` pour fournir une représentation textuelle personnalisée de chaque relique.

---

## Consignes

- Redéfinis la méthode `toString()` dans les classes de reliques
- Pour chaque relique, affiche une description du type :

Relique : Talisman de Feu | Puissance : 90 | Canalisable : oui

- Utilise `instanceof` si besoin pour détecter si une relique est canalisable
- Teste l’affichage avec plusieurs reliques dans une liste

# Exercice 5 – L’épreuve des fragments

**Contexte narratif :**  
Les reliques les plus anciennes sont constituées de **fragments enchantés**. Chaque fragment a un effet propre. Tu dois créer une structure d’objet où une relique peut contenir plusieurs fragments.

---

## Objectif

Utiliser **la composition** pour intégrer d’autres objets dans une classe.

---

## Consignes

- Crée une classe `Fragment` avec un nom et un effet
- Crée une sous-classe de `Relique` capable de contenir une liste de `Fragment`
- Ajoute une méthode pour afficher tous les effets de ses fragments
- Active la relique et affiche ses fragments à l’activation


# Exercice 6 – La fusion des reliques

**Contexte narratif :**  
Deux anciennes reliques peuvent être **fusionnées** pour n’en former qu’une seule, plus puissante. L’Ordre veut une méthode standard pour fusionner ces objets mystiques.

---

## Objectif

Créer une méthode permettant de **fusionner deux reliques** et d’en produire une nouvelle.

---

## Consignes

- Crée une méthode statique ou d’instance dans une classe dédiée ou directement dans une sous-classe
- Cette méthode doit prendre deux reliques et retourner une nouvelle relique
- Le nom résultant peut être une concaténation ou une combinaison
- La puissance doit être la somme ou la moyenne des puissances
- Affiche le résultat de la fusion dans le programme principal

# Exercice 7 – Relique temporaire (classe anonyme)

**Contexte narratif :**  
Un mage nomade t’offre une **relique éphémère**, créée uniquement pour une occasion spéciale. Elle n’existe nulle part ailleurs et disparaîtra après une seule invocation.

---

## Objectif

Utiliser une **classe anonyme** pour créer une instance unique d’une relique personnalisée.

---

## Consignes

- Crée une instance de `Relique` sans créer de nouvelle classe nommée
- Fournis une implémentation directe de `activer()` dans cette instance
- Affiche le résultat de son activation dans la console
- Cette instance ne doit exister qu’une seule fois dans ton programme

# Exercice 8 – L’épreuve des Interfaces multiples

**Contexte narratif :**  
Certaines reliques appartiennent à plusieurs ordres à la fois. Par exemple, une **relique défensive** peut aussi être **canalisable**. Il faut qu’elle puisse répondre à plusieurs normes à la fois.

---

## Objectif

Utiliser **plusieurs interfaces** dans une même classe.

---

## Consignes

- Crée une seconde interface `Defensif` avec une méthode `proteger()`
- Crée une classe de relique qui implémente **à la fois** `Canalisable` et `Defensif`
- Crée un programme test qui :
    - Parcourt une liste de reliques
    - Invoque `canaliser()` si possible
    - Invoque `proteger()` si applicable

# Exercice 9 – L’Ordre des Reliques triées

**Contexte narratif :**  
Le Grand Inventaire des Reliques requiert qu’elles soient triées par puissance avant d’être enregistrées dans le Grimoire sacré.

---

## Objectif

Rendre tes objets `Relique` **triables** par puissance croissante.

---

## Consignes

- Implémente l’interface `Comparable<Relique>` dans la classe `Relique` ou via un `Comparator`
- Trie une liste de reliques par puissance ascendante
- Affiche le classement avec le nom et la puissance de chaque relique

# Exercice 10 – Inventaire polymorphe étendu

**Contexte narratif :**  
Tu veux maintenant gérer une collection de **reliques diverses**, en exploitant au maximum l’**héritage et les interfaces** définies dans ce chapitre.

---

## Objectif

Combiner tout ce que tu as appris pour créer un inventaire complexe et polymorphe.

---

## Consignes

- Crée une liste contenant plusieurs types de reliques : simples, canalisables, défensives, fusionnées…
- Utilise uniquement des variables de type `Relique` pour les stocker
- Parcours cette liste et invoque toutes les méthodes disponibles **via `instanceof` ou `interface`**
- Affiche clairement les capacités de chaque objet de l’inventaire

