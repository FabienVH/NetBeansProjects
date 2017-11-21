package obj;

public class Calculette {
    
    public int ajouter(int a, int b){
        return a + b;
    }
    
    public int soustraire(int a, int b){
        return a - b;
    }
    
    public int multiplier(int a, int b){
        return a * b;
    }
    
    /**
     * 
     * @param a dividende
     * @param b diviseur
     * @return t[0] : quotient, t[1] :  reste
     */
    public int[] diviser(int a, int b) throws ArithmeticException{
        int[] res = new int[2];
        
            System.out.println("\ton commence la division");
            res[0] = a / b;
            res[1] = a%b;            
            System.out.println("\tFin de la division");
         return res;        
    }
    
}
