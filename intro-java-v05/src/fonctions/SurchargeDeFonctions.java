package fonctions;
/*
 1) dans une meme classe, on est en présence de fonctions surchargées si elles
 ont le même nom mais leurs signatures sont différentes.
 2) surcharger une fonction c'est ecrire une autre fonction avec le meme nom
 en changeant un ou plusieurs élements ci-dessous :
 a) le nombre de ses parametres
 b) le type de ses parametres
 c) l'ordre de ses paramètres
 */

public class SurchargeDeFonctions {

    public static void main(String[] args) {
        int n;
        n = ajouter();
        System.out.println("1) n = "+n);
        
        String s = ajouter("hello", "world");
        System.out.println("2) s = "+s);
                
        int a = 356;
        n = ajouter(a);
        System.out.println("3) n = "+n);
        
        float f = ajouter(15.3f, 10);
        System.out.println("4) f = "+f);
    }
    
    public static float ajouter(float e, float f){
        System.out.println("\t>> dans ajouter(float e, float f)");
        return e + f;
    }
    
    public static float ajouter(float e, int f){
        System.out.println("\t>> dans ajouter(float e, int f)");
        return e + f;
    }
    
    public static float ajouter(int f, float e){
        System.out.println("\t>> dans ajouter(int f, float e)");
        return e + f;
    }
    
    /**
     * cette fonction retourne toujours la meme valeur
     * @return valeur = -11
     */
    public static int ajouter() {
        System.out.println("\t>> dans ajouter()");
        return -11;
    }
    
    /**
     * cette fonction renvoie la valeur d'entrée
     * @param a
     * @return retourne a
     */
    public static int ajouter(int a) {
        System.out.println("\t>> dans ajouter(int a)");
        return a;
    }
    
    
    public static int ajouter(int a, int b) {
        System.out.println("\t>> dans ajouter(int a, int b)");
        int somme = a + b;
        return somme;
    }
    
    /**
     * Concatene les deux chaines en entree en les separant par un espace
     * @param a debut la chaine
     * @param b fin de la chaine
     * @return  a + " " + b
     */    
    public static String ajouter(String a, String b) {
        System.out.println("\t>> dans ajouter(String a, String b)");
        String c = a + " " + b;
        return c;
    }

//    impossible car il existe déjà une fonction de même signature
//    public static String ajouter(){
//        System.out.println("\t>> dans ajouter()");
//        return "hello";
//    }
}
