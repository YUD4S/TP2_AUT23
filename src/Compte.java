public abstract class Compte {

    //Attributs
    protected int numeroNIP,numeroCompte;
    protected double soldeCompte,retraitMaximum,montantTransfertMaximum;

    //Constructeur
    public Compte(Client unClient, int numeroCompte, double soldeCompte, double retraitMaximum, double montantTransfertMaximum) {
        this.numeroNIP = unClient.getNumeroNIP();
        this.numeroCompte = numeroCompte;
        this.soldeCompte = soldeCompte;
        this.retraitMaximum = retraitMaximum;
        this.montantTransfertMaximum = montantTransfertMaximum;
    }

    //Accesseurs et muttateurs
    public int getNumeroNIP() {
        return numeroNIP;
    }

    public void setNumeroNIP(int numeroNIP) {
        this.numeroNIP = numeroNIP;
    }

    public int getNumeroCompte() {
        return numeroCompte;
    }

    public void setNumeroCompte(int numeroCompte) {
        this.numeroCompte = numeroCompte;
    }

    public double getSoldeCompte() {
        return soldeCompte;
    }

    public void setSoldeCompte(double soleCompte) {
        this.soldeCompte = soleCompte;
    }

    public double getRetraitMaximum() {
        return retraitMaximum;
    }

    public void setRetraitMaximum(double retraitMaximum) {
        this.retraitMaximum = retraitMaximum;
    }

    public double getMontantTransfertMaximum() {
        return montantTransfertMaximum;
    }

    public void setMontantTransfertMaximum(double montantTransfertMaximum) {
        this.montantTransfertMaximum = montantTransfertMaximum;
    }

    public void retrait(double montant) throws MontantSupException{
        if (montant > this.soldeCompte && montant%10 == 0) {
            this.soldeCompte -= montant;
        }else {
            throw new MontantSupException();
        }
    }

    public void depot(double montant){
        this.soldeCompte += montant;
    }

    //Affichage
    @Override
    public String toString() {
        return "Compte{" +
                "numeroNIP=" + numeroNIP +
                ", numeroCompte=" + numeroCompte +
                ", soldeCompte=" + soldeCompte +
                ", retraitMaximum=" + retraitMaximum +
                ", montantTransfertMaximum=" + montantTransfertMaximum +
                '}';
    }
}
