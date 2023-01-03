package controller;

import view.FirmaForm;

public class FirmaControl {
    FirmaForm firmaForm;
    
    public FirmaControl() {}
    

    
    public void badgeINButtonPressed() {
        firmaForm = new FirmaForm();
        firmaForm.setVisible(true);
    }
    public void firmaOUTButtonPressed(){
        firmaForm = new FirmaForm();
        firmaForm.setVisible(true);
    }
}
