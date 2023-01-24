/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.AreaPersonale;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import model.DBMSBoundary;
import model.Utente;
import view.Errore;
import view.HomepageAmministratore;
import view.HomepageImpiegato;
import view.OrarioImpiegato;
import view.StipendioImpiegato;
import view.HomepageDatore;
import view.ListaImpiegati;
import view.RitardoForm;

/**
 *
 * @author dario
 */
public class OrariStipendiControl {

    HomepageImpiegato HPI;
    HomepageAmministratore HPA;
    HomepageDatore HPD;
    ListaImpiegati LI;
    JFrame StipendioImpiegato;

    public OrariStipendiControl() {
    }

    public void ConsultaOrarioButtonPressed(JFrame HP) {
        if (HP instanceof HomepageImpiegato) {
            HPI = (HomepageImpiegato) HP;
            HPI.setClickable(false);
        }
        if (HP instanceof HomepageAmministratore) {
            HPA = (HomepageAmministratore) HP;
            HPA.setClickable(false);
        }

        OrarioImpiegato OrarioImpiegati = new OrarioImpiegato(this);
        
        ResultSet OI = DBMSBoundary.getQuery("SELECT T.ora, dayofweek(data_) "
                + "FROM impiegato I, turno T, assegnazione_turno AT "
                + "WHERE AT.impiegato = I.matricola AND I.matricola='" + Utente.getMatricola() + "' AND AT.turno = T.id;");
        int turno = 0;
        int giorno = 0;
        try {
            if (OI.next()) {
                turno = ((OI.getInt(1) / 8) + 1);
                giorno = (((OI.getInt(2) - 2) % 7) + 7) % 7;
            }else{
                MostraErrore("Turni non trovati");
            }
        } catch (SQLException ex) {
            Logger.getLogger(OrariStipendiControl.class.getName()).log(Level.SEVERE, null, ex);
        }
        switch (turno * 10 + giorno) {
            case 10 ->
                OrarioImpiegati.getLabel10().setIcon(new javax.swing.ImageIcon(getClass().getResource("/OrarioCellSelezionata.png")));
            case 11 ->
                OrarioImpiegati.getLabel11().setIcon(new javax.swing.ImageIcon(getClass().getResource("/OrarioCellSelezionata.png")));
            case 12 ->
                OrarioImpiegati.getLabel12().setIcon(new javax.swing.ImageIcon(getClass().getResource("/OrarioCellSelezionata.png")));
            case 13 ->
                OrarioImpiegati.getLabel13().setIcon(new javax.swing.ImageIcon(getClass().getResource("/OrarioCellSelezionata.png")));
            case 14 ->
                OrarioImpiegati.getLabel14().setIcon(new javax.swing.ImageIcon(getClass().getResource("/OrarioCellSelezionata.png")));
            case 15 ->
                OrarioImpiegati.getLabel15().setIcon(new javax.swing.ImageIcon(getClass().getResource("/OrarioCellSelezionata.png")));
            case 16 ->
                OrarioImpiegati.getLabel16().setIcon(new javax.swing.ImageIcon(getClass().getResource("/OrarioCellSelezionata.png")));
            case 20 ->
                OrarioImpiegati.getLabel20().setIcon(new javax.swing.ImageIcon(getClass().getResource("/OrarioCellSelezionata.png")));
            case 21 ->
                OrarioImpiegati.getLabel21().setIcon(new javax.swing.ImageIcon(getClass().getResource("/OrarioCellSelezionata.png")));
            case 22 ->
                OrarioImpiegati.getLabel22().setIcon(new javax.swing.ImageIcon(getClass().getResource("/OrarioCellSelezionata.png")));
            case 23 ->
                OrarioImpiegati.getLabel23().setIcon(new javax.swing.ImageIcon(getClass().getResource("/OrarioCellSelezionata.png")));
            case 24 ->
                OrarioImpiegati.getLabel24().setIcon(new javax.swing.ImageIcon(getClass().getResource("/OrarioCellSelezionata.png")));
            case 25 ->
                OrarioImpiegati.getLabel25().setIcon(new javax.swing.ImageIcon(getClass().getResource("/OrarioCellSelezionata.png")));
            case 26 ->
                OrarioImpiegati.getLabel26().setIcon(new javax.swing.ImageIcon(getClass().getResource("/OrarioCellSelezionata.png")));
            case 30 ->
                OrarioImpiegati.getLabel30().setIcon(new javax.swing.ImageIcon(getClass().getResource("/OrarioCellSelezionata.png")));
            case 31 ->
                OrarioImpiegati.getLabel31().setIcon(new javax.swing.ImageIcon(getClass().getResource("/OrarioCellSelezionata.png")));
            case 32 ->
                OrarioImpiegati.getLabel32().setIcon(new javax.swing.ImageIcon(getClass().getResource("/OrarioCellSelezionata.png")));
            case 33 ->
                OrarioImpiegati.getLabel33().setIcon(new javax.swing.ImageIcon(getClass().getResource("/OrarioCellSelezionata.png")));
            case 34 ->
                OrarioImpiegati.getLabel34().setIcon(new javax.swing.ImageIcon(getClass().getResource("/OrarioCellSelezionata.png")));
            case 35 ->
                OrarioImpiegati.getLabel35().setIcon(new javax.swing.ImageIcon(getClass().getResource("/OrarioCellSelezionata.png")));
            case 36 ->
                OrarioImpiegati.getLabel36().setIcon(new javax.swing.ImageIcon(getClass().getResource("/OrarioCellSelezionata.png")));

        }
    }

