package essais;

public class AppliMain01 {
    
   public static void main(String[] args) {
         System.out.println("Hello world");
       int i; //declaration de variable i de type entier
       int j;
       
       i = 30; // affectation de variable (initialisation)
       j =20;
       
       int somme ; //declaration de variable
       somme = i +j; // affectation
       
       int produit = i* j; // declaration et affectation (en meme temps)
       
       System.out.println(i +"+" +j +" = " + somme);
       System.out.println(i +"*" +j+" = " + produit);
       System.out.println("----------------------------");
       
       float pi = 3.14f ;
       float rayon= 4;
       float perimetre = 2 * pi * rayon;
       
       System.out.println("perimetre "+perimetre);
       System.out.println("----------------------------");
       i = 15;
       j = 2;
       
       float quotien = i /j;
       System.out.println("quotient = "+quotien);
       
       float x =15;
       float y=2;
       float quotien02 = x /y;
       System.out.println("quotient = "+quotien02);
   }
  

}
    
    

