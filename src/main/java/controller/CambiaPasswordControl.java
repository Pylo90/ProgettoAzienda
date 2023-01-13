/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.ResultSet;
import javax.swing.JFrame;
import misc.DBMSBoundary;
import misc.Utente;
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
    
    public void submitForm(char vp, char np, char cp) {
        ResultSet pwSet;
        char pswSet;
        pwSet = DBMSBoundary.getQuery("select (psw) from impiegato where matricola=" +UT.getMatricola()+ ";"); 
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
