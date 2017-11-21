package volumes;

import bases.Carre;

public class PyramidePourri01 {
    private Carre base;
    private float hauteur;

    public PyramidePourri01() {
    }

    public PyramidePourri01(Carre base, float hauteur) {
        this.base = base;
        this.hauteur = hauteur;
    }

    public Carre getBase() {
        return base;
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
        String infos = "base : "+base.toString();
        infos +=  " - hauteur ="+hauteur;
        return infos;
    }
    
    public float getVolume(){
        return base.calculerAire() * hauteur / 3;
    }
    
}
