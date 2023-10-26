public class Banque extends Compte{

    // Attributs
    private final double montantMaximum, montantRemplissage;

    // Constructeur
    public Banque(Client unClient, int numeroCompte, double soldeCompte, double retraitMaximum, double montantTransfertMaximum, double montantMaximum, double montantRemplissage) {
        super(unClient, numeroCompte, soldeCompte, retraitMaximum, montantTransfertMaximum);
        this.montantMaximum = montantMaximum;
        this.montantRemplissage = montantRemplissage;
    }

    // Accesseurs et muttateurs

    public double getMontantMaximum() {
        return montantMaximum;
    }

    public double getMontantRemplissage() {
        return montantRemplissage;
    }

    public void remplirGuichet() {

    }

    // Affichage

    @Override
    public String toString() {
        return "Banque{" +
                "montantMaximum=" + montantMaximum +
                ", montantRemplissage=" + montantRemplissage +
                ", numeroNIP=" + numeroNIP +
                ", numeroCompte=" + numeroCompte +
                ", soldeCompte=" + soldeCompte +
                ", retraitMaximum=" + retraitMaximum +
                ", montantTransfertMaximum=" + montantTransfertMaximum +
                '}';
    }
}
