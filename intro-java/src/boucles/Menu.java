package boucles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Menu {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new  InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String message = "vous avez choisi Option ";
        int choix;
        boolean continuer = true;
        String saisi;
        
        do{
            System.out.println("\n -----------Menu------------");
            System.out.println("1: Option A");
            System.out.println("2: Option B");
            System.out.println("3: Option C");
            System.out.println("4: Quitter");
            System.out.print("Votre choix ?");
            saisi = br.readLine();
            choix = Integer.valueOf(saisi);
            
            if(choix ==1){
                System.out.println(message+"A");
            }
            
            
            if(choix == 2){
                System.out.println(message+"B");
            }
            
            
              if(choix == 3){
                System.out.println(message+"C");
            }
           
            
            if(choix == 4){
                System.out.println(">>Au revoir!");
                continuer = false;
            }
        }while(continuer);
        
        br.close();
        isr.close();
    }

   }

