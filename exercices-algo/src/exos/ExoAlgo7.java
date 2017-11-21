package exos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 //7. Lire n nombres et en calculer la moyenne.
Declaration des variables
entier a 
entier n 
entier somme


DEBUT 
	ecrire "combien voulez vous rentrer de nombres?"
	lire n 
	
	pour i allant de 1 à n pas de 1
		ecrire "entrez un nombre"
		lire a
		somme <- a+somme 
	fin pour
	
	ecrire "la moyenne est de " & somme/n 	
 */
public class ExoAlgo7 {
    public static void main(String[] args) throws IOException {
        int n = 0;
        int somme =0;
        int a =0;
        int i =0;
        
        String saisi;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new  BufferedReader(isr);
        
        System.out.println("Combien voulez vous saisir de nombres?");
        saisi =br.readLine();
        n = Integer.valueOf(saisi);
        System.out.println("----saisie des nombres----");
        
        for(i=1;i<=n;i= i+1){
            System.out.println("saisissez un nombre");
        saisi =br.readLine();
        a = Integer.valueOf(saisi);
        somme= somme+a;
        }
        
        System.out.println("la somme des nombres est "+somme);
    }
}
