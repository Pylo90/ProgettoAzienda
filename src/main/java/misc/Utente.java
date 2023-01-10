/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package misc;

import javax.swing.ImageIcon;

/**
 *
 * @author dario
 */
public class Utente {

    public Utente(String matricola, String nome, String cognome, String mail, String PW, String CF, ImageIcon foto, String numero, int livello, boolean disability, int ore_lavorate, long pin) {
        this.matricola = matricola;
        this.nome = nome;
        this.cognome = cognome;
        this.mail = mail;
        this.PW = PW;
        this.CF = CF;
        this.foto = foto;
        this.numero = numero;
        this.livello = livello;
        this.disability = disability;
        this.ore_lavorate = ore_lavorate;
        this.pin = pin;
    }

    
    String matricola;
    String nome;
    String cognome;
    String mail;
    String PW;
    String CF;
    ImageIcon foto;
    String numero;
    int livello;
    boolean disability;
    int ore_lavorate;
    long pin;

    public long getPin() {
        return pin;
    }

    public void setPin(long pin) {
        this.pin = pin;
    }

    
    
    public String getMatricola() {
        return matricola;
    }

    public void setMatricola(String matricola) {
        this.matricola = matricola;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPW() {
        return PW;
    }

    public void setPW(String PW) {
        this.PW = PW;
    }

    public String getCF() {
        return CF;
    }

    public void setCF(String CF) {
        this.CF = CF;
    }

    public ImageIcon getFoto() {
        return foto;
    }

    public void setFoto(ImageIcon foto) {
        this.foto = foto;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getLivello() {
        return livello;
    }

    public void setLivello(int livello) {
        this.livello = livello;
    }

    public boolean isDisability() {
        return disability;
    }

    public void setDisability(boolean disability) {
        this.disability = disability;
    }

    public int getOre_lavorate() {
        return ore_lavorate;
    }

    public void setOre_lavorate(int ore_lavorate) {
        this.ore_lavorate = ore_lavorate;
    }
    
    
    
}
