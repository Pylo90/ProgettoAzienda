/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.AreaPersonale;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
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

/**
 *
 * @author dario
 */
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
            HPI.setClickable(false);
        }
        if (HP instanceof HomepageAmministratore) {
            HPA = (HomepageAmministratore) HP;
            HPA.setClickable(false);
        }
        if (HP instanceof HomepageDatore) {
            HPD = (HomepageDatore) HP;
            HPD.setClickable(false);
        }
        JFrame ModificaPassword = new CambiaPasswordBoundary(this);
    }

    public void DisposeWindow(JFrame finestra) {
        finestra.dispose();
        if (HPI != null) {
            HPI.setClickable(true);
        }
        if (HPA != null) {
            HPA.setClickable(true);
        }
        if (HPD != null) {
            HPD.setClickable(true);
        }
    }

    public void submitForm(String vp, String np, String cp) {
        //invio modifica password
        ResultSet pwSet;
        pwSet = DBMSBoundary.getQuery("select (psw) from impiegato where matricola=" + Utente.getMatricola() + ";");
        try {
            if (pwSet.next()) {

                String hash = pwSet.getString("psw");

                if (!BCrypt.checkpw(vp, hash)) {
                    MostraErrore("Vecchia password errata");
                    return;
                }
                if (np != cp) {
                    MostraErrore("Nuova password e conferma non coincidono");
                    return;
                }
                MostraNotifica("Password cambiata correttamente");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    public void MostraErrore(String messaggio) {
        if (CPB != null) {
            CPB.setClickable(false);
        }
        new Errore(messaggio, this);
    }

    public void SubmitError(JFrame finestra) {
        if (CPB != null) {
            CPB.setClickable(true);
        }
        finestra.dispose();
    }

    public void MostraNotifica(String messaggio) {
        if (CPB != null) {
            CPB.setClickable(false);
        }
        new Notifica(messaggio, this);
        

    }

    public void SubmitNotice(JFrame finestra) {
        finestra.dispose();
        if (CPB != null) {
            CPB.setClickable(true);
        }
    }
}
