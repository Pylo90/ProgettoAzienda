package view.style;

import controller.RichiesteControl;
import java.awt.Image;
import java.io.FileInputStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Davide
 */
public class InfoBoxCard extends javax.swing.JPanel {

    /**
     * Creates new form infoBoxCard
     */

    
    Object controller = null;
    
    public InfoBoxCard(Object controller, ResultSet rs) {
        initComponents();
        this.controller = controller;
        try {
            nameField.setText(rs.getString("nome"));
            surnameField.setText(rs.getString("cognome"));
            levelField.setText(rs.getString("livello"));
            /*******GESTIONE IMMAGINE - DA ATTIVARE*******/
            //propic = propic.getScaledInstance(105, 105, Image.SCALE_DEFAULT);
            //this.propic.setIcon(new ImageIcon(propic));
            /*********************************************/
        } catch (SQLException ex) {
            Logger.getLogger(InfoBoxCard.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        useThisToHandleClick = new javax.swing.JLabel();
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

        useThisToHandleClick.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        useThisToHandleClick.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                useThisToHandleClick(evt);
            }
        });
        add(useThisToHandleClick);
        useThisToHandleClick.setBounds(0, 0, 1201, 113);

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
        propic.setBounds(1090, 2, 105, 105);
        add(jLabel1);
        jLabel1.setBounds(0, 0, 1200, 110);
    }// </editor-fold>//GEN-END:initComponents
    
    /*UTILIZZARE QUESTO METODO PER GESTIRE IL CLICK SULL'IMPIEGATO DALLA LISTA*/
    private void useThisToHandleClick(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_useThisToHandleClick
        System.out.println("culo");
    }//GEN-LAST:event_useThisToHandleClick

    private void levelFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_levelFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_levelFieldActionPerformed

    private void surnameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_surnameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_surnameFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField levelField;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel propic;
    private javax.swing.JTextField surnameField;
    private javax.swing.JLabel useThisToHandleClick;
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
    
}
