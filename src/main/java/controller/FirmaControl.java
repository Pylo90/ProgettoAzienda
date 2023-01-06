package controller;

import javax.swing.JFrame;
import view.FirmaForm;
import view.HomepageImpiegato;
import view.RitardoBoundary;

public class FirmaControl {

    HomepageImpiegato HPI;

    public void badgeINButtonPressed() {
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
}
