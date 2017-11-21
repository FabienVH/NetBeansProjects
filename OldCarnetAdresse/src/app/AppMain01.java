package app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import obj.*;

public class AppMain01 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        //creation de l'arraylist 
        List<Connaissance> contacts = new ArrayList();
        
        
        //menu du carnet d'adresse
        int choix;
        String saisi;
        boolean continuer = true;
        
        
        do{
            System.out.println(
" \\ \\/ /\\/ /\\ \\/ /\\/ /\\/                    \\ \\/\\ \\/ /\\ \\/\\ \\/\\ \\  \n" +
"  \\ \\/\\ \\/\\ \\/\\ \\/\\ \\/   Carnet d'adresses  \\/ /\\/ /  \\/ /\\/ /\\/ \n" +
"(__/\\__/\\__/\\__/\\__/\\________________________/\\__/\\__/\\__/\\__/\\_)\n") ;
            System.out.println("1>> afficher liste");
            System.out.println("2>> afficher fiche");
            System.out.println("3>> creer fiche");
            System.out.println("4>> modifier fiche");
            System.out.println("5>> Quitter");
            System.out.print("votre choix ? ");
            saisi = br.readLine();
            choix = Integer.valueOf(saisi);
            
            if(choix == 1){
                System.out.println("---afficher liste---"); 
            //todo
            }
            
            if(choix == 2){
                System.out.println("---afficher fiche---");
                //todo
            }
            
            if(choix == 3){
                System.out.println("---creer fiche---");
                    System.out.println("ami:1 \nfamille :2 \nconnaissance :3 ");
                    saisi = br.readLine();
                    choix = Integer.valueOf(saisi);
                    if(choix == 1){
                    
                    }
                //todo
            }
            
            if(choix == 4){
                System.out.println("---modifier fiche---");
                //todo
            }
            
            if(choix == 5){
                System.out.println(">> Au revoir");
                continuer = false;
            }
            
        }while(continuer);
        
        br.close();
        isr.close();    
        
        
    }
}