package bases;

public class Rectangle implements FigurePlane{
    private float cote01;
    private float cote02;

    public Rectangle() {
    }

    public Rectangle(float cote01, float cote02) {
        this.cote01 = cote01;
        this.cote02 = cote02;
    }

    public float getCote01() {
        return cote01;
    }

    public void setCote01(float cote01) {
        this.cote01 = cote01;
    }

    public float getCote02() {
        return cote02;
    }

    public void setCote02(float cote02) {
        this.cote02 = cote02;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "cote01=" + cote01 + ", cote02=" + cote02 + '}';
    }   
    
    @Override
    public float calculerAire(){
        return cote01 * cote02;
    }
    
    @Override
    public float calculerPerimetre(){
        return (cote01 + cote02) * 2;
    }
}
