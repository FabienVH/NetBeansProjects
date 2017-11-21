package exos2;

public class Flotte {

    private Voiture voiture01;
    private Voiture voiture02;
    private String nom;

    public Flotte() {
        voiture01 = null;
        voiture02 = null;
        nom = "";

    }

    public Flotte(Voiture voiture01, Voiture voiture02, String nom) {
        this.voiture01 = voiture01;
        this.voiture02 = voiture02;
        this.nom = nom;
    }

    // methodes : accesseurs/getters + mutateurs/setters    
    public Voiture getVoiture01() {
        return voiture01;
    }

    public void setVoiture01(Voiture voiture01) {
        this.voiture01 = voiture01;
    }
    public Voiture getVoiture02() {
        return voiture02;
    }

    public void setVoiture02(Voiture voiture02) {
        this.voiture01 = voiture02;
    }
    
     public float getTaxeFlotte(Voiture a, Voiture b) {
        float taxe1 = a.getTaxeVoiture();
        float taxe2 = b.getTaxeVoiture();
        return (taxe1 + taxe2);
    } 
    
    
}
