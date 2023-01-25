package misc;

import javax.swing.JFrame;
import view.Errore;
import view.Notifica;

public class RistabilisciConnessioneControl {

    public RistabilisciConnessioneControl() {
    }


    public void MostraErrore(String messaggio){
        new Errore(messaggio,this);
    }
    public void MostraNotifica(String messaggio){
        new Notifica(messaggio,this);
    }
    
    public void SubmitError(JFrame finestra) {
        finestra.dispose();
        //TB.setClickable(true); tempo boundary cliccabile?
    }
    
    public void SubmitNotice(JFrame finestra) {
        finestra.dispose();
        //TB.setClickable(true); tempo boundary cliccabile?
    }

}