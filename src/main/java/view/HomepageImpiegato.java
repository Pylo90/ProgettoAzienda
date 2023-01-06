/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.*;

/**
 *
 * @author dario
 */
public class HomepageImpiegato extends javax.swing.JFrame {

    /**
     * Creates new form FirmaBoundary
     */
    public HomepageImpiegato() {
        initComponents();
        jLabel4.setVisible(false);
        Permesso.setVisible(false);
        Ferie.setVisible(false);
        CongedoParentale.setVisible(false);
        setClickable(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BankButton = new javax.swing.JButton();
        ScheduleButton = new javax.swing.JButton();
        PasswordButton = new javax.swing.JButton();
        NotificationButton = new javax.swing.JButton();
        RequestButton = new javax.swing.JButton();
        Permesso = new javax.swing.JButton();
        Ferie = new javax.swing.JButton();
        CongedoParentale = new javax.swing.JButton();
        RequestButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        RequestButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        PersonLabel = new javax.swing.JLabel();
        MailLabel = new javax.swing.JLabel();
        PhoneLabel = new javax.swing.JLabel();
        MailText = new javax.swing.JLabel();
        NomeText = new javax.swing.JLabel();
        MatricolaText = new javax.swing.JLabel();
        PhoneText = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 248, 238));
        setUndecorated(true);
        getContentPane().setLayout(null);

