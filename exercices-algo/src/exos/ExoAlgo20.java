package exos;

/**
20. Compter le nombre d'occurrences de chaque lettre dans une chaine.
 */
public class ExoAlgo20 {
    public static void main(String[] args) {
        char n='e' ;
        String texte="textepourtest";
                                        //WIP car retour au 12
        
        for (char alphabet = 'a'; alphabet <= 'z'; alphabet++) {
                int count=0;
            for(int i=0;i<texte.length();i++){
                if(texte.charAt(i)==alphabet){
                    count=count+1;
                }
            System.out.println("il y a "+count+" fois la lettre "+alphabet);
            }
          
        }
       
    }
}
