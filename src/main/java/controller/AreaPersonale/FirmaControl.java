package controller.AreaPersonale;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import model.DBMSBoundary;
import view.FirmaForm;
import view.HomepageImpiegato;
import view.RitardoBoundary;

public class FirmaControl {

    HomepageImpiegato HPI;
    FirmaForm FF;
    RitardoBoundary RB;

    public FirmaControl() {;
    }

    public void firmaINButtonPressed() {
        JFrame firmaForm = new FirmaForm(this);
        firmaForm.setVisible(true);
        firmaForm.setAlwaysOnTop(true);

    }

    public void firmaOUTButtonPressed() {
        JFrame firmaForm = new FirmaForm(this);
        firmaForm.setVisible(true);
        firmaForm.setAlwaysOnTop(true);

    }

    public void firmaRitardoButtonPressed(HomepageImpiegato HPI) {
        this.HPI = HPI;
        HPI.setClickable(false);
        JFrame RitardoBoundary = new RitardoBoundary(this);
        RitardoBoundary.setVisible(true);
        RitardoBoundary.setAlwaysOnTop(true);
    }

    public void DisposeWindow(JFrame finestra) {
        finestra.dispose();
        HPI.setClickable(true);
    }

    public void SubmitError(JFrame finestra) {
        finestra.dispose();
        FF.setClickable(true);
        RB.setClickable(true);
    }

    public void SubmitNotice(JFrame finestra) {
        finestra.dispose();
        FF.setClickable(true);
        RB.setClickable(true);
    }

    public void submitForm(String nome, String cognome, String matricola, String motivazione) {
        ResultSet rs;
        rs = DBMSBoundary.getQuery(
                "SELECT T.ora"
                + "FROM impiegato I, assegnazione_turno AT, turno T"
                + "WHERE I.matricola=" + matricola + " && I.nome =" + nome + " && I.cognome=" + cognome + " && I.matricola = AT.impiegato && T.id = AT.turno;"
        );
        try {
            if (rs.next()) {
                DBMSBoundary.updateQuery(
                        "INSERT INTO ritardo"
                        + "VALUES (" + matricola
                        + "','"
                        + String.valueOf(Calendar.getInstance().get(Calendar.YEAR))
                        + "-" + String.format("%02d", Calendar.getInstance().get(Calendar.MONTH) + 1)
                        + "-" + String.format("%02d", Calendar.getInstance().get(Calendar.DAY_OF_MONTH))
                        + "','" + rs.getString("ora")
                        + "','" + motivazione + "';"
                );
            }
        } catch (SQLException ex) {
            Logger.getLogger(FirmaControl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
