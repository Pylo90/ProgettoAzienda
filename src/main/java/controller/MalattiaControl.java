/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import javax.swing.JFrame;
import view.HomepageDatore;
import view.ListaImpiegati;
import misc.Utente;
import misc.DBMSBoundary;
import view.Notifica;

/**
 *
 * @author dario
 */
public class MalattiaControl {
    
    HomepageDatore HPD;
    DBMSBoundary DBMS;
    ListaImpiegati LI;
    Utente UT;

    public MalattiaControl() {
    }
    
    public void InserimentoMalattiaButtonPressed(HomepageDatore HPD) {
        //prendi la lista dal dbms
        JFrame ListaImpiegati = new ListaImpiegati(this);
        HPD.setClickable(false);
        ListaImpiegati.setVisible(true);
        ListaImpiegati.setAlwaysOnTop(true);
    }
    
    public void SelectWorker(ListaImpiegati LI, Utente UT) {
        Notifica n = new Notifica("Dato inserito correttamente", this);     //non ho ancora creato Notifica quindi dà errore
        LI.setClickable(false);
        n.setVisible(true);
        n.setAlwaysOnTop(true);
        //DBMS.updateQuery();        //cambia lo stato in malato
    }
    
    public void SubmitNotice(JFrame finestra) {
        finestra.dispose();
        LI.setClickable(true);
    }
}
