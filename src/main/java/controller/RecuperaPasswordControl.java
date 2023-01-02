package controller;

import view.RecuperaPassword;

public class RecuperaPasswordControl {
    
    RecuperaPassword recuperaForm;
    
    public RecuperaPasswordControl() {
        
    }
    
    public void showRecuperaPassowrd() {
        recuperaForm = new RecuperaPassword(this);
        recuperaForm.setVisible(true);
    }
    
    public void submitForm() {
        //TODO
    }
    
    public void showLoginForm() {
        new LoginControl().createLogin();
        recuperaForm.dispose();
    }
}
