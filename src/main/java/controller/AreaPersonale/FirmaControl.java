package controller.AreaPersonale;

import controller.GestioneCalendario.AperturaChiusuraControl;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import model.DBMSBoundary;
import view.FirmaForm;
import view.HomepageAmministratore;
import view.HomepageImpiegato;
import view.RitardoBoundary;

public class FirmaControl {

    HomepageImpiegato HPI;
    HomepageAmministratore HPA;
    FirmaForm FF;
    RitardoBoundary RB;
    String funzione;

    public FirmaControl() {

    }

    public void firmaINButtonPressed() {
        //firma in ingresso
        funzione = "in";
        JFrame firmaForm = new FirmaForm(this, funzione);

    }

    public void firmaOUTButtonPressed() {
        //firma in uscita
        funzione = "out";
        JFrame firmaForm = new FirmaForm(this, funzione);

    }

    public void firmaRitardoButtonPressed(JFrame HP) {
        if (HP instanceof HomepageImpiegato) {
            this.HPI = (HomepageImpiegato) HP;
        }
        if (HP instanceof HomepageAmministratore) {
            this.HPA = (HomepageAmministratore) HP;
        }
        HPI.setClickable(false);
        JFrame RitardoBoundary = new RitardoBoundary(this);

    }

    public void DisposeWindow(JFrame finestra) {
        finestra.dispose();
        HPI.setClickable(true);
    }

    public void SubmitError(JFrame finestra) {
        finestra.dispose();
        if (FF != null) {
            FF.setClickable(true);
        }
        if (RB != null) {
            RB.setClickable(true);
        }
    }

    public void SubmitNotice(JFrame finestra) {
        finestra.dispose();
        if (FF != null) {
            FF.setClickable(true);
        }
        if (RB != null) {
            RB.setClickable(true);
        }
    }

    public void submitBadgeIn(String nome, String cognome, String matricola) {
        //firma in entrata
        ResultSet rs;
        rs = DBMSBoundary.getQuery(
                "SELECT T.livello"
                + "FROM impiegato I, assegnazione_turno AT, turno T"
                + "WHERE I.servizio_firmato is null AND I.matricola='" + matricola + "' && I.nome ='" + nome + "' && I.cognome='" + cognome + "' && I.matricola = AT.impiegato && T.id = AT.turno "
                + "AND T.data_ = '" + LocalDate.now().toString() + "' AND T.ora = " + LocalTime.now().getHour() + "ORDER BY T.ora ASC;");
        try {
            if (rs.next()) {

                DBMSBoundary.updateQuery("update impiegato set servizio_firmato =" + rs.getInt(1) + " WHERE matricola = '" + matricola + "';");
                AperturaChiusuraControl.checkEmployees();
            } else {
                //lancia errore
            }
        } catch (SQLException ex) {
            Logger.getLogger(FirmaControl.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void submitBadgeOut(String nome, String cognome, String matricola) {
        //firma in uscita
        ResultSet rs;
        rs = DBMSBoundary.getQuery(
                "SELECT T.livello"
                + "FROM impiegato I, assegnazione_turno AT, turno T"
                + "WHERE I.servizio_firmato is null AND I.matricola='" + matricola + "' && I.nome ='" + nome + "' && I.cognome='" + cognome + "' && I.matricola = AT.impiegato && T.id = AT.turno "
                + "AND T.data_ = '" + LocalDate.now().toString() + "' AND T.ora = " + LocalTime.now().getHour() + "ORDER BY T.ora ASC;"
        );
        try {
            if (rs.next()) {

                DBMSBoundary.updateQuery("update impiegato set servizio_firmato =" + rs.getInt(1) + " WHERE matricola = '" + matricola + "'");
                AperturaChiusuraControl.checkEmployees();

            } else {
                //lancia errore
            }
        } catch (SQLException ex) {
            Logger.getLogger(FirmaControl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void submitForm(String nome, String cognome, String matricola, String motivazione) {
        //firma in ritardo
        ResultSet rs;
        rs = DBMSBoundary.getQuery(
                "SELECT T.ora"
                + "FROM impiegato I, assegnazione_turno AT, turno T"
                + "WHERE I.servizio_firmato is null AND I.matricola='" + matricola + "' && I.nome ='" + nome + "' && I.cognome='" + cognome + "' && I.matricola = AT.impiegato && T.id = AT.turno;"
        );
        try {
            if (rs.next()) {
                DBMSBoundary.updateQuery(
                        "INSERT INTO ritardo"
                        + "VALUES ('" + matricola
                        + "','"
                        + String.valueOf(Calendar.getInstance().get(Calendar.YEAR))
                        + "-" + String.format("%02d", Calendar.getInstance().get(Calendar.MONTH) + 1)
                        + "-" + String.format("%02d", Calendar.getInstance().get(Calendar.DAY_OF_MONTH))
                        + "','" + rs.getString("ora")
                        + "','" + motivazione + "';"
                );
                DBMSBoundary.updateQuery("update impiegato set servizio_firmato =" + rs.getInt("livello") + ";");
                AperturaChiusuraControl.checkEmployees();
            }
        } catch (SQLException ex) {
            Logger.getLogger(FirmaControl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
