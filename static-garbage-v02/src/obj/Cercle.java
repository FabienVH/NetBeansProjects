package obj;


public class Cercle {
    
    public static final float PI = 3.14159f;
    private static int QTE = 0;
    
    private String nom;
    private float r;
    private int rang;

    public Cercle() {
        this("C",1);
    }

    public Cercle(String nom, float r) {
        this.nom = nom;
        this.r = r;
        Cercle.QTE++;
        rang = Cercle.QTE;
        System.out.println("-- creation du cercle de rang "+rang);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public float getR() {
        return r;
    }

    public void setR(float r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return "Cercle(" + nom + ", r=" + r + ") rang = "+rang;
    }
    
    public float getPerimetre(){
        return 2 * r * Cercle.PI;
    }
    
    public float getAire(){
        return r * r * Cercle.PI;
    }
    
    public static float getMultipleDePi(int coef){        
        return Cercle.PI * coef;
    }
    
    public static int getQTE(){
        return Cercle.QTE;
    }

    @Override
    public void finalize() throws Throwable {
        super.finalize(); 
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>> destruction du cercle de rang ="+rang);
    }
    
    
    
}
