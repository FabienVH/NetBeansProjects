/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exos;

/**
16. Remplacer tous les caractères d'une chaîne par une '*'
 */
public class ExoAlgo16 {
     public static void main(String[] args) {
        String texte ="essai-essai";
        String texte02="";
        
        for(int i=0;i<(texte.length());i++){
            texte02=texte02+"*" ;
        }
        
        System.out.println(texte02);
    }
}
