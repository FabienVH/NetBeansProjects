package exos;

/**
 18. Supprimer toutes les occurrences d'une lettre dans une chaîne de caractères.
 */
public class ExoAlgo18 {
    public static void main(String[] args) {
        char n='e' ;
        String texte="textePourTest";
        String texte02="";
        
        for(int i=0;i<texte.length();i++){
            if(texte.charAt(i)!=n){
                texte02=texte02+texte.charAt(i);
            }
            
        }
    
        System.out.println(texte02);
    }
}
