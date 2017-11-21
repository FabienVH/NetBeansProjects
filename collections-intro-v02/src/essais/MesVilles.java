package essais;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import obj.TriParCPNom;
import obj.TriParDensite;
import obj.Ville;

public class MesVilles {
    public static void main(String[] args) {
        System.out.println("----- compareTo  sur les chaines-----");
        String s = "ac";
        String r = "ab";
        int res = s.compareTo("ab");
        System.out.println("res = "+res);
        
        System.out.println("\n============= villes =============");
        Ville v01 = new Ville("ville-01", "10000", 5000, 5);
        List<Ville> villes = new ArrayList();
        villes.add(v01);
        villes.add(new Ville("ert", "10000", 7000, 10));
        villes.add(new Ville("ZZ", "20000", 15000, 15));
        villes.add(new Ville("Ab", "10000", 8000, 80));
        villes.add(new Ville(null,"35000", 100, 100));
        villes.add(new Ville("bb", null, 4000, 70));
        villes.add(new Ville("cd", "20000", 200, 50));
        villes.add(new Ville(null,"78000", 2000, 100));
        villes.add(new Ville("aa", null, 14000, 70));
        System.out.println("1) villes : "+villes);
        Collections.sort(villes);
        System.out.println("2) villes après tri par defaut : "+villes);
        TriParDensite tr01 = new TriParDensite();
        Collections.sort(villes, tr01);
        System.out.println("3) villes après tri par densité : "+villes);
        TriParCPNom tr02 = new TriParCPNom();
        Collections.sort(villes, tr02);
        System.out.println("4) villes après tri par CP et nom : ");
        System.out.println(villes);
    }
}
