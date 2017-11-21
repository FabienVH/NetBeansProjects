package exos;

/**
//15. Inverser une chaîne de caractères (sans supprimer l'originale).

 */
public class ExoAlgo15 {
    public static void main(String[] args) {
        String texte ="essai";
        String texte02="";
        
        for(int i=(texte.length()-1);i>=0;i--){
            texte02=texte02+texte.charAt(i) ;
        }
        
        System.out.println(texte02);
    }
    
}
