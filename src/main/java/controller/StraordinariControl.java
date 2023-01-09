/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import javax.swing.JFrame;
import view.HomepageDatore;
import view.ListaImpiegati;

/**
 *
 * @author dario
 */
public class StraordinariControl {
    
    HomepageDatore HPD;

    public StraordinariControl() {
    }
    
    public void AffidaStraordinariButtonPressed(HomepageDatore HPD) {
        //prendi la lista dal dbms
        JFrame ListaImpiegati = new ListaImpiegati(this);
        HPD.setClickable(false);
        ListaImpiegati.setVisible(true);
        ListaImpiegati.setAlwaysOnTop(true);
    }
    
}
