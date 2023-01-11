/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import javax.swing.JFrame;
import view.HomepageImpiegato;
import view.ModificaPassword;
import view.Errore;
import view.HomepageAmministratore;

/**
 *
 * @author dario
 */
public class CambiaPasswordControl {

    HomepageImpiegato HPI;
    HomepageAmministratore HPA;
    ModificaPassword MP;

    public CambiaPasswordControl() {
    }

    public void CPButtonPressed(HomepageImpiegato HPI) {
        this.HPI = HPI;
        JFrame ModificaPassword = new ModificaPassword(this);
        HPI.setClickable(false);
        ModificaPassword.setVisible(true);
        ModificaPassword.setAlwaysOnTop(true);
    }

    public void CPButtonPressed(HomepageAmministratore HPA) {
        this.HPA = HPA;
        JFrame ModificaPassword = new ModificaPassword(this);
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
