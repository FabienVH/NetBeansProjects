package app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import obj.*;

public class AppMain01 {

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        //creation de l'arraylist 
        List<Connaissance> contacts = new ArrayList();
        //contacts de test 
        contacts.add(new Connaissance(1,"Skywalker", "Luke", "12 rue des jawas", "75000","Mos Eisley","01 52 45 63 52", "Luke01@wanadoo.fr"));
        contacts.add(new Ami("06 52 14 52 36",2, "Skywalker", "Anakin", "17 rue des jawas", "75000","Mos Eisley","01 52 45 21 49", "Anakin.Sky@wanadoo.fr"));
        contacts.add(new Famille("06 52 14 52 36","22 Mars 1979",3, "Kenobi", "ObiWan", "11 rue des tuskens", "75010","Mos Espa","01 52 12 63 44", "OB1@wanadoo.fr"));
        contacts.add(new Connaissance(4,"Jin", "QiGon", "12 rue des jawas", "78000","Mos Eisley","01 52 45 63 52", "QGJ@wanadoo.fr"));
        contacts.add(new Ami("06 52 14 52 36",5, "Koon", "Plo", "17 rue des jawas", "75000","Mos Eisley","01 52 45 21 49", "PlK@wanadoo.fr"));
        contacts.add(new Famille( "06 52 14 52 36","22 Mars 1979",6,"Organa", "Leia", "11 rue des tuskens", "75010","Mos Espa","01 52 12 63 44", "princessL@wanadoo.fr"));
        contacts.add(new Connaissance(7,"Solo", "Han", "12 rue des jawas", "77000","Mos Eisley","01 52 45 63 52", "Shot1st@wanadoo.fr"));
        contacts.add(new Ami("06 52 14 52 36",8, "Ren", "Kylo", "17 rue des jawas", "75000","Mos Eisley","01 52 45 21 49", "KyloSolo@wanadoo.fr"));
        contacts.add(new Famille( "06 56 46 45 26","22 Mars 1981",9, "Amidala", "Padme", "11 rue des tuskens", "75020","Mos Espa","01 52 12 63 44", "padme@wanadoo.fr"));

        //menu du carnet d'adresse
        int choix;
        String saisi;
        boolean continuer = true;

