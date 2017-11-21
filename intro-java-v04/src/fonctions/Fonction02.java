package fonctions;

public class Fonction02 {

    public static void main(String[] args) {
        float a = 3.14f;
        float b = 12.5f;
        System.out.println("===>> 1) dans main a = " + a + "  b = " + b);
        permuter(a,b);
        System.out.println("===>> 2) dans main -après permuter- a = " + a + "  b = " + b);
        
        System.out.println("===========================");
        int tab[] = new int[3];
        tab[0] = 50;
        System.out.println("A) ==>>> dans main :");
        for(int i = 0; i < tab.length; i = i + 1){
            System.out.println("tab["+i+"]= "+tab[i]);
        }
        modifier01(tab);
        System.out.println("B) ==>>> dans main après modifier01 :");
        for(int i = 0; i < tab.length; i = i + 1){
            System.out.println("tab["+i+"]= "+tab[i]);
        }
        
        
        System.out.println("===========================");
        String s = "mon texte.";
        System.out.println("C.0) ===>> dans main s = "+s);
        modifier02(s);
        System.out.println("C.1) ===>> dans main après modifer02 s = "+s);
    }
    
    public static void permuter(float a, float b){
        System.out.println("\t1)dans permuter : a = "+a
        +" b = "+b);
        float f = a;
        a = b;
        b = f;
        System.out.println("\t2)dans permuter : a = "+a
        +" b = "+b);
    }
    
    public static void modifier01(int[] entiers){
        if(entiers.length >=3){
            entiers[1] = 999;
            entiers[2] = 888;
        }
        System.out.println("\tb) fin modifier01 :");
        for(int i = 0; i < entiers.length; i = i + 1){
            System.out.println("\tt["+i+"]= "+entiers[i]);
        }
    }
    
    public static void modifier02(String s){
        System.out.println("\tdans modifier02 s= "+s);
        s = s + "hello world!";
         System.out.println("\tfin modifier02 s= "+s);
    }
    
    
    
}
