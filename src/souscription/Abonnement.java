package souscription;

public class Abonnement {
    public int prix;

    public Abonnement(Formule formule) {
        this.prix = formule.prix;
    }
}
