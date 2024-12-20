package controller.Autenticazione;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Enumeration;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractButton;
import javax.swing.JFrame;
import misc.MailSender;
import model.DBMSBoundary;
import static org.passay.AllowedCharacterRule.ERROR_CODE;
import org.passay.CharacterData;
import org.passay.CharacterRule;
import org.passay.EnglishCharacterData;
import org.passay.PasswordGenerator;
import org.springframework.security.crypto.bcrypt.BCrypt;
import view.Errore;
import view.LoginForm;
import view.Notifica;
import view.RecuperaPasswordBoundary;

public class RecuperaPasswordControl {

    RecuperaPasswordBoundary recuperaForm;
    LoginForm LF;

    public RecuperaPasswordControl(LoginForm LF) {
        super();
        recuperaForm = new RecuperaPasswordBoundary(this);
        recuperaForm.setAlwaysOnTop(true);
        this.LF = LF;

        this.LF.setAlwaysOnTop(false);
        Enumeration<AbstractButton> buttons = LF.getButtonGroup1().getElements();
        while (buttons.hasMoreElements()) {
            buttons.nextElement().setEnabled(false);
        }
        recuperaForm.setVisible(true);

    }

    public void submitForm(String nome, String cognome, String pin, String matricola) {

        ResultSet rs = DBMSBoundary.getQuery("SELECT COUNT(*) FROM impiegato WHERE nome = '" + nome + "' AND cognome = '" + cognome + "' AND matricola = '" + matricola
                + "' AND pin = '" + pin + "'");
        try {
            rs.next();
            if (rs.getInt(1) == 0) {
                MostraErrore("Credenziali errate");
            } else {
                String psw = generatePlainPassword(12);
                String hash = hashPassword(psw);
                rs = DBMSBoundary.getQuery("SELECT email FROM impiegato WHERE matricola = '" + matricola + "'");
                rs.next();
                DBMSBoundary.updateQuery("UPDATE impiegato SET psw = '" + hash + "' WHERE matricola = '" + matricola + "'");
                MailSender.sendMail(rs.getString(1), "Recupero password", "Nuova password: " + psw);
                MostraNotifica("Nuova password inviata");

            }
        } catch (SQLException ex) {
            Logger.getLogger(RecuperaPasswordControl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void showLoginForm() {
        recuperaForm.dispose();

    }

    public void MostraErrore(String messaggio) {
        new Errore(messaggio, this);
        recuperaForm.setAlwaysOnTop(false);
        recuperaForm.getNameField().setEditable(false);
        recuperaForm.getSurnameField().setEditable(false);
        recuperaForm.getMatField().setEditable(false);
        recuperaForm.getPinField().setEditable(false);
        Enumeration<AbstractButton> buttons = recuperaForm.getButtonGroup1().getElements();
        while (buttons.hasMoreElements()) {
            buttons.nextElement().setEnabled(false);
        }

    }

    public void MostraNotifica(String messaggio) {
        new Notifica(messaggio, this);
        recuperaForm.getNameField().setEditable(false);
        recuperaForm.getSurnameField().setEditable(false);
        recuperaForm.getMatField().setEditable(false);
        recuperaForm.getPinField().setEditable(false);
        recuperaForm.setAlwaysOnTop(false);

        Enumeration<AbstractButton> buttons = recuperaForm.getButtonGroup1().getElements();
        while (buttons.hasMoreElements()) {
            buttons.nextElement().setEnabled(false);
        }

    }

    public void SubmitError(JFrame finestra) {
        finestra.dispose();
        recuperaForm.setAlwaysOnTop(true);
        recuperaForm.getNameField().setEditable(true);
        recuperaForm.getSurnameField().setEditable(true);
        recuperaForm.getMatField().setEditable(true);
        recuperaForm.getPinField().setEditable(true);
        Enumeration<AbstractButton> buttons = recuperaForm.getButtonGroup1().getElements();
        while (buttons.hasMoreElements()) {
            buttons.nextElement().setEnabled(true);
        }

    }

    public void SubmitNotice(JFrame finestra) {
        finestra.dispose();
        disposeWindow(recuperaForm);
        LF.setAlwaysOnTop(true);
        Enumeration<AbstractButton> buttons = LF.getButtonGroup1().getElements();
        while (buttons.hasMoreElements()) {
            buttons.nextElement().setEnabled(true);
        }

    }

    public void disposeWindow(JFrame finestra) {
        finestra.dispose();
        LF.setAlwaysOnTop(true);
        Enumeration<AbstractButton> buttons = LF.getButtonGroup1().getElements();
        while (buttons.hasMoreElements()) {
            buttons.nextElement().setEnabled(true);
        }

    }

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
}
