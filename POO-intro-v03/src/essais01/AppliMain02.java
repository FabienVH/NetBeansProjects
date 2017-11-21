package essais01;

import approche01.Ville;


public class AppliMain02 {
    public static void main(String[] args) {
        Ville v; 
        System.out.println("----------- debut ----------");        
        v = new Ville("Rennes", "35000",710481 , 50.39f);
        System.out.println(v.seDecrire());
        System.out.println("densité au km² : "+v.calculerDensite());
        v = null;
        System.out.println("----------- fin ----------");
    }
}
