public class Cheque extends Compte{

    //Attributs
    private final double fraisPaiementFacture;
    private final double montantFactureMaximum;

    //Constructeur
    public Cheque(Client unClient, int numeroCompte, double soldeCompte, double retraitMaximum, double montantTransfertMaximum, double fraisPaiementFacture, double montantFactureMaximum) {
        super(unClient, numeroCompte, soldeCompte, retraitMaximum, montantTransfertMaximum);
        this.fraisPaiementFacture = fraisPaiementFacture;
        this.montantFactureMaximum = montantFactureMaximum;
    }

    //Accesseurs et mutateurs

    public double getFraisPaiementFacture() {
        return fraisPaiementFacture;
    }


    public double getMontantFactureMaximum() {
        return montantFactureMaximum;
    }


    public void paiementFacture(double montant){
        super.setSoldeCompte(super.getSoldeCompte() - (montant + 1.25));
    }

    //Affichage

    @Override
    public String toString() {
        return "Cheque{" +
                "fraisPaiementFacture=" + fraisPaiementFacture +
                ", montantFactureMaximum=" + montantFactureMaximum +
                ", numeroNIP=" + numeroNIP +
                ", numeroCompte=" + numeroCompte +
                ", soldeCompte=" + soldeCompte +
                ", retraitMaximum=" + retraitMaximum +
                ", montantTransfertMaximum=" + montantTransfertMaximum +
                '}';
    }
}
