package essais;

public class PorteeDesVariables {
    public static void main(String[] args){
    System.out.println("---------Debut du main------------");
    
    String message = "Bonjour";
    System.out.println(message);
    int age = 25;
    int anneeNaissance = 2017 - age;
    String msg = message + ",vous etes né en  "+anneeNaissance ;
    System.out.println(msg);
    
    //bloc du code
    {
        System.out.println("\t >>>>>>>>>>>>>>>debut");
        String nom= "Titi";
        message="Hello";
        System.out.println(message+" "+nom);
    }
    //on ne peut plus acceder a la variable "nom" car elle est dans un bloc fermé
    message = "Au revoir";
    
    System.out.println("---------Fin du main------------");
    }
}
