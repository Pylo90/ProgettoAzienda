/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package view;

import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import controller.Autenticazione.LoginControl;
import java.awt.Font;
import java.awt.font.TextAttribute;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author Davide
 */
public class LoginForm extends javax.swing.JFrame {
    LoginControl LC;
    
    public LoginForm(LoginControl LC) {
        initComponents();
        this.setSize(1920,1080);
        this.LC = LC;
        this.getContentPane().setBackground(this.getBackground());
        Map<TextAttribute, Integer> fontAttributes = new HashMap<TextAttribute, Integer>();
        fontAttributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        Font underline = new Font("Segoe UI",Font.PLAIN, 18).deriveFont(fontAttributes);
        this.forgotButton.setFont(underline);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        confermaButton = new javax.swing.JButton();
        forgotButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        matricolaField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton45 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 248, 238));
        setBounds(new java.awt.Rectangle(0, 0, 1920, 1080));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.orange);
        setMinimumSize(new java.awt.Dimension(800, 600));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 248, 238));
        jPanel1.setPreferredSize(new java.awt.Dimension(1920, 1080));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Mail:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(464, 417, 103, 64);

        confermaButton.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        confermaButton.setForeground(new java.awt.Color(255, 255, 255));
        confermaButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LoginConferma.png"))); // NOI18N
        confermaButton.setText("Conferma");
        confermaButton.setBorder(null);
        confermaButton.setBorderPainted(false);
        confermaButton.setContentAreaFilled(false);
        confermaButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        confermaButton.setFocusable(false);
        confermaButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        confermaButton.setMaximumSize(new java.awt.Dimension(3, 161));
        confermaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confermaButtonActionPerformed(evt);
            }
        });
        jPanel1.add(confermaButton);
        confermaButton.setBounds(810, 750, 300, 77);

        forgotButton.setBackground(new java.awt.Color(255, 248, 238));
        forgotButton.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        forgotButton.setForeground(new java.awt.Color(0, 0, 0));
        forgotButton.setText("Hai dimenticato la password?");
        forgotButton.setBorder(null);
        forgotButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        forgotButton.setFocusPainted(false);
        forgotButton.setFocusable(false);
        forgotButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forgotButtonActionPerformed(evt);
            }
        });
        jPanel1.add(forgotButton);
        forgotButton.setBounds(722, 850, 476, 50);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Matricola:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(464, 507, 210, 64);

        emailField.setBackground(new java.awt.Color(219, 213, 205));
        emailField.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        emailField.setToolTipText("");
        emailField.setBorder(null);
        jPanel1.add(emailField);
        emailField.setBounds(582, 417, 873, 65);

        matricolaField.setBackground(new java.awt.Color(219, 213, 205));
        matricolaField.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        matricolaField.setBorder(null);
        jPanel1.add(matricolaField);
        matricolaField.setBounds(702, 507, 753, 65);

        passwordField.setBackground(new java.awt.Color(219, 213, 205));
        passwordField.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        passwordField.setBorder(null);
        passwordField.setPreferredSize(new java.awt.Dimension(116, 32));
        jPanel1.add(passwordField);
        passwordField.setBounds(690, 597, 765, 65);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Password:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(464, 597, 210, 64);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LogoLogin.png"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(510, 85, 900, 275);

        jButton45.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        jButton45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CloseIcon.png"))); // NOI18N
        jButton45.setBorder(null);
        jButton45.setContentAreaFilled(false);
        jButton45.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton45.setPreferredSize(new java.awt.Dimension(65, 65));
        jButton45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton45ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton45);
        jButton45.setBounds(1500, 185, 65, 65);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1920, 1080);

        setBounds(0, 0, 1920, 1080);
    }// </editor-fold>//GEN-END:initComponents

    private void confermaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confermaButtonActionPerformed
        LC.dataSubmit(getEmailField().getText(),getMatricolaField().getText(),String.valueOf(getPasswordField().getPassword()),this);
    }//GEN-LAST:event_confermaButtonActionPerformed

    private void forgotButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forgotButtonActionPerformed
        LC.RPButtonPressed();
    }//GEN-LAST:event_forgotButtonActionPerformed

    private void jButton45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton45ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton45ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
            //</editor-fold>
        

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });*/
        new LoginControl().createLogin();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confermaButton;
    private javax.swing.JTextField emailField;
    private javax.swing.JButton forgotButton;
    private javax.swing.JButton jButton45;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField matricolaField;
    private javax.swing.JPasswordField passwordField;
    // End of variables declaration//GEN-END:variables

    public JButton getConfermaButton() {
        return confermaButton;
    }

    public JTextField getEmailField() {
        return emailField;
    }

    public JButton getForgotButton() {
        return forgotButton;
    }

    public JTextField getMatricolaField() {
        return matricolaField;
    }

    public JPasswordField getPasswordField() {
        return passwordField;
    }
    
    private boolean clickable;

    public boolean isClickable() {
        return clickable;
    }

    public void setClickable(boolean clickable) {
        this.clickable = clickable;
    }
    
}
