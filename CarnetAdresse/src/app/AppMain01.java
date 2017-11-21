//package app;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//import obj.*;
//
//public class AppMain01 {
//
//    public static void main(String[] args) throws IOException {
//        InputStreamReader isr = new InputStreamReader(System.in);
//        BufferedReader br = new BufferedReader(isr);
//
//        //creation de l'arraylist 
//        List<Connaissance> contacts = new ArrayList();
//        //contacts de test 
//        contacts.add(new Connaissance(1, "Skywalker", "Luke", "12 rue des jawas", "75000", "Mos Eisley", "01 52 45 63 52", "Luke01@wanadoo.fr"));
//        contacts.add(new Ami("06 52 14 52 36", 2, "Skywalker", "Anakin", "17 rue des jawas", "75000", "Mos Eisley", "01 52 45 21 49", "Anakin.Sky@wanadoo.fr"));
//        contacts.add(new Famille("06 52 14 52 36", "22 Mars 1979", 3, "Kenobi", "ObiWan", "11 rue des tuskens", "75010", "Mos Espa", "01 52 12 63 44", "OB1@wanadoo.fr"));
//        contacts.add(new Connaissance(4, "Jin", "QiGon", "12 rue des jawas", "78000", "Mos Eisley", "01 52 45 63 52", "QGJ@wanadoo.fr"));
//        contacts.add(new Ami("06 52 14 52 36", 5, "Koon", "Plo", "17 rue des jawas", "75000", "Mos Eisley", "01 52 45 21 49", "PlK@wanadoo.fr"));
//        contacts.add(new Famille("06 52 14 52 36", "22 Mars 1979", 6, "Organa", "Leia", "11 rue des tuskens", "75010", "Mos Espa", "01 52 12 63 44", "princessL@wanadoo.fr"));
//        contacts.add(new Connaissance(7, "Solo", "Han", "12 rue des jawas", "77000", "Mos Eisley", "01 52 45 63 52", "Shot1st@wanadoo.fr"));
//        contacts.add(new Ami("06 52 14 52 36", 8, "Ren", "Kylo", "17 rue des jawas", "75000", "Mos Eisley", "01 52 45 21 49", "KyloSolo@wanadoo.fr"));
//        contacts.add(new Famille("06 56 46 45 26", "22 Mars 1981", 9, "Amidala", "Padme", "11 rue des tuskens", "75020", "Mos Espa", "01 52 12 63 44", "padme@wanadoo.fr"));
//
//        //menu du carnet d'adresse
//        int choix;
//        String saisi;
//        boolean continuer = true;
//
//        do {
//            System.out.println(
//                    " ________________________\n"
//                    + "|   Carnet d'adresses    | \n"
//                    + "|________________________|\n");
//            System.out.println("1>> afficher liste");
//            System.out.println("2>> afficher fiche");
//            System.out.println("3>> creer fiche");
//            System.out.println("4>> modifier fiche");
//            System.out.println("5>> Quitter");
//            System.out.print(">>> votre choix ? ");
//            saisi = br.readLine();
//            choix = Integer.valueOf(saisi);
//            System.out.println("---------------");
//
//            switch (choix) { //afficher liste simplifiée
//                case 1:
//                    System.out.println("1>> afficher tous vos contats");
//                    System.out.println("2>> afficher vos amis");
//                    System.out.println("3>> afficher votre famille");
//                    System.out.println("4>> afficher vos connaissances");
//                    System.out.print(">>> votre choix ? ");
//                    saisi = br.readLine();
//                    int choix2 = Integer.valueOf(saisi);
//                    System.out.println("---------------");
//                    Collections.sort(contacts);
//                    if (choix2 == 1) { //afficher tous les contacts
//
//                        for (Connaissance c01 : contacts) {
//                            if (c01 instanceof Connaissance) {
//                                System.out.println(c01);
//                            }
//
//                        }
//                    }
//                    if (choix2 == 2) { //afficher les amis
//                        for (Connaissance c01 : contacts) {
//                            if (c01 instanceof Ami) {
//                                System.out.println(c01);
//                            }
//                        }
//                    }
//                    if (choix2 == 3) { //afficher la famille
//                        for (Connaissance c01 : contacts) {
//                            if (c01 instanceof Famille) {
//                                System.out.println(c01);
//                            }
//                        }
//                    }
//                    if (choix2 == 4) { //afficher les connaissances
//                        for (Connaissance c01 : contacts) {
//                            if (c01 instanceof Connaissance && !(c01 instanceof Ami) && !(c01 instanceof Famille)) {
//                                System.out.println(c01);
//                            }
//
//                        }
//                    }
//                    break;
//                case 2:
//                    //menu 2 : affichage complet
//                    System.out.println("---afficher fiche---");
//                    System.out.println("1:recherche par Nom");
//                    System.out.println("2:recherche par numero de fiche");
//                    saisi = br.readLine();
//                    int choix3 = Integer.valueOf(saisi);
//                    switch (choix3) {
//                        case 1:
//                            System.out.println("saisissez le nom du contact");
//                            saisi = br.readLine();
//                            String nom = saisi;
//                            System.out.println("saisissez le prenom du contact");
//                            saisi = br.readLine();
//                            String Prenom = saisi;
//                            for (Connaissance c01 : contacts) {
//                                if (c01.getNom().equalsIgnoreCase(nom) && c01.getPrenom().equalsIgnoreCase(Prenom)) {
//                                    System.out.println(c01.getDetail());
//                                }
//                            }
//                        case 2:
//                            System.out.println("saisissez le numero de la fiche");
//                            saisi = br.readLine();
//                            int numFiche = Integer.valueOf(saisi);
//                            for (Connaissance c01 : contacts) {
//                                if (c01.getNumeroFiche() == numFiche) {
//                                    System.out.println(c01.getDetail());
//                                }
//                            }
//                    }
//                    break;
//                case 3:
//                    System.out.println("---creer fiche---");
//                    // a changer pour un switch
//                    System.out.println("ami:1 \nfamille :2 \nconnaissance :3 ");
//                    saisi = br.readLine();
//                    int choix4 = Integer.valueOf(saisi);
//                    switch (choix4) {
//                        case 1:
//                            System.out.println("---créer ami---");
//                            Ami newContact = new Ami();
//                            contacts.add(newContact);
//                            int numeroFiche = contacts.indexOf(newContact) + 1;
//                            newContact.setNumeroFiche(numeroFiche);
//                            System.out.println("Saisi le nom");
//                            String Nom = br.readLine();
//                            newContact.setNom(Nom);
//                            System.out.println("Saisi le prénom");
//                            String Prenom = br.readLine();
//                            newContact.setPrenom(Prenom);
//                            System.out.println("Saisi l numero et la rue");
//                            String Rue = br.readLine();
//                            newContact.setRue(Rue);
//                            System.out.println("Saisi le CodePostal");
//                            String Cp = br.readLine();
//                            newContact.setCp(Cp);
//                            System.out.println("Saisi la ville");
//                            String Ville = br.readLine();
//                            newContact.setVille(Ville);
//                            System.out.println("Saisi le téléphone");
//                            String Telephone = br.readLine();
//                            newContact.setTelephone(Telephone);
//                            System.out.println("Saisi le numéro de mobile");
//                            String Mobile = br.readLine();
//                            newContact.setMobile(Mobile);
//                            System.out.println("Saisi l'adresse email");
//                            String Email = br.readLine();
//                            newContact.setEmail(Email);
//                            break;
//                        case 2:
//                            System.out.println("---créer membre de la famille---");
//                            Famille newContact2 = new Famille();
//                            contacts.add(newContact2);
//                            numeroFiche = contacts.indexOf(newContact2) + 1;
//                            newContact2.setNumeroFiche(numeroFiche);
//                            System.out.println("Saisi le nom");
//                            Nom = br.readLine();
//                            newContact2.setNom(Nom);
//                            System.out.println("Saisi le prénom");
//                            Prenom = br.readLine();
//                            newContact2.setPrenom(Prenom);
//                            System.out.println("Saisi l numero et la rue");
//                            Rue = br.readLine();
//                            newContact2.setRue(Rue);
//                            System.out.println("Saisi le CodePostal");
//                            Cp = br.readLine();
//                            newContact2.setCp(Cp);
//                            System.out.println("Saisi la ville");
//                            Ville = br.readLine();
//                            newContact2.setVille(Ville);
//                            System.out.println("Saisi le téléphone");
//                            Telephone = br.readLine();
//                            newContact2.setTelephone(Telephone);
//                            System.out.println("Saisi le numéro de mobile");
//                            Mobile = br.readLine();
//                            newContact2.setMobile(Mobile);
//                            System.out.println("Saisi l'adresse email");
//                            Email = br.readLine();
//                            newContact2.setEmail(Email);
//                            System.out.println("Saisi la date de naissance");
//                            String Naissance = br.readLine();
//                            newContact2.setDateNaissance(Naissance);
//                            break;
//                        case 3:
//                            System.out.println("---créer connaissance---");
//                            Connaissance newContact3 = new Connaissance();
//                            contacts.add(newContact3);
//                            numeroFiche = contacts.indexOf(newContact3) + 1;
//                            newContact3.setNumeroFiche(numeroFiche);
//                            System.out.println("Saisi le nom");
//                            Nom = br.readLine();
//                            newContact3.setNom(Nom);
//                            System.out.println("Saisi le prénom");
//                            Prenom = br.readLine();
//                            newContact3.setPrenom(Prenom);
//                            System.out.println("Saisi l numero et la rue");
//                            Rue = br.readLine();
//                            newContact3.setRue(Rue);
//                            System.out.println("Saisi le CodePostal");
//                            Cp = br.readLine();
//                            newContact3.setCp(Cp);
//                            System.out.println("Saisi la ville");
//                            Ville = br.readLine();
//                            newContact3.setVille(Ville);
//                            System.out.println("Saisi le téléphone");
//                            Telephone = br.readLine();
//                            newContact3.setTelephone(Telephone);
//                            System.out.println("Saisi l'adresse email");
//                            Email = br.readLine();
//                            newContact3.setEmail(Email);
//                            break;
//                    }
//                    break;
//                case 4:
//                    System.out.println("---modifier fiche---");
//                    //menu 2 : affichage complet
//
//                    System.out.println("1:recherche par Nom");
//                    System.out.println("2:recherche par numero de fiche");
//                    saisi = br.readLine();
//                    int choix5 = Integer.valueOf(saisi);
//                    switch (choix5) {
//                        case 1:
//                            System.out.println("saisissez le nom du contact");
//                            saisi = br.readLine();
//                            String nom = saisi;
//                            System.out.println("saisissez le prenom du contact");
//                            saisi = br.readLine();
//                            String Prenom = saisi;
//                            for (Connaissance c01 : contacts) {
//                                if (c01.getNom().equalsIgnoreCase(nom) && c01.getPrenom().equalsIgnoreCase(Prenom)) {
//                                    System.out.println(c01);
//                                    System.out.println(c01);
//                                    System.out.println("entrez le nouveau nom");
//                                    String newNom = br.readLine();
//                                    if (!newNom.trim().isEmpty()) {
//                                        c01.setNom(newNom);
//                                    }
//
//                                    System.out.println("entrez le nouveau prenom");
//                                    saisi = br.readLine();
//                                    String newPrenom = saisi;
//                                    c01.setPrenom(newPrenom);
//
//                                    System.out.println("entrez la nouvelle adresse");
//                                    saisi = br.readLine();
//                                    String newAdresse = saisi;
//                                    c01.setRue(newAdresse);
//                                    System.out.println("entrez le nouveau CP");
//                                    saisi = br.readLine();
//                                    String newCp = saisi;
//                                    c01.setCp(newCp);
//
//                                    System.out.println("entrez la nouvelle ville");
//                                    saisi = br.readLine();
//                                    String newVille = saisi;
//                                    c01.setVille(newVille);
//
//                                    System.out.println("entrez le nouveau numero de tel");
//                                    saisi = br.readLine();
//                                    String newTel = saisi;
//                                    c01.setTelephone(newTel);
//
//                                    System.out.println("entrez la nouvelle adresse Email");
//                                    saisi = br.readLine();
//                                    String newEmail = saisi;
//                                    c01.setEmail(newEmail);
//                                }
//                            }
//                            break;
//                        case 2:
//                            System.out.println("saisissez le numero de la fiche");
//                            saisi = br.readLine();
//                            int numFiche = Integer.valueOf(saisi);
//                            for (Connaissance c01 : contacts) {
//                                if (c01.getNumeroFiche() == numFiche) {
//                                    System.out.println(c01);
//                                    System.out.println("entrez le nouveau nom");
//                                    saisi = br.readLine();
//                                    String newNom = saisi;
//                                    c01.setNom(newNom);
//
//                                    System.out.println("entrez le nouveau prenom");
//                                    saisi = br.readLine();
//                                    String newPrenom = saisi;
//                                    c01.setPrenom(newPrenom);
//
//                                    System.out.println("entrez la nouvelle adresse");
//                                    saisi = br.readLine();
//                                    String newAdresse = saisi;
//                                    c01.setRue(newAdresse);
//                                    System.out.println("entrez le nouveau CP");
//                                    saisi = br.readLine();
//                                    String newCp = saisi;
//                                    c01.setCp(newCp);
//
//                                    System.out.println("entrez la nouvelle ville");
//                                    saisi = br.readLine();
//                                    String newVille = saisi;
//                                    c01.setVille(newVille);
//
//                                    System.out.println("entrez le nouveau numero de tel");
//                                    saisi = br.readLine();
//                                    String newTel = saisi;
//                                    c01.setTelephone(newTel);
//
//                                    System.out.println("entrez la nouvelle adresse Email");
//                                    saisi = br.readLine();
//                                    String newEmail = saisi;
//                                    c01.setEmail(newEmail);
//
////                                    if (c01 instanceof Famille ||c01 instanceof Ami) {
////                                    System.out.println("entrez le nouveau numero de mobile");
////                                    saisi = br.readLine();
////                                    String newMobile = saisi;
////                                    if(newMobile != ""){
////                                    (Ami)c01.setMobile(newMobile);
////                                    }
//                                    if (c01 instanceof Famille) {
//                                        Famille f= (Famille) c01;
//                                    System.out.println("entrez la nouvelle date de naissance");
//                                    saisi = br.readLine();
//                                    String newNaissance = saisi;
//                                    if(newNaissance != ""){
//                                    f.setDateNaissance(newNaissance);
//                                    }
//                                }
//                            }
//                    }
//
//                    break;
//                case 5:
//                    System.out.println(">> Au revoir");
//                    continuer = false;
//            }
//
//        } while (continuer);
//
//        br.close();
//        isr.close();
//        }