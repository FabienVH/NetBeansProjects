package bases;


public class Carre implements FigurePlane{
    private float cote;

    public Carre() {
    }

    public Carre(float cote) {
        this.cote = cote;
    }

    public float getCote() {
        return cote;
    }

    public void setCote(float cote) {
        this.cote = cote;
    }

    @Override
    public String toString() {
        return "Carre{" + "cote=" + cote + '}';
    }
    
    @Override
    public float calculerAire(){
        return cote * cote;
    }
    
    @Override
    public float calculerPerimetre(){
        return 4 * cote;
    }
    
}
