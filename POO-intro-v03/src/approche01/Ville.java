package approche01;

public class Ville {

    // propriétés / attributs ----------
    private String nom;

    private String cp;

    private int population;

    private float surface;

    // methodes : constructeurs -------------
    // 1) constructeur sans argument / constructeur par defaut
    public Ville() {
        nom = "";
        cp = "";
        population = 0;
        surface = 1;
    }

    // 2) autres constructeurs
    public Ville(String nomVille, String cpVille,
            int populationVille, float surfaceVille) {
        nom = nomVille;
        cp = cpVille;
        setPopulation(populationVille);
        setSurface(surfaceVille);
    }

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

// methodes / comportements / operations
    public float calculerDensite() {
        float densite = population / surface;
        return densite;
    }

    public String seDecrire() {
        String s = nom.toUpperCase() + " - " + cp + " - nbHabitants= "
                + population + ", surface(km²) = " + surface;
        return s;
    }
}
