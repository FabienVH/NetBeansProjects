package egalite;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exemple01 {

    public static void main(String[] args) throws IOException {
        String s = "bonjour";
        String r = "bonjour";
        boolean ok01 = (s == r);
        boolean ok02 = s.equals(r);
        System.out.println("1)s = " + s + ", r= " + r);
        System.out.println("1.1) s == r ? " + ok01);
        System.out.println("1.2) s equals r ? " + ok02);

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        System.out.println("\n---");
        System.out.println("saisir un texte :");
        String saisi = br.readLine();
        ok01 = (s == saisi);
        ok02 = s.equals(saisi);
        System.out.println("2)s = " + s + ", saisi= " + saisi);
        System.out.println("2.1) s == saisi ? " + ok01);
        System.out.println("2.1) s equals saisi ? " + ok02);
        System.out.println("\n---");
        
        String s02 = new String("bonjour");
        ok01 = (s == s02);
        ok02 = s.equals(s02);
        System.out.println("3)s = " + s + ", s02= " + s02);
        System.out.println("3.1) s == s02 ? " + ok01);
        System.out.println("3.1) s equals s02 ? " + ok02);
        br.close();
        isr.close();

    }
}
