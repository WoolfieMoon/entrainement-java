## Chapitre 20 – Les Enchâssements du Temps : introduction à la gestion de dates et temps en Java

Dans les ruines d’Horak'Tal, les mages du temps manipulent des dates anciennes, des instants figés, et des périodes mystérieuses. Grâce à l'art des Enchâssements du Temps, tu vas apprendre à manier les classes temporelles de Java : LocalDate, LocalTime, LocalDateTime, Duration, Period, DateTimeFormatter, etc.

**Objectifs pédagogiques**

Tu vas apprendre à :

    Créer et manipuler des objets dates, heures, timestamps

    Utiliser des opérations temporelles (ajouter, soustraire, comparer)

    Formater et parser des dates avec DateTimeFormatter

    Calculer des durées ou périodes entre deux moments
# Exercice 1 – L’Horloge du Sanctuaire

**Contexte narratif :**  
Au sommet du Sanctuaire de Cristal, une **horloge magique** marque le **moment exact de l’invocation**. Ton premier défi est de capturer l’instant présent dans un cristal temporel.

---

## Objectif

Créer et afficher l’**instant actuel** du système.

---

## Consignes

- Affiche la **date du jour**
- Affiche l’**heure actuelle**
- Affiche la **date et l’heure combinées**
- Vérifie que chaque valeur affichée correspond bien au moment d’exécution

# Exercice 2 – Le Calendrier des Anciens

**Contexte narratif :**  
Un vieux grimoire contient des **dates clés** : naissance de héros, fondation de guildes… Tu dois manipuler ces **dates historiques** pour en extraire des éléments précieux.

---

## Objectif

Créer une **date précise** et en extraire ses composantes.

---

## Consignes

- Crée une date arbitraire (ex. 17 mars 1320)
- Affiche :
    - Le jour
    - Le mois (en toutes lettres)
    - L’année
    - Le jour de la semaine
- Vérifie si la date est **dans le passé** ou **dans le futur**

# Exercice 3 – Le Sablier inversé

**Contexte narratif :**  
Un sablier enchanté mesure le **temps écoulé** depuis un ancien événement. Tu vas calculer la **durée** entre deux instants, et découvrir ce qu’il en reste.

---

## Objectif

Calculer le **temps écoulé** entre deux moments (en secondes, jours ou années).

---

## Consignes

- Crée deux dates : l’une ancienne (ex. 2000) et l’autre actuelle
- Calcule la **période** entre elles (nombre d’années, mois, jours)
- Calcule aussi une **durée** (en secondes ou minutes) si tu utilises deux `LocalDateTime`
- Affiche les résultats dans un format clair

# Exercice 4 – Les Portails Rythmés

**Contexte narratif :**  
Les portails magiques ne peuvent être ouverts que **tous les 30 jours**. Tu dois calculer **la date du prochain rituel**, et avertir si une invocation est trop précoce.

---

## Objectif

Utiliser les **opérations de date** pour ajouter ou comparer des jours.

---

## Consignes

- Crée une date correspondant à la **dernière activation**
- Calcule et affiche la **prochaine date possible d’activation**
- Crée une date "aujourd’hui" et compare-la :
    - Est-ce que le portail peut être rouvert ?
    - Si non, affiche combien de jours il reste à attendre

# Exercice 5 – L’Inscription temporelle

**Contexte narratif :**  
Un parchemin t’indique des dates **dans un format ancien** : `15-06-1257`. Tu dois apprendre à **lire et écrire** les dates dans le bon format magique.

---

## Objectif

Utiliser un **DateTimeFormatter** personnalisé pour formater ou parser une date.

---

## Consignes

- Crée une date dans un format texte (ex. `31-12-2024`)
- Parse-la en objet Java (en respectant le format)
- Reformate une date Java en texte au format :
    - `dd/MM/yyyy`
    - `EEEE dd MMMM yyyy` (ex. "vendredi 14 juin 2024")
- Affiche le résultat des conversions

# Exercice 6 – Le Compteur d’Incantations

**Contexte narratif :**  
Chaque invocation consomme du temps d’énergie. Tu dois créer un **compteur temporel** qui mesure exactement le **temps mis par un mage pour réciter un sort**.

---

## Objectif

Mesurer la **durée réelle** entre deux actions en millisecondes ou secondes.

---

## Consignes

- Récupère l’heure de départ
- Simule une attente ou demande une saisie manuelle
- Récupère l’heure de fin
- Calcule la durée écoulée entre les deux
- Affiche le résultat en secondes et millisecondes

# Exercice 7 – Le Rituel hebdomadaire

**Contexte narratif :**  
Un rituel sacré doit être effectué **chaque lundi à 7h00**. Tu dois détecter si une date proposée correspond bien au **moment rituel** exact.

---

## Objectif

Vérifier qu’un instant correspond exactement à un **jour et une heure** donnés.

---

## Consignes

- Crée un objet contenant une date et une heure
- Vérifie si le jour de la semaine est **lundi**
- Vérifie si l’heure est **7h00**
- Si ce n’est pas le cas, affiche ce qui ne correspond pas

# Exercice 8 – La clé du portail saisonnier

**Contexte narratif :**  
Certains portails ne peuvent s’ouvrir **qu’en hiver**. Tu dois créer un sort de validation temporelle pour **vérifier la saison** d’une date magique.

---

## Objectif

Analyser le **mois** d’une date pour en déduire la **saison magique**.

---

## Consignes

- Crée une date quelconque
- Déduis le mois et affecte-lui une saison :
    - Décembre à février → hiver
    - Mars à mai → printemps
    - Juin à août → été
    - Septembre à novembre → automne
- Affiche la saison correspondante

# Exercice 9 – L’Horloge inversée

**Contexte narratif :**  
Un artefact maudit recule le temps à chaque activation. Tu dois calculer une **date passée** en fonction d’une invocation et d’un recul temporel.

---

## Objectif

Soustraire des durées temporelles à une date existante.

---

## Consignes

- Crée une date de départ (actuelle ou fixe)
- Soustrais :
    - Un nombre de jours
    - Un nombre de mois
    - Un nombre d’années
- Affiche les différentes dates obtenues

# Exercice 10 – Le Cercle des Âges

**Contexte narratif :**  
Les archives de la Tour de l’Âge contiennent la date de naissance de tous les membres. Tu dois calculer l’**âge exact** d’un mage aujourd’hui, et prédire sa prochaine **célébration d’anniversaire**.

---

## Objectif

Calculer un **âge humain** à partir d’une date de naissance et prévoir la **prochaine date anniversaire**.

---

## Consignes

- Demande à l’utilisateur sa **date de naissance**
- Calcule son âge en années
- Affiche la **prochaine date anniversaire**
- Indique si l’anniversaire de cette année est déjà passé ou non

