package controller.GestioneCalendario;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.DBMSBoundary;

/**
 *
 * @author dario
 */
public class AperturaChiusuraControl {

    /**
     * *****MODIFICARE A SECONDA DEL NUMERO DI LIVELLI NEL DATABASE******
     */
    /**
     * ******************************************************************
     */
    public AperturaChiusuraControl() {
        super();
    }

    public static void checkEmployees() throws SQLException {
        ArrayList<Integer> count_livelli = new ArrayList<>();
        ResultSet rs;
        int num_livelli = 0;
        rs = DBMSBoundary.getQuery("SELECT COUNT(*) FROM Servizio");
        rs.next();
        num_livelli = rs.getInt(1);

        for (int i = 1; i <= num_livelli; i++) {
            rs = DBMSBoundary.getQuery("SELECT COUNT(*) FROM Impiegato WHERE servizio_firmato = " + i);
            rs.next();
            count_livelli.add(rs.getInt(1));
        }

        rs = DBMSBoundary.getQuery("SELECT livello, minDipendenti FROM Servizio ORDER BY livello ASC");

        while (rs.next()) {
            if (count_livelli.get(rs.getInt("livello") - 1) < rs.getInt("minDipendenti")) {
                DBMSBoundary.updateQuery("UPDATE Servizio SET isOpen = 0 WHERE livello = " + rs.getInt("livello"));
            } else {
                DBMSBoundary.updateQuery("UPDATE Servizio SET isOpen = 1 WHERE livello = " + rs.getInt("livello"));
            }
        }

    }

    /**
     * ******TEST*******
     */
    public static void main(String[] args) {
        //AperturaChiusuraControl.checkEmployees();
    }

}
