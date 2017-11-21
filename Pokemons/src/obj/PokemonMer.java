package obj;

public class PokemonMer extends PokemonEau{

    public PokemonMer() {
    }

    public PokemonMer(int nbNageoires, String nom, float poids) {
        super(nbNageoires, nom, poids);
    }

     public float getVitesse(){
        float vitesse = getPoids()/25*getNbNageoires();
        return vitesse;
    }
    
    @Override
    public String toString() {
        return "\nJe suis le pokemon " +getNom()+ ", " + "mon poids est de " + getPoids()
                +"Kg, ma vitesse est de "+ getVitesse() +"km/h j'ai "+getNbNageoires()+" nageoires";
    }

    
}
