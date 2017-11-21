package exo2bis;



public class Voiture {

// propriétés / attributs ----------   
    private String marque;
    private int cylindree;
    private float taxe;

    public Voiture() {
        marque = "";
        cylindree = 0;
        taxe = 0.0f;
    }

    // methodes : accesseurs/getters + mutateurs/setters    
    public String getMarque(String marque) {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public int getCylindree(int cylindree) {
        return cylindree;
    }

    public void setCylindree(int cylindree) {
        this.cylindree = cylindree;
    }

// methodes / comportements / operations   
    public String toString() {
        String s = "Vous avez une " + marque + " de cylindree " + cylindree;
        return s;
    }

    public float getTaxeVoiture() {
        if (cylindree <= 1600) {
            taxe = 300.0f;
        } else if (cylindree <= 2300) {
            taxe = 500.0f;
        } else {
            taxe = 700.0f;
        }
        return taxe;
    }
}
