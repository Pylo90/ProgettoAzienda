package controller;

import view.RecuperaPasswordBoundary;

public class RecuperaPasswordControl {
    
    RecuperaPasswordBoundary recuperaForm;
    
    public RecuperaPasswordControl() {
        super();
    }
    
    public void showRecuperaPassowrd() {
        recuperaForm = new RecuperaPasswordBoundary(this);
        recuperaForm.setVisible(true);
        recuperaForm.setAlwaysOnTop(true);
    }
    
    public void submitForm() {
        //TODO
    }
    
    public void showLoginForm() {
        recuperaForm.dispose();
    }
}
