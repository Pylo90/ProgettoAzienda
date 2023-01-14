package misc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Davide
 */
public class DBMSBoundary {
    
    
    
    /*  DEFINIZIONE PARAMETRI DATABASE - MODIFICA QUESTI  */
    /******************************************************/
    private static String IP = "localhost:3306";
    private static String UNAME = "root"; //DA IMPOSTARE A NULL
    private static String PSW = "root"; //DA IMPOSTARE A NULL
    private static String NAME = "azienda";
    /******************************************************/
    /*  FINE DEFINIZIONE PARAMETRI   */
    
    private static Connection con = null;
    
    private static Connection getConnection() throws SQLException {
        if (con == null) {
            String connectionString = "jdbc:mysql://" + DBMSBoundary.IP + "/" + DBMSBoundary.NAME;
            con = DriverManager.getConnection(connectionString, DBMSBoundary.UNAME, DBMSBoundary.PSW);
        }
        return con;
    }

    /*******METODO DA UTILIZZARE DURANTE IL LOGOUT*******/
    public static void disposeConnection() throws SQLException {
        con.close();
        con = null;
    }
    
    /*      METODO DA ESEGUIRE PER QUERY CON RITORNO        */
    public static ResultSet getQuery(String query) {
        ResultSet rs = null;
        try {
            Connection con = DBMSBoundary.getConnection();
            rs = con.createStatement().executeQuery(query);
            //con.close();
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
            //con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void updatePropic(String matricola, FileInputStream image) {
        ResultSet rs = getQuery("SELECT COUNT(matricola) FROM Impiegato WHERE matricola = " + matricola);
        try {
            rs.next();
            if(rs.getInt(1) == 0) {
                return;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return;
        }
        
        try {
            PreparedStatement ps = con.prepareStatement("UPDATE Impiegato SET propic = ? WHERE matricola = ?");
            ps.setBinaryStream(1, image);
            ps.setString(2, matricola);
            ps.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    public static void updatePropic(String matricola, InputStream image) {
        ResultSet rs = getQuery("SELECT COUNT(matricola) FROM Impiegato WHERE matricola = " + matricola);
        try {
            rs.next();
            if(rs.getInt(1) == 0) {
                return;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return;
        }
        
        try {
            PreparedStatement ps = con.prepareStatement("UPDATE Impiegato SET propic = ? WHERE matricola = ?");
            ps.setBinaryStream(1, image);
            ps.setString(2, matricola);
            ps.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    /*********TEST**********/
    public static void main(String[] args) {
        try {
            updatePropic("123457", new FileInputStream("D:\\Desktop\\UseCaseDiagram.asta"));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DBMSBoundary.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static String getIP() {
        return IP;
    }

    public static void setIP(String IP) {
        DBMSBoundary.IP = IP;
    }

    public static String getUNAME() {
        return UNAME;
    }

    public static void setUNAME(String UNAME) {
        DBMSBoundary.UNAME = UNAME;
    }

    public static String getPSW() {
        return PSW;
    }

    public static void setPSW(String PSW) {
        DBMSBoundary.PSW = PSW;
    }

    public static String getNAME() {
        return NAME;
    }

    public static void setNAME(String NAME) {
        DBMSBoundary.NAME = NAME;
    }
    
}
