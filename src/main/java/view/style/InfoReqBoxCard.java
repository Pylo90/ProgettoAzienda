package view.style;

import controller.AreaPersonale.RichiesteControl;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JTextField;

public class InfoReqBoxCard extends javax.swing.JPanel {
    ResultSet rs;
    RichiesteControl RC = null;

    String nome;
    String cognome;
    String tipo;
    String data;
    String dati;
    String idRichiesta;
    String testo;

    public JButton getSelectButton() {
        return selectButton;
    }

    

    public InfoReqBoxCard(RichiesteControl RC, String nomeMittente, String cognomeMittente, String tipoRichiesta, String dataScadenza, String dati, String id, String motivazione) {
        initComponents();

        nome = nomeMittente;
        cognome = cognomeMittente;
        switch (tipoRichiesta) {
            case "3":
                typeField.setText("Sciopero");
                break;
            case "4":
                typeField.setText("Ferie");
                break;
            case "5":
                typeField.setText("Permesso");
                break;
            case "6":
                typeField.setText("Scambio Turni");
                break;
        }
        tipo = tipoRichiesta;
        data = dataScadenza;
        testo = motivazione;
        this.dati = dati;
        this.idRichiesta = id;
        this.RC = RC;
        nameField.setText(nomeMittente + " " + cognomeMittente);

        dateField.setText(dataScadenza);

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nameField = new javax.swing.JTextField();
        typeField = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        dateField = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        selectButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(219, 213, 205));
        setMinimumSize(new java.awt.Dimension(1201, 113));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(1201, 113));
        setLayout(null);

        nameField.setBackground(new java.awt.Color(219, 213, 205));
        nameField.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        nameField.setForeground(new java.awt.Color(0, 0, 0));
        nameField.setText("Nome Cognome");
        nameField.setBorder(null);
        nameField.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        nameField.setFocusable(false);
        add(nameField);
        nameField.setBounds(180, -10, 410, 80);

        typeField.setBackground(new java.awt.Color(219, 213, 205));
        typeField.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        typeField.setForeground(new java.awt.Color(0, 0, 0));
        typeField.setText("Tipo");
        typeField.setBorder(null);
        typeField.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        typeField.setFocusable(false);
        typeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeFieldActionPerformed(evt);
            }
        });
        add(typeField);
        typeField.setBounds(830, 10, 280, 40);

        jTextField3.setBackground(new java.awt.Color(219, 213, 205));
        jTextField3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(0, 0, 0));
        jTextField3.setText("Mittente:");
        jTextField3.setBorder(null);
        jTextField3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextField3.setFocusable(false);
        add(jTextField3);
        jTextField3.setBounds(30, 10, 150, 40);

        dateField.setBackground(new java.awt.Color(219, 213, 205));
        dateField.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        dateField.setForeground(new java.awt.Color(0, 0, 0));
        dateField.setText("Data");
        dateField.setBorder(null);
        dateField.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        dateField.setFocusable(false);
        add(dateField);
        dateField.setBounds(770, 60, 320, 40);

        jTextField5.setBackground(new java.awt.Color(219, 213, 205));
        jTextField5.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(0, 0, 0));
        jTextField5.setText("Tipo richiesta:");
        jTextField5.setBorder(null);
        jTextField5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextField5.setFocusable(false);
        add(jTextField5);
        jTextField5.setBounds(600, 10, 220, 40);

        jTextField6.setBackground(new java.awt.Color(219, 213, 205));
        jTextField6.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(0, 0, 0));
        jTextField6.setText("Scadenza:");
        jTextField6.setBorder(null);
        jTextField6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextField6.setFocusable(false);
        add(jTextField6);
        jTextField6.setBounds(600, 60, 160, 40);

        selectButton.setBackground(new java.awt.Color(219, 213, 205));
        selectButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InvioButton.png"))); // NOI18N
        selectButton.setBorder(null);
        selectButton.setContentAreaFilled(false);
        selectButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        selectButton.setFocusable(false);
        selectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectButtonActionPerformed(evt);
            }
        });
        add(selectButton);
        selectButton.setBounds(1120, 20, 60, 70);
    }// </editor-fold>//GEN-END:initComponents

    private void selectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectButtonActionPerformed
            RC.showRichiesta(nome, cognome, tipo, data, dati, idRichiesta, testo);
    }//GEN-LAST:event_selectButtonActionPerformed

    private void typeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeFieldActionPerformed
        
    }//GEN-LAST:event_typeFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField dateField;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField nameField;
    private javax.swing.JButton selectButton;
    private javax.swing.JTextField typeField;
    // End of variables declaration//GEN-END:variables

    public JTextField getDateField() {
        return dateField;
    }

    public JTextField getNameField() {
        return nameField;
    }

    public JTextField getTypeField() {
        return typeField;
    }

}
