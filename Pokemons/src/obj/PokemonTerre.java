package obj;


public class PokemonTerre extends Pokemon{
    private int nbPattes;
    private float taille;

    public PokemonTerre() {
    }


    public PokemonTerre(int nbPattes, float taille, String nom, float poids) {
        super(nom, poids);
        this.nbPattes = nbPattes;
        this.taille = taille;
    }

    public int getNbPattes() {
        return nbPattes;
    }

    public void setNbPattes(int nbPattes) {
        this.nbPattes = nbPattes;
    }

    public float getTaille() {
        return taille;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

    public float getVitesse(){
        float vitesse = taille *nbPattes*3;
        return vitesse;
    }
    @Override
    public String toString() {
        return "\nPokemonTerre{" + "nbPattes=" + nbPattes + ", taille=" + taille + '}';
    }
    
}
