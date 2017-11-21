package egalite;

import java.util.HashMap;
import obj.PointGPS;
import obj.Ville;

public class Exemple03 {
    public static void main(String[] args) {
        HashMap<PointGPS, Ville> mp = new HashMap<>();
        PointGPS p = new PointGPS();
        Ville v = new Ville("paris", "75000", 15666, 2.6f);
        mp.put(p, v);
        System.out.println("contenu : "+mp);
        System.out.println("\n-------");
        PointGPS p02 = new PointGPS(0, 0, "P");
        Ville res = mp.get(p02);
        System.out.println(res);
        
        System.out.println("----- avec p ----");
        Ville res02 = mp.get(p);
        System.out.println(res02);
        
        System.out.println("----- après modification de p-----");
        //p.setX(100);
        System.out.println("contenu : "+mp);
        System.out.println("--- recherche avec p --");
        Ville res03 = mp.get(p);
        System.out.println(res03);
        
        System.out.println("=========== sedeplacer ====");
        System.out.println(p02);
        PointGPS p03 = p02.deplacer(1, 2);
        System.out.println(p03);
        p03 = p03.deplacer(3, 4);
        System.out.println(p03);
    }
}
