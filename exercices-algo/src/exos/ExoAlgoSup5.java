package exos;

/**
// Un damier de dimension 4x4 peut se réprésenter de la forme suivante:
 // oxox
 // xoxo
 // oxox
 // xoxo
 // Votre programme doit afficher un damier de taille 40x40.
 // Assurez-vous bien que la case tout en haut à gauche contienne un "o", 
 * comme c'est le cas dans le damier ci-dessus
 */
public class ExoAlgoSup5 {
    public static void main(String[] args) {
        
       for(int i=1;i<= 100;i++){
           if(i%2!=0 ||i%20 ==0 || i%10 ==0){
               System.out.println("o");
           }
           if(i%2==0 ||i%20 !=0 || i%10 ==0 ){
               System.out.print("x");
           }
           if(i%2!=0 ||i%20 !=0 || i%10 ==0 ){
               System.out.print("x");
           }
           
           if(i%2==0 || i%20 !=0 || i%10 !=0 ){
                   System.out.print("x");
           }
           if(i%2!=0 || i%20 !=0 || i%10 !=0){
               System.out.print("o");
           }
            
    }
}}
