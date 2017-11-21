
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class sqls03 {

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
            String query = "INSERT INTO maTable VALUES (?,?,?)";
            PreparedStatement pstmt = connexion.prepareStatement(query);

            int ref = 6;
            String text = "FF";
            float prix = 6.6F;

            pstmt.setInt( 1, ref);
            pstmt.setString( 2, text);
            pstmt.setFloat( 3, prix);
            
//           String query= "INSERT INTO maTable VALUES "
//                   + "("+ ref
//                   + ",'"+ text
//                   + "', "+ prix
//                   + ")";
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
        } catch (SQLException ex) {
            System.err.println("Oops:close:" + ex.getMessage());
        }
        System.out.println("Done!");
    }

}
