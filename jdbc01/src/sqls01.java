
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class sqls01 {

    public static void main(String[] args) {

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException ex) {
            System.err.println("Oops:ClassNotFound:" + ex.getMessage());
        }
        Connection connexion = null;
        try {
            String url = "jdbc:sqlserver://localhost:1433;"
                    + "databaseName=maBase;"
                    + "user=sa;password=sa";
            connexion = DriverManager.getConnection(url);
        } catch (SQLException ex) {
            System.err.println("Oops:connexion:" + ex.getMessage());
        }

        try {
            Statement stmt = connexion.createStatement();
            
            String query= "INSERT INTO maTable VALUES (5,'EE', 5.5)";
            
            int result= stmt.executeUpdate( query);
            
            System.out.println("Result:"+ result);
            
            stmt.close();
        } catch (SQLException ex) {
            System.err.println("Oops:SQL:" + 
                    ex.getErrorCode() +"/"+ ex.getMessage());
        }

        try {
            connexion.close();
        } catch (SQLException ex) {
            System.err.println("Oops:close:" + ex.getMessage());
        }
        System.out.println("Done!");
    }

}
