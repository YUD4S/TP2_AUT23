public class Marge extends Compte{

    // Attribut
    private final double tauxInteret;

    // Constructeur
    public Marge(Client unClient, int numeroCompte, double soldeCompte, double retraitMaximum, double montantTransfertMaximum, double tauxInteret) {
        super(unClient, numeroCompte, soldeCompte, retraitMaximum, montantTransfertMaximum);
        this.tauxInteret = tauxInteret;
    }

    // Muttateur
    public void augmenterSoldeMarge() {

    }

    //Affichage
    @Override
    public String toString() {
        return "Marge{" +
                "tauxInteret=" + tauxInteret +
                ", numeroNIP=" + numeroNIP +
                ", numeroCompte=" + numeroCompte +
                ", soldeCompte=" + soldeCompte +
                ", retraitMaximum=" + retraitMaximum +
                ", montantTransfertMaximum=" + montantTransfertMaximum +
                '}';
    }
}
