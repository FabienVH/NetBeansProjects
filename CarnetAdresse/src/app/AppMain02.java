package app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import obj.*;

public class AppMain02 {

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException ex) {
            System.err.println("Oops:ClassNotFound:" + ex.getMessage());
        }
        Connection connexion = null;
        try {
            String url = "jdbc:sqlserver://jeannory.ovh:1433;"
                    + "databaseName=FabienDB;"
                    + "user=SA;password=Afpa03!!";
            connexion = DriverManager.getConnection(url);
            System.out.println("connecté à la BDD");
        } catch (SQLException ex) {
            System.err.println("Oops:connexion:" + ex.getMessage());
        }

        //creation de l'arraylist 
        List<Connaissance> contacts = new ArrayList();
        //contacts de test 
//        contacts.add(new Connaissance(1, "Skywalker", "Luke", "12 rue des jawas", "75000", "Mos Eisley", "01 52 45 63 52", "Luke01@wanadoo.fr"));
//        contacts.add(new Ami("06 52 14 52 36", 2, "Skywalker", "Anakin", "17 rue des jawas", "75000", "Mos Eisley", "01 52 45 21 49", "Anakin.Sky@wanadoo.fr"));
//        contacts.add(new Famille("06 52 14 52 36", "22 Mars 1979", 3, "Kenobi", "ObiWan", "11 rue des tuskens", "75010", "Mos Espa", "01 52 12 63 44", "OB1@wanadoo.fr"));
//        contacts.add(new Connaissance(4, "Jin", "QiGon", "12 rue des jawas", "78000", "Mos Eisley", "01 52 45 63 52", "QGJ@wanadoo.fr"));
//        contacts.add(new Ami("06 52 14 52 36", 5, "Koon", "Plo", "17 rue des jawas", "75000", "Mos Eisley", "01 52 45 21 49", "PlK@wanadoo.fr"));
//        contacts.add(new Famille("06 52 14 52 36", "22 Mars 1979", 6, "Organa", "Leia", "11 rue des tuskens", "75010", "Mos Espa", "01 52 12 63 44", "princessL@wanadoo.fr"));
//        contacts.add(new Connaissance(7, "Solo", "Han", "12 rue des jawas", "77000", "Mos Eisley", "01 52 45 63 52", "Shot1st@wanadoo.fr"));
//        contacts.add(new Ami("06 52 14 52 36", 8, "Ren", "Kylo", "17 rue des jawas", "75000", "Mos Eisley", "01 52 45 21 49", "KyloSolo@wanadoo.fr"));
//        contacts.add(new Famille("06 56 46 45 26", "22 Mars 1981", 9, "Amidala", "Padme", "11 rue des tuskens", "75020", "Mos Espa", "01 52 12 63 44", "padme@wanadoo.fr"));

        //menu du carnet d'adresse
        int choix;
        String saisi;
        boolean continuer = true;

        System.out.println("voulez vous charger le carnet existant 'SQL' 1 ");
        saisi = br.readLine();
        choix= Integer.valueOf(saisi);
        if (choix == 1) {
            try {
                Statement stmt = connexion.createStatement();
                String query = "SELECT * FROM contacts";

                ResultSet rs = stmt.executeQuery(query);

                while (rs.next()) {
                    
                      Connaissance newContact = new Connaissance();
                    newContact.setNumeroFiche(rs.getInt("numeroFiche"));
                   // newContact.setType(rs.getString("type"));
                    newContact.setNom(rs.getString("nom"));
                    newContact.setPrenom(rs.getString("prenom"));
                    newContact.setRue(rs.getString("rue"));
                    newContact.setCp(rs.getString("cp"));
                    newContact.setVille(rs.getString("ville"));
                    newContact.setTelephone(rs.getString("telephone"));  
                    
                    if(rs.getString("type").equalsIgnoreCase("Famille")){
                    Famille newContact = new Famille();   
                         newContact.setNumeroFiche(rs.getInt("numeroFiche"));
                   // newContact.setType(rs.getString("type"));
                    newContact.setNom(rs.getString("nom"));
                    newContact.setPrenom(rs.getString("prenom"));
                    newContact.setRue(rs.getString("rue"));
                    newContact.setCp(rs.getString("cp"));
                    newContact.setVille(rs.getString("ville"));
                    newContact.setTelephone(rs.getString("telephone"))
                    newContact.setMobile(rs.getString("mobile"));
                    newContact.setDateNaissance(rs.getString("dateNaissance"));
                    }
                    if(rs.getString("type").equalsIgnoreCase("Ami")){
                    Ami a = (Ami) newContact;
                    a.setMobile(rs.getString("mobile"));
                    }
                    
                    
                    
                }
            } catch (SQLException ex) {
                System.err.println("Oops:SQL:" + ex.getMessage());
            }
            
        } else {
            System.out.println("- a implementer -");
        }

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
            System.out.println("---------------");

            switch (choix) { //afficher liste simplifiée
                case 1:
                    System.out.println("1>> afficher tous vos contats");
                    System.out.println("2>> afficher vos amis");
                    System.out.println("3>> afficher votre famille");
                    System.out.println("4>> afficher vos connaissances");
                    System.out.print(">>> votre choix ? ");
                    saisi = br.readLine();
                    int choix2 = Integer.valueOf(saisi);
                    System.out.println("---------------");
                    Collections.sort(contacts);
                    if (choix2 == 1) { //afficher tous les contacts

                        for (Connaissance c01 : contacts) {
                            if (c01 instanceof Connaissance) {
                                System.out.println(c01);
                            }

                        }
                    }
                    if (choix2 == 2) { //afficher les amis
                        for (Connaissance c01 : contacts) {
                            if (c01 instanceof Ami) {
                                System.out.println(c01);
                            }
                        }
                    }
                    if (choix2 == 3) { //afficher la famille
                        for (Connaissance c01 : contacts) {
                            if (c01 instanceof Famille) {
                                System.out.println(c01);
                            }
                        }
                    }
                    if (choix2 == 4) { //afficher les connaissances
                        for (Connaissance c01 : contacts) {
                            if (c01 instanceof Connaissance && !(c01 instanceof Ami) && !(c01 instanceof Famille)) {
                                System.out.println(c01);
                            }

                        }
                    }
                    break;
                case 2:
                    //menu 2 : affichage complet
                    System.out.println("---afficher fiche---");
                    System.out.println("1:recherche par Nom");
                    System.out.println("2:recherche par numero de fiche");
                    saisi = br.readLine();
                    int choix3 = Integer.valueOf(saisi);
                    switch (choix3) {
                        case 1:
                            System.out.println("saisissez le nom du contact");
                            saisi = br.readLine();
                            String nom = saisi;
                            System.out.println("saisissez le prenom du contact");
                            saisi = br.readLine();
                            String Prenom = saisi;
                            for (Connaissance c01 : contacts) {
                                if (c01.getNom().equalsIgnoreCase(nom) && c01.getPrenom().equalsIgnoreCase(Prenom)) {
                                    System.out.println(c01.getDetail());
                                } else {
                                    System.out.println("contact non trouvé");
                                }
                            }
                            break;
                        case 2:
                            System.out.println("saisissez le numero de la fiche");
                            saisi = br.readLine();
                            int numFiche = Integer.valueOf(saisi);
                            for (Connaissance c01 : contacts) {
                                if (c01.getNumeroFiche() == numFiche) {
                                    System.out.println(c01.getDetail());
                                }
                            }
                    }
                    break;
                case 3:
                    System.out.println("---creer fiche---");
                    // a changer pour un switch
                    System.out.println("ami:1 \nfamille :2 \nconnaissance :3 ");
                    saisi = br.readLine();
                    int choix4 = Integer.valueOf(saisi);

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
                    String Email = br.readLine();
                    newContact.setEmail(Email);
                    switch (choix4) {
                        case 1: // Famille
                            Famille f = (Famille) newContact;
                            System.out.println("Saisi le numéro de mobile");
                            String Mobile = br.readLine();
                            f.setMobile(Mobile);
                            System.out.println("Saisi la date de naissance");
                            String Naissance = br.readLine();
                            f.setDateNaissance(Naissance);
                            break;
                        case 2: //Ami
                            Ami a = (Ami) newContact;
                            System.out.println("Saisi le numéro de mobile");
                            Mobile = br.readLine();
                            a.setMobile(Mobile);

                            break;

                    }
                    break;
                case 4:
                    System.out.println("---modifier fiche---");

                    System.out.println("saisissez le numero de la fiche");
                    saisi = br.readLine();
                    int numFiche = Integer.valueOf(saisi);
                    for (Connaissance c01 : contacts) {
                        if (c01.getNumeroFiche() == numFiche) {
                            System.out.println(c01);
                            System.out.println("entrez le nouveau nom");
                            String newNom = br.readLine();
                            if (!newNom.trim().isEmpty()) {
                                c01.setNom(newNom);
                            }

                            System.out.println("entrez le nouveau prenom");
                            String newPrenom = br.readLine();
                            if (!newPrenom.trim().isEmpty()) {
                                c01.setPrenom(newPrenom);
                            }

                            System.out.println("entrez la nouvelle adresse");
                            String newAdresse = br.readLine();
                            if (!newAdresse.trim().isEmpty()) {
                                c01.setRue(newAdresse);
                            }

                            System.out.println("entrez le nouveau CP");
                            String newCp = br.readLine();
                            if (!newCp.trim().isEmpty()) {
                                c01.setCp(newCp);
                            }

                            System.out.println("entrez la nouvelle ville");
                            String newVille = br.readLine();
                            if (!newVille.trim().isEmpty()) {
                                c01.setVille(newVille);
                            }

                            System.out.println("entrez le nouveau numero de tel");
                            String newTel = br.readLine();
                            if (!newTel.trim().isEmpty()) {
                                c01.setTelephone(newTel);
                            }

                            System.out.println("entrez la nouvelle adresse Email");
                            String newEmail = br.readLine();
                            if (!newEmail.trim().isEmpty()) {
                                c01.setEmail(newEmail);
                            }

                            if (c01 instanceof Famille) {
                                Famille fa = (Famille) c01;
                                System.out.println("entrez le nouveau numero de mobile");
                                String newMobile = br.readLine();
                                if (!newMobile.trim().isEmpty()) {
                                    fa.setMobile(newMobile);
                                }
                            }

                            if (c01 instanceof Ami) {
                                Ami a = (Ami) c01;
                                System.out.println("entrez le nouveau numero de mobile");
                                String newMobile2 = br.readLine();
                                if (!newMobile2.trim().isEmpty()) {
                                    a.setMobile(newMobile2);
                                }
                            }
                            if (c01 instanceof Famille) {
                                Famille f = (Famille) c01;
                                System.out.println("entrez la nouvelle date de naissance");
                                String newNaissance = br.readLine();
                                if (!newNaissance.trim().isEmpty()) {
                                    f.setDateNaissance(newNaissance);
                                }
                            }
                        }
                    }

                    break;
                case 5:
                    System.out.println(">> Au revoir");
                    continuer = false;
            }

        } while (continuer);

        try {
            connexion.close();
            System.out.println("deconnecté de la BDD");
        } catch (SQLException ex) {
            System.err.println("Oops:close:" + ex.getMessage());
        }

        br.close();
        isr.close();

    }
}
