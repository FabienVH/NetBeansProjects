package exos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
9* Dans un tableau de 10 entiers, afficher :
- le plus grand et sa position,
- la moyenne des entiers,
- les nombres inférieurs à la moyenne
*/
public class ExoAlgo9 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new  BufferedReader(isr);
        String saisi;
        int [] Entier = new int[10];
        int rangGrand = 0 ;
        int grand;
        float somme = 0;
        float moyenne;
        
        System.out.println("saisie de 10 valeurs:");
        for(int i =0;i < 10;i++){
            System.out.println("saisir la valeur n°"+(i+1));
            saisi = br.readLine();
            Entier[i] = Integer.valueOf(saisi);
        }
        
        for(int i =1;i<10 ;i++){
            if(Entier[i] >Entier[rangGrand]){
                rangGrand = i;
            }
        }
        System.out.println("le plus grand est le "+(rangGrand+1)+"eme donc "+Entier[rangGrand]);
        
        for(int j = 0;j<10;j++){
            somme = somme + Entier[j];
        }
        moyenne = somme/10;
        System.out.println("la moyenne est de "+moyenne);  
        
        for(int k =0;k<10;k++){
            if(moyenne>Entier[k]){
                System.out.println(Entier[k]+" est inferieur a la moyenne");
            }
        }
        
        
    br.close();
        isr.close();    
    }
}
