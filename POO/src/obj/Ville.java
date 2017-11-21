package obj;

public class Ville {

    // propriétés / attributs ----------
    private String nom;

    private String cp;

    private int population;

    private float surface;


// methodes : accesseurs/getters + mutateurs/setters    
    public String getNom() {
        return nom;
    }
    
    public void setNom(String nomVille){
        nom = nomVille;
    }
    
    public String getCp() {
        return cp;
    }
    
    public void setCp(String cpVille){
        cp = cpVille;
    }
    
    public int getPopulation() {
        return population;
    }
    
    public void setPopulation(int populationVille){
        if(populationVille >= 0){
            population = populationVille;
        }
    }
    
    public float getSurface() {
        return surface;
    }
    
    public void setSurface(float surfaceVille){
        if(surfaceVille >= 0){
            surface = surfaceVille;
        }
    }

    public Ville(String nomVille, String cpVille,
            int populationVille, float surfaceVille) {
        nom = nomVille;
        cp = cpVille;
        setPopulation(populationVille);
        setSurface(surfaceVille);
    }  
// methodes / comportements / operations
    public float calculerDensite() {
        float densite = population / surface;
        return densite;
    }
    
    //faux getter : a utiliser pour recuperer des valeurs calculees
    public float getDensite(){
        float densite = population / surface;
        return densite;
    }

    public String toString() {
        String s = nom+ " - " + cp + " - ";
        return s;
    }
}
