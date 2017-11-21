package app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import obj.Ami;
import obj.Connaissance;
import obj.Famille;
import obj.TriParTypeNomPrenom;

public class AppToSql {

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        //creation de l'arraylist 
        List<Connaissance> contacts = new ArrayList();
        
        contacts.add(new Connaissance(1,"Skywalker", "Luke", "12 rue des jawas", "75000","Mos Eisley","01 52 45 63 52", "Luke01@wanadoo.fr"));
        contacts.add(new Connaissance(2, "Skywalker", "Anakin", "17 rue des jawas", "75000","Mos Eisley","01 52 45 21 49", "Anakin.Sky@wanadoo.fr"));
        contacts.add(new Famille("06 52 14 52 36","22 Mars 1979",3, "Kenobi", "ObiWan", "11 rue des tuskens", "75010","Mos Espa","01 52 12 63 44", "OB1@wanadoo.fr"));
        contacts.add(new Connaissance(4,"Jin", "QiGon", "12 rue des jawas", "75000","Mos Eisley","01 52 45 63 52", "QGJ@wanadoo.fr"));
        contacts.add(new Ami("06 52 14 52 36",5, "Koon", "Plo", "17 rue des jawas", "75000","Mos Eisley","01 52 45 21 49", "PlK@wanadoo.fr"));
        contacts.add(new Famille( "06 52 14 52 36","22 Mars 1979",6,"Organa", "Leia", "11 rue des tuskens", "75010","Mos Espa","01 52 12 63 44", "princessL@wanadoo.fr"));
        contacts.add(new Connaissance(7,"Solo", "Han", "12 rue des jawas", "75000","Mos Eisley","01 52 45 63 52", "Shot1st@wanadoo.fr"));
        contacts.add(new Ami("06 52 14 52 36",8, "Ren", "Kylo", "17 rue des jawas", "75000","Mos Eisley","01 52 45 21 49", "KyloSolo@wanadoo.fr"));
        contacts.add(new Famille( "06 56 46 45 26","22 Mars 1981",9, "Amidala", "Padme", "11 rue des tuskens", "75010","Mos Espa","01 52 12 63 44", "padme@wanadoo.fr"));
        //Collections.sort(contacts);
        TriParTypeNomPrenom tr02 = new TriParTypeNomPrenom();
        contacts.sort(tr02);
        System.out.println(contacts);
        
        
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

        try {
            String query = "INSERT INTO contacts VALUES (?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pstmt = connexion.prepareStatement(query);

            //Connaissance newContact = new Connaissance();
            System.out.println("saisissez le numero de la fiche que vous voulez sauvegarder");
            String saisi = br.readLine();
            int numFiche = Integer.valueOf(saisi);
            for (Connaissance newContact : contacts) {
            if (newContact.getNumeroFiche() == numFiche) {
            
           
            int numeroFiche = newContact.getNumeroFiche();
            String type= newContact.getType();
            String nom= newContact.getNom();
            String prenom= newContact.getPrenom();
            String rue= newContact.getRue();
            String cp= newContact.getCp();
            String ville= newContact.getVille();
            String telephone= newContact.getTelephone();
            if (newContact instanceof Famille) {
            Famille f= (Famille) newContact;
            String mobile= f.getMobile();
            String dateNaissance= f.getDateNaissance();
            pstmt.setString( 9, mobile);
            pstmt.setString( 11, dateNaissance);
            }
            String email= newContact.getEmail();
            if (newContact instanceof Ami) {
            Ami a= (Ami) newContact;
            String mobile= a.getMobile();
            pstmt.setString( 9, mobile);
            }
            

            pstmt.setInt( 1, numeroFiche);
            if(newContact instanceof Ami) {
            pstmt.setString( 2, "Ami");
            }
            if(newContact instanceof Famille) {
            pstmt.setString( 2, "Famille");
            }
            if(newContact instanceof Connaissance && !(newContact instanceof Ami) && !(newContact instanceof Famille)) {
            pstmt.setString( 2, "Connaissance");
            }
            pstmt.setString( 2, type);
            pstmt.setString( 3, nom);
            pstmt.setString( 4, prenom);
            pstmt.setString( 5, rue);
            pstmt.setString( 6, cp);
            pstmt.setString( 7, ville);
            pstmt.setString( 8, telephone);
            if (newContact instanceof Connaissance && !(newContact instanceof Ami) && !(newContact instanceof Famille)) {
          pstmt.setString( 9, "");
            }
            pstmt.setString( 10, email);
            if (newContact instanceof Connaissance && !(newContact instanceof Famille)) {
          pstmt.setString( 11, "");
            }
            }  
            }

            int result = pstmt.executeUpdate();

            System.out.println("Result:" + result);

            pstmt.close();
        } catch (SQLException ex) {
//            ex.printStackTrace();
            System.err.println("Oops:SQL:"
                    + ex.getErrorCode() + "/" + ex.getMessage());
        }

        try {
            connexion.close();
            System.out.println("deconnecté de la BDD");
        } catch (SQLException ex) {
            System.err.println("Oops:close:" + ex.getMessage());
        }
        
    }

}
