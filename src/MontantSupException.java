public class MontantSupException extends Exception{

    //Constructeur
    public MontantSupException() { super(); }

    //Affichage

    @Override
    public String getMessage() {
        return "Impossible! Le montant est supérieur à votre solde actuelle ou votre montant n'est pas multiple de zéro.";
    }
}
