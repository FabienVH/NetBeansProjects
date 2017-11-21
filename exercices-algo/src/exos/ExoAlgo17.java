package exos;

/**
Remplacer toutes les occurrences d'une lettre par une autre dans une chaîne de
caractères.
 */
public class ExoAlgo17 {
    public static void main(String[] args) {
        char n='e' ;
        char r='*';
        String texte="textePourTest";
        String texte02="";
        
        for(int i=0;i<texte.length();i++){
            if(texte.charAt(i)!=n){
                texte02=texte02+texte.charAt(i);
            }else{
                texte02=texte02+r;
                 }
            
        }
    
        System.out.println(texte02);
    }
    
}
