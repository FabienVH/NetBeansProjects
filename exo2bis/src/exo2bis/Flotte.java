package exo2bis;

public class Flotte {

    private Voiture [] tableauVoiture;
    private String nom;

    public Flotte() {
        tableauVoiture = null;
        nom = "";

    }

    public Flotte(Voiture[] tableauVoiture, String nom) {
        this.tableauVoiture = tableauVoiture;
        this.nom = nom;
    }

    // methodes : accesseurs/getters + mutateurs/setters    
    public Voiture[] getTableauVoiture() {
        return tableauVoiture;
    }

    public void setTableauVoiture(Voiture[] tableauVoiture) {
        this.tableauVoiture = tableauVoiture;
    }
        
     public float getTaxeFlotte(Flotte) {
        float taxe1 = tableauVoiture[0].getTaxeVoiture();
        float taxe2 = tableauVoiture[1].getTaxeVoiture();
        return (taxe1 + taxe2);
    } 
    
    
}
