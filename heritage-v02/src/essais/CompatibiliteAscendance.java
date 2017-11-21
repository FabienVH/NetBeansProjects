package essais;

import faune.Animal;
import faune.Chien;
import faune.Pigeon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CompatibiliteAscendance {
    public static void main(String[] args) throws IOException {
        Chien c01 = new Chien("marron", "Milou", 3.5f, "M");
        Animal a01 = new Chien("brun", "Pif", 12.3f, "M");
        Pigeon p01 = new Pigeon();
        p01.setNom("pigeon01");
        p01.setGenre("F");
        p01.setPoids(0.35f);
        p01.setEndurance(75);
        p01.setEnvergure(65);
        
        System.out.println("1) c01.seDeplacer()");
        c01.seDeplacer();
        System.out.println("--");
        System.out.println("2) a01.seDeplacer()");
        a01.seDeplacer();
        
        System.out.println("3) on affecte à a01 le pigeon p01");
        a01 = p01;
        System.out.println("3.1) a01.seDeplacer()");
        a01.seDeplacer();
        System.out.println("==========================");
        Animal a02 = null;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("1 : chien");
        System.out.println("2 : pigeon");
        String saisi = br.readLine();
        int choix = Integer.valueOf(saisi);
        if(choix == 1){
            a02 = c01;
        }
        if(choix == 2){
            a02 = p01;
        }
        System.out.println("A) resultat a02.seDeplacer()");
        // la methode seDeplacer est polymorphe :
        // l'appel de la se comporte en fonction de l'objet et non de la reference
        // les mecanismes qui interviennent dans le polymorphisme :
        //        a) heritage
        //        b) compatibilté ascendante
        //        c) redefinition de methodes
        //        d) liaison tardive
        a02.seDeplacer();
        // a02.faireDuBruit(60); impossible car la reference a02 est de type Animal
        if(a02 instanceof Chien){
            Chien c = (Chien) a02;
            System.out.println(c.faireDuBruit(60));
        }
        br.close();
        isr.close();
    }
}
