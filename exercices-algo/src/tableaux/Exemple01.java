package tableaux;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exemple01 {
    public static void main(String[] args) throws IOException {
        String [] mesTextes; // on peut ecrire: String mesTextes []; 
                //(ci dessus)Declartion d'une variable pour designer un tableau de chaine
        mesTextes = new String[5]; // creation d'un tableau de longueur 5 et affectation à la variable 
        
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new  BufferedReader(isr);
        for(int k = 0;k < mesTextes.length;k++){
            System.out.println("saisir la valeur n° "+(k+1));
            mesTextes[k] = br.readLine();
            
        }
        System.out.println("---");
        for(int k = 0;k < mesTextes.length;k++){
            System.out.println("mesTextes[ "+k +"]= "+ mesTextes[k]);
        }
        
        br.close();
        isr.close();
    }
}
