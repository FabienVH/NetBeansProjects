package exos;

/**
A partir de deux tableaux précédemment saisis, écrivez un algorithme qui calcule 
* le schtroumpf des deux tableaux. Pour calculer le schtroumpf, 
* il faut multiplier chaque élément du tableau 1 par chaque élément du tableau 2,
* et additionner le tout. Par exemple si l'on a :
Tableau 1: 4 8 7 12 Tableau 2 : 3  6
Le Schtroumpf sera :
3*4 +3*8 +3*7 +3 *12+ 6*4+6*8+ 6*7 + 6*12 = 279

 */
public class ExoAlgoSup4 {
    public static void main(String[] args) {
        
        int tableau1[] = {4,8,7,12};
        int tableau2[] = {3,6};
        int total = 0;        
          
        //System.out.println(tableau1.length*tableau2.length);
        //System.out.println(tableau1[0]*tableau2[1]);
        for(int i=0;i < tableau1.length;i++){
                for(int j=0;j < tableau2.length;j++){
                    total =total+( tableau1[i]*tableau2[j]);
                }
        }
                
        System.out.println(total);      
    }
}
