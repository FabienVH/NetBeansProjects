package essais;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import obj.Ville;


public class AvantJava5 {
    public static void main(String[] args) {
        
        // type de reference et arraylist
        ArrayList tb01 = new ArrayList();        
        Collection tb03 = new ArrayList();
        
        List maListe = new ArrayList();
        // manipuler maListe.
        System.out.println("1) taille juste après la creation :");
        System.out.println("size = "+maListe.size());
        System.out.println("contenu : "+maListe);
        
        // maListe[0] = "texte 01"; // cette n'existe pas
        maListe.add("texte 01");        
        maListe.add("hello world");
        
        System.out.println("2) après ajout d'objet dans la liste");
        System.out.println("size = "+maListe.size());
        System.out.println("contenu : "+maListe);
        System.out.println("3) objet à l'indice 1 :");
        System.out.println("obj : "+ maListe.get(1));
        
        Ville v01 = new Ville("ville-01", "12345", 5000, 12.3f);
        maListe.add(new Ville("ville-02", "45678", 153012, 42.6f));
        maListe.add(v01);        
        
        System.out.println("4) après ajout d'objet dans la liste");
        System.out.println("size = "+maListe.size());
        System.out.println("contenu : "+maListe);
        System.out.println("4.1) objet à l'indice 1 :");
        System.out.println("obj : "+ maListe.get(1));
        System.out.println("4.2) objet à l'indice 2 :");
        System.out.println("obj : "+ maListe.get(2));
        
        //---------------------- autoboxing --------------------
        Integer i;
        i = new Integer(15); // equivalent à 
        // i = 15;
        
        int j = i.intValue(); // equivalent à 
        // j = i;
        System.out.println("j = "+j);
        
        // on a la meme chose avec les floats, double
        Float f = 15.6f; // equivalent f = new Float(15.6f);
        
        System.out.println("\n------------- calcul ----");
        List maListe02 = new ArrayList();
        maListe02.add(15.6f);
        maListe02.add(40);
        
        float somme = (float) maListe02.get(0) + (int) maListe02.get(1);
        System.out.println("5) somme = "+somme);
        
        maListe02.set(0, v01);
        somme = (float) maListe02.get(0) + (int) maListe02.get(1);
        // c'est pour ça que depuis java 5, on ne code pas comme celà
    }
}
