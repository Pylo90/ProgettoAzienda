/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.security.SecureRandom;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import view.HomepageDatore;
import view.HomepageAmministratore;
import view.ListaImpiegati;
import view.ModificaInfoImpiegato;
import view.AssumiImpiegatoBoundary;
import view.ProfiloPopup;
import misc.DBMSBoundary;
import misc.Utente;

/**
 *
 * @author dario
 */
public class AssumiLicenziaControl {

    HomepageDatore HPD;
    HomepageAmministratore HPA;
    ListaImpiegati LI;
    ModificaInfoImpiegato MII;
    AssumiImpiegatoBoundary AIB;
    DBMSBoundary DBMS;
    Utente UT;

    public AssumiLicenziaControl() {
    }

    public void ModificaInfoImpiegatoButtonPressed(HomepageDatore HPD) {
        this.HPD = HPD;
        //prendi la lista dal dbms
        JFrame ListaImpiegati = new ListaImpiegati(this);
        HPD.setClickable(false);
        ListaImpiegati.setVisible(true);
        ListaImpiegati.setAlwaysOnTop(true);
    }

    public void ModificaInfoImpiegatoButtonPressed(HomepageAmministratore HPA) {
        this.HPA = HPA;
        //prendi la lista dal dbms
        JFrame ListaImpiegati = new ListaImpiegati(this);
        HPD.setClickable(false);
        ListaImpiegati.setVisible(true);
        ListaImpiegati.setAlwaysOnTop(true);
    }

    public void workerSelected(ListaImpiegati LI, Utente UT) {
        this.LI = LI;
        JFrame ModificaInfoImpiegato = new ModificaInfoImpiegato(this, UT);
        LI.setClickable(false);
        ModificaInfoImpiegato.setVisible(true);
        ModificaInfoImpiegato.setAlwaysOnTop(true);
    }

    public void submitForm(Utente UT) {
        //Manda i dati nel DBMS (in caso spacchetta prima UT)
        ;
    }

    public void assumiButtonPressed(HomepageDatore HPD) {
        this.HPD = HPD;
        JFrame AssumiImpiegatoBoundary = new AssumiImpiegatoBoundary(this);
        HPD.setClickable(false);
        AssumiImpiegatoBoundary.setVisible(true);
        AssumiImpiegatoBoundary.setAlwaysOnTop(true);
    }

    public void assumiButtonPressed(HomepageAmministratore HPA) {
        this.HPA = HPA;
        JFrame AssumiImpiegatoBoundary = new AssumiImpiegatoBoundary(this);
        HPA.setClickable(false);
        AssumiImpiegatoBoundary.setVisible(true);
        AssumiImpiegatoBoundary.setAlwaysOnTop(true);
    }

    public void sendData(Utente UT) {
        int number = 0;

        ResultSet r = DBMSBoundary.getQuery("select count(matricola) from impiegato;"); //metti in input il numero degli impiegati nell'azienda
        try {
            if(r.next()){
                number = r.getInt(1);
            }
            else number = 0;
        } catch (SQLException ex) {
            Logger.getLogger(AssumiLicenziaControl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        UT.setMatricola(this.generateMatricola(UT.getLivello(), number));

        long PINtemporaneo = this.generatePIN(); //deve essere di 6 cifre e randomico
        //entrambi i metodi diventano campi del fantoccio

        this.sendPinToMail(PINtemporaneo, UT.getMail());
        DBMS.updateQuery("insert into impiegato values('"
                + UT.getMatricola() + "','"
                + UT.getCognome() + "',"
                + PINtemporaneo+ ",'"
                + UT.getPW() + "','"
                + UT.getNome() + "',"
                + UT.getLivello() + ",'"
                + UT.getMail() + "','"
                + UT.getNumero() + "',"
                + UT.isDisability() + ","
                + UT.getFoto() + ","
                + UT.getLivello() 
                + ");"); // inserisci impiegato
    }

    public void disposeWindow(JFrame finestra) {
        finestra.dispose();
         if (HPD != null) HPD.setClickable(true);
         if (HPA != null) HPA.setClickable(true);
    }

    public String generateMatricola(int livello, int numero_impiegati) {
        return String.valueOf(livello * 100000 + numero_impiegati);
    }

    public long generatePIN() {
        SecureRandom r = new SecureRandom();
        long low = 100000;
        long high = 999999;
        long PINtemp = r.nextLong(high - low) + low;
        ResultSet controllo = DBMSBoundary.getQuery("select pin from impiegato where impiegato.pin =" + PINtemp + ";");
        try {
            if (controllo.next()) {
                generatePIN();

            }
        } catch (SQLException ex) {
            Logger.getLogger(AssumiLicenziaControl.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        return PINtemp;
    }

    public void sendPinToMail(long pin, String mail) {
        //capire come mandare una mail
    }

    public void LicenziaButtonPressed(HomepageDatore HPD) {
        this.HPD = HPD;
        //prendi la lista degli impiegati dal dbms
        JFrame ListaImpiegati = new ListaImpiegati(this);
        HPD.setClickable(false);
        ListaImpiegati.setVisible(true);
        ListaImpiegati.setAlwaysOnTop(true);
    }

    public void SelectWorker(ListaImpiegati LI, Utente UT) {
        ProfiloPopup ProfiloPopup = new ProfiloPopup(this, UT);
        LI.setClickable(false);
        ProfiloPopup.setVisible(true);
        ProfiloPopup.setAlwaysOnTop(true);
    }

    public void decisionTaken() { //ha l'impiegato fantoccio
        DBMS.updateQuery(null);       //licenzia l'impiegato
        //distruggere profilopopup e listaimpiegati
    }

}
