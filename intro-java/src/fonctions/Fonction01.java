package fonctions;

public class Fonction01 {
    public static void main(String[] args) {
        System.out.println("===debut du main");
        int i =150;
        int j =300;
        
        ajouter(j,i);
        System.out.println(">>>>de retour dans le main");
        System.out.println("fin du main");
        
    }
    public static int ajouter(int a,int b){
        System.out.println("\tdebut d'ajouter: a="+a+"   b="+b);
        int somme = a+b;
        System.out.println("\tavant le return somme= "+somme);
        return somme;
    }
    
    
}
