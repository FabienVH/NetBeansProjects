package essais;

import faune.Animal;
import faune.Chien;
import faune.Pigeon;
import java.util.Date;

public class AppliMain01 {

    public static void main(String[] args) {
        Date d01 = new Date();
        // on ne peut pas instancier un Animal comme ci-dessous
        // car Animal est une classe abstraite
        //  Animal a01 = new Animal("anim01", 2.31f, "M", d01); 
//        System.out.println("1) a01 : "+a01);
//        System.out.println("1.1) poids : "+a01.getPoids());
//        System.out.println("1.2) date naiss : "+a01.getDateNaissance());
        System.out.println("---");

        Pigeon p01 = new Pigeon();
        p01.setNom("pigeon01");
        p01.setGenre("F");
        p01.setPoids(0.35f);
        System.out.println("2.1) infos p01 = " + p01);
        System.out.println("2.2) p01.seDeplacer() :");
        p01.seDeplacer();
        System.out.println("2.3) p01.manger() :");
        p01.manger();
        System.out.println();

        System.out.println("3) modification de p01");
        p01.setEndurance(75);
        p01.setEnvergure(65);
        System.out.println("3.1) endurance de p01 : " + p01.getEndurance());
        System.out.println("3.2) envergure de p01 : " + p01.getEnvergure());
        System.out.println("3.3) p01.seDeplacer() :");
        p01.seDeplacer();
        System.out.println("3.4) p01.manger() :");
        p01.manger();

        System.out.println("---");
        Chien c01 = new Chien("marron", "Milou", 3.5f, "M");
        Chien c02 = new Chien();

        c02.setNom("Pif");
        c02.setPelage("Brun");
        c02.setGenre("M");
        c02.setPoids(12.3f);
        System.out.println("4.1) infos de c01 :" + c01);
        System.out.println("4.2) c01.manger()");
        c01.manger();
        System.out.println("4.3) c01.seDeplacer()");
        c01.seDeplacer();
        int db = 65;
        System.out.println("4.3) c01.faireDuBruit(int decibel)");
        String s = c01.faireDuBruit(db);
        System.out.println(s);
    }
}