    public void ConsultaStipendioButtonPressed(JFrame HP) {
        if (HP instanceof HomepageImpiegato) {
            HPI = (HomepageImpiegato) HP;
            HPI.setClickable(false);
        }
        if (HP instanceof HomepageAmministratore) {
            HPA = (HomepageAmministratore) HP;
            HPA.setClickable(false);
        }
        ResultSet rs = DBMSBoundary.getQuery(
                "SELECT matricola, nome, cognome, anno, mese, base, bonus, straord, malattia, congedo "
                + "FROM impiegato I, stipendio S "
                + "WHERE I.matricola=S.impiegato AND I.matricola='" + Utente.getMatricola() + "' "
                + "ORDER BY anno DESC, mese;");
        StipendioImpiegato StipendioImpiegato = new StipendioImpiegato(this, rs);
        
        StipendioImpiegato.getImpiegatoLabel().setVisible(false);
        StipendioImpiegato.getMatricolaLabel().setVisible(false);
    }
    
    
    public void MostraErrore(String messaggio){
        if(LI != null){
            LI.setClickable(false);
        }
        new Errore(messaggio, this);
    }
    
    public void SubmitError(JFrame finestra) {
        if(LI != null){
            LI.setClickable(true);
        }
        finestra.dispose();
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
        if (LI != null) {
            LI.setClickable(true);
            for (int i = 0; i < LI.getImpiegati().size(); ++i) {
                LI.getImpiegati().get(i).setClickable(true);
            }
        }
    }

    public void ConsultaStipendiImpiegatiButtonPressed(JFrame homepage) {
        if (homepage instanceof HomepageDatore) {
            this.HPD = (HomepageDatore) homepage;
            HPD.setClickable(false);
        }
        if (homepage instanceof HomepageAmministratore) {
            this.HPA = (HomepageAmministratore) homepage;
            HPA.setClickable(false);
        }
        ResultSet rs = DBMSBoundary.getQuery("select matricola, nome , cognome , propic , livello from impiegato where matricola!='0';");
        JFrame ListaImpiegati = new ListaImpiegati(this, rs, "ConsultaStipendi");
        
    }

