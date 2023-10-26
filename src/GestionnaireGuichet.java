import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GestionnaireGuichet {
    private Banque banque;
    private List<Client> clients;
    private List<Cheque> Cheque;
    private List<Epargne> Epargne;
    private List<Marge> Marge;
    private List<Hypothecaire> Hypothecaire;
    private List<Transaction> transactions;
    private double soldeCompteCourant;

    public GestionnaireGuichet(Banque banque) {
        this.banque = banque;
        this.clients = new ArrayList<>();
        this.Cheque = new ArrayList<>();
        this.Epargne = new ArrayList<>();
        this.Marge = new ArrayList<>();
        this.Hypothecaire = new ArrayList<>();
        this.transactions = new ArrayList<>();
        this.soldeCompteCourant = 0.0;
    }

    public Client validerUtilisateur(String nom, int nip) {
        Client unClient = null;
        for (Client client : clients) {
            if (client.getNom().equals(nom) && client.getNumeroNIP() == nip) {
                unClient = client;
            }
        }
        return unClient;
    }

    // public double retraitCheque(int nip, float montant) throws MontantSupException{
    //     double unMontant = 0.0;
    //     for(Cheque unCheque : Cheque){
    //         if(unCheque.getNumeroNIP() == nip){
    //             unCheque.retrait(montant);
    //             unMontant = unCheque.getSoldeCompte();
    //         }
    //     }
    //     return unMontant;
    // }

    // private Cheque getCompteCheque(Client client) {
    // }


    // public double retraitEpargne(String nip, double montant) {
    //     Client client = validerUtilisateur(nip);
    //     if (client != null) {
    //         Epargne compteEpargne = getCompteEpargne(client);
    //         if (compteEpargne != null && montant % 10 == 0 && montant <= compteEpargne.getSolde()) {
    //             compteEpargne.retirer(montant);
    //             transactions.add(new Transaction(client, montant, compteEpargne, TypeCompte.EPARGNE));
    //             soldeCompteCourant -= montant;
    //             return compteEpargne.getSolde();
    //         }
    //     }
    //     return -1.0; // Retourne -1 pour un retrait invalide
    // }

    // // private Epargne getCompteEpargne(Client client) {
    // // }

    // public double depotCheque(String nip, double montant) {
    //     Client client = validerUtilisateur(nip);
    //     if (client != null) {
    //         Cheque compteCheque = getCompteCheque(client);
    //         if (compteCheque != null && montant > 0) {
    //             compteCheque.deposer(montant);
    //             transactions.add(new Transaction(client, montant, compteCheque, TypeCompte.CHEQUE));
    //             soldeCompteCourant += montant;
    //             return compteCheque.getSolde();
    //         }
    //     }
    //     return -1.0; // Retourne -1 pour un dépôt invalide
    // }

    // public double depotEpargne(String nip, double montant) {
    //     Client client = validerUtilisateur(nip);
    //     if (client != null) {
    //         Epargne compteEpargne = getCompteEpargne(client);
    //         if (compteEpargne != null && montant > 0) {
    //             compteEpargne.deposer(montant);
    //             transactions.add(new Transaction(client, montant, compteEpargne, TypeCompte.EPARGNE));
    //             soldeCompteCourant += montant;
    //             return compteEpargne.getSolde();
    //         }
    //     }
    //     return -1.0; // Retourne -1 pour un dépôt invalide
    // }

    // public boolean paiementFacture(String nip, double montant) {
    //     Client client = validerUtilisateur(nip);
    //     if (client != null) {
    //         Cheque compteCheque = getCompteCheque(client);
    //         if (compteCheque != null && montant > 0) {
    //             if (compteCheque.getSolde() >= montant + Cheque.getFraisPaiementFacture()) {
    //                 compteCheque.retirer(montant + Cheque.getFraisPaiementFacture());
    //                 transactions.add(new Transaction(client, montant + Cheque.getFraisPaiementFacture(), compteCheque, TypeCompte.CHEQUE));
    //                 soldeCompteCourant -= montant + Cheque.getFraisPaiementFacture();
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }

    // public boolean transfertFonds(String nip, double montant, TypeCompte typeCompte) {
    //     Client client = validerUtilisateur(nip);
    //     if (client != null) {
    //         Compte source = null;
    //         Compte destination = null;

    //         // Identifie le compte source et le compte destination en fonction du type de compte spécifié.
    //         switch (typeCompte) {
    //             case "CHEQUE":
    //                 source = getCompteCheque(client);
    //                 break;
    //             case "EPARGNE":
    //                 source = getCompteEpargne(client);
    //                 break;
    //             case "HYPOTHECAIRE":
    //                 destination = getCompteHypothecaire(client);
    //                 break;
    //             case "MARGE":
    //                 destination = getCompteMarge(client);
    //                 break;
    //         }

    //         // Effectue le transfer si les compte source et destination sont valide.
    //         if (source != null && destination != null && montant > 0 && source.getSolde() >= montant) {
    //             source.retirer(montant);
    //             destination.deposer(montant);
    //             transactions.add(new Transaction(client, montant, destination, typeCompte));
    //             return true;
    //         }
    //     }
    //     return false;
    // }

    // private Compte getCompteHypothecaire(Client client) {
    // }

    // public double afficheSoldeCompte() {
    //     // Code pour afficher le solde du compte courant du clinsh
    //     return soldeCompteCourant;
    // }

    // public Client creerClient(String codeClient, String nom, String prenom, String telephone, String courriel, String numeroNIP) {
    //     Client nouveauClient = new Client(codeClient, nom, prenom, telephone, courriel, numeroNIP);
    //     clients.add(nouveauClient);
    //     return nouveauClient;
    // }

    // public void creerCompte() {
    //     switch (typeCompte) {
    //         case CHEQUE:
    //             Cheque compteCheque = new Cheque(client);
    //             comptesCheque.add(compteCheque);
    //             break;
    //         case EPARGNE:
    //             Epargne compteEpargne = new Epargne(client);
    //             comptesEpargne.add(compteEpargne);
    //             break;
    //         case HYPOTHECAIRE:
    //             Hypothecaire compteHypothecaire = new Hypothecaire(client);
    //             comptesHypothecaire.add(compteHypothecaire);
    //             break;
    //         case MARGE:
    //             Marge compteMarge = new Marge(client);
    //             comptesMarge.add(compteMarge);
    //             break;
    //     }
    // }
}
