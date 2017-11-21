package essais;

public class AppliMain01 {
    public static void main(String[] args) {
        
        System.out.println("Hello world !");
        
        int i; // declaration une variable i de type entier
        int j;

        i = 30; // affectation
        j = 20;

        int somme; // declaration de variable
        somme = i + j; // affectation

        int produit = i * j; // declaration et affectation

        System.out.println(i + " + " + j + " = " + somme);
        System.out.println(i + " * " + j + " = " + produit);
        System.out.println("-----------------------------");
        
        float pi = 3.14F ;
        float rayon = 4;
       
        float produit02 = 2 * pi * rayon;
        System.out.println("produit02 = "+produit02);
        
        System.out.println("------------------------------");
        i = 15;
        j = 2;
        
        float quotient01 = i / j;
        System.out.println("quotient01 = "+quotient01);
        
        float x = 15;
        float y = 2;
        float quotient02 = i / y;
        System.out.println("quotient02 = "+quotient02);
        
    }
}
