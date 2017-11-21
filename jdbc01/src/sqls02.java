
import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class sqls02 {

    public static void main(String[] args) {

        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setUser("sa");
        ds.setPassword("sa");
        ds.setServerName("localhost");
        ds.setPortNumber(1433);
        ds.setDatabaseName("maBase");

        Connection connexion = null;

        try {
            connexion = ds.getConnection();
        } catch (SQLServerException ex) {
            System.err.println("Oops:connexion:" + ex.getMessage());
        }

        try {
//            Statement stmt= connexion.createStatement();
            Statement stmt = connexion.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY
            );
            String query = "SELECT * FROM maTable";

            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                System.out.println(rs.getInt("ref"));
                System.out.println(rs.getString("text"));
                System.out.println(rs.getFloat("prix"));
                System.out.println("--");
            }
            System.out.println("-----");
            while (rs.previous()) {
                System.out.println(rs.getInt("ref"));
                System.out.println(rs.getString("text"));
                System.out.println(rs.getFloat("prix"));
                System.out.println("--");
            }

            rs.close();
            stmt.close();
        } catch (SQLException ex) {
            System.err.println("Oops:SQL:" + ex.getErrorCode() + "/"
                    + ex.getMessage());
        }

        try {
            connexion.close();
        } catch (SQLException ex) {
            System.err.println("Oops:close:" + ex.getMessage());
        }

        System.out.println("Done!");
    }

}
