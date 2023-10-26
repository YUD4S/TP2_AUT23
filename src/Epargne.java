public class Epargne extends Compte{

    ///Attributs
    private final double tauxInteret;

    //Constructeur
    public Epargne(Client unClient, int numeroCompte, double soldeCompte, double retraitMaximum, double montantTransfertMaximum, double tauxInteret) {
        super(unClient, numeroCompte, soldeCompte, retraitMaximum, montantTransfertMaximum);
        this.tauxInteret = tauxInteret;
    }

    //Accesseurs et mutateurs
    public double getTauxInteret() {
        return tauxInteret;
    }

    public void paimentInteret(){
        double montant = super.soldeCompte*this.tauxInteret;
        super.soldeCompte += montant;
    }

    //Affichage

    @Override
    public String toString() {
        return "Epargne{" +
                "tauxInteret=" + tauxInteret +
                ", numeroNIP=" + numeroNIP +
                ", numeroCompte=" + numeroCompte +
                ", soldeCompte=" + soldeCompte +
                ", retraitMaximum=" + retraitMaximum +
                ", montantTransfertMaximum=" + montantTransfertMaximum +
                '}';
    }
}
