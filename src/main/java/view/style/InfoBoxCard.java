package view.style;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import view.ListaImpiegati;

public class InfoBoxCard extends javax.swing.JPanel {
    String matricola;
    ListaImpiegati li;


    public InfoBoxCard(String matricolaImpiegato, String nomeImpiegato, String cognomeImpiegato, String livello, ImageIcon proPic, ListaImpiegati li) {
        initComponents();
        this.matricola = matricolaImpiegato;
        this.li = li;

        nameField.setText(nomeImpiegato);
        surnameField.setText(cognomeImpiegato);
        levelField.setText(livello);
        propic.setIcon(proPic);
        /**
         * *****GESTIONE IMMAGINE - DA ATTIVARE******
         */
        //propic = propic.getScaledInstance(105, 105, Image.SCALE_DEFAULT);
        //this.propic.setIcon(new ImageIcon(propic));
        /**
         * ******************************************
         */

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        useThisToHandleClick = new javax.swing.JButton();
        Cornice = new javax.swing.JLabel();
        surnameField = new javax.swing.JTextField();
        levelField = new javax.swing.JTextField();
        nameField = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        propic = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(219, 213, 205));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(1201, 113));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(1201, 113));
        setLayout(null);

        useThisToHandleClick.setBorder(null);
        useThisToHandleClick.setBorderPainted(false);
        useThisToHandleClick.setContentAreaFilled(false);
        useThisToHandleClick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                useThisToHandleClickActionPerformed(evt);
            }
        });
        add(useThisToHandleClick);
        useThisToHandleClick.setBounds(0, 0, 1200, 110);

        Cornice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cornice105x105.png"))); // NOI18N
        add(Cornice);
        Cornice.setBounds(1090, 3, 105, 105);

        surnameField.setBackground(new java.awt.Color(219, 213, 205));
        surnameField.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        surnameField.setForeground(new java.awt.Color(0, 0, 0));
        surnameField.setText("Cognome");
        surnameField.setBorder(null);
        surnameField.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        surnameField.setFocusable(false);
        surnameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                surnameFieldActionPerformed(evt);
            }
        });
        add(surnameField);
        surnameField.setBounds(50, 50, 560, 50);

        levelField.setBackground(new java.awt.Color(219, 213, 205));
        levelField.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        levelField.setForeground(new java.awt.Color(0, 0, 0));
        levelField.setText("1");
        levelField.setBorder(null);
        levelField.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        levelField.setFocusable(false);
        levelField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                levelFieldActionPerformed(evt);
            }
        });
        add(levelField);
        levelField.setBounds(730, 40, 30, 40);

        nameField.setBackground(new java.awt.Color(219, 213, 205));
        nameField.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        nameField.setForeground(new java.awt.Color(0, 0, 0));
        nameField.setText("Nome");
        nameField.setBorder(null);
        nameField.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        nameField.setFocusable(false);
        add(nameField);
        nameField.setBounds(50, 10, 540, 40);

        jTextField4.setBackground(new java.awt.Color(219, 213, 205));
        jTextField4.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(0, 0, 0));
        jTextField4.setText("Livello:");
        jTextField4.setBorder(null);
        jTextField4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextField4.setFocusable(false);
        add(jTextField4);
        jTextField4.setBounds(610, 40, 120, 40);

        propic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagePlaceholder.png"))); // NOI18N
        add(propic);
        propic.setBounds(1090, 3, 105, 105);
        add(jLabel1);
        jLabel1.setBounds(0, 0, 1200, 110);
    }// </editor-fold>//GEN-END:initComponents

    private void levelFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_levelFieldActionPerformed

    }//GEN-LAST:event_levelFieldActionPerformed

    private void surnameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_surnameFieldActionPerformed
       
    }//GEN-LAST:event_surnameFieldActionPerformed

    private void useThisToHandleClickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_useThisToHandleClickActionPerformed
        li.getFromInfoBox(matricola);
    }//GEN-LAST:event_useThisToHandleClickActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cornice;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField levelField;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel propic;
    private javax.swing.JTextField surnameField;
    private javax.swing.JButton useThisToHandleClick;
    // End of variables declaration//GEN-END:variables

    public JTextField getLevelField() {
        return levelField;
    }

    public JTextField getNameField() {
        return nameField;
    }

    public JLabel getPropic() {
        return propic;
    }

    public JTextField getSurnameField() {
        return surnameField;
    }

    public JButton getUseThisToHandleClick() {
        return useThisToHandleClick;
    }


}
