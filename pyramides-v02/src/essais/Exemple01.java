
package essais;

import bases.Carre;
import bases.Rectangle;
import volumes.PyramidePourri01;
import volumes.PyramidePourri02;


public class Exemple01 {
    public static void main(String[] args) {
        Carre c01 = new Carre(3);
        Carre c02 = new Carre(5);
        Rectangle r01 = new Rectangle(2, 3);
        
        PyramidePourri01 pp01 = new PyramidePourri01(c01, 6);
        System.out.println("1) pp01 : ");
        System.out.println(pp01);
        float volume01 = pp01.getVolume();
        System.out.println("volume = "+volume01);
        
        System.out.println("\n- modification de pp01 -");
        pp01.setBase(c02);
        pp01.setHauteur(12);
        System.out.println("2) pp01 : ");
        System.out.println(pp01);
        volume01 = pp01.getVolume();
        System.out.println("volume = "+volume01);
        
        System.out.println("\n- base rectangulaire -");
        PyramidePourri02 pp02 = new PyramidePourri02(r01, 6);
        System.out.println("3) pp02 : ");
        System.out.println(pp02);
        volume01 = pp02.getVolume();
        System.out.println("volume = "+volume01);
    }
}
