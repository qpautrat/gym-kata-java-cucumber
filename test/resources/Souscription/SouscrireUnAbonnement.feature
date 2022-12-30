# language: fr

  Fonctionnalité: Souscrire un abonnement

    La souscription est la source de revenu principal de la société.
    Les personnes peuvent souscrire un abonnement en fonction des formules proposées.
    Certaines réductions sur le prix peuvent s'appliquer:
      - Un abonnement annuel bénéficie de 10% de réduction
      - Un étudiant bénéficie de 20% de réduction, peu importe le type d'abonnement

    Attention toutefois, les réductions ne peuvent se cumulées.
    La plus grosse réduction prend la priorité.

    Règle: Aucune réduction si mensuel et non étudiant
      Exemple: Une souscription à une formule mensuelle à 30 euros coûte 30 euros par mois
        Soit : Une formule mensuelle à 30 euros
        Lorsqu': Un abonnement est souscrit
        Alors : Le prix est de 30 euros

    Règle: Réduction annuelle de 10%
      Exemple: Une souscription à une formule annuelle à 300 euros coûte 270 euros
        Soit : Une formule annuelle à 300 euros
        Lorsqu': Un abonnement est souscrit
        Alors : Le prix est de 270 euros