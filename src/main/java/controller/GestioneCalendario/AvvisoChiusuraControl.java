package controller.GestioneCalendario;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalTime;
import misc.MailSender;
import model.DBMSBoundary;
import model.Utente;

/**
 *
 * @author Davide
 */
public class AvvisoChiusuraControl implements Runnable {
    
    @Override
    public void run() {
        int mins = LocalTime.now().getMinute(), delay;
        if(mins > 11) {
            delay = 71 - LocalTime.now().getMinute();
        } else {
            delay = 11 - LocalTime.now().getMinute();
        }
        try {
            Thread.sleep(delay*60*1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        while(true) {
            try {
                Thread.sleep(3600*1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            try {
                checkNotice();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
    
    private void checkNotice() throws SQLException {
        ResultSet rs = DBMSBoundary.getQuery("SELECT livello FROM Servizio WHERE isOpen = 0");
        ResultSet imp;
        while(rs.next()) {
            imp = DBMSBoundary.getQuery("SELECT email FROM Impiegato WHERE servizio_firmato = " + rs.getInt(1));
            while(imp.next()) {
                MailSender.sendMail(imp.getString("email"), "Avviso chiusura servizio", "Il servizio per cui stai lavorando è appena stato chiuso. Puoi firmare l'uscita"); 
            }
            
        }
        
    }
}
