package controller;

import view.HomePageAmministratore;
import view.LoginForm;

/**
 *
 * @author davide
 */
public class LoginControl {
    LoginForm loginFrame;
    HomePageAmministratore adminPage;
    
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
        adminPage = new HomePageAmministratore(this);
        adminPage.setVisible(true);
    }
}
