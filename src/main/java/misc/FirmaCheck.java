/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package misc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComponent;
import model.DBMSBoundary;
import model.Utente;

/**
 *
 * @author Davide
 */
public class FirmaCheck implements Runnable {
    
    private JComponent firmaButton;
    
    public FirmaCheck(JComponent firmaButton) {
        this.firmaButton = firmaButton;
    }
    
    @Override
    public void run(){
        ResultSet rs;
        while(true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(FirmaCheck.class.getName()).log(Level.SEVERE, null, ex);
            }
            rs = DBMSBoundary.getQuery("SELECT MIN(ora) as firstHour FROM turno JOIN assegnazione_turno ON id = turno WHERE impiegato = '" + Utente.getMatricola() + "' AND data_ = '" + LocalDate.now().toString()+"';");
            try {
                rs.next();
                
                if(rs.getInt("firstHour") != LocalTime.now().getHour()){
                    firmaButton.setVisible(false);
                    continue;
                }
                
                if(LocalTime.now().getMinute() >= 10) {
                    firmaButton.setVisible(false);
                    continue;
                }
                
                firmaButton.setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(FirmaCheck.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
