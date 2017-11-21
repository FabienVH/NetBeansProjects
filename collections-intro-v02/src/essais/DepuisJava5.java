package essais;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class DepuisJava5 {

    public static void main(String[] args) {

        List<Integer> entiers01 = new ArrayList<Integer>(); // en java 5
        List<Integer> entiers02 = new ArrayList<>(); // en java 7 et 8        
        List<Integer> mesEntiers = new ArrayList(); // en java 5, 6, 7, 8

        mesEntiers.add(45);
        mesEntiers.add(-6);
        mesEntiers.add(45);
        mesEntiers.add(78);
        mesEntiers.add(-1);

        // mesEntiers.add("hello world"); impossible
        int somme = mesEntiers.get(0) + mesEntiers.get(2);
        System.out.println("1) size = " + mesEntiers.size());
        System.out.println("2) contenu = " + mesEntiers);
        System.out.println("3) somme = " + somme);
        String msg = afficher(mesEntiers);
        System.out.println("4) infos = " + msg);

        System.out.println("---- caculer le total des entiers de la liste ----");
        somme = 0;
        for (Integer valeur : mesEntiers) {
            // somme = somme + valeur;
            somme += valeur;
        }
        System.out.println("5) total = " + somme);

        System.out.println("---- trier mesEntiers dans l'ordre croissant ----");
        System.out.println("avant tri : " + mesEntiers);
        Collections.sort(mesEntiers);
        System.out.println("après tri : " + mesEntiers);

        System.out.println("================== avec des chaines  ==================");
        List<String> textes = new ArrayList();
        textes.add("zero");
        textes.add("ab");
        textes.add("Ef");
        textes.add("ZZ");
        textes.add("ZZ");
        textes.add("rst");
        textes.add("cd");
        System.out.println("avant tri : "+textes);
        Collections.sort(textes);
        System.out.println("après tri : "+textes);
        System.out.println("-- retirer ZZ  et la valeur à l'indice 3");
        textes.remove("ZZ");
        System.out.println("apres remove : "+textes);
        textes.remove(3);
        System.out.println("apres remove : "+textes);
        
        System.out.println("===============================================");
        List<Float> decimaux = new ArrayList();
        decimaux.add(-4.3f);
        decimaux.add(40f);
        decimaux.add(9.15f);
        decimaux.add(-8.6f);
        decimaux.add(104.98f);
        System.out.println("decimaux : "+decimaux);
//        for(Float val : decimaux){
//            if(val < 0){
//                decimaux.remove(val);
//            }
//        } // ça ne marche pas de cette façon pour le remove
        
        Iterator<Float> it = decimaux.iterator();
        System.out.println(">>>>>>>>>> "+it);
        while(it.hasNext()){
            Float f = it.next();
            if(f < 0){  
                it.remove();
            }
        }
        
        System.out.println("decimaux positifs : "+decimaux);
    }

    public static String afficher(List<Integer> t) {
        String infos = "[";
        StringBuilder tmp = new StringBuilder();
        for (int i = 0; i < t.size() - 1; i++) {
            tmp.append(t.get(i).toString()).append(", ");

        }
        tmp.append(t.get(t.size() - 1).toString()).append("]");
        infos += tmp.toString();
        return infos;
    }

}
