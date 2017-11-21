package exos;

/**
 //2. Afficher la somme des nombres de 1 à 10. OK 


Declaration des variables
Somme entier

Somme <- 0

DEBUT
Pour i allant de 1 à 10 pas de 1
Somme <- i + somme
FinPour
ecrire Somme
FIN
 */
public class ExoAlgo2 {
    public static void main(String[] args) {
        int i;
        int somme = 0;
        
        for(i=1 ;i <= 10;i = i+1){
            somme = somme + i;
        }
         System.out.println("la somme des nombres de 1 à 10 est  "+somme);
    }
}
