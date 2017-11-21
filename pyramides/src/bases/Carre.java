
package bases;


public class Carre {
    private float cote;

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
    
    public float calculerAire(){
        return cote * cote;
    }
    
    public float calculerPerimetre(){
        return cote *4;
    }
}
