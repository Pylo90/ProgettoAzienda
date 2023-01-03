/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import javax.swing.JFrame;
import view.OrarioImpiegato;
import view.StipendioImpiegato;

/**
 *
 * @author dario
 */
public class OrariStipendiControl {
    public void ConsultaOrarioButtonPressed(){
        JFrame OrarioImpiegati = new OrarioImpiegato();
        OrarioImpiegati.setVisible(true);
    }
    public void ConsultaStipendioButtonPressed(){
        JFrame StipendioImpiegato = new StipendioImpiegato();
        StipendioImpiegato.setVisible(true);
    }
    
}
