package tableaux;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exemple01 {

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        String[] mesTextes; // déclaration d'une variable pour désigner une tableaux de String
        mesTextes = new String[4]; // creation d'un tableau de longueur 5 et affectation à la variable mesTextes
        for (int k = 0; k < mesTextes.length; k = k + 1) {
            System.out.println("saisir le texte n° " + (k + 1));
            mesTextes[k] = br.readLine();
        }

        System.out.println("---");
        for (int k = 0; k < mesTextes.length; k = k + 1) {
            System.out.println("mesTextes[" + k + "]= " + mesTextes[k]);
        }
        br.close();
        isr.close();
    }
}
