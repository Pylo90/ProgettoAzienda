package controller;

import view.RecuperaPasswordBoundary;

public class RecuperaPasswordControl {
    
    RecuperaPasswordBoundary recuperaForm;
    
    public RecuperaPasswordControl() {
        
    }
    
    public void showRecuperaPassowrd() {
        recuperaForm = new RecuperaPasswordBoundary(this);
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
