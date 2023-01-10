package controller;

import javax.swing.JFrame;
import view.LoginForm;
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
        //TODO
    }
    
    public void showLoginForm() {
        recuperaForm.dispose();
    }
    
    public void SubmitError(JFrame finestra) {
        finestra.dispose();
        LF.setClickable(true);
    }
}
