package fonctions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Schtroumpfbis {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new  BufferedReader(isr);
        int longueurTmp;
        String saisi;
        float somme = 0;
        System.out.println(">>> remplissage du tableau 01");
        System.out.print("saisir la longueur du tableau : ");
        saisi = br.readLine();
        longueurTmp = Integer.valueOf(saisi);
        float[] decimaux01 = new float[longueurTmp];
        
        remplir(decimaux01,br);
        
        System.out.println("---");
        System.out.println(">>> remplissage du tableau 02");
        System.out.print("saisir la longueur du tableau : ");
        saisi = br.readLine();
        longueurTmp = Integer.valueOf(saisi);
        float[] decimaux02 = new float[longueurTmp];
        
        remplir(decimaux02,br);
        
        System.out.println("--- calcul ---");
        for(int i =0;i< decimaux01.length;i++){
            for(int j= 0; j< decimaux02.length;j++){
                somme = somme + decimaux01[i]*decimaux02[j];
            }
        }
        System.out.println("le schtroumpf de vos 2 tableaux est "+somme);
        
        br.close();
        isr.close();
        
        }
        public static void remplir(float[] t,BufferedReader br) throws IOException{
            for(int i =0;i < t.length;i++){
            System.out.println("saisir la valeur n°"+(i+1));
            String saisi = br.readLine();
            t[i] = Float.valueOf(saisi);
        }
    
 
}}
