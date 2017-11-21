package essais;

import faune.Animal;
import faune.Chien;
import faune.Pigeon;


public class Polymorphisme {
    public static void main(String[] args) {
        Animal a01 = null;
        Chien c01 = new Chien("marron", "Milou", 3.5f, "M");        
        Pigeon p01 = new Pigeon();
        p01.setNom("pigeon01");
        p01.setGenre("F");
        p01.setPoids(0.35f);
        p01.setEndurance(75);
        p01.setEnvergure(65);
        
        a01 = c01;
        System.out.println("1) a01.seDeplacer()");
        a01.seDeplacer();
        
        a01 = p01;
        System.out.println("2) a01.seDeplacer()");
        a01.seDeplacer();
        System.out.println("----------------------");
        
        
        // pas très pratique
        Pigeon pigeons[] = new Pigeon[2];
        Chien chiens[] = new Chien[4];        
        pigeons[0] = p01;
        // pigeons[1] = c01;
        chiens[0] = c01;
        
        // il faut mieux faire : 
        Animal animaux[] = new Animal[3];
        animaux[1] = c01;
        animaux[0] = p01;
        animaux[2] = new Pigeon(90, "Titi", 0.075f, "M");
        
        float dc = 3.14f;
        dc *=  10; // equivalent dc = dc * 10;
        System.out.println("\n---- boucle for : ----");
        for(int i = 0; i  < animaux.length; i++){
            System.out.println("tour n° "+i);
            if(animaux[i] != null){
                animaux[i].seDeplacer();
            }else{
                System.out.println("pas d'objet affecté.");
            }           
        }
    }
}
