package souscription;

public class Abonnement {
    public int prix;

    public Abonnement(Formule formule, boolean estEtudiant) {
        this.prix = formule.prix;
        if (estEtudiant) {
            this.prix -= formule.prix * 0.2;
        } else if (formule.estAnuelle) {
            this.prix -= formule.prix * 0.1;
        }
    }
}
