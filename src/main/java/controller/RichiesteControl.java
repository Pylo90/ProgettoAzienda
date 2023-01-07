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

    public void RichiesteButtonPressed(HomepageImpiegato HPI) {
        this.HPI = HPI;
        JFrame RichiestaList = new RichiestaList(this);
        HPI.setClickable(false);
        RichiestaList.setVisible(true);
        RichiestaList.setAlwaysOnTop(true);
    }

    public void DisposeWindow(JFrame finestra) {

        finestra.dispose();
        HPI.setClickable(true);

    }
    
    public void ScambiaOrariButtonPressed(HomepageDatore HPD) {
        this.HPD = HPD;
        JFrame ListaImpiegati = new ListaImpiegati(this);
        HPD.setClickable(false);
        ListaImpiegati.setVisible(true);
        ListaImpiegati.setAlwaysOnTop(true);
    }

}
