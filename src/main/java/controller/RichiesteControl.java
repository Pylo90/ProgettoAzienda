/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import javax.swing.JFrame;
import view.CalendarioInterattivo;
import view.CongedoForm;
import view.HomepageImpiegato;
import view.HomepageDatore;
import view.ListaImpiegati;
import view.RichiestaList;

/**
 *
 * @author dario
 */
public class RichiesteControl {
    HomepageImpiegato HPI;
    HomepageDatore HPD;
    CongedoForm CF;
    RichiestaList RL;
    ListaImpiegati LI;
    CalendarioInterattivo CI;

    public RichiesteControl() {
    }

    public void RichiestaPermessoButtonPressed(HomepageImpiegato HPI) {
        this.HPI = HPI;
        HPI.setClickable(false);
        CI = new CalendarioInterattivo(this);
        CI.setVisible(true);
        CI.setAlwaysOnTop(true);
    }

    public void RichiestaFerieButtonPressed(HomepageImpiegato HPI) {
        this.HPI = HPI;
        HPI.setClickable(false);
        CI = new CalendarioInterattivo(this);
        CI.setVisible(true);
        CI.setAlwaysOnTop(true);
    }

    public void RichiestaCongedoParentaleButtonPressed(HomepageImpiegato HPI) {
        this.HPI = HPI;
        HPI.setClickable(false);
        CF = new CongedoForm(this);
        CF.setVisible(true);
        CF.setAlwaysOnTop(true);
    }
    
    public void ConsultaListaButtonPressed(HomepageImpiegato HPI) {
        this.HPI = HPI;
        RL = new RichiestaList(this);
        HPI.setClickable(false);
        RL.setVisible(true);
        RL.setAlwaysOnTop(true);
    }
    
    public void RichiesteButtonPressed(HomepageImpiegato HPI) {
        this.HPI=HPI;
        if (!this.HPI.getjLabel4().isVisible()) {
                this.HPI.getjLabel4().setVisible(true);
                this.HPI.getPermesso().setVisible(true);
                this.HPI.getFerie().setVisible(true);
                this.HPI.getCongedoParentale().setVisible(true);
            } else {
                this.HPI.getjLabel4().setVisible(false);
                this.HPI.getPermesso().setVisible(false);
                this.HPI.getFerie().setVisible(false);
                this.HPI.getCongedoParentale().setVisible(false);
            }
    }

    public void DisposeWindow(JFrame finestra) {
        finestra.dispose();
        HPI.setClickable(true);

    }
    
    public void ScambiaOrariButtonPressed(HomepageDatore HPD) {
        this.HPD = HPD;
        //prendi la lista dal dbms
        LI = new ListaImpiegati(this);
        HPD.setClickable(false);
        LI.setVisible(true);
        LI.setAlwaysOnTop(true);
    }
    
}
