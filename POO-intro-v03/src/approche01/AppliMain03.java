package approche01;

public class AppliMain03 {
    public static void main(String[] args) {
        Ville v = new Ville();
        System.out.println("1) "+v.seDecrire());
        
        // v.nom = "Nom-01"; impossible car les propriétés de Ville sont en private
        // v.surface = 100;
        
        v.setNom("NOM-01");        
        System.out.println("2) "+v.seDecrire());
        
        
        v.setSurface(100);
        v.setPopulation(-200);
        System.out.println("3) "+v.seDecrire());
        System.out.println("3.1) densité = "+v.calculerDensite());
        
        v.setPopulation(200);
        v.setCp("789654");
        System.out.println("4) "+v.seDecrire());
        System.out.println("4.1) densité = "+v.calculerDensite());
        // System.out.println("3) nom de la ville v : "+ v.nom);
        System.out.println("5) nom de la ville v : "+ v.getNom());
    }
}
