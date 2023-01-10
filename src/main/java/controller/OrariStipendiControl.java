/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.Color;
import java.awt.Component;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.table.TableCellRenderer;
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

        ResultSet OI = DBMSBoundary.getQuery("select num, dayofweek(_data) "
                + "from impiegato, turno "
                + "where impiegato.matricola=turno.IMPIEGATO_matricola;");

        try {
            if (OI.next()) {
                switch (OI.getInt(1)*10+(((OI.getInt(2)-2)% 7) + 7) % 7) {
                    case 10:
                        OrarioImpiegati.getLabel1().setIcon(new javax.swing.ImageIcon(getClass().getResource("/OrarioButtonSelezionato.png")));
                        break;
                    case 11:
                        OrarioImpiegati.getLabel2().setIcon(new javax.swing.ImageIcon(getClass().getResource("/OrarioButtonSelezionato.png")));
                        break;
                    case 12:
                        OrarioImpiegati.getLabel3().setIcon(new javax.swing.ImageIcon(getClass().getResource("/OrarioButtonSelezionato.png")));
                        break;
                    case 13:
                        OrarioImpiegati.getLabel4().setIcon(new javax.swing.ImageIcon(getClass().getResource("/OrarioButtonSelezionato.png")));
                        break;
                    case 14:
                        OrarioImpiegati.getLabel5().setIcon(new javax.swing.ImageIcon(getClass().getResource("/OrarioButtonSelezionato.png")));
                        break;
                    case 15:
                        OrarioImpiegati.getLabel6().setIcon(new javax.swing.ImageIcon(getClass().getResource("/OrarioButtonSelezionato.png")));
                        break;
                    case 16:
                        OrarioImpiegati.getLabel7().setIcon(new javax.swing.ImageIcon(getClass().getResource("/OrarioButtonSelezionato.png")));
                        break;
                    case 20:
                        OrarioImpiegati.getLabel8().setIcon(new javax.swing.ImageIcon(getClass().getResource("/OrarioButtonSelezionato.png")));
                        break;
                    case 21:
                        OrarioImpiegati.getLabel9().setIcon(new javax.swing.ImageIcon(getClass().getResource("/OrarioButtonSelezionato.png")));
                        break;
                    case 22:
                        OrarioImpiegati.getLabel10().setIcon(new javax.swing.ImageIcon(getClass().getResource("/OrarioButtonSelezionato.png")));
                        break;
                    case 23:
                        OrarioImpiegati.getLabel11().setIcon(new javax.swing.ImageIcon(getClass().getResource("/OrarioButtonSelezionato.png")));
                        break;
                    case 24:
                        OrarioImpiegati.getLabel12().setIcon(new javax.swing.ImageIcon(getClass().getResource("/OrarioButtonSelezionato.png")));
                        break;
                    case 25:
                        OrarioImpiegati.getLabel13().setIcon(new javax.swing.ImageIcon(getClass().getResource("/OrarioButtonSelezionato.png")));
                        break;
                    case 26:
                        OrarioImpiegati.getLabel14().setIcon(new javax.swing.ImageIcon(getClass().getResource("/OrarioButtonSelezionato.png")));
                        break;
                    case 30:
                        OrarioImpiegati.getLabel15().setIcon(new javax.swing.ImageIcon(getClass().getResource("/OrarioButtonSelezionato.png")));
                        break;
                    case 31:
                        OrarioImpiegati.getLabel16().setIcon(new javax.swing.ImageIcon(getClass().getResource("/OrarioButtonSelezionato.png")));
                        break;
                    case 32:
                        OrarioImpiegati.getLabel17().setIcon(new javax.swing.ImageIcon(getClass().getResource("/OrarioButtonSelezionato.png")));
                        break;
                    case 33:
                        OrarioImpiegati.getLabel18().setIcon(new javax.swing.ImageIcon(getClass().getResource("/OrarioButtonSelezionato.png")));
                        break;
                    case 34:
                        OrarioImpiegati.getLabel19().setIcon(new javax.swing.ImageIcon(getClass().getResource("/OrarioButtonSelezionato.png")));
                        break;
                    case 35:
                        OrarioImpiegati.getLabel20().setIcon(new javax.swing.ImageIcon(getClass().getResource("/OrarioButtonSelezionato.png")));
                        break;
                    case 36:
                        OrarioImpiegati.getLabel21().setIcon(new javax.swing.ImageIcon(getClass().getResource("/OrarioButtonSelezionato.png")));
                        break;
                    
                }
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

    public void ConsultaStipendiImpiegatiButtonPressed(HomepageDatore HPD) {
        this.HPD = HPD;
        //consulta il dbms per la lista degli impiegati
        JFrame ListaImpiegati = new ListaImpiegati(this);
        HPD.setClickable(false);
        ListaImpiegati.setVisible(true);
        ListaImpiegati.setAlwaysOnTop(true);
    }

    public void ConsultaOrariImpiegatiButtonPressed(HomepageDatore HPD) {
        this.HPD = HPD;
        //consulta il dbms per la lista degli impiegati
        JFrame ListaImpiegati = new ListaImpiegati(this);
        HPD.setClickable(false);
        ListaImpiegati.setVisible(true);
        ListaImpiegati.setAlwaysOnTop(true);
    }

    public void sendSelectionSalary(ListaImpiegati LI) {
        this.LI = LI;
        //chiedi il salario al dbms
        JFrame StipendioImpiegatoDatore = new StipendioImpiegatoDatore(this);
        LI.setClickable(false);
        StipendioImpiegatoDatore.setVisible(true);
        StipendioImpiegatoDatore.setAlwaysOnTop(true);
    }

    public void sendSelectionTimeTables(ListaImpiegati LI) {
        this.LI = LI;
        //chiedi l'orario al dbms
        JFrame OrarioImpiegatoDatore = new OrarioImpiegatoDatore(this);
        LI.setClickable(false);
        OrarioImpiegatoDatore.setVisible(true);
        OrarioImpiegatoDatore.setAlwaysOnTop(true);
    }

}
