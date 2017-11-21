package exos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 //3. Afficher les nombres de n à m.
//b) Permuter n et m, puis continuer.  OK 

Declaration des variables
m Entier
n Entier
temp Entier 

DEBUT
ecrire "entrez un nombre"
lire n 
ecrire "entrez un nombre"
lire m 

SI m>n alors
	Pour i allant de n a m pas de 1
		ecrire i
	fin pour
SINON
		temp<-n 
		n<-m 
		m<-temp 
	Pour i allant de n a m pas de 1
	ecrire i
	fin pour
FIN SI
FIN
 */
public class ExoAlgo3b {
    public static void main(String[] args) throws IOException {
       int m;
        int n;
        int i;
        int temp;
        String saisi;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new  BufferedReader(isr);
        
        System.out.println("saisissez un nombre n");
        saisi = br.readLine();
        n = Integer.valueOf(saisi);
        //System.out.println(n);
        System.out.println("saisissez un nombre m");
        saisi =br.readLine();
        m = Integer.valueOf(saisi);
        //System.out.println( n+" et "+m );
        System.out.println("-----------------");
        if(n >m){
            /*
            temp<-n 
		n<-m 
		m<-temp 
	Pour i allant de n a m pas de 1
	ecrire i
	fin pour
            */
            temp = n;
            n = m;
            m = temp;
            for(i=n;i<=m;i=i+1){
                System.out.println(i);
            }
        }else{
            for(i=n;i<=m;i=i+1){
                System.out.println(i);
            }
        } 
    }
}
