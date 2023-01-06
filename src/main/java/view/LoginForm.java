/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package view;

import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import controller.LoginControl;
import java.awt.Font;
import java.awt.font.TextAttribute;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author Davide
 */
public class LoginForm extends javax.swing.JFrame {
    LoginControl lc;
    
    public LoginForm(LoginControl lc) {
        initComponents();
        this.lc = lc;
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
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextPane5 = new javax.swing.JTextPane();
        jPanel3 = new javax.swing.JPanel();
        emailField1 = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextPane6 = new javax.swing.JTextPane();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextPane7 = new javax.swing.JTextPane();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextPane8 = new javax.swing.JTextPane();
        matricolaField1 = new javax.swing.JTextField();
        passwordField1 = new javax.swing.JPasswordField();
        confermaButton1 = new javax.swing.JButton();
        forgotButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 248, 238));
        setBounds(new java.awt.Rectangle(0, 0, 1920, 1080));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.orange);
        setMinimumSize(new java.awt.Dimension(800, 600));
        setUndecorated(true);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setBackground(new java.awt.Color(255, 248, 238));
        jPanel1.setPreferredSize(new java.awt.Dimension(1920, 1080));

        jScrollPane5.setBackground(new java.awt.Color(255, 248, 238));
        jScrollPane5.setBorder(null);

        jTextPane5.setEditable(false);
        jTextPane5.setBackground(new java.awt.Color(255, 248, 238));
        jTextPane5.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jTextPane5.setText("Benvenuto!");
        jTextPane5.setFocusable(false);
        jScrollPane5.setViewportView(jTextPane5);

        jPanel3.setBackground(new java.awt.Color(255, 248, 238));
        jPanel3.setPreferredSize(new java.awt.Dimension(911, 245));

        emailField1.setBackground(new java.awt.Color(219, 213, 205));
        emailField1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        emailField1.setToolTipText("");
        emailField1.setBorder(null);

        jScrollPane6.setBackground(new java.awt.Color(60, 63, 65));
        jScrollPane6.setBorder(null);

        jTextPane6.setEditable(false);
        jTextPane6.setBackground(new java.awt.Color(255, 248, 238));
        jTextPane6.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jTextPane6.setText("E-Mail:");
        jTextPane6.setDoubleBuffered(true);
        jTextPane6.setFocusable(false);
        jScrollPane6.setViewportView(jTextPane6);

        jScrollPane7.setBackground(new java.awt.Color(60, 63, 65));
        jScrollPane7.setBorder(null);

        jTextPane7.setEditable(false);
        jTextPane7.setBackground(new java.awt.Color(255, 248, 238));
        jTextPane7.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jTextPane7.setText("Password:");
        jTextPane7.setFocusable(false);
        jScrollPane7.setViewportView(jTextPane7);

        jScrollPane8.setBackground(new java.awt.Color(60, 63, 65));
        jScrollPane8.setBorder(null);

        jTextPane8.setEditable(false);
        jTextPane8.setBackground(new java.awt.Color(255, 248, 238));
        jTextPane8.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jTextPane8.setText("Matricola:");
        jTextPane8.setFocusable(false);
        jScrollPane8.setViewportView(jTextPane8);

        matricolaField1.setBackground(new java.awt.Color(219, 213, 205));
        matricolaField1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        matricolaField1.setBorder(null);

        passwordField1.setBackground(new java.awt.Color(219, 213, 205));
        passwordField1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        passwordField1.setBorder(null);
        passwordField1.setPreferredSize(new java.awt.Dimension(116, 32));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(matricolaField1)
                    .addComponent(emailField1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passwordField1, javax.swing.GroupLayout.DEFAULT_SIZE, 663, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane6)
                    .addComponent(emailField1))
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane7)
                    .addComponent(passwordField1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane8)
                    .addComponent(matricolaField1))
                .addGap(8, 8, 8))
        );

        confermaButton1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        confermaButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LivRed.png"))); // NOI18N
        confermaButton1.setText("Conferma");
        confermaButton1.setBorderPainted(false);
        confermaButton1.setContentAreaFilled(false);
        confermaButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        confermaButton1.setFocusable(false);
        confermaButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        confermaButton1.setMaximumSize(new java.awt.Dimension(3, 161));
        confermaButton1.setPreferredSize(new java.awt.Dimension(300, 77));
        confermaButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/LivRed-selected.png"))); // NOI18N
        confermaButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confermaButton1ActionPerformed(evt);
            }
        });

        forgotButton1.setBackground(new java.awt.Color(255, 248, 238));
        forgotButton1.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        forgotButton1.setText("Hai dimenticato la password?");
        forgotButton1.setBorder(null);
        forgotButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        forgotButton1.setFocusPainted(false);
        forgotButton1.setFocusable(false);
        forgotButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forgotButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(329, 329, 329)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(305, 305, 305)
                            .addComponent(confermaButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(339, 339, 339)
                            .addComponent(forgotButton1)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(135, 135, 135)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(27, 27, 27)
                    .addComponent(confermaButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(15, 15, 15)
                    .addComponent(forgotButton1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel1, new java.awt.GridBagConstraints());

        setBounds(0, 0, 1920, 1080);
    }// </editor-fold>//GEN-END:initComponents

    private void confermaButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confermaButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confermaButton1ActionPerformed

    private void forgotButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forgotButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_forgotButton1ActionPerformed

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
    private javax.swing.JButton confermaButton1;
    private javax.swing.JTextField emailField1;
    private javax.swing.JButton forgotButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTextPane jTextPane5;
    private javax.swing.JTextPane jTextPane6;
    private javax.swing.JTextPane jTextPane7;
    private javax.swing.JTextPane jTextPane8;
    private javax.swing.JTextField matricolaField1;
    private javax.swing.JPasswordField passwordField1;
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

    
}