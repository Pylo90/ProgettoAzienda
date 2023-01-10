package controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import misc.DBMSBoundary;

/**
 *
 * @author dario
 */

public class AperturaChiusuraControl {
    
    public static final int num_livelli = 5;
    
    public AperturaChiusuraControl() {
        super();
    }
    
    public static void checkEmployees() {
        int count_livelli[] = new int[num_livelli];
        for(int i = 0; i < num_livelli; i++) {
            count_livelli[i] = 0;
        }
        
        ResultSet rs = DBMSBoundary.getQuery("SELECT servizio_firmato FROM Impiegato WHERE servizio_firmato IS NOT NULL");
        try {
            while(rs.next()) {
                count_livelli[rs.getInt("servizio_firmato") - 1]++;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        rs = DBMSBoundary.getQuery("SELECT livello, minDipendenti FROM Servizio");
        try {
            while(rs.next()) {
                if(count_livelli[rs.getInt("livello") - 1] < rs.getInt("minDipendenti")) {
                    DBMSBoundary.updateQuery("UPDATE Servizio SET isOpen = 0 WHERE livello = " + rs.getInt("livello"));
                } else {
                    DBMSBoundary.updateQuery("UPDATE Servizio SET isOpen = 1 WHERE livello = " + rs.getInt("livello"));
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    /*******TEST*******/
    public static void main(String[] args) {
        AperturaChiusuraControl.checkEmployees();
    }
    
}
