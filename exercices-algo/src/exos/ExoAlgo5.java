package exos;
// probleme avec les saisies de plus de 10 caracteres ou vide
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*5. Lire 10 nombres et trouver le plus grand. 
Declaration des variables
a entier
grand entier

DEBUT
ecrire "entrez un nombre"
	lire a 
	grand <- a
	
pour i allant de 1 a 9 pas de 1
	ecrire "entrez un nombre"
	lire a 
	si grand < a 
	alors grand <- a 
	fin si 
fin pour	
ecrire "le plus grand nombre est " & grand

FIN 
 */
public class ExoAlgo5 {
    public static void main(String[] args) throws IOException {
        int a=0;
        int i;
        int grand=0 ;
       
        String saisi;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new  BufferedReader(isr);
        
        
        //System.out.println(n);
        System.out.println("------- vous allez saisir 10 nombres -------");
        System.out.println("saisissez un nombre");
        saisi =br.readLine();
        a = Integer.valueOf(saisi);
        grand = a;
      
        for(i = 1; i<=9;i=i+1){
            System.out.println("saisissez un nombre n");
        saisi =br.readLine();
        a = Integer.valueOf(saisi);
        
            if(grand<a){
                grand = a;
            }
        }
        System.out.println("le plus grand nombre est "+grand);
    }}

