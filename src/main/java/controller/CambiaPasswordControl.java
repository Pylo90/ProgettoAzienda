/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import javax.swing.JFrame;
import view.HomepageImpiegato;
import view.ModificaPassword;

/**
 *
 * @author dario
 */
public class CambiaPasswordControl {

    HomepageImpiegato HPI;

    public void CPButtonPressed(HomepageImpiegato HPI) {
        this.HPI = HPI;
        JFrame ModificaPassword = new ModificaPassword(this);
        HPI.setClickable (false);
        ModificaPassword.setVisible(true);
        ModificaPassword.setAlwaysOnTop(true);
    }
    
      public void DisposeWindow(JFrame finestra) {
        finestra.dispose();
        HPI.setClickable(true);
    }
}