    public void ConsultaOrariImpiegatiButtonPressed(JFrame homepage) {
        if (homepage instanceof HomepageDatore) {
            this.HPD = (HomepageDatore) homepage;
            HPD.setClickable(false);
        }
        if (homepage instanceof HomepageAmministratore) {
            this.HPA = (HomepageAmministratore) homepage;
            HPA.setClickable(false);
        }
        ResultSet rs = DBMSBoundary.getQuery("select matricola, nome , cognome , propic , livello from impiegato where matricola != '0';");
        JFrame ListaImpiegati = new ListaImpiegati(this, rs, "ConsultaOrari");
        
    }

    public void sendSelectionSalary(String matricola) {
        //ricarica Lista
        if (LI != null) {
            this.LI = LI;
        }
        if (StipendioImpiegato != null) {
            this.DisposeWindow(StipendioImpiegato);
        }

        ResultSet rs = DBMSBoundary.getQuery(
                "SELECT matricola, nome, cognome, anno, mese, base, bonus, straord, malattia, congedo "
                + "FROM impiegato I, stipendio S "
                + "WHERE I.matricola=S.impiegato AND I.matricola='" + matricola + "'"
                + "ORDER BY anno DESC, mese;");
        
        StipendioImpiegato = new StipendioImpiegato(this, rs);
        LI.setClickable(false);
        
    }

    public void sendSelectionTimeTables(String matricola, ListaImpiegati LI) {
        this.LI = LI;
        OrarioImpiegato OrarioImpiegati = new OrarioImpiegato(this);
        LI.setClickable(false);
        
        ResultSet OI = DBMSBoundary.getQuery("select T.ora, dayofweek(data_) "
                + "from impiegato I, turno T, assegnazione_turno AT "
                + "where AT.impiegato = I.matricola AND I.matricola='" + matricola + "' AND AT.turno = T.id;");
        int turno = 0;
        int giorno = 0;
        try {
            if (OI.next()) {
                turno = ((OI.getInt(1) / 8) + 1);
                giorno = (((OI.getInt(2) - 2) % 7) + 7) % 7;
            }else{
                MostraErrore("Turni non trovati");
            }
        } catch (SQLException ex) {
            Logger.getLogger(OrariStipendiControl.class.getName()).log(Level.SEVERE, null, ex);
        }
        switch (turno * 10 + giorno) {
            case 10 ->
                OrarioImpiegati.getLabel10().setIcon(new javax.swing.ImageIcon(getClass().getResource("/OrarioCellSelezionata.png")));
            case 11 ->
                OrarioImpiegati.getLabel11().setIcon(new javax.swing.ImageIcon(getClass().getResource("/OrarioCellSelezionata.png")));
            case 12 ->
                OrarioImpiegati.getLabel12().setIcon(new javax.swing.ImageIcon(getClass().getResource("/OrarioCellSelezionata.png")));
            case 13 ->
                OrarioImpiegati.getLabel13().setIcon(new javax.swing.ImageIcon(getClass().getResource("/OrarioCellSelezionata.png")));
            case 14 ->
                OrarioImpiegati.getLabel14().setIcon(new javax.swing.ImageIcon(getClass().getResource("/OrarioCellSelezionata.png")));
            case 15 ->
                OrarioImpiegati.getLabel15().setIcon(new javax.swing.ImageIcon(getClass().getResource("/OrarioCellSelezionata.png")));
            case 16 ->
                OrarioImpiegati.getLabel16().setIcon(new javax.swing.ImageIcon(getClass().getResource("/OrarioCellSelezionata.png")));
            case 20 ->
                OrarioImpiegati.getLabel20().setIcon(new javax.swing.ImageIcon(getClass().getResource("/OrarioCellSelezionata.png")));
            case 21 ->
                OrarioImpiegati.getLabel21().setIcon(new javax.swing.ImageIcon(getClass().getResource("/OrarioCellSelezionata.png")));
            case 22 ->
                OrarioImpiegati.getLabel22().setIcon(new javax.swing.ImageIcon(getClass().getResource("/OrarioCellSelezionata.png")));
            case 23 ->
                OrarioImpiegati.getLabel23().setIcon(new javax.swing.ImageIcon(getClass().getResource("/OrarioCellSelezionata.png")));
            case 24 ->
                OrarioImpiegati.getLabel24().setIcon(new javax.swing.ImageIcon(getClass().getResource("/OrarioCellSelezionata.png")));
            case 25 ->
                OrarioImpiegati.getLabel25().setIcon(new javax.swing.ImageIcon(getClass().getResource("/OrarioCellSelezionata.png")));
            case 26 ->
                OrarioImpiegati.getLabel26().setIcon(new javax.swing.ImageIcon(getClass().getResource("/OrarioCellSelezionata.png")));
            case 30 ->
                OrarioImpiegati.getLabel30().setIcon(new javax.swing.ImageIcon(getClass().getResource("/OrarioCellSelezionata.png")));
            case 31 ->
                OrarioImpiegati.getLabel31().setIcon(new javax.swing.ImageIcon(getClass().getResource("/OrarioCellSelezionata.png")));
            case 32 ->
                OrarioImpiegati.getLabel32().setIcon(new javax.swing.ImageIcon(getClass().getResource("/OrarioCellSelezionata.png")));
            case 33 ->
                OrarioImpiegati.getLabel33().setIcon(new javax.swing.ImageIcon(getClass().getResource("/OrarioCellSelezionata.png")));
            case 34 ->
                OrarioImpiegati.getLabel34().setIcon(new javax.swing.ImageIcon(getClass().getResource("/OrarioCellSelezionata.png")));
            case 35 ->
                OrarioImpiegati.getLabel35().setIcon(new javax.swing.ImageIcon(getClass().getResource("/OrarioCellSelezionata.png")));
            case 36 ->
                OrarioImpiegati.getLabel36().setIcon(new javax.swing.ImageIcon(getClass().getResource("/OrarioCellSelezionata.png")));

        }
    }

