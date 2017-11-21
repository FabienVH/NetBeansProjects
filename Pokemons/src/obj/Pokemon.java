package obj;


public class Pokemon {
    private String nom;
    private float poids;

    public Pokemon() {
    }

    public Pokemon(String nom, float poids) {
        this.nom = nom;
        this.poids = poids;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public float getPoids() {
        return poids;
    }

    public void setPoids(float poids) {
        this.poids = poids;
    }

    @Override
    public String toString() {
        return "Pokemon{" + "nom=" + nom + ", poids=" + poids + '}';
    }
   
    
    
}
