/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import misc.DBMSBoundary;
import view.CalendarioInterattivo;
import view.CongedoForm;
import view.HomepageAmministratore;
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
    HomepageAmministratore HPA;
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
    
    public void sendSelection(int mesi) {
        ResultSet idSet;
        int id = 1;
        idSet = DBMSBoundary.getQuery("select max(id) from richiesta;");
        try {
            if(idSet.next()) {
                id = idSet.getInt(1)+1;
            }
            else
                id = 1;
        } catch (SQLException ex) {
            Logger.getLogger(RichiesteControl.class.getName()).log(Level.SEVERE, null, ex);
        }
        DBMSBoundary.updateQuery("insert into richiesta values(" +id+ "," +1+ ",'culo','400005','200006');");
    }
    
    public void ConsultaListaButtonPressed(HomepageImpiegato HPI) {
        this.HPI = HPI;
        RL = new RichiestaList(this);
        HPI.setClickable(false);
        RL.setVisible(true);
        RL.setAlwaysOnTop(true);
    }
    public void ConsultaListaButtonPressed(HomepageAmministratore HPA) {
        this.HPA = HPA;
        RL = new RichiestaList(this);
        HPA.setClickable(false);
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
    public void RichiesteButtonPressed(HomepageAmministratore HPA) {
        this.HPA=HPA;
        if (!this.HPA.getjLabel3().isVisible()) {
                this.HPA.getjLabel3().setVisible(true);
                this.HPA.getPermesso().setVisible(true);
                this.HPA.getFerie().setVisible(true);
                this.HPA.getCongedoParentale().setVisible(true);
            } else {
                this.HPA.getjLabel3().setVisible(false);
                this.HPA.getPermesso().setVisible(false);
                this.HPA.getFerie().setVisible(false);
                this.HPA.getCongedoParentale().setVisible(false);
            }
    }

    public void DisposeWindow(JFrame finestra) {
        finestra.dispose();
        if(HPI!= null) HPI.setClickable(true);
        if(HPA!= null) HPA.setClickable(true);
        if(HPD!= null) HPD.setClickable(true);

    }
    
    public void ScambiaOrariButtonPressed(HomepageDatore HPD) {
        this.HPD = HPD;
        //prendi la lista dal dbms
        LI = new ListaImpiegati(this);
        HPD.setClickable(false);
        LI.setVisible(true);
        LI.setAlwaysOnTop(true);
    }
    public void ScambiaOrariButtonPressed(HomepageAmministratore HPA) {
        this.HPA = HPA;
        //prendi la lista dal dbms
        LI = new ListaImpiegati(this);
        HPA.setClickable(false);
        LI.setVisible(true);
        LI.setAlwaysOnTop(true);
    }
    
}
