package essais;

import obj.Ville;

public class AppliMain01 {

    public static void main(String[] args) {
        Ville v01;
        v01 = new Ville();
        System.out.println("1) infos de v01 :");
        System.out.println("sans appel du toString");
        System.out.println(v01);
        System.out.println("appel du toString");
        System.out.println(v01.toString());

        v01.setNom("Lyon");
        v01.setCp("69001");
        System.out.println("2) infos de v01 :");
        System.out.println("sans appel du toString");
        System.out.println(v01);
        System.out.println("appel du toString");
        System.out.println(v01.toString());

        v01.setPopulation(245632);
        v01.setSurface(47.23f);
        System.out.println("------------------------------");
        System.out.println("infos de v01 : ");
        System.out.println(v01);
        System.out.println("nb habitants : " + v01.getPopulation());
        System.out.println("surface : " + v01.getSurface() + " km²");
        System.out.println("densité : " + v01.getDensite());
        
        Ville v02 = new Ville("test-01", "1000", 50000, 58);
        System.out.println("infos de v02 : ");
        System.out.println(v02);
        float d = v02.getDensite();
    }
}