        do {
            System.out.println(
                    " ________________________\n"
                    + "|   Carnet d'adresses    | \n"
                    + "|________________________|\n");
            System.out.println("1>> afficher liste");
            System.out.println("2>> afficher fiche");
            System.out.println("3>> creer fiche");
            System.out.println("4>> modifier fiche");
            System.out.println("5>> Quitter");
            System.out.print(">>> votre choix ? ");
            saisi = br.readLine();
            choix = Integer.valueOf(saisi);

            if (choix == 1) { //afficher liste
                System.out.println("1>> afficher tous vos contats");
                System.out.println("2>> afficher vos amis");
                System.out.println("3>> afficher votre famille");
                System.out.println("4>> afficher vos connaissances");
                System.out.println("5>> Quitter");
                System.out.print(">>> votre choix ? ");
                saisi = br.readLine();
                choix = Integer.valueOf(saisi);
               // TriParCPNomPrenom tr02 = new TriParCPNomPrenom();
                //contacts.sort(tr02);
                if (choix == 1) { //afficher tous les contacts
                  
                    for(Connaissance c01 : contacts ){
                     if(c01 instanceof Connaissance){
                        System.out.println(c01);
                    }
                  
                }}
                if (choix == 2) { //afficher les amis
                    for(Connaissance c01 : contacts ){
                     if(c01 instanceof Ami){
                        System.out.println(c01);
                    }
                    } 
                }    
                if (choix == 3) { //afficher la famille
                    for(Connaissance c01 : contacts ){
                     if(c01 instanceof Famille){
                        System.out.println(c01);
                    }
                    }
                }
             if (choix == 4) { //afficher les connaissances
                    for(Connaissance c01 : contacts ){
                     if(c01 instanceof Connaissance && !(c01 instanceof Ami) && !(c01 instanceof Famille) ){
                        System.out.println(c01);
                    }
                    
                }}   
                
            }

            if (choix == 2) {
                System.out.println("---afficher fiche---");
                //todo
                System.out.println("saisissez le nom du contact");
                saisi = br.readLine();
                String nom = saisi;
               System.out.println("saisissez le prenom du contact");
                saisi = br.readLine();
                String Prenom = saisi;
                for(Connaissance c01 : contacts ){
                     if(c01.getNom().equalsIgnoreCase(nom) && c01.getPrenom().equalsIgnoreCase(Prenom)){
                        System.out.println(c01);
                    }
                    }
            }

            if (choix == 3) {
                System.out.println("---creer fiche---");
                // a changer pour un switch
                System.out.println("ami:1 \nfamille :2 \nconnaissance :3 ");
                saisi = br.readLine();
                choix = Integer.valueOf(saisi);
                if (choix == 1) {
                    System.out.println("---créer ami---");
                    Ami newContact = new Ami();
                    contacts.add(newContact);
                    int numeroFiche = contacts.indexOf(newContact) + 1;
                    newContact.setNumeroFiche(numeroFiche);
                    System.out.println("Saisi le nom");
                    String Nom = br.readLine();
                    newContact.setNom(Nom);
                    System.out.println("Saisi le prénom");
                    String Prenom = br.readLine();
                    newContact.setPrenom(Prenom);
                    System.out.println("Saisi l numero et la rue");
                    String Rue = br.readLine();
                    newContact.setRue(Rue);
                    System.out.println("Saisi le CodePostal");
                    String Cp = br.readLine();
                    newContact.setCp(Cp);
                    System.out.println("Saisi la ville");
                    String Ville = br.readLine();
                    newContact.setVille(Ville);
                    System.out.println("Saisi le téléphone");
                    String Telephone = br.readLine();
                    newContact.setTelephone(Telephone);
                    System.out.println("Saisi le numéro de mobile");
                    String Mobile = br.readLine();
                    newContact.setMobile(Mobile);
                    System.out.println("Saisi l'adresse email");
                    String Email = br.readLine();
                    newContact.setEmail(Email);
                }
                if (choix == 2) {
                    System.out.println("---créer membre de la famille---");
                    Famille newContact = new Famille();
                    contacts.add(newContact);
                    int numeroFiche = contacts.indexOf(newContact) + 1;
                    newContact.setNumeroFiche(numeroFiche);
                    System.out.println("Saisi le nom");
                    String Nom = br.readLine();
                    newContact.setNom(Nom);
                    System.out.println("Saisi le prénom");
                    String Prenom = br.readLine();
                    newContact.setPrenom(Prenom);
                    System.out.println("Saisi l numero et la rue");
                    String Rue = br.readLine();
                    newContact.setRue(Rue);
                    System.out.println("Saisi le CodePostal");
                    String Cp = br.readLine();
                    newContact.setCp(Cp);
                    System.out.println("Saisi la ville");
                    String Ville = br.readLine();
                    newContact.setVille(Ville);
                    System.out.println("Saisi le téléphone");
                    String Telephone = br.readLine();
                    newContact.setTelephone(Telephone);
                    System.out.println("Saisi le numéro de mobile");
                    String Mobile = br.readLine();
                    newContact.setMobile(Mobile);
                    System.out.println("Saisi l'adresse email");
                    String Email = br.readLine();
                    newContact.setEmail(Email);
                    System.out.println("Saisi la date de naissance");
                    String Naissance = br.readLine();
                    newContact.setDateNaissance(Naissance);
                }
                if (choix == 3) {
                    System.out.println("---créer connaissance---");
                    Connaissance newContact = new Connaissance();
                    contacts.add(newContact);
                    int numeroFiche = contacts.indexOf(newContact) + 1;
                    newContact.setNumeroFiche(numeroFiche);
                    System.out.println("Saisi le nom");
                    String Nom = br.readLine();
                    newContact.setNom(Nom);
                    System.out.println("Saisi le prénom");
                    String Prenom = br.readLine();
                    newContact.setPrenom(Prenom);
                    System.out.println("Saisi l numero et la rue");
                    String Rue = br.readLine();
                    newContact.setRue(Rue);
                    System.out.println("Saisi le CodePostal");
                    String Cp = br.readLine();
                    newContact.setCp(Cp);
                    System.out.println("Saisi la ville");
                    String Ville = br.readLine();
                    newContact.setVille(Ville);
                    System.out.println("Saisi le téléphone");
                    String Telephone = br.readLine();
                    newContact.setTelephone(Telephone);
                    System.out.println("Saisi l'adresse email");
                    String Email = br.readLine();
                    newContact.setEmail(Email);
                }
            }

            if (choix == 4) {
                System.out.println("---modifier fiche---");
                //todo
            }

            if (choix == 5) {
                System.out.println(">> Au revoir");
                continuer = false;
            }

        } while (continuer);

        br.close();
        isr.close();

    }
}
        
