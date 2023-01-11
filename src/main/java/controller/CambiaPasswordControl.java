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
import view.ModificaPassword;
import view.Errore;

/**
 *
 * @author dario
 */
public class CambiaPasswordControl {

    HomepageImpiegato HPI;
    ModificaPassword MP;
    Utente UT;

    public CambiaPasswordControl() {
    }

    public void CPButtonPressed(HomepageImpiegato HPI) {
        this.HPI = HPI;
        JFrame ModificaPassword = new ModificaPassword(this);
        HPI.setClickable (false);
        ModificaPassword.setVisible(true);
        ModificaPassword.setAlwaysOnTop(true);
    }
    
    public void submitForm(char vp, char np, char cp) {
        ResultSet pwSet;
        pwSet = DBMSBoundary.getQuery("select (psw) from impiegato where matricola=" +UT.getMatricola()+ ";");
        if(pwSet=vp) {
            
        }
    }
    
      public void DisposeWindow(JFrame finestra) {
        finestra.dispose();
        HPI.setClickable(true);
    }
      
    public void MostraErrore(String messaggio){
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
