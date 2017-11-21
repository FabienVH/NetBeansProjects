package fonctions;

/*
    1) java identifie une fonction par sa signature.
    2) la signature d'une fonction est constituée par
        a) son nom
        b) le nombre de ses parametres
        c) le type de ses parametres
        d) l'ordre de ses paramètres
    3) /!\ le type de retour ou void de fonction ne fait pas partie de sa signature
*/
public class Fonction03 {

    public static void main(String[] args) {
        float a = 3.14f;
        float b = 12.5f;
        System.out.println("===>> 1) dans main a = " + a + "  b = " + b);
        permuter(a,b);
        System.out.println("===>> 2) dans main -après permuter- a = " + a + "  b = " + b);
        
        System.out.println("============== tableaux =============");
        int tab[] = new int[3];
        tab[0] = 50;
        System.out.println("A) ==>>> dans main :");
        for(int i = 0; i < tab.length; i = i + 1){
            System.out.println("tab["+i+"]= "+tab[i]);
        }
        modifier(tab);
        System.out.println("B) ==>>> dans main après modifier01 :");
        for(int i = 0; i < tab.length; i = i + 1){
            System.out.println("tab["+i+"]= "+tab[i]);
        }
        
        
        System.out.println("============== String  =============");
        String s = "mon texte.";
        System.out.println("C.0) ===>> dans main s = "+s);
        modifier(s);
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
    
    public static void modifier(int[] entiers){
        if(entiers.length >=3){
            entiers[1] = 999;
            entiers[2] = 888;
        }
        System.out.println("\tb) fin modifier(int[] entiers) :");
        for(int i = 0; i < entiers.length; i = i + 1){
            System.out.println("\tt["+i+"]= "+entiers[i]);
        }
    }
    
    public static void modifier(String s){
        System.out.println("\tdans modifier(String s) s= "+s);
        s = s + "hello world!";
         System.out.println("\tfin modifier s= "+s);
    }
    
}
