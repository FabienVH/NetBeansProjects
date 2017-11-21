package essais;

import bases.Carre;
import bases.Rectangle;
import volumes.Pyramide;


public class Exemple02 {
    public static void main(String[] args) {
        Carre c01 = new Carre(3);
        Carre c02 = new Carre(5);
        Rectangle r01 = new Rectangle(2, 3);
        
        Pyramide pr = new Pyramide(c01, 6);
        System.out.println("1) pp01 : ");
        System.out.println(pr);
        float volume01 = pr.getVolume();
        System.out.println("volume = "+volume01);
        
        System.out.println("\n- modififcation -");
        pr.setBase(r01);
        pr.setHauteur(12);
        System.out.println(pr);
        volume01 = pr.getVolume();
        System.out.println("volume = "+volume01);
        
        
    }
}
