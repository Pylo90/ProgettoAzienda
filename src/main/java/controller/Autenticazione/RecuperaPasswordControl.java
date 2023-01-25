package controller.Autenticazione;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
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

    public RecuperaPasswordControl() {
        super();
    }

    public void showRecuperaPassowrd() {
        recuperaForm = new RecuperaPasswordBoundary(this);
        recuperaForm.setVisible(true);
        recuperaForm.setAlwaysOnTop(true);
    }

    public void submitForm() {
        try {
            ResultSet rs = DBMSBoundary.getQuery("SELECT COUNT(*) FROM impiegato WHERE nome = '" + recuperaForm.getNameField() + "' AND cognome = '" + recuperaForm.getSurnameField() + "' AND matricola = '" + recuperaForm.getMatField()
                    + "' AND pin = '" + recuperaForm.getPinField() + "'");
            rs.next();
            if (rs.getInt(1) == 0) {
                MostraErrore("Credenziali errate");
            } else {
                String psw = generatePlainPassword(12);
                String hash = hashPassword(psw);
                rs = DBMSBoundary.getQuery("SELECT email FROM impiegato WHERE matricola = '" + recuperaForm.getMatField() + "'");
                rs.next();
                DBMSBoundary.updateQuery("UPDATE impiegato SET psw = '" + hash + "' WHERE matricola = '" + recuperaForm.getMatField() + "'");
                MailSender.sendMail(rs.getString(1), "Recupero password", "Nuova password: " + psw);
                MostraNotifica("Password modificata correttamente");
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(RecuperaPasswordControl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void showLoginForm() {
        recuperaForm.dispose();
    }

    public void MostraErrore(String messaggio){
        new Errore(messaggio,this);
        LF.setClickable(false);
    }
    public void MostraNotifica(String messaggio){
        new Notifica(messaggio,this);
        LF.setClickable(false);
    }
    
    public void SubmitError(JFrame finestra) {
        finestra.dispose();
        LF.setClickable(true);
    }

    public void SubmitNotice(JFrame finestra) {
        finestra.dispose();
        LF.setClickable(true);
    }

    public void disposeWindow(JFrame finestra) {
        finestra.dispose();
        LF.setClickable(true);
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
