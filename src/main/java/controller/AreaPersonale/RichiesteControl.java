/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.AreaPersonale;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import model.DBMSBoundary;
import model.Utente;
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

    String firstG = null;
    String secondG = null;
    String firstM = null;
    String secondM = null;
    String id_1 = null;
    String id_2 = null;

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

    public void ComunicazioneScioperoButtonPressed(HomepageAmministratore HPA) {

        this.HPA = HPA;
        this.HPA.setClickable(false);

        funzione = "ComunicazioneSciopero";
        CIM = new CalendarioInterattivoMotivazione(this, funzione);
        CIM.setVisible(true);
        CIM.setAlwaysOnTop(true);
    }

    public void sendSelection(int mesi) {
        
        DBMSBoundary.updateQuery("INSERT INTO RICHIESTA (tipo,dati_richiesta,data_scadenza,mittente,destinatario) "
                + "VALUES('1','"
                + mesi + "','"
                + String.valueOf(Calendar.getInstance().get(Calendar.YEAR))
                + "-" + String.format("%02d",Calendar.getInstance().get(Calendar.MONTH)+1)
                + "-" + String.format("%02d",Calendar.getInstance().get(Calendar.DAY_OF_MONTH))
                + "','"
                + Utente.getMatricola()
                + "','0');");
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
                + "where R.destinatario = " + Utente.getMatricola() + " AND R.mittente = MITT.matricola;");

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

            HPI.getComunicazioneMalattia().setVisible(true);
        } else {
            HPI.getjLabel4().setVisible(false);
            HPI.getPermesso().setVisible(false);
            HPI.getFerie().setVisible(false);
            HPI.getCongedoParentale().setVisible(false);
            HPI.getComunicazioneMalattia().setVisible(false);

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
        String mese = String.format("%02d", m);
        DBMSBoundary.updateQuery("INSERT INTO RICHIESTA (tipo,dati_richiesta,data_scadenza,mittente,destinatario)"
                + "VALUES('5','" + giorno + " " + mese + "','" + Year.now().getValue() + "-" + mese + "-" + giorno + "','" + Utente.getMatricola() + "','0');");
    }

    public void selectGiornoFerie(int giorno, int mese, String FS, String motivazione) {

        if (FS.equals("F")) {
            firstG = String.format("%02d", giorno);
            firstM = String.format("%02d", mese);
            if (HPI != null) {
                this.HPI.setClickable(false);
            }
            if (HPA != null) {
                this.HPA.setClickable(false);
            }
            funzione = "RichiestaFerie";
            CIM = new CalendarioInterattivoMotivazione(this, funzione);
            CIM.setVisible(true);
            CIM.setAlwaysOnTop(true);
        }
        if (FS.equals("RichiestaFerie")) {
            secondG = String.format("%02d", giorno);
            secondM = String.format("%02d", mese);
            DBMSBoundary.updateQuery("INSERT INTO RICHIESTA (tipo,dati_richiesta,data_scadenza,mittente,destinatario,testo) "
                    + "VALUES('4','"
                    + firstG + " "
                    + firstM + "-"
                    + secondG + " "
                    + secondM + "','"
                    + Year.now().getValue()
                    + "-" + firstM
                    + "-" + firstG
                    + "','"
                    + Utente.getMatricola()
                    + "','0','" + motivazione
                    + "');");
        }

    }

    public void selectGiornoMalattia(int g, int m, String motivazione) {
        String giorno = String.format("%02d", g);
        String mese = String.format("%01d", m);
        ResultSet rs = DBMSBoundary.getQuery("SELECT _data, IMPIEGATO_matricola from turno where "
                + "impiegato = '" + Utente.getMatricola() + "' AND _data = ' " + Year.now().getValue() + "-" + mese + "-" + giorno + "';");
        try {
            if (rs.next()) {
                DBMSBoundary.updateQuery("INSERT INTO assenza values ("
                        + "'" + Year.now().getValue() + "-" + mese + "-" + giorno + "-" + motivazione + "'," + "'" + Year.now().getValue() + "-" + mese + "-" + giorno + "','malattia',null,'" + Utente.getMatricola() + "');");
            } else {
                System.out.println("non c'è un turno per il giorno slezionato");
            }
        } catch (SQLException ex) {
            Logger.getLogger(RichiesteControl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void selectGiornoSciopero(int g, int m, String motivazione) {
        String giorno = String.format("%02d", g);
        String mese = String.format("%01d", m);
        ResultSet rs = DBMSBoundary.getQuery("SELECT impiegato from turno T, assegnazione_turno AT WHERE AT.turno = T.id AND T._data = '" + Year.now().getValue() + "-" + mese + "-" + giorno + "';");
        try {
            while (rs.next()) {
                DBMSBoundary.updateQuery("INSERT INTO RICHIESTA (tipo,dati_richiesta,data_scadenza,mittente,destinatario)"
                        + "VALUES ('3','" + giorno + " " + mese + "-" + motivazione + "','" + Year.now().getValue() + "-" + mese + "-" + giorno + "','" + Utente.getMatricola() + "','" + rs.getString("impiegato") + "';");
            }
        } catch (SQLException ex) {
            Logger.getLogger(RichiesteControl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
