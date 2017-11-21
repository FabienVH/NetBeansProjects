package essai;

import faune.Animal;
import faune.Pigeon;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class AppliMain01 {
    public static void main(String[] args) {
        Date d01 = new Date();
        Animal a01 = new Animal(null, 2.31f, null, d01);
        System.out.println("");
        
        Pigeon p01 = new Pigeon();
        p01.setNom("pigeon01");
        p01.setGenre("F");
        p01.setPoids(0.35f);
       p01.seDeplacer();
        
    }
    
    
}
