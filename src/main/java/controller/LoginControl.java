package controller;

import view.Login;

/**
 *
 * @author dario
 */
public class LoginControl {
    Login loginFrame;
    public LoginControl() {
        loginFrame = new Login(this);
        loginFrame.setVisible(true);
    }
    
    public void dataSubmit(){
        System.out.println("dataSubmit()"); //TODO
    }
    
    public void RPButtonPressed() {
        System.out.println("RPButtonPressed()"); //TODO
    }
    
    /* Debug main */
    public static void main(String[] args) {
        new LoginControl();
    }
}
