/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.AreaPersonale;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.Year;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import misc.DBMSBoundary;
import misc.Utente;
import view.CalendarioInterattivo;
import view.CalendarioInterattivoMotivazione;
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
    CalendarioInterattivoMotivazione CIM;
    ResultSet rs;
    String funzione;
    
    String firstG=null;
    String secondG=null;
    String firstM=null;
    String secondM=null;

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
        funzione = "RichiestaPermesso";
        CI = new CalendarioInterattivo(this, funzione);
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
        funzione = "RichiestaFerie";
        CI = new CalendarioInterattivo(this, funzione);
        CI.setVisible(true);
        CI.setAlwaysOnTop(true);

    }

    public void ComunicazioneMalattiaButtonPressed(JFrame homepage) {
        if (homepage instanceof HomepageImpiegato) {
            this.HPI = (HomepageImpiegato) homepage;
            this.HPI.setClickable(false);
        }
        if (homepage instanceof HomepageAmministratore) {
            this.HPA = (HomepageAmministratore) homepage;
            this.HPA.setClickable(false);
        }
        funzione = "ComunicazioneMalattia";

        CI = new CalendarioInterattivo(this, funzione);
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

    public void DisposeForm(JFrame form) {
        form.dispose();
        RL.setClickable(true);
        for (int i = 0; i < RL.getRichieste().size(); ++i) {
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
        LI = new ListaImpiegati(this, rs, "ScambiaOrari");
        LI.setVisible(true);
        LI.setAlwaysOnTop(true);
    }

    public void showRichiesta(String nomeMittente, String cognomeMittente, String tipoRichiesta, String dataScadenza, String dati) {
        RL.setAlwaysOnTop(false);
        RL.setClickable(false);
        for (int i = 0; i < RL.getRichieste().size(); ++i) {
            RL.getRichieste().get(i).setClickable(false);
        }
        RF = new RichiestaForm(nomeMittente, cognomeMittente, tipoRichiesta, dataScadenza, dati, this);

    }

    public void selectGiornoPermesso(int g, int m) {
        String giorno = String.format("%02d", g);
        String mese = String.format("%01d", m);
        DBMSBoundary.updateQuery("INSERT INTO RICHIESTA (tipo,dati_richiesta,data_scadenza,mittente_matricola,dest_matricola)"
                + "VALUES('5','" + giorno + " " + mese + "','" + Year.now().getValue() + "-" + mese + "-" + giorno + "','" + Utente.getMatricola() + "','000');");
    }

    public void selectGiornoFerie(int giorno, int mese, String FS) {

        if (FS.equals("F")) {
            firstG = String.format("%02d", giorno);
            firstM = String.format("%02d", mese);
            if (HPI != null) {
                this.HPI.setClickable(false);
            }
            if (HPA != null) {
                this.HPA.setClickable(false);
            }
            funzione = "RichiestaFerieF";
            CI = new CalendarioInterattivo(this, funzione);
            CI.setVisible(true);
            CI.setAlwaysOnTop(true);
        }
        if (FS.equals("RichiestaFerieF")) {
            secondG = String.format("%02d", giorno);
            secondM = String.format("%02d", mese);
            DBMSBoundary.updateQuery("INSERT INTO RICHIESTA (tipo,dati_richiesta,data_scadenza,mittente_matricola,dest_matricola)"
                    + "VALUES('4','" + firstG + " " + firstM +"-"+ secondG + " " + secondM + "','" + Year.now().getValue() + "-" + firstM + "-" + firstG + "','" + Utente.getMatricola() + "','000');");
        }

    }

    public void selectGiornoMalattia(int giorno, int mese) {

    }

}
