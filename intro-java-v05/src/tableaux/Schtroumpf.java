package tableaux;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Schtroumpf {
    public static void main(String[] args) throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int longueurTmp;
        String saisi;
        System.out.println(">>> remplissage du tableau 01");
        System.out.print("saisir la longueur du tableau : ");
        saisi = br.readLine();
        longueurTmp = Integer.valueOf(saisi);
        float[] decimaux01 = new float[longueurTmp];
        
        for(int i = 0; i < decimaux01.length; i = i + 1){
            System.out.println("saisir la valeur n° "+(i + 1));
            saisi = br.readLine();
            decimaux01[i] = Float.valueOf(saisi);
        }
        System.out.println("---");
        System.out.println(">>> remplissage du tableau 02");
        System.out.print("saisir la longueur du tableau : ");
        saisi = br.readLine();
        longueurTmp = Integer.valueOf(saisi);
        float[] decimaux02 = new float[longueurTmp];
        for(int i = 0; i < decimaux02.length; i = i + 1){
            System.out.println("saisir la valeur n° "+(i + 1));
            saisi = br.readLine();
            decimaux02[i] = Float.valueOf(saisi);
        }
        
        System.out.println("---- calcul ---");
        float somme = 0;
        for(int i = 0; i  < decimaux01.length; i = i + 1){
            for(int j = 0; j < decimaux02.length; j = j + 1){
                somme = somme + decimaux01[i] * decimaux02[j];
            }
        }
        System.out.println("le schtroumpf de vos deux tableau est "+somme);
        br.close();
        isr.close();
    }
}
