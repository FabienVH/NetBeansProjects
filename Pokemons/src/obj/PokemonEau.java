
package obj;

public class PokemonEau extends Pokemon{
    private int nbNageoires;

    public PokemonEau() {
    }

    public PokemonEau(int nbNageoires) {
        this.nbNageoires = nbNageoires;
    }

    public PokemonEau(int nbNageoires, String nom, float poids) {
        super(nom, poids);
        this.nbNageoires = nbNageoires;
    }

    public int getNbNageoires() {
        return nbNageoires;
    }

    public void setNbNageoires(int nbNageoires) {
        this.nbNageoires = nbNageoires;
    }

    @Override
    public String toString() {
        return "PokemonEau{" + "nbNageoires=" + nbNageoires + '}';
    }
    
    
}
