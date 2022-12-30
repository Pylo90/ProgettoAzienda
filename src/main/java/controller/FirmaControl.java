package controller;

import view.FirmaForm;

public class FirmaControl {
    FirmaForm firmaForm;
    
    public FirmaControl() {}
    
    public void showFirmaForm() {
        firmaForm = new FirmaForm(this);
        firmaForm.setVisible(true);
    }
    
    public void submitBadgeIn() {
        //TODO
    }
}
