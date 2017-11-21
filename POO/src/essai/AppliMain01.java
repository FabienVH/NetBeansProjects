package essai;

import obj.Ville;

public class AppliMain01 {
    public static void main(String[] args) {
        Ville v01;
        v01 = new Ville();
        System.out.println(v01);
        
        v01.setNom("Lyon");
        v01.setCp("69001");
        System.out.println(v01);
        
        v01.setPopulation(245632);
        v01.setSurface(47.23f);
        System.out.println(v01);
        System.out.println("nb d'habitants : "+v01.getPopulation());
        System.out.println("surperfcie : "+v01.getSurface());
        System.out.println("densité : "+v01.getDensite());
        
        
    }
}
