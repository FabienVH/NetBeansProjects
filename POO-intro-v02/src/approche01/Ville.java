package approche01;

public class Ville {
    
    // propriétés / attributs ----------
    
    String nom; // pas de modificateur d'accès : la visibilté est le package
    
    private String cp; // private : visibilité reduite à la classe
    
    public int population; // public : visible dans toute l'application
    
    private float surface;
    
    // constructeurs -------------
    // 1) constructeur sans argument / constructeur par defaut
    public Ville(){
        nom="";
        cp = "";
        population = 0;
        surface = 1;
    }
    
    // 2) autres constructeurs
    public Ville(String nomVille, String cpVille, 
            int populationVille, float surfaceVille){
        nom = nomVille;
        cp = cpVille;
        population = populationVille;
        surface = surfaceVille;
    }
    
    // methodes / comportements / operations
    public float calculerDensite(){
        float densite = population / surface;
        return densite;
    }
    
    public String seDecrire(){
        String s = nom.toUpperCase() + " - " + cp + " - nbHabitants= "
                + population + ", surface(km²) = " + surface;
        return s;
    }
}
