public class Client {

    // Les attributs
    private String codeClient,nom,prenom,telephone,courriel;
    private int numeroNIP;
    private static int addittion;

    //Constructeur

    public Client(String codeClient, String nom, String prenom, String telephone, String courriel) {
        this.codeClient = codeClient;
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
        this.courriel = courriel;
        this.numeroNIP = ++addittion;
    }


    //Accesseurs et mutatteurs

    public String getCodeClient() {
        return codeClient;
    }

    public void setCodeClient(String codeClient) {
        this.codeClient = codeClient;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getCourriel() {
        return courriel;
    }

    public void setCourriel(String courriel) {
        this.courriel = courriel;
    }

    public int getNumeroNIP() {
        return numeroNIP;
    }

    public void setNumeroNIP(int numeroNIP) {
        this.numeroNIP = numeroNIP;
    }

    //Affichage

    @Override
    public String toString() {
        return "Client{" +
                "codeClient='" + codeClient + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", telephone='" + telephone + '\'' +
                ", courriel='" + courriel + '\'' +
                ", numeroNIP=" + numeroNIP +
                '}';
    }
}
