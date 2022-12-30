package controller;

import view.Login;
import view.HomePageAmministratore;

/**
 *
 * @author davide
 */
public class LoginControl {
    Login loginFrame;
    HomePageAmministratore adminPage;
    
    public LoginControl() {
        
    }
    
    /* TODO */
    public void dataSubmit(){
        System.out.println(loginFrame.getEmailField().getText()); //DEBUG
        System.out.println(loginFrame.getMatricolaField().getText()); //DEBUG
        System.out.println(loginFrame.getPasswordField().getPassword()); //DEBUG
    }
    
    /* TODO */
    public void RPButtonPressed() {
        new RecuperaPasswordControl().showRecuperaPassowrd();
        loginFrame.dispose();
    }
    
    /* Debug main */
    public static void main(String[] args) {
        new LoginControl();
    }
    
    public void createLogin() {
        loginFrame = new Login(this);
        loginFrame.setVisible(true);
    }
    
    public void createAdminPage() {
        adminPage = new HomePageAmministratore(this);
        adminPage.setVisible(true);
    }
}
