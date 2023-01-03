/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import javax.swing.JFrame;
import view.CalendarioInterattivo;
import view.CongedoForm;

/**
 *
 * @author dario
 */
public class RichiesteControl {
    public void RichiestaPermessoButtonPressed(){
        JFrame CalendarioInterattivo = new CalendarioInterattivo();
        CalendarioInterattivo.setVisible(true);
    }
    public void RichiestaFerieButtonPressed(){
        JFrame CalendarioInterattivo = new CalendarioInterattivo();
        CalendarioInterattivo.setVisible(true);
    }
    public void RichiestaCongedoParentaleButtonPressed(){
        JFrame CongedoForm = new CongedoForm();
        CongedoForm.setVisible(true);
    }
    
}
