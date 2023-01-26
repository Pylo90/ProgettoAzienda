package controller.Autenticazione;

import java.awt.Image;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Enumeration;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import model.DBMSBoundary;
import model.Utente;
import org.springframework.security.crypto.bcrypt.BCrypt;
import view.Errore;
import view.HomepageAmministratore;
import view.HomepageDatore;
import view.HomepageImpiegato;
import view.LoginForm;
import view.Notifica;

public class LoginControl {

    public LoginControl() {
        super();
    }
    ResultSet imp;
    LoginForm LF;
    String nome = null;
    String cognome = null;
    String matricola = null;
    String mail = null;
    String tel = null;
    int livello = 0;
    ImageIcon proPicToSend = null;

    /* TODO */
    public void dataSubmit(String mail, String matricola, String password, LoginForm LF) {
        String email = mail;
        String mat = matricola;
        String psw = password;

        imp = DBMSBoundary.getQuery("SELECT COUNT(matricola), psw, nome, cognome, matricola, email, tel, propic, livello FROM Impiegato WHERE matricola = '" + mat + "' AND email = '" + email + "'");

        try {
            imp.next();
            if (imp.getInt(1) == 0) {
                wrongData();
                return;
            }

            String hash = imp.getString("psw");

            if (!BCrypt.checkpw(psw, hash)) {
                wrongData();
                return;
            }
            correctData(imp, LF);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        System.out.println(mail); //DEBUG
        System.out.println(matricola); //DEBUG
        System.out.println(password); //DEBUG
        //implementazione Hashing password
    }

    /**
     * *****IMPLEMENTARE AZIONE IN CASO DI CREDENZIALI CORRETTE******
     */
    private void correctData(ResultSet imp, LoginForm LF) {
        System.out.println("CORRECT"); //DEBUG

        try {
            nome = imp.getString("nome");
            cognome = imp.getString("cognome");
            matricola = imp.getString("matricola");
            Utente.setMatricola(matricola);
            mail = imp.getString("email");
            tel = imp.getString("tel");
            livello = imp.getInt("livello");
            proPicToSend = new javax.swing.ImageIcon(getClass().getResource("/Propic.png"));
            if (imp.getBlob("propic") != null) {
                byte[] propicBytes = imp.getBytes("propic");
                ImageIcon format = new ImageIcon(propicBytes);
                Image foto = format.getImage();
                Image foto2 = foto.getScaledInstance(460, 460, Image.SCALE_SMOOTH);
                proPicToSend = new ImageIcon(foto2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoginControl.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(livello);

        switch (livello) {
            case 0:
                HomepageDatore HPD = new HomepageDatore(nome, cognome, matricola, tel, mail, proPicToSend, this);
                MostraNotifica("Login effettuato correttamente");
                break;
            case 1:
                HomepageImpiegato HPI = new HomepageImpiegato(nome, cognome, matricola, tel, mail, proPicToSend, this);
                MostraNotifica("Login effettuato correttamente");
                break;
            case 2:
                HPI = new HomepageImpiegato(nome, cognome, matricola, tel, mail, proPicToSend, this);
                MostraNotifica("Login effettuato correttamente");
                break;
            case 3:
                HPI = new HomepageImpiegato(nome, cognome, matricola, tel, mail, proPicToSend, this);
                MostraNotifica("Login effettuato correttamente");
                break;
            case 4:

                HomepageAmministratore HPA = new HomepageAmministratore(nome, cognome, matricola, tel, mail, proPicToSend, this);
                MostraNotifica("Login effettuato correttamente");
                break;
        } //DEBUG
        Enumeration<AbstractButton> buttons = LF.getButtonGroup1().getElements();
        while (buttons.hasMoreElements()) {
            buttons.nextElement().setEnabled(false);
        }
    }

    /**
     * *****IMPLEMENTARE AZIONE IN CASO DI CREDENZIALI ERRATE******
     */
    private void wrongData() {
        MostraErrore("Dati errati");

    }

    

    /* Debug main */
    public static void main(String[] args) {
        new LoginControl().createLogin();
    }

    public void createLogin() {
        LF = new LoginForm(this);

    }

    public void MostraErrore(String messaggio) {
        if (LF != null) {
            LF.getEmailField().setEditable(false);
            LF.getMatricolaField().setEditable(false);
            LF.getPasswordField().setEditable(false);
            LF.setAlwaysOnTop(false);
            Enumeration<AbstractButton> buttons = LF.getButtonGroup1().getElements();
            while (buttons.hasMoreElements()) {
                buttons.nextElement().setEnabled(false);
            }
        }
        new Errore(messaggio, this);
    }

    public void MostraNotifica(String messaggio) {
        if (LF != null) {
            LF.getEmailField().setEditable(false);
            LF.getMatricolaField().setEditable(false);
            LF.getPasswordField().setEditable(false);
            LF.setAlwaysOnTop(false);

            Enumeration<AbstractButton> buttons = LF.getButtonGroup1().getElements();
            while (buttons.hasMoreElements()) {
                buttons.nextElement().setEnabled(false);
            }
        }
        new Notifica(messaggio, this);
    }

    public void SubmitError(JFrame finestra) {
        DisposeWindow(finestra);
        LF.getEmailField().setEditable(true);
        LF.getMatricolaField().setEditable(true);
        LF.getPasswordField().setEditable(true);

        Enumeration<AbstractButton> buttons = LF.getButtonGroup1().getElements();
        while (buttons.hasMoreElements()) {
            buttons.nextElement().setEnabled(true);
        }

    }

    public void SubmitNotice(Notifica finestra) {

        if (LF != null) {
            Enumeration<AbstractButton> buttons = LF.getButtonGroup1().getElements();
            while (buttons.hasMoreElements()) {
                buttons.nextElement().setEnabled(true);
            }
            LF.getEmailField().setEditable(true);
            LF.getMatricolaField().setEditable(true);
            LF.getPasswordField().setEditable(true);
        }
        switch (livello) {
            case 0:
                HomepageDatore HPD = new HomepageDatore(nome, cognome, matricola, tel, mail, proPicToSend, this);
                HPD.setVisible(true);
                DisposeWindow(LF);
                break;
            case 1:
                HomepageImpiegato HPI = new HomepageImpiegato(nome, cognome, matricola, tel, mail, proPicToSend, this);
                HPI.setVisible(true);
                DisposeWindow(LF);
                break;

            case 2:
                HPI = new HomepageImpiegato(nome, cognome, matricola, tel, mail, proPicToSend, this);
                HPI.setVisible(true);
                DisposeWindow(LF);
                break;
            case 3:
                HPI = new HomepageImpiegato(nome, cognome, matricola, tel, mail, proPicToSend, this);
                HPI.setVisible(true);
                DisposeWindow(LF);
                break;
            case 4:
                HomepageAmministratore HPA = new HomepageAmministratore(nome, cognome, matricola, tel, mail, proPicToSend, this);
                HPA.setVisible(true);
                DisposeWindow(LF);
                break;
            case 5:
                finestra.dispose();

        } //DEBUG
        finestra.dispose();
    }

    public void DisposeWindow(JFrame window) {
        if (window instanceof HomepageImpiegato || window instanceof HomepageDatore || window instanceof HomepageAmministratore) {
            
            
            createLogin();
            window.dispose();
            Utente.setMatricola(null);
            MostraNotifica("Logout effettuato correttamente");
            livello = 5;

        } else {
            window.dispose();
        }
    }
}
