package controller.AreaPersonale;

import java.sql.ResultSet;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.JFrame;
import model.DBMSBoundary;
import view.HomepageDatore;
import view.ListaImpiegati;
import model.Utente;
import view.CalendarioInterattivo;
import view.CalendarioOreInterattivo;
import view.HomepageAmministratore;

public class StraordinariControl {

    HomepageDatore HPD;
    HomepageAmministratore HPA;
    ListaImpiegati LI;
    Utente UT;
    CalendarioInterattivo CI;
    CalendarioOreInterattivo COI;

    public StraordinariControl() {
    }

    public void AffidaStraordinariButtonPressed(JFrame homepage) {
        if (homepage instanceof HomepageDatore) {
            this.HPD = (HomepageDatore) homepage;
            Enumeration<AbstractButton> buttons = HPD.getButtonGroup1().getElements();
                while (buttons.hasMoreElements()) {
                    buttons.nextElement().setEnabled(false);
                }
        }
        if (homepage instanceof HomepageAmministratore) {
            this.HPA = (HomepageAmministratore) homepage;
            Enumeration<AbstractButton> buttons = HPA.getButtonGroup1().getElements();
                while (buttons.hasMoreElements()) {
                    buttons.nextElement().setEnabled(false);
                }
        }
        ResultSet rs = DBMSBoundary.getQuery("select nome , cognome , propic , livello from impiegato where matricola != '000000';");
        JFrame ListaImpiegati = new ListaImpiegati(this, rs, "AffidaStraordinari");
        
        ListaImpiegati.setVisible(true);
        ListaImpiegati.setAlwaysOnTop(true);
    }

    public void endingHourSelected(Utente UT, int giorno, int inizioStraordinario, int fineStraordinario) {
        // manda inizio e fine straordinario nel dbms
    }

    public void DisposeWindow(JFrame finestra) {
        finestra.dispose();
        if (HPA != null) {
            Enumeration<AbstractButton> buttons = HPA.getButtonGroup1().getElements();
            while (buttons.hasMoreElements()) {
                buttons.nextElement().setEnabled(true);
            }
        }
        if (HPD != null) {
            Enumeration<AbstractButton> buttons = HPD.getButtonGroup1().getElements();
                while (buttons.hasMoreElements()) {
                    buttons.nextElement().setEnabled(true);
                }
        }

    }
}
