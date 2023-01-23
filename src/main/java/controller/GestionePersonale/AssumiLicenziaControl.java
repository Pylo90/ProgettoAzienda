 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.GestionePersonale;

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
import model.DBMSBoundary;
import misc.MailSender;
import model.Utente;
import static org.passay.AllowedCharacterRule.ERROR_CODE;
import org.passay.CharacterData;
import org.passay.CharacterRule;
import org.passay.EnglishCharacterData;
import org.passay.PasswordGenerator;
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

    public void ModificaInfoImpiegatoButtonPressed(JFrame homepage) {
        if (homepage instanceof HomepageDatore) {
            this.HPD = (HomepageDatore) homepage;
        }
        if (homepage instanceof HomepageAmministratore) {
            this.HPA = (HomepageAmministratore) homepage;
        }
        ResultSet rs = DBMSBoundary.getQuery("select * from impiegato;");
        JFrame ListaImpiegati = new ListaImpiegati(this, rs, "ModificaImpiegato");
        if (HPD != null) {
            HPD.setClickable(false);
        }
        if (HPA != null) {
            HPA.setClickable(false);
        }
        ListaImpiegati.setVisible(true);
        ListaImpiegati.setAlwaysOnTop(true);
    }

    public void workerSelected(ListaImpiegati LI, String matricola) {
        rs = null;
        this.LI = LI;
        rs = DBMSBoundary.getQuery("select * from impiegato where impiegato.matricola = " + matricola + " ;");
        JFrame ModificaInfoImpiegato = new ModificaInfoImpiegato(this, rs);
        LI.setClickable(false);
        ModificaInfoImpiegato.setVisible(true);
        ModificaInfoImpiegato.setAlwaysOnTop(true);
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

    public void assumiImpiegatoButtonPressed(JFrame homepage) {
        if (homepage instanceof HomepageDatore) {
            this.HPD = (HomepageDatore) homepage;
        }
        if (homepage instanceof HomepageAmministratore) {
            this.HPA = (HomepageAmministratore) homepage;
        }
        JFrame AssumiImpiegatoBoundary = new AssumiImpiegatoBoundary(this);
        if (HPD != null) {
            HPD.setClickable(false);
        }
        if (HPA != null) {
            HPA.setClickable(false);
        }
        AssumiImpiegatoBoundary.setVisible(true);
        AssumiImpiegatoBoundary.setAlwaysOnTop(true);
    }

    public void licenziaImpiegatoButtonPressed(JFrame homepage) {
        if (homepage instanceof HomepageDatore) {
            this.HPD = (HomepageDatore) homepage;
        }
        if (homepage instanceof HomepageAmministratore) {
            this.HPA = (HomepageAmministratore) homepage;
        }
        ResultSet rs = DBMSBoundary.getQuery("select * from impiegato;");
        JFrame ListaImpiegati = new ListaImpiegati(this, rs, "LicenziaImpiegato");
        if (HPD != null) {
            HPD.setClickable(false);
        }
        if (HPA != null) {
            HPA.setClickable(false);
        }
        ListaImpiegati.setVisible(true);
        ListaImpiegati.setAlwaysOnTop(true);

    }

    public void sendData(String name, String surname, String mail, String cf, ImageIcon foto, String numero, int livello, String path) {
        int number = 0;

        String matricola = this.generateMatricola(livello, number);
        String plainPW = generatePlainPassword (12);
        String passw = hashPassword(plainPW);

        long PINtemporaneo = this.generatePin(); //deve essere di 6 cifre e randomico
        //entrambi i metodi diventano campi del fantoccio

        
        MailSender.sendMail(mail, "Password e Pin", "Password: "+plainPW + "   , Pin: "+ PINtemporaneo);
        DBMSBoundary.updateQuery("insert into impiegato values('"
                + matricola + "','"
                + surname + "','"
                + PINtemporaneo + "','"
                + passw + "','"
                + name + "',"
                + livello + ",'"
                + mail + "','"
                + numero + "',"
                + null + ","
                + null + ","
                + 1 + ",'"
                + cf + "');"); // inserisci impiegato
        try {
            DBMSBoundary.updatePropic(matricola, new FileInputStream(path));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AssumiLicenziaControl.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void submitForm(String name, String surname, String mail, String cf, String numero, int livello, InputStream in, String matricola, boolean updatePropic) {

        DBMSBoundary.updateQuery("UPDATE Impiegato SET "
                + "cognome = '" + surname + "',"
                + "nome = '" + name + "',"
                + "livello = " + (livello + 1) + ","
                + "email = '" + mail + "',"
                + "tel = '" + numero + "',"
                + "_104 = " + null + " where Impiegato.matricola = '" + matricola + "';"); // inserisci impiegato

        if (updatePropic) {
            DBMSBoundary.updatePropic(matricola, in);
        }

    }

    public void disposeWindow(JFrame finestra) {
        if (finestra instanceof ModificaInfoImpiegato) {
            if (LI != null) {
                LI.dispose();
            }
        }
        if (finestra instanceof ProfiloPopup) {
            if (LI != null) {
                LI.dispose();
            }
        }
        finestra.dispose();
        if (HPD != null) {
            HPD.setClickable(true);
        }
        if (HPA != null) {
            HPA.setClickable(true);
        }
    }

    public void disposeProfiloPopup(ProfiloPopup pp) {
        pp.dispose();
        for (int i = 0; i < LI.getImpiegati().size(); ++i) {
            LI.getImpiegati().get(i).setClickable(true);
        }
    }

    public String generateMatricola(int livello, int numero_impiegati) {
        return String.valueOf(livello * 100000 + numero_impiegati);
    }

    public long generatePin() {
        SecureRandom r = new SecureRandom();
        long low = 100000;
        long high = 999999;
        long PINtemp = r.nextLong(high - low) + low;
        ResultSet controllo = DBMSBoundary.getQuery("select pin from impiegato where impiegato.pin =" + PINtemp + ";");
        try {
            if (controllo.next()) {
                generatePin();

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
    private String generatePlainPassword(int lenght) {
        PasswordGenerator gen = new PasswordGenerator();
        CharacterData lowerCaseChars = EnglishCharacterData.LowerCase;
        CharacterRule lowerCaseRule = new CharacterRule(lowerCaseChars);
        lowerCaseRule.setNumberOfCharacters(2);

        CharacterData upperCaseChars = EnglishCharacterData.UpperCase;
        CharacterRule upperCaseRule = new CharacterRule(upperCaseChars);
        upperCaseRule.setNumberOfCharacters(2);

        CharacterData digitChars = EnglishCharacterData.Digit;
        CharacterRule digitRule = new CharacterRule(digitChars);
        digitRule.setNumberOfCharacters(2);

        CharacterData specialChars;
        specialChars = new CharacterData() {
            @Override
            public String getErrorCode() {
                return ERROR_CODE;
            }

            @Override
            public String getCharacters() {
                return "!@#$%^&*()_+";
            }
        };
        CharacterRule splCharRule = new CharacterRule(specialChars);
        splCharRule.setNumberOfCharacters(2);

        return gen.generatePassword(lenght, splCharRule, lowerCaseRule,
                upperCaseRule, digitRule);
    }

    /**
     * *****DA UTILIZZARE PER GENERARE L'HASH DI UNA PASSWORD PER SALVARLA NEL
     * DATABASE******
     */
    private String hashPassword(String password) {
        String hash = BCrypt.hashpw(password, BCrypt.gensalt());
        return hash;
    }

    public static void main(String[] args) {
    }


    public void SelectWorker(ListaImpiegati LI, String matricola) {
        rs = null;
        this.LI = LI;
        rs = DBMSBoundary.getQuery("select * from impiegato where impiegato.matricola = " + matricola + " ;");
        JFrame ProfiloPopup = new ProfiloPopup(this, rs);
        LI.setClickable(false);
        LI.setAlwaysOnTop(false);
        for (int i = 0; i < LI.getImpiegati().size(); ++i) {
            LI.getImpiegati().get(i).setClickable(false);
        }
        ProfiloPopup.setVisible(true);
        ProfiloPopup.setAlwaysOnTop(true);
    }

    public void decisionTaken(String matricola) { //ha l'impiegato fantoccio
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
