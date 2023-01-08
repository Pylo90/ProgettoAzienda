/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import javax.swing.JFrame;
import view.HomepageDatore;
import view.HomePageAmministratore;
import view.ListaImpiegati;
import view.ModificaInfoImpiegato;
import view.AssumiImpiegatoBoundary;
import view.ProfiloPopup;
import view.DBMSBoundary; //se esiste

/**
 *
 * @author dario
 */
public class AssumiLicenziaControl {

    HomepageDatore HPD;
    HomePageAmministratore HPA;
    ListaImpiegati LI;
    ModificaInfoImpiegato MII;
    AssumiImpiegatoBoundary AIB;
    DBMSBoundary DBMS;

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
    public void ModificaInfoImpiegatoButtonPressed(HomePageAmministratore HPA) {
        this.HPA = HPA;
        //prendi la lista dal dbms
        JFrame ListaImpiegati = new ListaImpiegati(this);
        HPD.setClickable(false);
        ListaImpiegati.setVisible(true);
        ListaImpiegati.setAlwaysOnTop(true);
    }

    public void workerSelected(ListaImpiegati LI) {  //inserire nella parentesi l'impiegato di tipo boh e al posto di void l'impiegato di tipo boh
        this.LI = LI;
        JFrame ModificaInfoImpiegato = new ModificaInfoImpiegato(this); //nella parentesi mettere impiegato di tipo boh
        LI.setClickable(false);
        ModificaInfoImpiegato.setVisible(true);
        ModificaInfoImpiegato.setAlwaysOnTop(true);
    }

    public void submitForm(ModificaInfoImpiegato MII) {  //inserire nella parentesi l'impiegato di tipo boh e al posto di void l'impiegato di tipo boh
        //Manda i cazzi nel dbms
        ;
    }

    public void assumiButtonPressed(HomepageDatore HPD) {
        this.HPD = HPD;
        JFrame AssumiImpiegatoBoundary = new AssumiImpiegatoBoundary(this);
        HPD.setClickable(false);
        AssumiImpiegatoBoundary.setVisible(true);
        AssumiImpiegatoBoundary.setAlwaysOnTop(true);
    }

    public void sendData(AssumiImpiegatoBoundary AIB) { //non void ma devo mandare un tipo di dato utente o impiegato al dbms
        this.AIB = AIB;
        //prendi in qualche modo i dati dalla boundary e inseriscili in un utente fantoccio
        int number = DMBS.getEmployeesNumber();
        this.generateMatricola(); //come attributo andrebbe messo il livello del fantoccio e il numero degli impiegati
        this.generatePIN(); //deve essere di 6 cifre e randomico
        //entrambi i metodi diventano campi del fantoccio
        while (DBMS.checkPin()) {        //come attributo di checkPin va messo quello generato da generatePin
            this.generatePIN(); //deve essere riassegnato al fantoccio (User.pin = this.generatePIN();
            this.sendPinToMail();
            DBMS.insertEmployee();
            //distruggi assumiImpiegatoBoundary
        }
    }

    public void disposeWindow(JFrame finestra) {

        finestra.dispose();
        HPD.setClickable(true);

    }

    public double generateMatricola() {       //ha il livello del fantoccio e il numero degli impiegati
        return numero * 100000 + numero_impiegati;
    }

    public double generatePIN() {
        //vedere come generare un pin randomico
    }

    public void sendPinToMail() {     //ha il numero del pin e la mail del fantoccio in ingresso
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

    public void SelectWorker(ListaImpiegati LI) {  //inserire nella parentesi l'impiegato di tipo boh e al posto di void l'impiegato di tipo boh
        this.LI = LI;
        JFrame ProfiloPopup = new ProfiloPopup(); //nella parentesi mettere impiegato di tipo boh
        LI.setClickable(false);
        ProfiloPopup.setVisible(true);
        ProfiloPopup.setAlwaysOnTop(true);
    }

    public void decisionTaken() { //ha l'impiegato fantoccio
        DBMS.FireWorker();       //come attributo inserire l'impiegato fantoccio
        //distruggere profilopopup e listaimpiegati
    }

}