    public void consultazioneRitardiButtonPressed(JFrame homepage) {
        if (homepage instanceof HomepageDatore) {
            this.HPI = (HomepageImpiegato) homepage;
            HPI.setClickable(false);
        }
        if (homepage instanceof HomepageAmministratore) {
            this.HPA = (HomepageAmministratore) homepage;
            HPA.setClickable(false);
        }
        ResultSet rs = DBMSBoundary.getQuery(
                "SELECT I.nome, I.cognome, R.data_, R.motivo "
                + "FROM ritardo R, impiegato I "
                + "WHERE R.impiegato = I.matricola AND I.matricola = '" + Utente.getMatricola() + "';"
        );
        RitardoForm RT = new RitardoForm(rs, this);

       
    }

    public void consultazioneRitardiImpiegatiButtonPressed(JFrame homepage) {
        if (homepage instanceof HomepageDatore) {
            this.HPI = (HomepageImpiegato) homepage;
            HPI.setClickable(false);
        }
        if (homepage instanceof HomepageAmministratore) {
            this.HPA = (HomepageAmministratore) homepage;
            HPA.setClickable(false);
        }
        ResultSet rs = DBMSBoundary.getQuery("select matricola, nome , cognome , propic , livello from impiegato where matricola != '0';");
        JFrame ListaImpiegati = new ListaImpiegati(this, rs, "ConsultaRitardi");
        
    }

    public void sendSelectionDelay(String matricola) {
        if (HPD != null) {
            HPD.setClickable(false);
        }
        if (HPA != null) {
            HPA.setClickable(false);
        }
        ResultSet rs = DBMSBoundary.getQuery(
                "SELECT I.nome, I.cognome, R.data_, R.motivo "
                + "FROM ritardo R, impiegato I "
                + "WHERE R.impiegato = I.matricola AND I.matricola = '" + matricola + "';"
        );
        RitardoForm RT = new RitardoForm(rs, this);
        LI.setClickable(false);
        for (int i = 0; i < LI.getImpiegati().size(); ++i) {
            LI.getImpiegati().get(i).setClickable(false);
        }
        
    }

}
