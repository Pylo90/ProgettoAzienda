package controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import misc.DBMSBoundary;
import org.springframework.security.crypto.bcrypt.BCrypt;
import view.HomepageAmministratore;
import view.LoginForm;

/**
 *
 * @author davide
 */
public class LoginControl {
    LoginForm loginFrame;
    HomepageAmministratore adminPage;
    
    public LoginControl() {
        super();
    }
    
    /* TODO */
    public void dataSubmit(){
        String email = loginFrame.getEmailField().getText();
        String mat = loginFrame.getMatricolaField().getText();
        String psw = String.valueOf(loginFrame.getPasswordField().getPassword());
        boolean check = false;
        
        ResultSet imp = DBMSBoundary.getQuery("SELECT COUNT(matricola), psw FROM Impiegato WHERE matricola = " + mat + " AND email = " + email);
        
        try {
            imp.next();
            if(imp.getInt(1) == 0) {
                wrongData();
                return;
            }
            
            String hash = imp.getString("psw");
            
            if(!BCrypt.checkpw(psw, hash)) {
                wrongData();
                return;
            }
            correctData();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        System.out.println(loginFrame.getEmailField().getText()); //DEBUG
        System.out.println(loginFrame.getMatricolaField().getText()); //DEBUG
        System.out.println(loginFrame.getPasswordField().getPassword()); //DEBUG
        //implementazione Hashing password
    }
    
    /*******IMPLEMENTARE AZIONE IN CASO DI CREDENZIALI CORRETTE*******/
    private void correctData() {
        System.out.println("CORRECT"); //DEBUG
    }
    
    /*******IMPLEMENTARE AZIONE IN CASO DI CREDENZIALI ERRATE*******/
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
        loginFrame = new LoginForm(this);
        loginFrame.setVisible(true);
    }
    
    public void createAdminPage() {
        adminPage = new HomepageAmministratore(this);
        adminPage.setVisible(true);
    }
    
    public void SubmitError(JFrame finestra) {
        finestra.dispose();
        loginFrame.setClickable(true);
    }
    
    public void SubmitNotice(JFrame finestra) {
        finestra.dispose();
        loginFrame.setClickable(true);
    }
}
