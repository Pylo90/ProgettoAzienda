package misc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Davide
 */
public class DBMSBoundary {
    
    
    
    /*  DEFINIZIONE PARAMETRI DATABASE - MODIFICA QUESTI  */
    /******************************************************/
    public static String IP = "localhost:3306";
    public static String UNAME = "root"; //DA IMPOSTARE A NULL
    public static String PSW = "root"; //DA IMPOSTARE A NULL
    public static String NAME = "azienda";
    /******************************************************/
    /*  FINE DEFINIZIONE PARAMETRI   */
    
    
    /*
     * @throws java.sql.SQLException
    */
    public static Connection getConnection() throws SQLException {
        String connectionString = "jdbc:mysql://" + DBMSBoundary.IP + "/" + DBMSBoundary.NAME;
        Connection con = DriverManager.getConnection(connectionString, DBMSBoundary.UNAME, DBMSBoundary.PSW);
        return con;
    }
    
    /*      METODO DA ESEGUIRE PER QUERY CON RITORNO        */
    public static ResultSet getQuery(String query) {
        ResultSet rs = null;
        try {
            Connection con = DBMSBoundary.getConnection();
            rs = con.createStatement().executeQuery(query);
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return rs;
    }
    
    /*      METODO DA ESEGUIRE PER QUERY SENZA RITORNO        */
    public static void updateQuery(String query) {
        try {
            Connection con = DBMSBoundary.getConnection();
            con.createStatement().executeUpdate(query);
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    /*      TEST       */
    public static void main(String[] args) {
        ResultSet rs = DBMSBoundary.getQuery("SELECT * FROM servizio");
        try {
            while(rs.next()) {
                System.out.println(rs.getDouble("paga_oraria"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }
}
