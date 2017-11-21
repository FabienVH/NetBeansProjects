package tests;

public class Conditionnel {
    public static void main(String[] args){
        System.out.println("--------------------------DEBUT---------------------------");
        int entier01 =350;
        int entier02 =500;
        
        if(entier01 >= 500){
            System.out.println(entier01+" est superieur à "+entier02);
    
            }else{
            System.out.println(entier01+" est inferieur à "+entier02);
        }
        
        int entier03 = 56;
        if (entier03>=0 && entier03<=9){
            String texte = " s'ecrit avec un seul caractere";
            System.out.println(entier03 + texte);
        }else{
            String texte = " s'ecrit avec au moins 2 caracteres";
            System.out.println(entier03 + texte );
            
        }
        
        if (entier03 <0 || entier03>9){
            System.out.println(entier03+"est superieur à 9 ou infereieur a 0");
        }
        
        if(entier03 %2 == 0){
          System.out.println(entier03+" est un nombre pair");
        }
    }
}
