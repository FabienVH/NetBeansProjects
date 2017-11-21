package volumes;

import bases.Rectangle;

public class PyramidePourri02 {
    private Rectangle base;
    private float hauteur;

    public PyramidePourri02() {
    }

    public PyramidePourri02(Rectangle base, float hauteur) {
        this.base = base;
        this.hauteur = hauteur;
    }

    public Rectangle getBase() {
        return base;
    }

    public void setBase(Rectangle base) {
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
        return "base=" + base + "- hauteur=" + hauteur;
    }
    
    public float getVolume(){
        return base.calculerAire() * hauteur / 3;
    }
    
}
