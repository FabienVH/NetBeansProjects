package chaines;


public class exemple {
    public static void main(String[] args) {
        String texte;
        texte = "mon texte.";
        
        System.out.println("longueur :"+texte.length());
        texte = "voici "+texte;
        System.out.println("texte:"+texte);
        System.out.println("longueur :"+texte.length());
        
        System.out.println(texte.charAt(2));
        
        
        //replace
        String s = "Bonjour";
        s = s.replaceAll("o","a");
        System.out.println(s);
    }
}
