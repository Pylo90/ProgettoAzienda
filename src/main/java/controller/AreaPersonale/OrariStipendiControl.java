package controller.AreaPersonale;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Enumeration;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractButton;
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

public class OrariStipendiControl {

    HomepageImpiegato HPI;
    HomepageAmministratore HPA;
    HomepageDatore HPD;
    ListaImpiegati LI;
    JFrame StipendioImpiegato;
    boolean found = false;

    public OrariStipendiControl() {
    }

    public void ConsultaOrarioButtonPressed(JFrame HP) {
        if (HP instanceof HomepageImpiegato) {
            HPI = (HomepageImpiegato) HP;
            Enumeration<AbstractButton> buttons = HPI.getButtonGroup1().getElements();
            while (buttons.hasMoreElements()) {
                buttons.nextElement().setEnabled(false);
            }
        }
        if (HP instanceof HomepageAmministratore) {
            HPA = (HomepageAmministratore) HP;
            Enumeration<AbstractButton> buttons = HPA.getButtonGroup1().getElements();
            while (buttons.hasMoreElements()) {
                buttons.nextElement().setEnabled(false);
            }
        }

        ResultSet OI = DBMSBoundary.getQuery("SELECT T.ora, dayofweek(data_) "
                + "FROM impiegato I, turno T, assegnazione_turno AT "
                + "WHERE AT.impiegato = I.matricola AND I.matricola='" + Utente.getMatricola() + "' AND AT.turno = T.id;");
        int turno = 0;
        int giorno = 0;
        try {
            if (OI.next()) {
                OrarioImpiegato OrarioImpiegati = new OrarioImpiegato(this);
                while (OI.next()) {
                    turno = ((OI.getInt(1) / 8) + 1);
                    giorno = (((OI.getInt(2) - 2) % 7) + 7) % 7;
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

            } else {
                MostraErrore("Turni non trovati");
            }
        } catch (SQLException ex) {
            Logger.getLogger(OrariStipendiControl.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void ConsultaStipendioButtonPressed(JFrame HP) {
        if (HP instanceof HomepageImpiegato) {
            HPI = (HomepageImpiegato) HP;
            Enumeration<AbstractButton> buttons = HPI.getButtonGroup1().getElements();
            while (buttons.hasMoreElements()) {
                buttons.nextElement().setEnabled(false);
            }
        }
        if (HP instanceof HomepageAmministratore) {
            HPA = (HomepageAmministratore) HP;
            Enumeration<AbstractButton> buttons = HPA.getButtonGroup1().getElements();
            while (buttons.hasMoreElements()) {
                buttons.nextElement().setEnabled(false);
            }
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

    public void MostraErrore(String messaggio) {
        if (LI != null) {
            for (int i = 0; i < LI.getImpiegati().size(); ++i) {
                LI.getImpiegati().get(i).getUseThisToHandleClick().setEnabled(false);
            }
            LI.getHomeButton().setEnabled(false);
            LI.getSearchField().setEditable(false);
            LI.setAlwaysOnTop(false);

        }
        new Errore(messaggio, this);
    }

    public void SubmitError(JFrame finestra) {
        if (LI != null) {
            for (int i = 0; i < LI.getImpiegati().size(); ++i) {
                LI.getImpiegati().get(i).getUseThisToHandleClick().setEnabled(true);
            }
            LI.getHomeButton().setEnabled(true);
            LI.setAlwaysOnTop(true);
            LI.getSearchField().setEditable(true);

        }
        finestra.dispose();
        if (HPI != null) {

            Enumeration<AbstractButton> buttons = HPI.getButtonGroup1().getElements();
            while (buttons.hasMoreElements()) {
                buttons.nextElement().setEnabled(true);
            }
        }
        if (HPA != null) {

            Enumeration<AbstractButton> buttons = HPA.getButtonGroup1().getElements();
            while (buttons.hasMoreElements()) {
                buttons.nextElement().setEnabled(true);
            }
        }
    }

    public void DisposeWindow(JFrame finestra) {
        finestra.dispose();
        if (HPI != null) {
            Enumeration<AbstractButton> buttons = HPI.getButtonGroup1().getElements();
            while (buttons.hasMoreElements()) {
                buttons.nextElement().setEnabled(true);
            }
        }
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
        if (LI != null) {
            LI.getHomeButton().setEnabled(true);
            for (int i = 0; i < LI.getImpiegati().size(); ++i) {
                LI.getImpiegati().get(i).getUseThisToHandleClick().setEnabled(true);
            }
            LI.getSearchField().setEditable(true);
            LI.setAlwaysOnTop(true);
            LI.getSearchField().setEditable(true);
        }
    }

    public void ConsultaStipendiImpiegatiButtonPressed(JFrame homepage) {
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
        ResultSet rs = DBMSBoundary.getQuery("select matricola, nome , cognome , propic , livello from impiegato where matricola!='000000';");
        JFrame ListaImpiegati = new ListaImpiegati(this, rs, "ConsultaStipendi");

    }

    public void ConsultaOrariImpiegatiButtonPressed(JFrame homepage) {
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
        ResultSet rs = DBMSBoundary.getQuery("select matricola, nome , cognome , propic , livello from impiegato where matricola != '000000';");
        JFrame ListaImpiegati = new ListaImpiegati(this, rs, "ConsultaOrari");

    }

    public void sendSelectionSalary(String matricola, ListaImpiegati LI) {
        //ricarica Lista
        this.LI = LI;
        this.LI.setAlwaysOnTop(false);
        if (StipendioImpiegato != null) {
            this.DisposeWindow(StipendioImpiegato);
        }

        ResultSet rs = DBMSBoundary.getQuery(
                "SELECT matricola, nome, cognome, anno, mese, base, bonus, straord, malattia, congedo "
                + "FROM impiegato I, stipendio S "
                + "WHERE I.matricola=S.impiegato AND I.matricola='" + matricola + "'"
                + "ORDER BY anno DESC, mese;");

        StipendioImpiegato = new StipendioImpiegato(this, rs);
        this.LI.getHomeButton().setEnabled(false);
        for (int i = 0; i < LI.getImpiegati().size(); ++i) {
            LI.getImpiegati().get(i).getUseThisToHandleClick().setEnabled(false);
        }

    }

    public void sendSelectionTimeTables(String matricola, ListaImpiegati LI) {
        this.LI = LI;
        this.LI.setAlwaysOnTop(false);
        this.LI.getHomeButton().setEnabled(false);
        for (int i = 0; i < LI.getImpiegati().size(); ++i) {
            LI.getImpiegati().get(i).getUseThisToHandleClick().setEnabled(false);
        }

        ResultSet OI = DBMSBoundary.getQuery("select T.ora, dayofweek(data_) "
                + "from impiegato I, turno T, assegnazione_turno AT "
                + "where AT.impiegato = I.matricola AND I.matricola='" + matricola + "' AND AT.turno = T.id;");
        int turno = 0;
        int giorno = 0;
        try {
            if (OI.next()) {
                OrarioImpiegato OrarioImpiegati = new OrarioImpiegato(this);
                while (OI.next()) {
                    turno = ((OI.getInt(1) / 8) + 1);
                    giorno = (((OI.getInt(2) - 2) % 7) + 7) % 7;
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

            } else {
                MostraErrore("Turni non trovati");
            }
        } catch (SQLException ex) {
            Logger.getLogger(OrariStipendiControl.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void consultazioneRitardiButtonPressed(JFrame homepage) {
        if (homepage instanceof HomepageDatore) {
            this.HPI = (HomepageImpiegato) homepage;
            Enumeration<AbstractButton> buttons = HPI.getButtonGroup1().getElements();
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
        ResultSet rs = DBMSBoundary.getQuery(
                "SELECT I.nome, I.cognome, R.data_, R.motivo "
                + "FROM ritardo R, impiegato I "
                + "WHERE R.impiegato = I.matricola AND I.matricola = '" + Utente.getMatricola() + "';"
        );
        RitardoForm RT = new RitardoForm(rs, this);

    }

    public void consultazioneRitardiImpiegatiButtonPressed(JFrame homepage) {
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
        ResultSet rs = DBMSBoundary.getQuery("select matricola, nome , cognome , propic , livello from impiegato where matricola != '000000';");
        JFrame ListaImpiegati = new ListaImpiegati(this, rs, "ConsultaRitardi");

    }

    public void sendSelectionDelay(String matricola, ListaImpiegati LI) {
        if (HPD != null) {
            Enumeration<AbstractButton> buttons = HPD.getButtonGroup1().getElements();
            while (buttons.hasMoreElements()) {
                buttons.nextElement().setEnabled(false);
            }
        }
        if (HPA != null) {
            Enumeration<AbstractButton> buttons = HPA.getButtonGroup1().getElements();
            while (buttons.hasMoreElements()) {
                buttons.nextElement().setEnabled(false);
            }
        }
        ResultSet rs = DBMSBoundary.getQuery(
                "SELECT I.nome, I.cognome, R.data_, R.motivo "
                + "FROM ritardo R, impiegato I "
                + "WHERE R.impiegato = I.matricola AND I.matricola = '" + matricola + "';"
        );
        this.LI = LI;
        RitardoForm RT = new RitardoForm(rs, this);
        this.LI.getHomeButton().setEnabled(false);
        for (int i = 0; i < LI.getImpiegati().size(); ++i) {
            LI.getImpiegati().get(i).getUseThisToHandleClick().setEnabled(false);
        }

    }

}
