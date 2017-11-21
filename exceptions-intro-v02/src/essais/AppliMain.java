package essais;

import obj.Calculette;

public class AppliMain {

    public static void main(String[] args) {

        Calculette calc = new Calculette();
        int a = 15;
        int b = 10;
        int c = 23;

        int somme = calc.ajouter(a, b);
        System.out.println("1) "+a + " + " + b + " = " + somme);
        somme = calc.ajouter(a, c);
        System.out.println("2) "+a + " + " + c + " = " + somme);
        somme = calc.ajouter(calc.ajouter(a, b),c);
        System.out.println("3) "+a + " + "+b+" + " + c + " = " + somme);
        System.out.println("---");
        int d = 88;
        int ds = 0;
        try{
            int r[] = calc.diviser(d, ds);
            System.out.println("4) "+d +" : "+ds+" = "+r[0]+", reste = "+r[1]);
        }catch(ArithmeticException ex){
            System.out.println("oups erreur ");
            System.out.println("message = "+ex.getMessage());
            ex.printStackTrace();
        }finally{
            System.out.println(">>>>>>>>>>>> dans le finally");
        }
        
        System.out.println("=========== FIN ==========");
    }
}
