package Exo01;

import Obj.Lettre;
import Obj.ObjetPostal;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class AppliMain01 {
    public static void main(String[] args) throws IOException {
     InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String message = ">> Entrez le type d'objet (1 pour lettre, 2 pour colis)";
        String fin = "vos envois:";
        int choix;
        int type;
        int index =  0;
        int urgent;
        ObjetPostal[] envoi;
        envoi= new ObjetPostal[4];
       
        String saisi;
        do{
            System.out.println("\n------ Boite aux lettres ------");
            System.out.println("1: Affranchissement");
            System.out.println("2: Terminer");
            System.out.print("votre choix ? ");
            saisi = br.readLine();
            choix = Integer.valueOf(saisi);
            
            if(choix == 1){
                System.out.println(message);
                String saisi02 = br.readLine();
                type = Integer.valueOf(saisi02);
                
                    if(type == 1){
                        envoi[index] = new Lettre();  
                        Lettre l01 = (Lettre) envoi[index];
                            System.out.println("pour un envoi urgent: tappez 1,sinon 2");
                            String saisi03 = br.readLine();
                            urgent = Integer.valueOf(saisi03);
                            if (urgent == 1){
                               l01.setUrgence(true);
                            }
                        System.out.println("nom:");
                        String nom01= br.readLine();
                        l01.setNomDestinataire(nom01);
                        System.out.println("adresse:");
                        String adresse01 = br.readLine();
                        l01.setAdresseDestinataire(adresse01);
                        System.out.println("CP:");
                        String cp01 = br.readLine();
                        l01.setCpDestinataire(cp01);
                        System.out.println("Ville:");
                        String ville01 = br.readLine();
                        l01.setVilleDestinataire(ville01);
                            System.out.println("recommandé?:");
                            saisi = br.readLine();
                            int reco = Integer.valueOf(saisi);
                            if (reco == 1){
                               l01.setRecommande(true);
                            }
                        System.out.println(l01);
                        System.out.println("le prix de l'envoi est de "+l01.PrixAffranchissementLettre());
                    }
//                        if(type == 2){
//
//
//                        }
                    
                    
                    
                    
                index++;
            }
            
            if(choix == 2){
                System.out.println(fin);
            }
            
            
        }while(index<4);
        
        
        
        br.close();
        isr.close();
    }
}
