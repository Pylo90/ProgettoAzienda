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

/**
 *
 * @author dario
 */
public class CambiaPasswordControl {

    HomepageImpiegato HPI;
    HomepageAmministratore HPA;
    CambiaPasswordBoundary MP;
    Utente UT;

    public CambiaPasswordControl() {
    }

    public void CPButtonPressed(HomepageImpiegato HPI) {
        this.HPI = HPI;
        JFrame ModificaPassword = new CambiaPasswordBoundary(this);
        HPI.setClickable(false);
        ModificaPassword.setVisible(true);
        ModificaPassword.setAlwaysOnTop(true);
    }

    public void CPButtonPressed(HomepageAmministratore HPA) {
        this.HPA = HPA;
        JFrame ModificaPassword = new CambiaPasswordBoundary(this);
        HPA.setClickable(false);
        ModificaPassword.setVisible(true);
        ModificaPassword.setAlwaysOnTop(true);
    }

    public void DisposeWindow(JFrame finestra) {
        finestra.dispose();
        if (HPI != null) {
            HPI.setClickable(true);
        }
        if (HPA != null) {
            HPA.setClickable(true);
        }

    }

    public void submitForm(String vp, String np, String cp) {
        ResultSet pwSet;
        pwSet = DBMSBoundary.getQuery("select (psw) from impiegato where matricola=" + UT.getMatricola() + ";");
        try {
            if (pwSet.next()) {

                String hash = pwSet.getString("psw");

                if (!BCrypt.checkpw(vp, hash)) {
                    System.out.println("errato");// errore: vecchia password errata
                    return;
                }
                if(np!=cp){
                    System.out.println("errato"); // errore: vecchia password e nuova non coincicono
                    return;
                }
                System.out.println("corretto");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    public void MostraErrore(String messaggio) {
        Errore error = new Errore(messaggio, this);
        MP.setClickable(false);
        error.setVisible(true);
        error.setAlwaysOnTop(true);
    }

    public void SubmitError(JFrame finestra) {
        finestra.dispose();
        MP.setClickable(true);
    }

    public void SubmitNotice(JFrame finestra) {
        finestra.dispose();
        MP.setClickable(true);
    }
}
