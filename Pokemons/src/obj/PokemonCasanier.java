package obj;

public class PokemonCasanier extends PokemonTerre{
    private int nbHeuresTv;

    public PokemonCasanier() {
    }

    public PokemonCasanier(int nbHeuresTv, int nbPattes, float taille, String nom, float poids) {
        super(nbPattes, taille, nom, poids);
        this.nbHeuresTv = nbHeuresTv;
    }

    @Override
    public String toString() {
        return "\nJe suis le pokemon " +getNom()+ ", " + "mon poids est de " + getPoids()
                +"Kg, ma vitesse est de "+ getVitesse() +"km/h j'ai "+getNbPattes()+" pattes,ma taille est de "+getTaille()
                +"je regarde la TV " + nbHeuresTv +"h par jour";
    }
    
    
}
