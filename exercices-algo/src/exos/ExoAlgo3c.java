
package exos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 //3. Afficher les nombres de n à m.
//c) Afficher de n à m (de manière décroissante).  OK 
Declaration des variables
m Entier
n Entier

DEBUT
SI n>m alors
  Pour i allant de n a m pas de -1
  ecrire i
 fin pour
SINON
 Pour i allant de n a m pas de 1
 ecrire i
 fin pour
FIN SI
FIN
 */
public class ExoAlgo3c {
    public static void main(String[] args) throws IOException {
       int m;
        int n;
        int i;
        String saisi;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new  BufferedReader(isr);
        
        System.out.println("saisissez un nombre n");
        saisi =br.readLine();
        n = Integer.valueOf(saisi);
        //System.out.println(n);
        System.out.println("saisissez un nombre m");
        saisi =br.readLine();
        m = Integer.valueOf(saisi);
        //System.out.println( n+" et "+m );
        System.out.println("-----------------");
        if(n >m){/*
            SI n>m alors
            Pour i allant de n a m pas de -1
            ecrire i
            fin pour
            */
           for(i=n;i>=m;i=i-1){
                System.out.println(i);
            }
        }else{
            for(i=n;i<=m;i=i+1){
                System.out.println(i);
            }
        } 
}
}
