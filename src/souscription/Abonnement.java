package souscription;

public class Abonnement {
    public int prix;

    public Abonnement(Formule formule) {
        this.prix = formule.prix;
        if (formule.estAnuelle) {
            this.prix -= formule.prix * 0.1;
        }
    }
}
