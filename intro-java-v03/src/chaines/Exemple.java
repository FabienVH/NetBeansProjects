package chaines;

public class Exemple {
    public static void main(String[] args) {
        String texte;        
        texte = "mon texte.";
        
        System.out.println("1) longueur = "+texte.length());
        texte = "voici " + texte;
        System.out.println("texte : "+texte);
        System.out.println("2) longueur = "+texte.length());
        System.out.println(texte.charAt(2));
        
        String hello = "hallo wold!";
        System.out.println("3) hello = "+hello);
        // on ne peut pas modifier le contenu d'un String en java
        // on est obligé d'affecter un nouveau String
        hello = "hello world";
        
        //replace
        String s = "bonjour";
        String s02 = s.replace("o", "a");
        
        System.out.println("a) s= "+s);
        System.out.println("b) s02 = "+s02);
        
        s = s.replaceAll("o", "a");
        System.out.println("c) s= "+s);
    }
}
