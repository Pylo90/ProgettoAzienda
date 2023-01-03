/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import javax.swing.JFrame;
import view.ModificaPassword;

/**
 *
 * @author dario
 */
public class CambiaPasswordControl {
    public void CPButtonPressed(){
        JFrame CambiaPasswordBoundary = new ModificaPassword();
        CambiaPasswordBoundary.setVisible(true);
    }
}
