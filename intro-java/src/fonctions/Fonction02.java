package fonctions;

public class Fonction02 {

    public static void main(String[] args) {
        float a = 3.14f;
        float b = 12.5f;
        System.out.println("===> dans main a = " + a + " b = " + b);

    }
    
    public static void permuter(float a, float b){
        System.out.println("\tdans permuter : a = "+a+" b = "+b);
        float f = a;
        a = b;
        b = f;
        
        
    }

}
