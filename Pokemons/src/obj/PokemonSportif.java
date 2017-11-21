package obj;


public class PokemonSportif extends PokemonTerre{
    private int pulsation;

    public PokemonSportif() {
    }

    public PokemonSportif(int pulsation, int nbPattes, float taille, String nom, float poids) {
        super(nbPattes, taille, nom, poids);
        this.pulsation = pulsation;
    }

    public int getPulsation() {
        return pulsation;
    }

    public void setPulsation(int pulsation) {
        this.pulsation = pulsation;
    }

    @Override
    public String toString() {
        return "\nJe suis le pokemon " +getNom()+ ", " + "mon poids est de " + getPoids()
                +"Kg, ma vitesse est de "+ getVitesse() +"km/h j'ai "+getNbPattes()+" pattes,ma taille est de "+getTaille()
                +"m, ma frequence cardiaque est de "+pulsation+"pulsations /minutes";
    }

    
    
   
    
    
}
