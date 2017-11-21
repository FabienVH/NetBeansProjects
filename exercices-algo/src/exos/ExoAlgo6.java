package exos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
6. Lire 10 nombres et trouver le plus petit et son rang. OK
Declaration des variables
a entier
petit entier
rang entier
rang <- 0

DEBUT
ecrire "entrez un nombre"
	lire a 
	petit <- a
	rang <- 1
	
pour i allant de 2 à 10 pas de 1
	ecrire "entrez un nombre"
	lire a 
	si petit > a 
	alors petit <- a et rang<- i
	fin si 
fin pour
ecrire "le plus petit nombre est le " & rang &"eme : "& petit
 */
public class ExoAlgo6 {
    public static void main(String[] args) throws IOException {
        int a;
        int petit;
        int rang = 0;
        int i = 0;
        
        String saisi;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new  BufferedReader(isr);
        
        System.out.println("saisissez un nombre");
        saisi =br.readLine();
        a = Integer.valueOf(saisi);
        petit = a;
        rang = 1;
        
        for(i=1;i<=9;i=i+1){
            System.out.println("saisissez un nombre");
        saisi =br.readLine();
        a = Integer.valueOf(saisi);
        if(petit > a){
            petit = a;
            rang = i+1;
        }}
        System.out.println("le plus petit nombre est le "+rang+"eme, c'est a dire le "+a);
    
}}
