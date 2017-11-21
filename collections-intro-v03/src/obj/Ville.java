package obj;

public class Ville implements Comparable<Ville>
{

// propriétés / attributs ----------
    private String nom;
    private String cp;
    private int population;
    private float surface;

    // constructeurs
    public Ville() {
        nom = "";
        cp = "";
        population = 0;
        surface = 1;
    }

    public Ville(String nom, String cp,
            int population, float surface) {
        this.nom = nom;
        this.cp = cp;
        setPopulation(population);
        setSurface(surface);
    }

// methodes : accesseurs/getters + mutateurs/setters    
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        if (population >= 0) {
            this.population = population;
        }
    }

    public float getSurface() {
        return surface;
    }

    public void setSurface(float surface) {
        if (surface >= 0) {
            this.surface = surface;
        }
    }

// methodes / comportements / operations
//    public float calculerDensite() {
//        float densite = population / surface;
//        return densite;
//    }
    // faux getter : à utiliser pour des valeurs calculées
    public float getDensite() {
        float densite = population / surface;
        return densite;
    }

    @Override
    public String toString() {
        String s = "{ (" + cp + ")"+nom+", d = "+getDensite()+"}";
        return s;
    }

    @Override
    public int compareTo(Ville cible) {
        String nom01 = this.getNom();
        if(nom01 == null){
            return -1;
        }
        String nom02 = cible.getNom();
        if(nom02 == null){
            return 1;
        }
        int res = nom01.compareToIgnoreCase(nom02);
        return res;
    }
}
