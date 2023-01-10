/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import javax.swing.JFrame;
import view.HomepageDatore;
import view.ListaImpiegati;
import misc.Utente;
import view.CalendarioInterattivo;
import view.CalendarioOreInterattivo;

/**
 *
 * @author dario
 */
public class StraordinariControl {
    
    HomepageDatore HPD;
    ListaImpiegati LI;
    Utente UT;
    CalendarioInterattivo CI;
    CalendarioOreInterattivo COI;

    public StraordinariControl() {
    }
    
    public void AffidaStraordinariButtonPressed(HomepageDatore HPD) {
        //prendi la lista dal dbms
        JFrame ListaImpiegati = new ListaImpiegati(this);
        HPD.setClickable(false);
        ListaImpiegati.setVisible(true);
        ListaImpiegati.setAlwaysOnTop(true);
    }
    
    public void workerSelected(ListaImpiegati LI, Utente UT) {
        this.LI = LI;
        CalendarioInterattivo c = new CalendarioInterattivo(this, UT); 
        LI.setClickable(false);
        c.setVisible(true);
        c.setAlwaysOnTop(true);
    }
    
    public void daySelected(CalendarioInterattivo CI, Utente UT, int giorno) {
        this.CI = CI;
        CalendarioOreInterattivo c = new CalendarioOreInterattivo(this, UT, giorno); 
        CI.setClickable(false);
        c.setVisible(true);
        c.setAlwaysOnTop(true);
    }
    
    public void startingHourSelected(Utente UT, int giorno, boolean ora, int inizioStraordinario) {
        CalendarioOreInterattivo c = new CalendarioOreInterattivo(this, UT, giorno, true, inizioStraordinario); //appare un calendarioOreInterattivo senza l'ora selezionata e rendendo incliccabili tutte le ore precedenti 
        c.setVisible(true);
        c.setAlwaysOnTop(true);
    }
    
    public void endingHourSelected(Utente UT, int giorno, int inizioStraordinario, int fineStraordinario) {
        // manda inizio e fine straordinario nel dbms
    }
    
    public void disposeWindow(JFrame finestra) {
        finestra.dispose();
        HPD.setClickable(true);
    }
}
