package egalite;

import obj.PointGPS;

public class Exemple02 {
    public static void main(String[] args) {
        PointGPS p01 = new PointGPS();
        System.out.println("1) p01 : "+p01);
        p01.setNom("A");
        // p01.setY(-1);
        System.out.println("2) p01 : "+p01);
        System.out.println("---");
        PointGPS p02 = new PointGPS(0, -0, "M");
        System.out.println("3) p02 :"+p02);
        boolean ok = (p01 == p02);
        boolean ok02 = p01.equals(p02);
        System.out.println("4.1) p01 == p02 ? "+ok);
        System.out.println("4.2) p01 equals p02 ? "+ok02);
        System.out.println("4.3) p01.hascode() = " + p01.hashCode());
        System.out.println("4.4) p02.hascode() = " + p02.hashCode());
        
        System.out.println("\n---");
        PointGPS p03 = new PointGPS(4, 6, "E");
        PointGPS p04 = new PointGPS(4, 7, "R");
        ok = (p03 == p04);
        ok02 = p03.equals(p04);
        System.out.println("5.1) p03 == p04 ? "+ok);
        System.out.println("5.2) p03 equals p04 ? "+ok02);
        System.out.println("5.3) p03.hascode() = " + p03.hashCode());
        System.out.println("5.4) p04.hascode() = " + p04.hashCode());
        
        //p03.setX(-99);
        // System.out.println("5.5) p03.hascode() = " + p03.hashCode());
        
    }
}
