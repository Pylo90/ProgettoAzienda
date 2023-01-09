/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import javax.swing.JFrame;
import java.util.Random;
import view.HomepageDatore;
import view.HomepageAmministratore;
import view.ListaImpiegati;
import view.ModificaInfoImpiegato;
import view.AssumiImpiegatoBoundary;
import view.ProfiloPopup;
import misc.DBMSBoundary; //se esiste
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

    public void sendData(Utente UT) {
        int number = DMBS.getQuery(numero_impiegati); //metti in input il numero degli impiegati nell'azienda
        UT.matricola = this.generateMatricola(UT.livello, number);
        UT.pin = this.generatePIN(); //deve essere di 6 cifre e randomico
        //entrambi i metodi diventano campi del fantoccio
        while (DBMS.getQuery(PIN)) {        //come attributo di checkPin va messo quello generato da generatePin
            UT.pin = this.generatePIN(); //deve essere riassegnato al fantoccio (User.pin = this.generatePIN();
            this.sendPinToMail(UT.pin, UT.mail);
            DBMS.updateQuery(UT); // inserisci impiegato
        }
    }

    public void disposeWindow(JFrame finestra) {
        finestra.dispose();
        HPD.setClickable(true);
    }

    public double generateMatricola(int UT.livello, int numero_impiegati) {
        return UT.livello * 100000 + numero_impiegati;
    }

    public long generatePIN() {
        Random r = new Random();
            long low = 100000;
            long high = 999999;
            return r.nextLong(high-low) + low;
    }

    public void sendPinToMail(int UT.pin, String UT.mail) {
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
        DBMS.updateQuery(matricola);       //licenzia l'impiegato
        //distruggere profilopopup e listaimpiegati
    }

}
