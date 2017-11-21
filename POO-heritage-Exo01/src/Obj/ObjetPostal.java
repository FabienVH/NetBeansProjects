package Obj;

public abstract class ObjetPostal {

    private String nomDestinataire;
    private String adresseDestinataire;
    private String cpDestinataire;
    private String villeDestinataire;
    private boolean recommande;

    /*
     On devra munir cette classe des méthodes suivantes : 
     - un constructeur, 
     - une méthode toString pour toutes les données membres. 
     Attention, la classe ObjetPostal ne correspond en réalité à aucun objet existant, elle ne fait que 
     rassembler les caractéristiques communes à tous les objets postaux réellement manipulés par 
     l'application, qui seront des instances des classes Lettre et Colis que nous allons définir ci
     dessous. 
    
     */
    // constructeurs
    public ObjetPostal() {
        nomDestinataire = "";
        adresseDestinataire = "";
        cpDestinataire = "";
        villeDestinataire = "";
        recommande = false;
    }

    public ObjetPostal(String nomDestinataire, String adresseDestinataire, String cpDestinataire, String villeDestinataire, boolean recommandé) {
        this.nomDestinataire = nomDestinataire;
        this.adresseDestinataire = adresseDestinataire;
        this.cpDestinataire = cpDestinataire;
        this.villeDestinataire = villeDestinataire;
        this.recommande = recommandé;
    }

    public String getNomDestinataire() {
        return nomDestinataire;
    }

    public void setNomDestinataire(String nomDestinataire) {
        this.nomDestinataire = nomDestinataire;
    }

    public String getAdresseDestinataire() {
        return adresseDestinataire;
    }

    public void setAdresseDestinataire(String adresseDestinataire) {
        this.adresseDestinataire = adresseDestinataire;
    }

    public String getCpDestinataire() {
        return cpDestinataire;
    }

    public void setCpDestinataire(String cpDestinataire) {
        this.cpDestinataire = cpDestinataire;
    }

    public String getVilleDestinataire() {
        return villeDestinataire;
    }

    public void setVilleDestinataire(String villeDestinataire) {
        this.villeDestinataire = villeDestinataire;
    }

    public boolean isRecommande() {
        return recommande;
    }

    public void setRecommande(boolean recommande) {
        this.recommande = recommande;
    }

    
    public String toString() {
        return "ObjetPostal{" + "nomDestinataire=" + nomDestinataire + ", adresseDestinataire=" + adresseDestinataire + ", cpDestinataire=" + cpDestinataire + ", villeDestinataire=" + villeDestinataire + ", recommande=" + recommande + '}';
    }
    

}
