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
import view.HomepageImpiegato;
import view.OrarioImpiegato;
import view.StipendioImpiegato;
import view.HomepageDatore;
import view.ListaImpiegati;
import view.StipendioImpiegatoDatore;
import view.OrarioImpiegatoDatore;

/**
 *
 * @author dario
 */
public class OrariStipendiControl {

    HomepageImpiegato HPI;
    HomepageDatore HPD;
    ListaImpiegati LI;

    public OrariStipendiControl() {
    }
    
    public void ConsultaOrarioButtonPressed(HomepageImpiegato HP) {
        HPI = HP;
        OrarioImpiegato OrarioImpiegati = new OrarioImpiegato(this);
        HPI.setClickable(false);
        OrarioImpiegati.setVisible(true);
        OrarioImpiegati.setAlwaysOnTop(true);
        
        ResultSet OI = DBMSBoundary.getQuery("select num "
                + "from impiegato, turno "
                + "where impiegato.matricola=turno.IMPIEGATO_matricola;");
        
        try {if(OI.next()){
            OrarioImpiegati.getjTable1().;
        }
        } catch (SQLException ex) {
            Logger.getLogger(OrariStipendiControl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void ConsultaStipendioButtonPressed(HomepageImpiegato HP) {
        HPI = HP;
        JFrame StipendioImpiegato = new StipendioImpiegato(this);
        HPI.setClickable(false);
        StipendioImpiegato.setVisible(true);
        StipendioImpiegato.setAlwaysOnTop(true);
    }

    public void DisposeWindow(JFrame finestra) {
        finestra.dispose();
        HPI.setClickable(true);
    }
    
    public void ConsultaStipendiImpiegatiButtonPressed(HomepageDatore HPD){
        this.HPD = HPD;
        //consulta il dbms per la lista degli impiegati
        JFrame ListaImpiegati = new ListaImpiegati(this);
        HPD.setClickable(false);
        ListaImpiegati.setVisible(true);
        ListaImpiegati.setAlwaysOnTop(true);
    }
    
    public void ConsultaOrariImpiegatiButtonPressed(HomepageDatore HPD){
        this.HPD = HPD;
        //consulta il dbms per la lista degli impiegati
        JFrame ListaImpiegati = new ListaImpiegati(this);
        HPD.setClickable(false);
        ListaImpiegati.setVisible(true);
        ListaImpiegati.setAlwaysOnTop(true);
    }
    
    public void sendSelectionSalary(ListaImpiegati LI){
        this.LI = LI;
        //chiedi il salario al dbms
        JFrame StipendioImpiegatoDatore = new StipendioImpiegatoDatore(this);
        LI.setClickable(false);
        StipendioImpiegatoDatore.setVisible(true);
        StipendioImpiegatoDatore.setAlwaysOnTop(true);
    }
    
    public void sendSelectionTimeTables(ListaImpiegati LI){
        this.LI = LI;
        //chiedi l'orario al dbms
        JFrame OrarioImpiegatoDatore = new OrarioImpiegatoDatore(this);
        LI.setClickable(false);
        OrarioImpiegatoDatore.setVisible(true);
        OrarioImpiegatoDatore.setAlwaysOnTop(true);
    }

}
