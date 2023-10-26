public class Transaction {

    // Attributs
    private int numeroTransaction;
    private static int addition;
    private double montant;
    Compte compte, compteTransfert;
    String type;

    // Constructeur
    public Transaction(double montant, Compte compte, Compte compteTransfert, String type) {
        this.numeroTransaction = ++addition;
        this.montant = montant;
        this.compte = compte;
        this.compteTransfert = compteTransfert;
        this.type = type;
    }

    // Accessuers et muttateurs
    public int getNumeroTransaction() {
        return numeroTransaction;
    }

    public void setNumeroTransaction(int numeroTransaction) {
        this.numeroTransaction = numeroTransaction;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(float montant) {
        this.montant = montant;
    }

    public Compte getCompte() {
        return compte;
    }

    public void setCompte(Compte compte) {
        this.compte = compte;
    }

    public Compte getCompteTransfert() {
        return compteTransfert;
    }

    public void setCompteTransfert(Compte compteTransfert) {
        this.compteTransfert = compteTransfert;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    //Affichage

    @Override
    public String toString() {
        return "Transaction{" +
                "numeroTransaction=" + numeroTransaction +
                ", montant=" + montant +
                ", compte=" + compte +
                ", compteTransfert=" + compteTransfert +
                ", type='" + type + '\'' +
                '}';
    }
}
