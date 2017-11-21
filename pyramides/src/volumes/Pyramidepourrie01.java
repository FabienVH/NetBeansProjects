package volumes;

import bases.Carre;


public class Pyramidepourrie01 {
    private Carre base;
    private float hauteur;

    public Pyramidepourrie01(Carre base) {
        this.base = base;
    }

    public Carre getBase() { 
    }

    public void setBase(Carre base) {
        this.base = base;
    }

    public float getHauteur() {
        return hauteur;
    }

    public void setHauteur(float hauteur) {
        this.hauteur = hauteur;
    }
    

    @Override
    public String toString() {
        String infos = base.toString();
        infos = infos+"hauteur ="+hauteur;
        
        return infos;
    }
    
}
