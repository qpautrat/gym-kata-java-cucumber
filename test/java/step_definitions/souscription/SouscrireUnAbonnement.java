package step_definitions.souscription;

import io.cucumber.java.fr.Alors;
import io.cucumber.java.fr.Etque;
import io.cucumber.java.fr.Lorsqu;
import io.cucumber.java.fr.Soit;
import souscription.Abonnement;
import souscription.Formule;

import static org.junit.Assert.assertEquals;

public class SouscrireUnAbonnement {

    private Formule formule;
    private Abonnement abonnement;
    private boolean estEtudiant;

    @Soit(": Une formule mensuelle à {int} euros")
    public void uneFormuleMensuelleÀEuros(int prix) {
        formule = new Formule(prix, false);
    }

    @Soit(": Une formule annuelle à {int} euros")
    public void uneFormuleAnnuelleÀEuros(int prix) {
        formule = new Formule(prix, true);
    }

    @Etque(": La personne qui souscrit est un étudiant")
    public void laPersonneQuiSouscritEstUnÉtudiant() {
        estEtudiant = true;
    }

    @Lorsqu(": Un abonnement est souscrit")
    public void unAbonnementEstSouscrit() {
        abonnement = new Abonnement(formule, estEtudiant);
    }

    @Alors(": Le prix est de {int} euros")
    public void lePrixEstDeEuros(int prix) {
        assertEquals(prix, abonnement.prix);
    }
}
