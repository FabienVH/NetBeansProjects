package essais;

import obj.Ville;

public class AppliMain02 {
    public static void main(String[] args) {
        int[] entiers = new int[6];
        
        float[] decimaux ;
        decimaux = new float[] {14.6f,15.68f,13.3f};
        
        String[] mots = {"un","deux","txt"};
        
        System.out.println("--------------------");
        Ville[] mesVilles01 = new Ville[3];
        System.out.println("1) mesVilles01[0] : " +mesVilles01[0]);
        mesVilles01[0] = new Ville("zero", "00001", 5000, 10);
        System.out.println("2.1) mesVilles01[0] : " +mesVilles01[0]);
        System.out.println("2.2) mesVilles01[1] : " +mesVilles01[1]);
        System.out.println("2.3) mesVilles01[2] : " +mesVilles01[2]);
        
        mesVilles01[2] = new Ville();
        mesVilles01[2].setCp("2000");
        mesVilles01[2].setNom("test-02");
        mesVilles01[2].setPopulation(8000);
        mesVilles01[2].setSurface(5f);
        System.out.println("3.1) densité de mesVilles01[0] : "+mesVilles01[0].getDensite());
        // System.out.println("3.2) densité de mesVilles01[1] : "+mesVilles01[1].getDensite());
        System.out.println("3.3) densité de mesVilles01[2] : "+mesVilles01[2].getDensite());
    }
}
