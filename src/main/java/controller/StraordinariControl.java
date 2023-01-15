/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.ResultSet;
import javax.swing.JFrame;
import misc.DBMSBoundary;
import view.HomepageDatore;
import view.ListaImpiegati;
import misc.Utente;
import view.CalendarioInterattivo;
import view.CalendarioOreInterattivo;
import view.HomepageAmministratore;

/**
 *
 * @author dario
 */
public class StraordinariControl {

    HomepageDatore HPD;
    HomepageAmministratore HPA;
    ListaImpiegati LI;
    Utente UT;
    CalendarioInterattivo CI;
    CalendarioOreInterattivo COI;

    public StraordinariControl() {
    }

    public void AffidaStraordinariButtonPressed(JFrame homepage) {
        if (homepage instanceof HomepageDatore) {
            this.HPD = (HomepageDatore) homepage;
        }
        if (homepage instanceof HomepageAmministratore) {
            this.HPA = (HomepageAmministratore) homepage;
        }
        ResultSet rs = DBMSBoundary.getQuery("select nome , cognome , propic , livello from impiegato;");
        JFrame ListaImpiegati = new ListaImpiegati(this, rs, "AffidaStraordinari");
        HPD.setClickable(false);
        ListaImpiegati.setVisible(true);
        ListaImpiegati.setAlwaysOnTop(true);
    }


    /*public void workerSelected(ListaImpiegati LI, Utente UT) {
        this.LI = LI;
        CalendarioInterattivo c = new CalendarioInterattivo(this, UT);
        LI.setClickable(false);
        c.setVisible(true);
        c.setAlwaysOnTop(true);
    }

    public void daySelected(CalendarioInterattivo CI, Utente UT, int giorno) {
        this.CI = CI;
        CalendarioOreInterattivo c = new CalendarioOreInterattivo(this, UT, giorno, false);
        DisposeWindow(CI);
        c.setVisible(true);
        c.setAlwaysOnTop(true);
    }

    public void startingHourSelected(Utente UT, int giorno, boolean ora, int inizioStraordinario) {
        CalendarioOreInterattivo c = new CalendarioOreInterattivo(this, UT, giorno, true, inizioStraordinario); //appare un calendarioOreInterattivo senza l'ora selezionata e rendendo incliccabili tutte le ore precedenti 
        c.setVisible(true);
        c.setAlwaysOnTop(true);
    }*/

    public void endingHourSelected(Utente UT, int giorno, int inizioStraordinario, int fineStraordinario) {
        // manda inizio e fine straordinario nel dbms
    }

    public void DisposeWindow(JFrame finestra) {
        finestra.dispose();
        if (HPA != null) {
            HPA.setClickable(true);
        }
        if (HPD != null) {
            HPD.setClickable(true);
        }

    }
}
