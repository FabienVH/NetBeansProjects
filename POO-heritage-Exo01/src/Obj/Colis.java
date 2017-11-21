package Obj;

public class Colis extends ObjetPostal {
    private Float poids;

    public Colis(Float poids, String nomDestinataire, String adresseDestinataire, String cpDestinataire, String villeDestinataire, boolean recommande) {
        super(nomDestinataire, adresseDestinataire, cpDestinataire, villeDestinataire, recommande);
        this.poids = poids;
    }

    public Float getPoids() {
        return poids;
    }

    public void setPoids(Float poids) {
        this.poids = poids;
    }
    
    public Float PrixAffranchissementColis(){
         float prix = 0.8f;
        if (isRecommande() == true){
            prix = (((poids/100)-(poids%100))*0.8f) + 3.0f;
            
        }else{
            prix = ((poids/100)-(poids%100));
        }
        return PrixAffranchissementColis();
}
     
}
