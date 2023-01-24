/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.AreaPersonale;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.Year;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import model.DBMSBoundary;
import model.Utente;
import view.CalendarioInterattivo;
import view.CalendarioInterattivoMotivazione;
import view.CongedoForm;
import view.Errore;
import view.HomepageAmministratore;
import view.HomepageImpiegato;
import view.HomepageDatore;
import view.ListaImpiegati;
import view.RichiestaForm;
import view.RichiestaList;
import view.ScioperoForm;

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
    ScioperoForm SF;

    String firstG = null;
    String secondG = null;
    String firstM = null;
    String secondM = null;
    String id_1 = null;
    String id_2 = null;

    String giorno1;
    String giorno2;
    String mese1;
    String mese2;

    String matScambio1 = null;
    String matScambio2 = null;
    ResultSet orarioScambio1 = null;
    ResultSet orarioScambio2 = null;

    public RichiesteControl() {
    }

    public void accettaRichiesta(String idRichiesta) {
        ResultSet richiesta = DBMSBoundary.getQuery("select * from richiesta where id = '" + idRichiesta + "';");
        try {
            if (richiesta.next()) {
                System.out.println("prova");
                int tipo = richiesta.getInt("tipo");
                String dati = richiesta.getString("dati_richiesta");
                String matDest = richiesta.getString("destinatario");
                switch (tipo) {

                    case 3:
                        //caso sciopero
                        ResultSet turnoId = DBMSBoundary.getQuery("select id from assegnazine_turno AT, turno T, where AT.turno = T.id and AT.impiegato = '" + matDest + "' AND T.data_ ='" + Year.now().getValue() + "-" + dati.substring(3, 4) + "-" + dati.substring(0, 1) + "';");
                        if (turnoId.next()) {
                            DBMSBoundary.updateQuery("delete from assegnazione_turno where turno = '" + turnoId.getString("id") + "';");

                        }
                        DBMSBoundary.updateQuery("delete from richiesta where id ='" + idRichiesta + "';");
                        break;
                    case 4:
                        //caso ferie
                        ResultSet turniSet = DBMSBoundary.getQuery("select id from assegnazine_turno AT, turno T, where AT.turno = T.id and AT.impiegato = '" + matDest + "' AND T.data_ >='" + Year.now().getValue() + "-" + dati.substring(3, 4) + "-" + dati.substring(0, 1) + "'AND T.data_ <='" + Year.now().getValue() + "-" + dati.substring(9, 10) + "-" + dati.substring(6, 7) + "';");
                        while (turniSet.next()) {
                            DBMSBoundary.updateQuery("delete from assegnazione_turno where turno = '" + turniSet.getString("id") + "';");
                        }
                        DBMSBoundary.updateQuery("delete from richiesta where id ='" + idRichiesta + "';");
                        break;
                    case 5:
                        //caso permesso
                        ResultSet idTurno = DBMSBoundary.getQuery("select id from assegnazine_turno AT, turno T, where AT.turno = T.id and AT.impiegato = '" + matDest + "' AND T.data_ ='" + Year.now().getValue() + "-" + dati.substring(3, 4) + "-" + dati.substring(0, 1) + "';");
                        if (idTurno.next()) {
                            DBMSBoundary.updateQuery("delete from assegnazione_turno where turno = '" + idTurno.getString("id") + "';");
                            DBMSBoundary.updateQuery("delete from richiesta where id ='" + idRichiesta + "';");
                        }
                        break;
                    case 6:
                        //caso scambio turni
                        ResultSet ID1 = DBMSBoundary.getQuery("select * from richiesta where id ='" + idRichiesta + "';");
                        ID1.next();
                        ResultSet ID2 = DBMSBoundary.getQuery("select * from richiesta where data_scadenza ='" + ID1.getString("data_scadenza") + "' AND destinatario ='" + ID1.getString("dati_richiesta").substring(0, 6) + "' AND tipo =" + ID1.getInt("tipo") + " AND mittente ='" + ID1.getString("mittente") + "';");

                        if (ID2.next()) {
                            if ("S".equals(ID2.getString("dati_richiesta").substring(ID2.getString("dati_richiesta").length() - 1))) {
                                //esegui scambio
                                String matF = ID1.getString("destinatario");
                                String matS = ID2.getString("destinatario");
                                String id1 = ID2.getString("dati_richiesta").substring(7, 8);
                                String id2 = ID1.getString("dati_richiesta").substring(7, 8);
                                DBMSBoundary.updateQuery("update assegnazione_turno set impiegato ='" + matS + "' where turno ='" + id1 + "';");
                                DBMSBoundary.updateQuery("update assegnazione_turno set impiegato ='" + matF + "' where turno ='" + id2 + "';");
                                DBMSBoundary.updateQuery("delete from richiesta where id =" + ID1.getInt("id") + ";");
                                DBMSBoundary.updateQuery("delete from richiesta where id =" + ID2.getInt("id") + ";");
                            } else {
                                // cambia i dati_richiesta di ID1 affinchè ci sia S alla fine dei dati
                                DBMSBoundary.updateQuery("update richiesta "
                                        + "SET dati_richiesta = '" + ID1.getString("dati_richiesta") + " S' where id ='" + idRichiesta + "';");
                            }
                        } else {
                            MostraErrore("La persona con cui è stato proposto lo scambio ha rifiutato la richiesta");
                            DBMSBoundary.updateQuery("delete from richiesta where id ='" + idRichiesta + "';");
                        }

                        break;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(RichiesteControl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void rifiutaRichiesta(String idRichiesta) {
        DBMSBoundary.updateQuery("delete from richiesta where id ='" + idRichiesta + "';");
    }

    public void MostraErrore(String messaggio){
        if(CF != null){
            CF.setClickable(false);
        }
        if(CI != null){
            CI.setClickable(false);
        }
        if(CIM != null){
            CIM.setClickable(false);
        }
        if(LI != null){
            LI.setClickable(false);
        }
        if(RF != null){
            RF.setClickable(false);
        }
        if(RL != null){
            RL.setClickable(false);
        }
        if(SF != null){
            SF.setClickable(false);
        }
        
        new Errore(messaggio,this);
    }
    
    public void SubmitError(JFrame finestra) {
        if(CF != null){
            CF.setClickable(true);
        }
        if(CI != null){
            CI.setClickable(true);
        }
        if(CIM != null){
            CIM.setClickable(true);
        }
        if(LI != null){
            LI.setClickable(true);
        }
        if(RF != null){
            RF.setClickable(true);
        }
        if(RL != null){
            RL.setClickable(true);
        }
        if(SF != null){
            SF.setClickable(true);
        }
        finestra.dispose();
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

    }

    public void ComunicazioneScioperoButtonPressed(HomepageAmministratore HPA) {

        this.HPA = HPA;
        this.HPA.setClickable(false);

        funzione = "ComunicazioneSciopero";
        SF = new ScioperoForm(this);

    }

    public void sendSelection(int mesi) {
        //congedo parentale
        String giorno1 = String.format("%02d", Calendar.getInstance().get(Calendar.DAY_OF_MONTH));
        String mese1 = String.format("%02d", Calendar.getInstance().get(Calendar.MONTH));

        String giorno2 = String.format("%02d", Calendar.getInstance().get(Calendar.DAY_OF_MONTH));
        String mese2 = String.format("%02d", Calendar.getInstance().get(Calendar.MONTH) + mesi);

        ResultSet rs = DBMSBoundary.getQuery("SELECT data_, matricola,T.id from turno T, assegnazione_turno AT where "
                + "AT.impiegato = '" + Utente.getMatricola() + "' AND T.data_ >= ' " + Year.now().getValue() + "-" + mese1 + "-" + giorno1 + "'AND T.data_ <= ' " + Year.now().getValue() + "-" + mese2 + "-" + giorno2 + "';");
        try {
            if (rs.next()) {
                rs.first();
                String primaData = rs.getString("data_");
                rs.last();
                String ultimaData = rs.getString("data_");

                DBMSBoundary.updateQuery("INSERT INTO assenza values ("
                        + "'" + primaData + "','" + ultimaData + "','malattia','" + Utente.getMatricola() + "');");
                rs.beforeFirst();
                while (rs.next()) {
                    String idTurno = rs.getString("id");
                    DBMSBoundary.updateQuery("delete from assegnazione_turno AT where AT.turno = '" + idTurno + "' AND AT.impiegato = '" + Utente.getMatricola() + "';");
                    
                }

            } else {
                MostraErrore("Non sono stati trovati turni lavorativi nell'intervallo selezionato");
            }
        } catch (SQLException ex) {
            Logger.getLogger(RichiesteControl.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        ResultSet rs = DBMSBoundary.getQuery("select matricola, nome , cognome , propic , livello from impiegato where matricola != '0';");
        LI = new ListaImpiegati(this, rs, "ScambiaOrari");

    }

    public void showRichiesta(String nomeMittente, String cognomeMittente, String tipoRichiesta, String dataScadenza, String dati, String idRichiesta, String motivazione) {
        RL.setAlwaysOnTop(false);
        RL.setClickable(false);
        for (int i = 0; i < RL.getRichieste().size(); ++i) {
            RL.getRichieste().get(i).setClickable(false);
        }
        RF = new RichiestaForm(nomeMittente, cognomeMittente, tipoRichiesta, dataScadenza, dati, this, idRichiesta, motivazione);

    }

    public void selectGiornoPermesso(int g, int m) {
        String giorno = String.format("%02d", g);
        String mese = String.format("%02d", m);
        ResultSet check = DBMSBoundary.getQuery("select * from turno T, assegnazione_turno AT where "
                + "T.id = AT.turno AND T.data_ = '" + Year.now().getValue() + "-" + mese + "-" + giorno + "' AND AT.impiegato ='" + Utente.getMatricola() + "';");
        try {
            if (check.next()) {
                DBMSBoundary.updateQuery("INSERT INTO RICHIESTA (tipo,dati_richiesta,data_scadenza,mittente,destinatario)"
                        + "VALUES('5','" + giorno + " " + mese + "','" + Year.now().getValue() + "-" + mese + "-" + giorno + "','" + Utente.getMatricola() + "','0');");
            } else {
                MostraErrore("Non sono previsti turni lavorativi per la giornata selezionata");
            }
        } catch (SQLException ex) {
            Logger.getLogger(RichiesteControl.class.getName()).log(Level.SEVERE, null, ex);
        }
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
            ResultSet check = DBMSBoundary.getQuery("SELECT data_, impiegato,T.id from turno T, assegnazione_turno AT where "
                    + "AT.impiegato = '" + Utente.getMatricola() + "' AND T.data_ >= ' " + Year.now().getValue() + "-" + firstM + "-" + firstG + "'AND T.data_ <= ' " + Year.now().getValue() + "-" + secondM + "-" + secondG + "';");
            try {
                if (check.next()) {
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
                } else {
                    MostraErrore("Non sono presenti turni lavorativi nell'intervallo selezionato");
                }
            } catch (SQLException ex) {
                Logger.getLogger(RichiesteControl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public void selectGiornoMalattia(int g, int m, String motivazione, String FS) {
        if ("normale".equals(FS)) {
            String giorno1 = String.format("%02d", g);
            String mese1 = String.format("%02d", m);
            funzione = "fine";

            CI = new CalendarioInterattivo(this, funzione);
            CI.setVisible(true);
            CI.setAlwaysOnTop(true);
        }
        if ("fine".equals(FS)) {
            String giorno2 = String.format("%02d", g);
            String mese2 = String.format("%02d", m);

            ResultSet rs = DBMSBoundary.getQuery("SELECT data_, matricola,T.id from turno T, assegnazione_turno AT where "
                    + "AT.impiegato = '" + Utente.getMatricola() + "' AND T.data_ >= ' " + Year.now().getValue() + "-" + mese1 + "-" + giorno1 + "'AND T.data_ <= ' " + Year.now().getValue() + "-" + mese2 + "-" + giorno2 + "';");
            try {
                if (rs.next()) {
                    rs.first();
                    String primaData = rs.getString("data_");
                    rs.last();
                    String ultimaData = rs.getString("data_");

                    DBMSBoundary.updateQuery("INSERT INTO assenza values ("
                            + "'" + primaData + "','" + ultimaData + "','malattia','" + Utente.getMatricola() + "');");
                    rs.beforeFirst();
                    while (rs.next()) {
                        String idTurno = rs.getString("id");
                        DBMSBoundary.updateQuery("delete from assegnazione_turno AT where AT.turno = '" + idTurno + "' AND AT.impiegato = '" + Utente.getMatricola() + "';");
                    }

                } else {
                    MostraErrore("Non sono presenti turni lavorativi nell'intervallo selezionato");

                }
            } catch (SQLException ex) {
                Logger.getLogger(RichiesteControl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void selectGiornoSciopero(int g, int m, String motivazione, int livello) {
        String giorno = String.format("%02d", g);
        String mese = String.format("%02d", m);
        ResultSet rs = DBMSBoundary.getQuery("SELECT impiegato from turno T, assegnazione_turno AT, impiegato I WHERE AT.turno = T.id AND T.data_ = '" + Year.now().getValue() + "-" + mese + "-" + giorno + "' AND AT.impiegato = I.matricola AND I.livello =" + livello + ";");
        System.out.println(giorno);
        System.out.println(mese);
        System.out.println(motivazione);
        System.out.println(livello);
        try {
            while (rs.next()) {

                DBMSBoundary.updateQuery("INSERT INTO RICHIESTA (testo,tipo,dati_richiesta,data_scadenza,mittente,destinatario) "
                        + "VALUES (" + motivazione + "','3','" + giorno + " " + mese + "','" + Year.now().getValue() + "-" + mese + "-" + giorno + "','" + Utente.getMatricola() + "','" + rs.getString("impiegato") + "');");
            }
        } catch (SQLException ex) {
            Logger.getLogger(RichiesteControl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void selectWorker(String matricola, String iterata) {
        switch (iterata) {
            case "1":
                matScambio1 = matricola;
                CI = new CalendarioInterattivo(this, "ScambiaOrari");

                break;
            case "2":
                matScambio2 = matricola;
                CI = new CalendarioInterattivo(this, "ScambiaOrari2");

                break;
        }

    }

    public void selectGiornoScambio(int g, int m, String iterata) {
        String giorno = String.format("%02d", g);
        String mese = String.format("%02d", m);
        switch (iterata) {
            case "1":

                orarioScambio1 = DBMSBoundary.getQuery(
                        "SELECT impiegato, T.data_, T.id "
                        + "FROM assegnazione_turno AT, turno T, impiegato I "
                        + "WHERE AT.impiegato ='" + matScambio1 + "'AND AT.turno = T.id AND T.data_ = '" + Year.now().getValue() + "-" + mese + "-" + giorno + "';");
                try {
                    if (orarioScambio1.next()) {
                        DisposeWindow(this.LI);
                        ResultSet rs = DBMSBoundary.getQuery("select matricola, nome , cognome , propic , livello from impiegato where matricola != '0' AND matricola != '" + matScambio1 + "';");
                        LI = new ListaImpiegati(this, rs, "ScambiaOrari2");

                    } else {
                        MostraErrore("Impossibile torvare un turno lavorativo nel giorno selezionato");
                    }
                } catch (SQLException sQLException) {
                }

                break;
            case "2":
                orarioScambio2 = DBMSBoundary.getQuery(
                        "SELECT impiegato, T.data_, T.id "
                        + "FROM assegnazione_turno AT, turno T, impiegato I "
                        + "WHERE AT.impiegato ='" + matScambio2 + "'AND AT.turno = T.id AND T.data_ = '" + Year.now().getValue() + "-" + mese + "-" + giorno + "';");
                try {
                    if (orarioScambio2.next()) {
                        Date d1 = orarioScambio1.getDate("data_");
                        Date d2 = orarioScambio2.getDate("data_");
                        Date datadefinitiva = null;
                        if (d1.after(d2)) {
                            datadefinitiva = d2;
                        } else {
                            datadefinitiva = d1;
                        }

                        DBMSBoundary.updateQuery("INSERT INTO RICHIESTA (tipo,dati_richiesta,data_scadenza,mittente,destinatario) "
                                + "VALUES ('6','" + orarioScambio2.getString("impiegato") + " " + orarioScambio2.getString("id") + " " + orarioScambio2.getString("data_") + "','" + datadefinitiva.toString() + "','" + Utente.getMatricola() + "','" + matScambio1 + "');");
                        DBMSBoundary.updateQuery("INSERT INTO RICHIESTA (tipo,dati_richiesta,data_scadenza,mittente,destinatario)"
                                + "VALUES ('6','" + orarioScambio1.getString("impiegato") + " " + orarioScambio1.getString("id") + " " + orarioScambio1.getString("data_") + "','" + datadefinitiva.toString() + "','" + Utente.getMatricola() + "','" + matScambio2 + "');");

                        DisposeWindow(this.LI);

                    } else {
                        MostraErrore("Impossibile torvare un turno lavorativo nel giorno selezionato");
                    }
                } catch (SQLException sQLException) {
                }
                break;
        }
    }

}
