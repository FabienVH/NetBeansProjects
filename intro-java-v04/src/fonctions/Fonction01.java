package fonctions;

public class Fonction01 {
    public static void main(String[] args) {
        System.out.println("====== debut du main");
        int i = 150;
        int j = 300;
        
        int r= -111;
        r = ajouter(j,i);
        System.out.println(">>> de retour dans le main");
        System.out.println("1) r = "+r);
        
        int a = 10;
        int b = 20;
        r = ajouter(a,b);
        System.out.println("2) r = "+r);
        
        r = ajouter(-10,b);
        System.out.println("3) r = "+r);
        
        r= ajouter(78,12);
        System.out.println("4) r = "+r);
        
        System.out.println("====== fin du main");
    }
    
    public static int ajouter(int a, int b){
        System.out.println("\tdans ajouter : a= "+a+"   b="+b);
        int somme = a + b;
        System.out.println("\tavant le return somme = "+somme);
        return somme;
        
    }
    
    
}
