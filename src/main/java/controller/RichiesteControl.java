/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import misc.DBMSBoundary;
import misc.Utente;
import view.CalendarioInterattivo;
import view.CongedoForm;
import view.HomepageAmministratore;
import view.HomepageImpiegato;
import view.HomepageDatore;
import view.ListaImpiegati;
import view.RichiestaForm;
import view.RichiestaList;

/**
 *
 * @author dario
 */
public class RichiesteControl {

    HomepageImpiegato HPI;
    HomepageAmministratore HPA;
    HomepageDatore HPD;
    CongedoForm CF;
    RichiestaList RL;
    RichiestaForm RF;
    ListaImpiegati LI;
    CalendarioInterattivo CI;
    ResultSet rs;

    public RichiesteControl() {
    }

    public void RichiestaPermessoButtonPressed(JFrame homepage) {
        if (homepage instanceof HomepageImpiegato) {
            this.HPI = (HomepageImpiegato) homepage;
            this.HPI.setClickable(false);
        }
        if (homepage instanceof HomepageAmministratore) {
            this.HPA = (HomepageAmministratore) homepage;
            this.HPA.setClickable(false);
        }

        CI = new CalendarioInterattivo(this);
        CI.setVisible(true);
        CI.setAlwaysOnTop(true);
    }

    public void RichiestaFerieButtonPressed(JFrame homepage) {
        if (homepage instanceof HomepageImpiegato) {
            this.HPI = (HomepageImpiegato) homepage;
            this.HPI.setClickable(false);
        }
        if (homepage instanceof HomepageAmministratore) {
            this.HPA = (HomepageAmministratore) homepage;
            this.HPA.setClickable(false);
        }
        HPI.setClickable(false);
        CI = new CalendarioInterattivo(this);
        CI.setVisible(true);
        CI.setAlwaysOnTop(true);
    }

    public void RichiestaCongedoParentaleButtonPressed(JFrame homepage) {
        if (homepage instanceof HomepageImpiegato) {
            this.HPI = (HomepageImpiegato) homepage;
            this.HPI.setClickable(false);
        }
        if (homepage instanceof HomepageAmministratore) {
            this.HPA = (HomepageAmministratore) homepage;
            this.HPA.setClickable(false);
        }
        CF = new CongedoForm(this);
        CF.setVisible(true);
        CF.setAlwaysOnTop(true);
    }

    public void sendSelection(int mesi) {
        ResultSet idSet;
        int id = 1;
        idSet = DBMSBoundary.getQuery("select max(id) from richiesta;");
        try {
            if (idSet.next()) {
                id = idSet.getInt(1) + 1;
            } else {
                id = 1;
            }
        } catch (SQLException ex) {
            Logger.getLogger(RichiesteControl.class.getName()).log(Level.SEVERE, null, ex);
        }
        DBMSBoundary.updateQuery("insert into richiesta values(" + id + "," + 1 + ",'culo','400005','200006');");
    }

    public void ConsultazioneListaRichiesteButtonPressed(JFrame homepage) {
        Utente.setMatricola("000");
        if (homepage instanceof HomepageImpiegato) {
            this.HPI = (HomepageImpiegato) homepage;
            this.HPI.setClickable(false);
        }
        if (homepage instanceof HomepageAmministratore) {
            this.HPA = (HomepageAmministratore) homepage;
            this.HPA.setClickable(false);
        }
        if (homepage instanceof HomepageDatore) {
            this.HPD = (HomepageDatore) homepage;
            this.HPD.setClickable(false);
        }
        ResultSet rs = DBMSBoundary.getQuery("select * "
                + "from richiesta R, impiegato MITT "
                + "where R.dest_matricola = " + Utente.getMatricola() + " AND R.mittente_matricola = MITT.matricola;");

        RL = new RichiestaList(this, rs);
        RL.setVisible(true);
        RL.setAlwaysOnTop(true);

    }

    public void MostraRichiesteButtonPressed(HomepageImpiegato HPI) {
        if (!HPI.getjLabel4().isVisible()) {
            HPI.getjLabel4().setVisible(true);
            HPI.getPermesso().setVisible(true);
            HPI.getFerie().setVisible(true);
            HPI.getCongedoParentale().setVisible(true);
        } else {
            HPI.getjLabel4().setVisible(false);
            HPI.getPermesso().setVisible(false);
            HPI.getFerie().setVisible(false);
            HPI.getCongedoParentale().setVisible(false);
        }
    }

    public void RichiesteButtonPressed(HomepageAmministratore HPA) {
        if (!HPA.getjLabel3().isVisible()) {
            HPA.getjLabel3().setVisible(true);
            HPA.getPermesso().setVisible(true);
            HPA.getFerie().setVisible(true);
            HPA.getCongedoParentale().setVisible(true);
        } else {
            HPA.getjLabel3().setVisible(false);
            HPA.getPermesso().setVisible(false);
            HPA.getFerie().setVisible(false);
            HPA.getCongedoParentale().setVisible(false);
        }
    }

    public void DisposeWindow(JFrame finestra) {
        finestra.dispose();
        if (HPI != null) {
            HPI.setClickable(true);
        }
        if (HPA != null) {
            HPA.setClickable(true);
        }
        if (HPD != null) {
            HPD.setClickable(true);
        }

    }
    public void DisposeForm(JFrame form){
        form.dispose();        
        RL.setClickable(true);
        for (int i = 0; i<RL.getRichieste().size()  ; ++i) {
            RL.getRichieste().get(i).setClickable(true);
        }
    }

    public void ScambiaOrariButtonPressed(JFrame homepage) {
        if (homepage instanceof HomepageAmministratore) {
            this.HPA = (HomepageAmministratore) homepage;
            this.HPA.setClickable(false);
        }
        if (homepage instanceof HomepageDatore) {
            this.HPD = (HomepageDatore) homepage;
            this.HPD.setClickable(false);
        }
        ResultSet rs = DBMSBoundary.getQuery("select nome , cognome , propic , livello from impiegato;");
        LI = new ListaImpiegati(this, rs,"ScambiaOrari");
        LI.setVisible(true);
        LI.setAlwaysOnTop(true);
    }

    public void showRichiesta(String nomeMittente, String cognomeMittente, String tipoRichiesta, String dataScadenza, String dati) {
        RL.setAlwaysOnTop(false);
        RL.setClickable(false);
        for (int i = 0; i<RL.getRichieste().size()  ; ++i) {
            RL.getRichieste().get(i).setClickable(false);
        }
        RF = new RichiestaForm(nomeMittente, cognomeMittente, tipoRichiesta, dataScadenza, dati,this);

    }

}
