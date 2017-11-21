package essais01;

import approche01.Ville;

public class AppliMain01 {

    public static void main(String[] args) {

        Ville ville01 = new Ville("Amiens", "80000", 294595, 49.46f);
        System.out.println("1) infos ville01 :");
        String chaineTmp = ville01.seDecrire();
        System.out.println(chaineTmp);
        float densiteTmp = ville01.calculerDensite();
        System.out.println("densité par km² : " + densiteTmp);

        System.out.println("----------------------");
        Ville ville02 = new Ville();
        System.out.println("2) infos ville02 :");
        chaineTmp = ville02.seDecrire();
        System.out.println(chaineTmp);
        densiteTmp = ville02.calculerDensite();
        System.out.println("densité par km² : " + densiteTmp);

        System.out.println("-----------------");
        Ville ville03 = new Ville();
        System.out.println("3) infos ville03 :");
        chaineTmp = ville03.seDecrire();
        System.out.println(chaineTmp);
        densiteTmp = ville03.calculerDensite();
        System.out.println("densité par km² : " + densiteTmp);

//       ville03.nom = "Lyon";
//       ville03.cp = "69001";
        ville03.setNom("Lyon");
        ville03.setCp("69001");
        System.out.println("\n3.1) infos ville03 :");
        chaineTmp = ville03.seDecrire();
        System.out.println(chaineTmp);
        densiteTmp = ville03.calculerDensite();
        System.out.println("densité par km² : " + densiteTmp);

//       ville03.population = -2265375;
//       ville03.surface = -47.87f;
        ville03.setPopulation(2265375);
        ville03.setSurface(47.87f);
        System.out.println("\n3.2) infos ville03 :");
        chaineTmp = ville03.seDecrire();
        System.out.println(chaineTmp);
        densiteTmp = ville03.calculerDensite();
        System.out.println("densité par km² : " + densiteTmp);

        //--------------------------------------------------
        System.out.println("=========================================");
        Ville v04 = new Ville("teste01", "10000", -50000, 100);
        System.out.println("4) infos de v04 :");
        System.out.println(v04.seDecrire());
        System.out.println("4.1) densité de v04 = " + v04.calculerDensite());
        System.out.println("4.2) nbHabitants de v04 = " + v04.getPopulation());
    }
}
