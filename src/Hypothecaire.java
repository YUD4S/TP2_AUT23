public class Hypothecaire extends Compte{

    // Constructeur
    public Hypothecaire(Client unClient, int numeroCompte, double soldeCompte, double retraitMaximum, double montantTransfertMaximum) {
        super(unClient, numeroCompte, soldeCompte, retraitMaximum, montantTransfertMaximum);
    }

    // Accesseurs
    public void preleverMontantHypotheque() {

    }

    // Affichage
    @Override
    public String toString() {
        return "Hypothecaire{" +
                "numeroNIP=" + numeroNIP +
                ", numeroCompte=" + numeroCompte +
                ", soldeCompte=" + soldeCompte +
                ", retraitMaximum=" + retraitMaximum +
                ", montantTransfertMaximum=" + montantTransfertMaximum +
                '}';
    }
}
