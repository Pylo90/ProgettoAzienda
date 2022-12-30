package controller;

import view.Login;

/**
 *
 * @author davide
 */
public class LoginControl {
    Login loginFrame;
    public LoginControl() {
        loginFrame = new Login(this);
        loginFrame.setVisible(true);
    }
    
    /* TODO */
    public void dataSubmit(){
        System.out.println(loginFrame.getEmailField().getText()); //DEBUG
        System.out.println(loginFrame.getMatricolaField().getText()); //DEBUG
        System.out.println(loginFrame.getPasswordField().getPassword()); //DEBUG
    }
    
    /* TODO */
    public void RPButtonPressed() {
        System.out.println("RPButtonPressed()"); //DEBUG
    }
    
    /* Debug main */
    public static void main(String[] args) {
        new LoginControl();
    }
}
