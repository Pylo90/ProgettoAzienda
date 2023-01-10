package controller;

import javax.swing.JFrame;
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
        char[] psw = loginFrame.getPasswordField().getPassword();
        System.out.println(loginFrame.getEmailField().getText()); //DEBUG
        System.out.println(loginFrame.getMatricolaField().getText()); //DEBUG
        System.out.println(loginFrame.getPasswordField().getPassword()); //DEBUG
        //implementazione Hashing password
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
}
