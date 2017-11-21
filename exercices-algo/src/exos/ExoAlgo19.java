package exos;

/**
19. Afficher la présence d'une lettre dans une chaîne (si oui, en afficher le nombre
(quantité, si non, afficher "absent").
 */
public class ExoAlgo19 {
     public static void main(String[] args) {
        char n='e' ;
        String texte="textePourTest";
        int count=0;
        
        for(int i=0;i<texte.length();i++){
            if(texte.charAt(i)==n){
                count=count+1;
            }
            
        }
    
        if(count==0){
            System.out.println(n+" est  absent");
        }else{
            System.out.println("il y a "+count+" fois la lettre "+n);
        }
    }
    
    
}
