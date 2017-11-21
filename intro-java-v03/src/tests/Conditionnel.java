package tests;

public class Conditionnel {
    public static void main(String[] args) {
        System.out.println("----------- debut --------");
        int entier01 = 950;
        int entier02 = 600;
        
        if(entier01 >= entier02){            
            System.out.println(entier01 + " est superieur à "+entier02);
        } else {
            System.out.println(entier01 + " est strictement inférieur à "+entier02);
        }
        
        int entier03 = -73;
        if(0 <= entier03 && entier03 <= 9){
            String texte = " s'écrit avec avec un seul caractère.";
            System.out.println(entier03 + texte);
        }else {
            String texte = " s'écrit avec au moins deux caractères.";
            System.out.println(entier03 + texte);
        }
        
        
        if(entier03 < 0 || entier03 > 9){
            String texte = " s'écrit avec au moins deux caractères.";
            System.out.println(entier03 + texte);
        }
        
        if(entier03 % 2 == 0){
            System.out.println(entier03 + " est pair");
        }else{
            System.out.println(entier03 + " est impair");
        }
        
        System.out.println("---------- fin ---------");
    }
}
