package exos2;

public class Exo01POO {

    public static void main(String[] args) {
        
        Voiture v = new Voiture();
        v.setMarque("Toyota");
        v.setCylindree(1598);
        System.out.println(v);
       // System.out.println(v.getTaxeVoiture());

        Voiture w = new Voiture();
        w.setMarque("BMW");
        w.setCylindree(2756);
        System.out.println(w);
        //System.out.println(w.getTaxeVoiture());

        Flotte maFlotte = new Flotte();
        maFlotte.setVoiture01(v);
        maFlotte.setVoiture02(w);
    
        System.out.println("----------------------------------");
        System.out.println("la taxe de la flotte est " + maFlotte.getTaxeFlotte(w,v));
    }

  
}
