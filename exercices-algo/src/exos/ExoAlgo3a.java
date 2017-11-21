package exos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*a) Afficher un message d'erreur et arrêter le programme si m<n
        Declaration des variables
m Entier
n Entier

DEBUT
ecrire "entrez un nombre"
lire n 
ecrire "entrez un nombre"
lire m  

SI n>m alors
 Ecrire "un message d'erreur"
SINON
 Pour i allant de n a m pas de 1
 ecrire i
FIN SI
FIN
        */
public class ExoAlgo3a {
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
        if(n >m){
            System.out.println("n est supérieur à m donc je ne suis pas content");
        }else{
            for(i=n;i<=m;i=i+1){
                System.out.println(i);
            }
        }
}}
