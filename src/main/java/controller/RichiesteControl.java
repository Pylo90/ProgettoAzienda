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

    public RichiesteControl() {
    }

    public void RichiestaPermessoButtonPressed(HomepageImpiegato HPI) {
        this.HPI = HPI;
        HPI.setClickable(false);
        JFrame CalendarioInterattivo = new CalendarioInterattivo(this);
        CalendarioInterattivo.setVisible(true);
        CalendarioInterattivo.setAlwaysOnTop(true);
    }

    public void RichiestaFerieButtonPressed(HomepageImpiegato HPI) {
        this.HPI = HPI;
        HPI.setClickable(false);
        JFrame CalendarioInterattivo = new CalendarioInterattivo(this);
        CalendarioInterattivo.setVisible(true);
        CalendarioInterattivo.setAlwaysOnTop(true);
    }

    public void RichiestaCongedoParentaleButtonPressed(HomepageImpiegato HPI) {
        this.HPI = HPI;
        HPI.setClickable(false);
        JFrame CongedoForm = new CongedoForm(this);
        CongedoForm.setVisible(true);
        CongedoForm.setAlwaysOnTop(true);
    }
    
    public void ConsultaListaButtonPressed(HomepageImpiegato HPI) {
        this.HPI = HPI;
        JFrame RichiestaList = new RichiestaList(this);
        HPI.setClickable(false);
        RichiestaList.setVisible(true);
        RichiestaList.setAlwaysOnTop(true);
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
        JFrame ListaImpiegati = new ListaImpiegati(this);
        HPD.setClickable(false);
        ListaImpiegati.setVisible(true);
        ListaImpiegati.setAlwaysOnTop(true);
    }
    
}
