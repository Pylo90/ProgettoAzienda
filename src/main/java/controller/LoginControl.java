package controller;

import java.awt.Image;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import misc.DBMSBoundary;
import org.springframework.security.crypto.bcrypt.BCrypt;
import view.HomepageAmministratore;
import view.HomepageDatore;
import view.HomepageImpiegato;
import view.LoginForm;

/**
 *
 * @author davide
 */
public class LoginControl {

    public LoginControl() {
        super();
    }
    ResultSet imp;
    LoginForm LF;

    /* TODO */
    public void dataSubmit(String mail, String matricola, String password, LoginForm LF) {
        String email = mail;
        String mat = matricola;
        String psw = password;

        /*imp = DBMSBoundary.getQuery("SELECT nome, cognome, matricola,email,tel,propic,livello FROM Impiegato WHERE matricola = '" + mat + "' AND email = '" + email + "' AND psw = '" + psw + "';");

        try {
            if (imp.next()) {
                correctData(imp, LF);
            } else {
                wrongData();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }*/

        ResultSet imp = DBMSBoundary.getQuery("SELECT COUNT(matricola), psw, nome, cognome, matricola, email, tel, propic, livello FROM Impiegato WHERE matricola = '" + mat + "' AND email = '" + email + "'");

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
        String nome = null;
        String cognome = null;
        String matricola = null;
        String mail = null;
        String tel = null;
        int livello = 0;
        ImageIcon proPicToSend = null;
        try {
            nome = imp.getString("nome");
            cognome = imp.getString("cognome");
            matricola = imp.getString("matricola");
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

        switch (livello) {
            case 0:
                HomepageDatore HPD = new HomepageDatore(nome, cognome, matricola, tel, mail, proPicToSend, this);
                HPD.setVisible(true);
                DisposeWindow(LF);
                break;
            case 1:
                HomepageAmministratore HPA = new HomepageAmministratore(nome, cognome, matricola, tel, mail, proPicToSend, this);
                HPA.setVisible(true);
                DisposeWindow(LF);
                break;
            case 2:
                HomepageImpiegato HPI = new HomepageImpiegato(nome, cognome, matricola, tel, mail, proPicToSend, this);
                HPI.setVisible(true);
                DisposeWindow(LF);
                break;
            case 3:
                HPI = new HomepageImpiegato(nome, cognome, matricola, tel, mail, proPicToSend, this);
                HPI.setVisible(true);
                DisposeWindow(LF);
                break;
            case 4:
                HPI = new HomepageImpiegato(nome, cognome, matricola, tel, mail, proPicToSend, this);
                HPI.setVisible(true);
                DisposeWindow(LF);
                break;
        } //DEBUG

    }

    /**
     * *****IMPLEMENTARE AZIONE IN CASO DI CREDENZIALI ERRATE******
     */
    private void wrongData() {
        System.out.println("WRONG"); //DEBUG
    }

    /* TODO */
    public void RPButtonPressed() {
        new RecuperaPasswordControl().showRecuperaPassowrd();
        //loginFrame.dispose();
    }

    /* Debug main */
    public static void main(String[] args) {
        new LoginControl().createLogin();
    }

    public void createLogin() {
        LF = new LoginForm(this);
        LF.setVisible(true);
    }

    public void SubmitError(JFrame finestra) {
        finestra.dispose();
        LF.setClickable(true);
    }

    public void SubmitNotice(JFrame finestra) {
        finestra.dispose();
        LF.setClickable(true);
    }

    public void DisposeWindow(JFrame window) {
        if (window instanceof HomepageImpiegato || window instanceof HomepageDatore || window instanceof HomepageAmministratore) {
            createLogin();
        }
        window.dispose();
    }
}