        BankButton.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        BankButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BankButton.png"))); // NOI18N
        BankButton.setContentAreaFilled(false);
        BankButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BankButton.setIconTextGap(0);
        BankButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        BankButton.setPreferredSize(new java.awt.Dimension(100, 100));
        BankButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BankButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BankButton);
        BankButton.setBounds(50, 50, 100, 100);

        ScheduleButton.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        ScheduleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ScheduleButton.png"))); // NOI18N
        ScheduleButton.setContentAreaFilled(false);
        ScheduleButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ScheduleButton.setIconTextGap(0);
        ScheduleButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        ScheduleButton.setPreferredSize(new java.awt.Dimension(100, 100));
        ScheduleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ScheduleButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ScheduleButton);
        ScheduleButton.setBounds(50, 170, 100, 100);

        PasswordButton.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        PasswordButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PasswordButton.png"))); // NOI18N
        PasswordButton.setContentAreaFilled(false);
        PasswordButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PasswordButton.setIconTextGap(0);
        PasswordButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        PasswordButton.setPreferredSize(new java.awt.Dimension(100, 100));
        PasswordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordButtonActionPerformed(evt);
            }
        });
        getContentPane().add(PasswordButton);
        PasswordButton.setBounds(50, 290, 100, 100);

        NotificationButton.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        NotificationButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NotificationButton.png"))); // NOI18N
        NotificationButton.setContentAreaFilled(false);
        NotificationButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        NotificationButton.setIconTextGap(0);
        NotificationButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        NotificationButton.setPreferredSize(new java.awt.Dimension(100, 100));
        NotificationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NotificationButtonActionPerformed(evt);
            }
        });
        getContentPane().add(NotificationButton);
        NotificationButton.setBounds(50, 410, 100, 100);

        RequestButton.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        RequestButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RequestIcon.png"))); // NOI18N
        RequestButton.setContentAreaFilled(false);
        RequestButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        RequestButton.setIconTextGap(0);
        RequestButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        RequestButton.setPreferredSize(new java.awt.Dimension(100, 100));
        RequestButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RequestButtonActionPerformed(evt);
            }
        });
        getContentPane().add(RequestButton);
        RequestButton.setBounds(50, 530, 100, 100);

        Permesso.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        Permesso.setForeground(new java.awt.Color(255, 255, 255));
        Permesso.setText("Permesso");
        Permesso.setAlignmentY(0.0F);
        Permesso.setBorderPainted(false);
        Permesso.setContentAreaFilled(false);
        Permesso.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Permesso.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Permesso.setIconTextGap(0);
        Permesso.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Permesso.setMaximumSize(new java.awt.Dimension(177, 55));
        Permesso.setMinimumSize(new java.awt.Dimension(177, 55));
        Permesso.setPreferredSize(new java.awt.Dimension(177, 55));
        Permesso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PermessoActionPerformed(evt);
            }
        });
        getContentPane().add(Permesso);
        Permesso.setBounds(223, 19, 177, 60);

        Ferie.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        Ferie.setForeground(new java.awt.Color(255, 255, 255));
        Ferie.setText("Ferie");
        Ferie.setAlignmentY(0.0F);
        Ferie.setBorderPainted(false);
        Ferie.setContentAreaFilled(false);
        Ferie.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Ferie.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Ferie.setIconTextGap(0);
        Ferie.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Ferie.setMaximumSize(new java.awt.Dimension(177, 55));
        Ferie.setMinimumSize(new java.awt.Dimension(177, 55));
        Ferie.setPreferredSize(new java.awt.Dimension(177, 55));
        Ferie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FerieActionPerformed(evt);
            }
        });
        getContentPane().add(Ferie);
        Ferie.setBounds(223, 72, 177, 60);

        CongedoParentale.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        CongedoParentale.setForeground(new java.awt.Color(255, 255, 255));
        CongedoParentale.setText("Congedo Parentale");
        CongedoParentale.setAlignmentY(0.0F);
        CongedoParentale.setBorderPainted(false);
        CongedoParentale.setContentAreaFilled(false);
        CongedoParentale.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        CongedoParentale.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        CongedoParentale.setIconTextGap(0);
        CongedoParentale.setMargin(new java.awt.Insets(0, 0, 0, 0));
        CongedoParentale.setMaximumSize(new java.awt.Dimension(177, 55));
        CongedoParentale.setMinimumSize(new java.awt.Dimension(177, 55));
        CongedoParentale.setPreferredSize(new java.awt.Dimension(177, 55));
        CongedoParentale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CongedoParentaleActionPerformed(evt);
            }
        });
        getContentPane().add(CongedoParentale);
        CongedoParentale.setBounds(223, 125, 340, 60);

        RequestButton3.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        RequestButton3.setForeground(new java.awt.Color(255, 255, 255));
        RequestButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LogoutIcon.png"))); // NOI18N
        RequestButton3.setAlignmentY(0.0F);
        RequestButton3.setBorderPainted(false);
        RequestButton3.setContentAreaFilled(false);
        RequestButton3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        RequestButton3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        RequestButton3.setIconTextGap(0);
        RequestButton3.setMargin(new java.awt.Insets(0, 0, 0, 0));
        RequestButton3.setMaximumSize(new java.awt.Dimension(177, 55));
        RequestButton3.setMinimumSize(new java.awt.Dimension(177, 55));
        RequestButton3.setPreferredSize(new java.awt.Dimension(177, 55));
        RequestButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RequestButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(RequestButton3);
        RequestButton3.setBounds(1304, 572, 60, 60);

        jPanel1.setBackground(new java.awt.Color(255, 248, 238));
        jPanel1.setPreferredSize(new java.awt.Dimension(1920, 1080));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/costinaHomepageImpiegato.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SecondaCostinaHomepageImpiegato.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 40)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/costinaDestra.png"))); // NOI18N
        jLabel5.setText("NOME AZIENDA");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        RequestButton1.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        RequestButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RitardoCostina.png"))); // NOI18N
        RequestButton1.setText("FIRMA RITARDO");
        RequestButton1.setContentAreaFilled(false);
        RequestButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        RequestButton1.setIconTextGap(0);
        RequestButton1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        RequestButton1.setPreferredSize(new java.awt.Dimension(350, 100));
        RequestButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RequestButton1ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alessandra.png"))); // NOI18N

        PersonLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PersonIcon.png"))); // NOI18N

        MailLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MailIcon.png"))); // NOI18N

        PhoneLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PhoneIcon.png"))); // NOI18N

        MailText.setFont(new java.awt.Font("Segoe UI", 0, 40)); // NOI18N
        MailText.setText(": mail");

        NomeText.setFont(new java.awt.Font("Segoe UI", 0, 40)); // NOI18N
        NomeText.setText(": Nome e Cognome");

        MatricolaText.setFont(new java.awt.Font("Segoe UI", 0, 40)); // NOI18N
        MatricolaText.setText(": Matricola");

        PhoneText.setFont(new java.awt.Font("Segoe UI", 0, 40)); // NOI18N
        PhoneText.setText(": mail");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(RequestButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(204, 204, 204))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(653, 653, 653)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(MailLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(PhoneLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(PersonLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(NomeText)
                                    .addComponent(MatricolaText)
                                    .addComponent(MailText)
                                    .addComponent(PhoneText))
                                .addGap(317, 317, 317)))))
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PersonLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NomeText))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(RequestButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(MailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(MatricolaText)
                                .addGap(0, 0, 0)
                                .addComponent(MailText)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PhoneText)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PhoneLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(187, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 678, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1920, 1080);

        setBounds(0, 0, 1920, 1080);
    }// </editor-fold>//GEN-END:initComponents

    private void BankButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BankButtonActionPerformed
        // TODO add your handling code here:
        if (isClickable()) {
            OSC.ConsultaStipendioButtonPressed(this);
        }
    }//GEN-LAST:event_BankButtonActionPerformed

    private void ScheduleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ScheduleButtonActionPerformed
        // TODO add your handling code here:
        if (isClickable()) {
            OSC.ConsultaOrarioButtonPressed(this);
        }
    }//GEN-LAST:event_ScheduleButtonActionPerformed

    private void PasswordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordButtonActionPerformed
        // TODO add your handling code here:
        if (isClickable()) {
            CPC.CPButtonPressed(this);
        }

    }//GEN-LAST:event_PasswordButtonActionPerformed

    private void NotificationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NotificationButtonActionPerformed
        // TODO add your handling code here:
        if (isClickable()){
            RicC.RichiesteButtonPressed(this);
        }
    }//GEN-LAST:event_NotificationButtonActionPerformed

    private void RequestButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RequestButtonActionPerformed
        // TODO add your handling code here:
        if (isClickable()) {
            if (!jLabel4.isVisible()) {
                jLabel4.setVisible(true);
                Permesso.setVisible(true);
                Ferie.setVisible(true);
                CongedoParentale.setVisible(true);
            } else {
                jLabel4.setVisible(false);
                Permesso.setVisible(false);
                Ferie.setVisible(false);
                CongedoParentale.setVisible(false);
            }
        }
    }//GEN-LAST:event_RequestButtonActionPerformed

    private void RequestButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RequestButton1ActionPerformed
        // TODO add your handling code here:
        if(isClickable()){
            FirC.firmaRitardoButtonPressed(this);
        }
        
    }//GEN-LAST:event_RequestButton1ActionPerformed

    private void PermessoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PermessoActionPerformed
        // TODO add your handling code here:
        if (isClickable()) {
            RicC.RichiestaPermessoButtonPressed(this);
        }
    }//GEN-LAST:event_PermessoActionPerformed

    private void FerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FerieActionPerformed
        // TODO add your handling code here:
        if (isClickable()) {
            RicC.RichiestaFerieButtonPressed(this);
        }
    }//GEN-LAST:event_FerieActionPerformed

    private void RequestButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RequestButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RequestButton3ActionPerformed

    private void CongedoParentaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CongedoParentaleActionPerformed
        // TODO add your handling code here:
        if (isClickable()) {
            RicC.RichiestaCongedoParentaleButtonPressed(this);
        }
    }//GEN-LAST:event_CongedoParentaleActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomepageImpiegato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomepageImpiegato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomepageImpiegato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomepageImpiegato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomepageImpiegato().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BankButton;
    private javax.swing.JButton CongedoParentale;
    private javax.swing.JButton Ferie;
    private javax.swing.JLabel MailLabel;
    private javax.swing.JLabel MailText;
    private javax.swing.JLabel MatricolaText;
    private javax.swing.JLabel NomeText;
    private javax.swing.JButton NotificationButton;
    private javax.swing.JButton PasswordButton;
    private javax.swing.JButton Permesso;
    private javax.swing.JLabel PersonLabel;
    private javax.swing.JLabel PhoneLabel;
    private javax.swing.JLabel PhoneText;
    private javax.swing.JButton RequestButton;
    private javax.swing.JButton RequestButton1;
    private javax.swing.JButton RequestButton3;
    private javax.swing.JButton ScheduleButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private CambiaPasswordControl CPC = new CambiaPasswordControl();
    private LoginControl AutC = new LoginControl();
    private FirmaControl FirC = new FirmaControl();
    private RichiesteControl RicC = new RichiesteControl();
    private OrariStipendiControl OSC = new OrariStipendiControl();
    private boolean clickable;

    public boolean isClickable() {
        return clickable;
    }

    public void setClickable(boolean clickable) {
        this.clickable = clickable;
    }

}
