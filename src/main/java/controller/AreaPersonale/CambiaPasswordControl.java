package controller.AreaPersonale;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Enumeration;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractButton;
import javax.swing.JFrame;
import model.DBMSBoundary;
import model.Utente;
import org.springframework.security.crypto.bcrypt.BCrypt;
import view.HomepageImpiegato;
import view.CambiaPasswordBoundary;
import view.Errore;
import view.HomepageAmministratore;
import view.HomepageDatore;
import view.Notifica;

public class CambiaPasswordControl {

    HomepageImpiegato HPI;
    HomepageAmministratore HPA;
    HomepageDatore HPD;
    CambiaPasswordBoundary CPB;

    public CambiaPasswordControl() {
    }

    public void CPButtonPressed(JFrame HP) {
        //reference homepage e apparizione boundary
        if (HP instanceof HomepageImpiegato) {
            HPI = (HomepageImpiegato) HP;
            Enumeration<AbstractButton> buttons = HPI.getButtonGroup1().getElements();
            while (buttons.hasMoreElements()) {
                buttons.nextElement().setEnabled(false);
            }
        }
        if (HP instanceof HomepageAmministratore) {
            HPA = (HomepageAmministratore) HP;
            Enumeration<AbstractButton> buttons = HPA.getButtonGroup1().getElements();
            while (buttons.hasMoreElements()) {
                buttons.nextElement().setEnabled(false);
            }
        }
        if (HP instanceof HomepageDatore) {
            HPD = (HomepageDatore) HP;
            Enumeration<AbstractButton> buttons = HPD.getButtonGroup1().getElements();
            while (buttons.hasMoreElements()) {
                buttons.nextElement().setEnabled(false);
            }
        }
        JFrame ModificaPassword = new CambiaPasswordBoundary(this);
    }

    public void DisposeWindow(JFrame finestra) {
        finestra.dispose();
        if (HPI != null) {
            Enumeration<AbstractButton> buttons = HPI.getButtonGroup1().getElements();
            while (buttons.hasMoreElements()) {
                buttons.nextElement().setEnabled(true);
            }
        }
        if (HPA != null) {
            Enumeration<AbstractButton> buttons = HPA.getButtonGroup1().getElements();
            while (buttons.hasMoreElements()) {
                buttons.nextElement().setEnabled(true);
            }
        }
        if (HPD != null) {
            Enumeration<AbstractButton> buttons = HPD.getButtonGroup1().getElements();
            while (buttons.hasMoreElements()) {
                buttons.nextElement().setEnabled(true);
            }
        }
    }

    public void submitForm(String vp, String np, String cp, CambiaPasswordBoundary CPB) {
        //invio modifica password
        this.CPB = CPB;
        ResultSet pwSet;
        pwSet = DBMSBoundary.getQuery("select (psw) from impiegato where matricola=" + Utente.getMatricola() + ";");
        try {
            if (pwSet.next()) {

                String hash = pwSet.getString("psw");

                if (!BCrypt.checkpw(vp, hash)) {
                    MostraErrore("Vecchia password errata");
                    return;
                }
                if (!np.equals(cp)) {
                    MostraErrore("Nuova password e conferma non coincidono");
                    return;
                }
                String passw = BCrypt.hashpw(np, BCrypt.gensalt());
                DBMSBoundary.updateQuery("update impiegato set psw ='" + passw + "' where matricola=" + Utente.getMatricola() + ";");

                MostraNotifica("Password cambiata correttamente");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    public void MostraErrore(String messaggio) {
        if (CPB != null) {
            Enumeration<AbstractButton> buttons = CPB.getButtonGroup1().getElements();
            while (buttons.hasMoreElements()) {
                buttons.nextElement().setEnabled(false);
            }
            CPB.setAlwaysOnTop(false);
            CPB.getjPasswordField1().setEditable(false);
            CPB.getjPasswordField2().setEditable(false);
            CPB.getjTextField1().setEditable(false);
        }
        new Errore(messaggio, this);
    }

    public void SubmitError(JFrame finestra) {
        if (CPB != null) {
            Enumeration<AbstractButton> buttons = CPB.getButtonGroup1().getElements();
            while (buttons.hasMoreElements()) {
                buttons.nextElement().setEnabled(true);

            }
            CPB.getjPasswordField1().setEditable(true);
            CPB.getjPasswordField2().setEditable(true);
            CPB.getjTextField1().setEditable(true);
            CPB.setAlwaysOnTop(true);

        }
        finestra.dispose();
    }

    public void MostraNotifica(String messaggio) {
        if (CPB != null) {
            Enumeration<AbstractButton> buttons = CPB.getButtonGroup1().getElements();
            while (buttons.hasMoreElements()) {
                buttons.nextElement().setEnabled(false);
            }
            CPB.setAlwaysOnTop(false);
            CPB.getjPasswordField1().setEditable(false);
            CPB.getjPasswordField2().setEditable(false);
            CPB.getjTextField1().setEditable(false);
        }
        
        new Notifica(messaggio, this);

    }

    public void SubmitNotice(JFrame finestra) {
        finestra.dispose();
        if (CPB != null) {
            Enumeration<AbstractButton> buttons = CPB.getButtonGroup1().getElements();
            while (buttons.hasMoreElements()) {
                buttons.nextElement().setEnabled(true);
            }
            CPB.getjPasswordField1().setEditable(true);
            CPB.getjPasswordField2().setEditable(true);
            CPB.getjTextField1().setEditable(true);
            CPB.setAlwaysOnTop(true);


        }
    }
}
