package exos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 8. Dans un tableau de 10 entiers, trouver les rangs du plus petit et du plus grand élément,
et afficher les rangs et leurs valeurs.
 */
public class ExoAlgo8 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new  BufferedReader(isr);
        String saisi;
        int [] Entier = new int[10];
        int rangPetit = 0 ;
        int rangGrand =0 ;
                
        for(int i =0;i < 10;i++){
            System.out.println("saisir la valeur n°"+(i+1));
            saisi = br.readLine();
            Entier[i] = Integer.valueOf(saisi);
        }
        
        for(int i =1;i<10 ;i++){
            if(Entier[i] <Entier[rangPetit]){
                rangPetit = i;
            }
            if(Entier[i] >Entier[rangGrand]){
                rangGrand = i;
            }
        }
        System.out.println("le plus petit est le "+(rangPetit+1)+"eme donc "+Entier[rangPetit]);
        System.out.println("le plus grand est le "+(rangGrand+1)+"eme donc "+Entier[rangGrand]);

        
        br.close();
        isr.close();
    }
}
