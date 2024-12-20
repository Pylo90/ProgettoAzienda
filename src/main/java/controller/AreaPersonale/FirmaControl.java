package controller.AreaPersonale;

import controller.GestioneCalendario.AperturaChiusuraControl;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Enumeration;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractButton;
import javax.swing.JFrame;
import model.DBMSBoundary;
import view.Errore;
import view.FirmaForm;
import view.HomepageAmministratore;
import view.HomepageImpiegato;
import view.Notifica;
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
            Enumeration<AbstractButton> buttons = HPI.getButtonGroup1().getElements();
            while (buttons.hasMoreElements()) {
                buttons.nextElement().setEnabled(false);
            }
        }
        if (HP instanceof HomepageAmministratore) {
            this.HPA = (HomepageAmministratore) HP;
            Enumeration<AbstractButton> buttons = HPA.getButtonGroup1().getElements();
            while (buttons.hasMoreElements()) {
                buttons.nextElement().setEnabled(false);
            }
        }

        JFrame RitardoBoundary = new RitardoBoundary(this);

    }

    public void DisposeWindow(JFrame finestra) {
        finestra.dispose();
        if (HPI != null) {
            Enumeration<AbstractButton> buttons = HPI.getButtonGroup1().getElements();
            while (buttons.hasMoreElements()) {
                buttons.nextElement().setEnabled(true);
            }
        }
    }

    public void MostraErrore(String messaggio) {
        if (FF != null) {
            Enumeration<AbstractButton> buttons = FF.getButtonGroup1().getElements();
            while (buttons.hasMoreElements()) {
                buttons.nextElement().setEnabled(false);
            }
        }
        if (RB != null) {
            Enumeration<AbstractButton> buttons = RB.getButtonGroup1().getElements();
            while (buttons.hasMoreElements()) {
                buttons.nextElement().setEnabled(false);
            }
        }
        new Errore(messaggio, this);
    }

    public void MostraNotifica(String messaggio) {
        if (FF != null) {
            Enumeration<AbstractButton> buttons = FF.getButtonGroup1().getElements();
            while (buttons.hasMoreElements()) {
                buttons.nextElement().setEnabled(false);
            }
        }
        if (RB != null) {
            Enumeration<AbstractButton> buttons = RB.getButtonGroup1().getElements();
            while (buttons.hasMoreElements()) {
                buttons.nextElement().setEnabled(false);
            }
        }
        new Notifica(messaggio, this);
    }

    public void SubmitError(JFrame finestra) {
        finestra.dispose();
        if (FF != null) {
            Enumeration<AbstractButton> buttons = FF.getButtonGroup1().getElements();
            while (buttons.hasMoreElements()) {
                buttons.nextElement().setEnabled(true);
            }
        }
        if (RB != null) {
            Enumeration<AbstractButton> buttons = RB.getButtonGroup1().getElements();
            while (buttons.hasMoreElements()) {
                buttons.nextElement().setEnabled(true);
            }
        }
    }

    public void SubmitNotice(JFrame finestra) {
        finestra.dispose();
        if (FF != null) {
            Enumeration<AbstractButton> buttons = FF.getButtonGroup1().getElements();
            while (buttons.hasMoreElements()) {
                buttons.nextElement().setEnabled(true);
            }
        }
        if (RB != null) {
            Enumeration<AbstractButton> buttons = RB.getButtonGroup1().getElements();
            while (buttons.hasMoreElements()) {
                buttons.nextElement().setEnabled(true);
            }
        }
    }

    public void submitBadgeIn(String nome, String cognome, String matricola) {
        //firma in entrata
        ResultSet rs;
        if (LocalTime.now().getMinute() <= 10) {
            rs = DBMSBoundary.getQuery(
                    "SELECT T.livello"
                    + "FROM impiegato I, assegnazione_turno AT, turno T"
                    + "WHERE I.servizio_firmato is null AND I.matricola='" + matricola + "' && I.nome ='" + nome + "' && I.cognome='" + cognome + "' && I.matricola = AT.impiegato && T.id = AT.turno "
                    + "AND T.data_ = '" + LocalDate.now().toString() + "' AND T.ora = " + LocalTime.now().getHour() + " ORDER BY T.ora ASC;");
            try {
                if (rs.next()) {

                    DBMSBoundary.updateQuery("update impiegato set servizio_firmato =" + rs.getInt(1) + " WHERE matricola = '" + matricola + "';");
                    AperturaChiusuraControl.checkEmployees();
                    MostraNotifica("Entrata firmato correttamente");
                } else {
                    MostraErrore("Non è prevista la presenza dell'impiegato in questo orario o credenziali errate");
                }
            } catch (SQLException ex) {
                Logger.getLogger(FirmaControl.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            MostraErrore("Sono passati i primi 10 minuti dall'inizio del turno, firma in ritardo");
        }
    }

    public void submitBadgeOut(String nome, String cognome, String matricola) {
        //firma in uscita
        ResultSet rs;
        rs = DBMSBoundary.getQuery(
                "SELECT T.livello"
                + "FROM impiegato I, assegnazione_turno AT, turno T"
                + "WHERE I.servizio_firmato is not null AND I.matricola='" + matricola + "' && I.nome ='" + nome + "' && I.cognome='" + cognome + "' && I.matricola = AT.impiegato && T.id = AT.turno "
                + "AND T.data_ = '" + LocalDate.now().toString() + "' AND T.ora = " + LocalTime.now().getHour() + "ORDER BY T.ora ASC;"
        );
        try {
            if (rs.next()) {

                DBMSBoundary.updateQuery("update impiegato set servizio_firmato =" + rs.getInt(1) + " WHERE matricola = '" + matricola + "'");
                AperturaChiusuraControl.checkEmployees();
                MostraNotifica("Uscita firmato correttamente");

            } else {
                MostraErrore("Non è stata trovata una firma in entrata, impossibile firmare l'uscita");
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
                MostraNotifica("Ritardo firmato correttamente");

            } else {
                MostraErrore("Credenziali errate");
            }
        } catch (SQLException ex) {
            Logger.getLogger(FirmaControl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
