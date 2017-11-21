package obj;

public class PointGPS {
    private final int x;
    private final int y;
    private String nom;

    public PointGPS() {
        x=0;
        y=0;
        nom="O";
    }

    public PointGPS(int x, int y, String nom) {
        this.x = x;
        this.y = y;
        this.nom = nom;
    }

    public int getX() {
        return x;
    }

//    public void setX(int x) {
//        this.x = x;
//    }

    public int getY() {
        return y;
    }

//    public void setY(int y) {
//        this.y = y;
//    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return nom+"(x=" + x + ", y=" + y +")";
    }
    
    /*
        1) quand on redefinit le equals() on doit aussi redefinir le hashcode()
        2) si deux objets sont egaux par le equals alors ils doivent avoir le meme hashcode
        3) deux objets différents pas le equals peuvent avoir le meme hashcode
        4) le hascode d'un objet est immuable
    */
    @Override
    public int hashCode() {        
        return x;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        PointGPS other = (PointGPS) obj;
        if (this.x != other.x) {
            return false;
        }
        if (this.y != other.y) {
            return false;
        }
        return true;
    }
    
    public PointGPS deplacer(int deltaX, int deltaY){
        int x01 = this.x + deltaX;
        int y01 = this.y + deltaY;
        String nom01 = this.nom+"'";
        return new PointGPS(x01, y01, nom01);
    }
    
}
