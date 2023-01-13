/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.security.SecureRandom;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import view.HomepageDatore;
import view.HomepageAmministratore;
import view.ListaImpiegati;
import view.ModificaInfoImpiegato;
import view.AssumiImpiegatoBoundary;
import view.ProfiloPopup;
import misc.DBMSBoundary;
import misc.Utente;
import org.springframework.security.crypto.bcrypt.BCrypt;
import view.Errore;

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
    ResultSet rs;

    public AssumiLicenziaControl() {
    }

    public void ModificaInfoImpiegatoButtonPressed(HomepageDatore HPD) {
        this.HPD = HPD;
        ResultSet rs = DBMSBoundary.getQuery("select * from impiegato;");
        JFrame ListaImpiegati = new ListaImpiegati(this, rs, "ModificaImpiegato");
        HPD.setClickable(false);
        ListaImpiegati.setVisible(true);
        ListaImpiegati.setAlwaysOnTop(true);
    }

    public void ModificaInfoImpiegatoButtonPressed(HomepageAmministratore HPA) {
        this.HPA = HPA;
        ResultSet rs = DBMSBoundary.getQuery("select nome , cognome , propic , livello from impiegato;");
        JFrame ListaImpiegati = new ListaImpiegati(this, rs, "ModificaImpiegato");
        HPD.setClickable(false);
        ListaImpiegati.setVisible(true);
        ListaImpiegati.setAlwaysOnTop(true);
    }

    public void workerSelected(ListaImpiegati LI, String matricola) {
        rs = null;
        this.LI = LI;
        rs = DBMSBoundary.getQuery("select * from impiegato where impiegato.matricola = " + matricola);
        JFrame ModificaInfoImpiegato = new ModificaInfoImpiegato(this, rs);
        LI.setClickable(false);
        ModificaInfoImpiegato.setVisible(true);
        ModificaInfoImpiegato.setAlwaysOnTop(true);
    }

    public void submitForm(Utente UT) {
        //Manda i dati nel DBMS (in caso spacchetta prima UT)
        ;
    }

    public void DisposeWindow(JFrame finestra) {
        finestra.dispose();
        if (HPA != null) {
            HPA.setClickable(true);
        }
        if (HPD != null) {
            HPD.setClickable(true);
        }

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

    public void sendData(String name, String surname, String mail, String passw, String cf, ImageIcon foto, String numero, int livello, boolean disability, String path) {
        int number = 0;

        ResultSet r = DBMS.getQuery("select count(matricola) from impiegato;"); //metti in input il numero degli impiegati nell'azienda
        try {
            if (r.next()) {
                number = r.getInt(1);
            } else {
                number = 0;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AssumiLicenziaControl.class.getName()).log(Level.SEVERE, null, ex);
        }

        String matricola = this.generateMatricola(livello, number);

        long PINtemporaneo = this.generatePIN(); //deve essere di 6 cifre e randomico
        //entrambi i metodi diventano campi del fantoccio

        this.sendPinToMail(PINtemporaneo, mail);
        DBMS.updateQuery("insert into impiegato values('"
                + matricola + "','"
                + surname + "',"
                + PINtemporaneo + ",'"
                + passw + "','"
                + name + "',"
                + livello + ",'"
                + mail + "','"
                + numero + "',"
                + disability + ","
                + null + ","
                + livello + ");"); // inserisci impiegato
        try {
            DBMS.updatePropic(matricola, new FileInputStream(path));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AssumiLicenziaControl.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void submitForm(String name, String surname, String mail, String passw, String cf, ImageIcon foto, String numero, int livello, boolean disability, String path, String matricola) {

 
        DBMS.updateQuery("UPDATE Impiegato SET "
                + "cognome = '" +surname + "',"
                + "nome = '"+name + "',"
                + "livello = "+livello + ",'"
                + "email = '" +mail + "','"
                + "tel = '"+numero + "',"
                + "_104 = "+disability + ");"); // inserisci impiegato
        try {
            DBMS.updatePropic(matricola, new FileInputStream(path));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AssumiLicenziaControl.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void disposeWindow(JFrame finestra) {
        finestra.dispose();
        if (HPD != null) {
            HPD.setClickable(true);
        }
        if (HPA != null) {
            HPA.setClickable(true);
        }
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

    /**
     * *****DA UTILIZZARE PER GENERARE UNA PASSWORD CASUALE******
     */
    private String generatePlainPassword() {
        byte[] psw = new byte[16];
        new SecureRandom().nextBytes(psw);
        return new String(psw);
    }

    /**
     * *****DA UTILIZZARE PER GENERARE L'HASH DI UNA PASSWORD PER SALVARLA NEL DATABASE******
     */
    private String hashPassword(String password) {
        String hash = BCrypt.hashpw(password, BCrypt.gensalt());
        return hash;
    }

    public void sendPinToMail(long pin, String mail) {
        //capire come mandare una mail
    }

    public void LicenziaButtonPressed(HomepageDatore HPD) {
        this.HPD = HPD;
        ResultSet rs = DBMSBoundary.getQuery("select nome , cognome , propic , livello from impiegato;");
        JFrame ListaImpiegati = new ListaImpiegati(this, rs, "LicenziaImpiegato");
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

    public void verifyMail(String mail, AssumiImpiegatoBoundary AIB) {
        if (!((mail.contains("@") && mail.contains(".it")) || mail.contains("@gmail.com"))) {
            Errore e = new Errore("mail errata", this);
            AIB.setClickable(false);
            e.setVisible(true);
            e.setAlwaysOnTop(true);
        }
    }

    public void verifyMail(String mail, ModificaInfoImpiegato MII) {
        if (!((mail.contains("@") && mail.contains(".it")) || mail.contains("@gmail.com"))) {
            Errore e = new Errore("mail errata", this);
            MII.setClickable(false);
            e.setVisible(true);
            e.setAlwaysOnTop(true);
        }
    }

    public void SubmitError(JFrame finestra) {
        finestra.dispose();
        AIB.setClickable(true);
    }

}
