
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class mysql01 {

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        } catch (ClassNotFoundException ex) {
            System.err.println("oops:ClassNotFound:" + ex.getMessage());
        } catch (InstantiationException ex) {
            System.err.println("oops:Instantiation:" + ex.getMessage());
        } catch (IllegalAccessException ex) {
            System.err.println("oops:IllegalAccessNotFound:" + ex.getMessage());
        }

        Connection connexion = null;

        try {
            String url = "jdbc:mysql://leox/cdi00?"
                    + "user=cdi00&password=afpa";

            connexion = DriverManager.getConnection(url);
        } catch (SQLException ex) {
            System.err.println("Oops:connexion:" + ex.getMessage());
        }

        try {
            Statement stmt= connexion.createStatement();
            String query = "SELECT * FROM maTable";

            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                System.out.println(rs.getInt("ref"));
                System.out.println(rs.getString("text"));
                System.out.println(rs.getFloat("prix"));
                System.out.println("--");
            }
        } catch (SQLException ex) {
            System.err.println("Oops:SQL:"+ ex.getMessage());
        }

        try {
            connexion.close();
        } catch (SQLException ex) {
            System.err.println("Oops:close:" + ex.getMessage());
        }
        System.out.println("Done!");
    }

}
