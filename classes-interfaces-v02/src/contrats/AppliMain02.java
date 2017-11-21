package contrats;

import faune.Animal;
import faune.Pigeon;
import faune.Voisin;
import mesinterfaces.Penible;
import mesinterfaces.Voyageur;


public class AppliMain02 {
    public static void main(String[] args) {
        Pigeon p = new Pigeon(58, "pigeon-01", 0.200f, "F");
        Animal a01 = new Pigeon(50, "pigeon-02", 0.220f, "M");
    
        Voyageur v01 = new Pigeon(60, "pigeon-03", 0.230f, "M");
        
        System.out.println("1) p :");
        System.out.println(p);
        p.seDeplacer();
        String mg = p.voyager();
        System.out.println(mg);
        
        System.out.println("---");
        System.out.println("2) a01 :");
        System.out.println(a01);
        a01.seDeplacer();
        // a01.voyager(); impossible car voyager() est dans l'interface Voyageur 
        
        System.out.println("---");
        System.out.println("3) v01 :");
        System.out.println(v01);
        // v01.seDeplacer(); // impossible car v01 est de type Voyageur
        String msg = v01.voyager();
        System.out.println(msg);
        
        System.out.println("========================");
        Voisin vn01 = new Voisin("nom-01", "prenom-01");
        System.out.println("4) vn01 :");
        System.out.println(vn01);
        msg = vn01.voyager();
        System.out.println(msg);
        
        System.out.println("---");
        v01 = vn01;
        msg = v01.voyager();
        System.out.println(msg);
        
        System.out.println("---");
        Voyageur v02 = new Voisin("nom02", "prenom02");
        System.out.println("5) v02 :");
        System.out.println(v02);
        msg = v02.voyager();
        System.out.println(msg);
        
        System.out.println("-----");
        System.out.println("avec Voisin vn01 :");
        System.out.println(vn01);
        System.out.println("A.1) vn01.voyager() : "+vn01.voyager());
        System.out.println("A.2) vn01.chanter(80) : "+vn01.chanter(80));
        System.out.println("A.3) vn01.bricoler() : "+vn01.bricoler());
        
        Penible pn01 = vn01;
        System.out.println("B.1) pn01.chanter(80) : "+pn01.chanter(80));
        System.out.println("B.2) pn01.bricoler() : "+pn01.bricoler());
    
    }
}
