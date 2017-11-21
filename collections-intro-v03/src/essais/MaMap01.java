package essais;

import java.util.HashMap;
import obj.Ville;

public class MaMap01 {
    public static void main(String[] args) {
        HashMap<String, Ville> mp = creerJeuDeTest();
        Ville v = mp.get("78300");
        System.out.println("1) résultat : "+v);
        System.out.println("1.1) densité = "+v.getDensite());
        
        String cp= "89456";
        Ville v02 = mp.get(cp);
        System.out.println("2) résultat : "+v02);
        boolean existeClef = mp.containsKey(cp);
        System.out.println("2.1) existeClef = "+existeClef);
        System.out.println("\n--------------------");
        System.out.println("contenur :");
        System.out.println(mp);
        mp.remove("12345");
        System.out.println("après suppression");
        System.out.println(mp);
        
        mp.put("78311", new Ville("test", "78310", 16000, 8));
        System.out.println("après modification");
        System.out.println(mp);
    }
    
    public static HashMap<String, Ville> creerJeuDeTest(){
        HashMap<String, Ville> mp = new HashMap();
        Ville v01 = new Ville("ville-01", "10005", 5000, 5);
        mp.put(v01.getCp(), v01);
        Ville v02 = new Ville("ert", "50002", 7000, 10);
        Ville v03 = new Ville("ZZ", "78300", 15000, 15);
        Ville v04 = new Ville("Ab", "78311", 8000, 80);
        mp.put(v02.getCp(), v02);
        mp.put(v03.getCp(), v03);
        mp.put(v04.getCp(), v04);
        mp.put("12345", null);
        return mp;
    }
}
