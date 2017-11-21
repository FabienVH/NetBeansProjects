package exos;
// probleme saisie vide
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
//4. Afficher la somme des nombres pairs de n à m.
 */
public class ExoAlgo4 {
    public static void main(String[] args) throws IOException {
       /*

SI m>n alors
	si n/2 = (n+1)/2  alors
		Pour i allant de n a m pas de 2
			Somme <- i + somme
		FinPour
		ecrire Somme
	sinon
		n<-n+1
		Pour i allant de n a m pas de 2
			Somme <- i + somme
		FinPour
		ecrire Somme
	FIN SI 
SINON 
	si n/2 = (n+1)/2  alors
		Pour i allant de n a m pas de -2
			Somme <- i + somme
		FinPour
		ecrire Somme
	sinon
		n<-n-1
		Pour i allant de n a m pas de -2
			Somme <- i + somme
		FinPour
		ecrire Somme
	FIN SI 
FIN SI
        */ 
        int n;
        int m;
        int somme = 0;
        int i;
        int temp;
        
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
        /*
        SI m>n alors
            si n/2 = (n+1)/2  alors
		Pour i allant de n a m pas de 2
			Somme <- i + somme
		FinPour
		ecrire Somme
            sinon
		n<-n+1
		Pour i allant de n a m pas de 2
			Somme <- i + somme
		FinPour
		ecrire Somme
	FIN SI 
        */if (m>n){
            
        i = n;
            if(i%2 == 0){
                for(i=n;i<=m;i = i+2){
                    somme = somme + i;
                }
        }else{
                for(i=n+1;i<=m;i = i+2){
                    somme = somme + i;
                }
            }
    }else{
           temp = n;
            n = m;
            m = temp;
            i = n;
            if(i%2 == 0){
                for(i=n;i<=m;i = i+2){
                    somme = somme + i;
                }
        }else{
                for(i=n+1;i<=m;i = i+2){
                    somme = somme + i;
                }
        }
            
}
    System.out.println("la somme des nombres paires entre n et m est "+somme);
    }}
