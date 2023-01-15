package controller;

import javax.swing.JFrame;
import view.FirmaForm;
import view.HomepageImpiegato;
import view.RitardoBoundary;

public class FirmaControl {

    HomepageImpiegato HPI;
    FirmaForm FF;
    RitardoBoundary RB;

    public FirmaControl() {;
    }

    public void firmaINButtonPressed() {
        JFrame firmaForm = new FirmaForm(this);
        firmaForm.setVisible(true);
        firmaForm.setAlwaysOnTop(true);

    }

    public void firmaOUTButtonPressed() {
        JFrame firmaForm = new FirmaForm(this);
        firmaForm.setVisible(true);
        firmaForm.setAlwaysOnTop(true);

    }
    
    public void firmaRitardoButtonPressed (HomepageImpiegato HPI){
        this.HPI = HPI;
        HPI.setClickable(false);
        JFrame RitardoBoundary = new RitardoBoundary(this);
        RitardoBoundary.setVisible(true);
        RitardoBoundary.setAlwaysOnTop(true);
    }

    public void DisposeWindow(JFrame finestra) {
        finestra.dispose();
        HPI.setClickable(true);
    }
    
    public void SubmitError(JFrame finestra) {
        finestra.dispose();
        FF.setClickable(true);
        RB.setClickable(true);
    }
    
    public void SubmitNotice(JFrame finestra) {
        finestra.dispose();
        FF.setClickable(true);
        RB.setClickable(true);
    }
}
