package exos;

/**
//14. Créer une chaîne de caractères de 50 '-'
chaine texte

DEBUT
texte<-"-"
pour i allant de 1 à 49
	texte<- texte&"-"
finpour
FIN
 */
public class ExoAlgo14 {
    public static void main(String[] args) {
        String texte ="-";
        
        for(int i=1;i<50;i++){
            texte= texte+"-";
        }
        System.out.println(texte.length());
        System.out.println(texte);
        
    }
}
