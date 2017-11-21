package essais;

public class PorteeDesVariables {

    public static void main(String[] args) {
        System.out.println("--------- debut du main ---------");
        String message = "Bonjour";
        // System.out.println(message);
        int age = 25;
        int anneeNaissance = 2017 - age;
        String msg = message + ", vous etes né(e) en " + anneeNaissance;
        System.out.println(msg);
        // bloc de code
        {
            System.out.println("\t>>>>>> debut du bloc");
            String nom = "Titi";
            message = "hello!";
            System.out.println(message + " " + nom);
            System.out.println("\t>>>>>> fin du bloc");
        }
        //System.out.println("nom = "+nom); // on ne peut plus accéder à la variable nom
        //message = "Au revoir";
        System.out.println(message);
        System.out.println("-------- fin du main --------");
    }
}
