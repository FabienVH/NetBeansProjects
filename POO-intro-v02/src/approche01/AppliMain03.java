package approche01;

public class AppliMain03 {
    public static void main(String[] args) {
        Ville v = new Ville();
        System.out.println("1) "+v.seDecrire());
        
        v.nom = "Nom-01";
        // v.surface = 100;
        System.out.println("2) "+v.seDecrire());
        
        System.out.println("3) nom de la ville v : "+ v.nom);
    }
}
