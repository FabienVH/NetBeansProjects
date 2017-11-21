package exos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
Ecrire un algorithme qui demande un nombre compris entre 10 et 20,
* jusqu'à ce que la réponse convienne. 
* En cas de réponse supérieure à 20, on fera apparaître un message : « Plus petit ! », 
* et inversement, « Plus grand ! » si le nombre est inférieur à 10.
 */
public class ExoAlgoSup1 {
    public static void main(String[] args) throws IOException {
        int n=0;
        String saisi;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new  BufferedReader(isr);
        
        System.out.println("Saisir un nombre entre 10 et 20");
        saisi =br.readLine();
        n = Integer.valueOf(saisi);
        while(n<10 || n>20){
        if(n<10 ){
            System.out.println("plus grand!");
        }
        if(n>20 ){
            System.out.println("plus petit!");
        }
        System.out.println("Saisir un nombre entre 10 et 20");
        saisi =br.readLine();
        n = Integer.valueOf(saisi);
        }
        System.out.println("merci d'avoir respecté la consigne");
    }
    
}
