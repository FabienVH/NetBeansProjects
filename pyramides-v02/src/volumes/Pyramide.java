package volumes;

import bases.FigurePlane;

public class Pyramide {
    private FigurePlane base;
    private float hauteur;

    public Pyramide() {
    }

    public Pyramide(FigurePlane base, float hauteur) {
        this.base = base;
        this.hauteur = hauteur;
    }

    public FigurePlane getBase() {
        return base;
    }

    public void setBase(FigurePlane base) {
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
        String infos = "base : "+base.toString();
        infos +=  " - hauteur ="+hauteur;
        return infos;
    }
    
    public float getVolume(){
        return base.calculerAire() * hauteur / 3;
    }
    
}
