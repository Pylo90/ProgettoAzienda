/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.AreaPersonale.CambiaPasswordControl;
import controller.AreaPersonale.FirmaControl;
import controller.Autenticazione.LoginControl;
import controller.AreaPersonale.OrariStipendiControl;
import controller.AreaPersonale.RichiesteControl;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import model.Utente;

/**
 *
 * @author dario
 */
public class HomepageImpiegato extends javax.swing.JFrame {

    private FirmaControl FirC;
    private RichiesteControl RicC;
    private OrariStipendiControl OSC;
    private LoginControl LC;
    private CambiaPasswordControl CPC;

    public HomepageImpiegato(String nome, String cognome, String matricola, String tel, String mail, ImageIcon propic, LoginControl logC) {
        Utente.setMatricola(matricola);
        initComponents();
        jLabel4.setVisible(false);
        Permesso.setVisible(false);
        Ferie.setVisible(false);
        CongedoParentale.setVisible(false);
        ComunicazioneMalattia.setVisible(false);
        setClickable(true);
        nameText.setText(nome + " " + cognome);
        idText.setText(matricola);
        mailText.setText(mail);
        phoneText.setText(tel);
        this.Propic.setIcon(propic);
        this.LC = logC;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BankButton = new javax.swing.JButton();
        ScheduleButton = new javax.swing.JButton();
        PasswordButton = new javax.swing.JButton();
        NotificationButton = new javax.swing.JButton();
        RequestButton = new javax.swing.JButton();
        Permesso = new javax.swing.JButton();
        Ferie = new javax.swing.JButton();
        ComunicazioneMalattia = new javax.swing.JButton();
        CongedoParentale = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        RequestButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        idText = new javax.swing.JTextField();
        nameText = new javax.swing.JTextField();
        LogoutButton = new javax.swing.JButton();
        mailText = new javax.swing.JTextField();
        phoneText = new javax.swing.JTextField();
        Cornice = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Propic = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 248, 238));
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 248, 238));
        jPanel1.setPreferredSize(new java.awt.Dimension(1920, 1080));
        jPanel1.setLayout(null);

        BankButton.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        BankButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BankButton.png"))); // NOI18N
        BankButton.setBorder(null);
        BankButton.setContentAreaFilled(false);
        BankButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BankButton.setIconTextGap(0);
        BankButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        BankButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BankButtonActionPerformed(evt);
            }
        });
        jPanel1.add(BankButton);
        BankButton.setBounds(50, 50, 100, 100);

        ScheduleButton.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        ScheduleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ScheduleButton.png"))); // NOI18N
        ScheduleButton.setBorder(null);
        ScheduleButton.setContentAreaFilled(false);
        ScheduleButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ScheduleButton.setIconTextGap(0);
        ScheduleButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        ScheduleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ScheduleButtonActionPerformed(evt);
            }
        });
        jPanel1.add(ScheduleButton);
        ScheduleButton.setBounds(50, 170, 100, 100);

        PasswordButton.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        PasswordButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PasswordButton.png"))); // NOI18N
        PasswordButton.setBorder(null);
        PasswordButton.setContentAreaFilled(false);
        PasswordButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PasswordButton.setIconTextGap(0);
        PasswordButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        PasswordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordButtonActionPerformed(evt);
            }
        });
        jPanel1.add(PasswordButton);
        PasswordButton.setBounds(50, 290, 100, 100);

        NotificationButton.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        NotificationButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NotificationButton.png"))); // NOI18N
        NotificationButton.setBorder(null);
        NotificationButton.setContentAreaFilled(false);
        NotificationButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        NotificationButton.setIconTextGap(0);
        NotificationButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        NotificationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NotificationButtonActionPerformed(evt);
            }
        });
        jPanel1.add(NotificationButton);
        NotificationButton.setBounds(50, 410, 100, 100);

        RequestButton.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        RequestButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RequestIcon.png"))); // NOI18N
        RequestButton.setBorder(null);
        RequestButton.setContentAreaFilled(false);
        RequestButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        RequestButton.setIconTextGap(0);
        RequestButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        RequestButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RequestButtonActionPerformed(evt);
            }
        });
        jPanel1.add(RequestButton);
        RequestButton.setBounds(50, 530, 100, 100);

        Permesso.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        Permesso.setForeground(new java.awt.Color(255, 255, 255));
        Permesso.setText("Permesso");
        Permesso.setAlignmentY(0.0F);
        Permesso.setBorder(null);
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
        jPanel1.add(Permesso);
        Permesso.setBounds(223, 19, 177, 60);

        Ferie.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        Ferie.setForeground(new java.awt.Color(255, 255, 255));
        Ferie.setText("Ferie");
        Ferie.setAlignmentY(0.0F);
        Ferie.setBorder(null);
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
        jPanel1.add(Ferie);
        Ferie.setBounds(223, 72, 177, 60);

        ComunicazioneMalattia.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        ComunicazioneMalattia.setForeground(new java.awt.Color(255, 255, 255));
        ComunicazioneMalattia.setText("Comunicazione Malattia");
        ComunicazioneMalattia.setAlignmentY(0.0F);
        ComunicazioneMalattia.setBorder(null);
        ComunicazioneMalattia.setBorderPainted(false);
        ComunicazioneMalattia.setContentAreaFilled(false);
        ComunicazioneMalattia.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ComunicazioneMalattia.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        ComunicazioneMalattia.setIconTextGap(0);
        ComunicazioneMalattia.setMargin(new java.awt.Insets(0, 0, 0, 0));
        ComunicazioneMalattia.setMaximumSize(new java.awt.Dimension(177, 55));
        ComunicazioneMalattia.setMinimumSize(new java.awt.Dimension(177, 55));
        ComunicazioneMalattia.setPreferredSize(new java.awt.Dimension(177, 55));
        ComunicazioneMalattia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComunicazioneMalattiaActionPerformed(evt);
            }
        });
        jPanel1.add(ComunicazioneMalattia);
        ComunicazioneMalattia.setBounds(223, 178, 370, 60);

        CongedoParentale.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        CongedoParentale.setForeground(new java.awt.Color(255, 255, 255));
        CongedoParentale.setText("Congedo Parentale");
        CongedoParentale.setAlignmentY(0.0F);
        CongedoParentale.setBorder(null);
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
        jPanel1.add(CongedoParentale);
        CongedoParentale.setBounds(223, 125, 340, 60);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SecondaCostinaHomepageImpiegato.png"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(200, 0, 450, 270);

        RequestButton1.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        RequestButton1.setForeground(new java.awt.Color(255, 255, 255));
        RequestButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RitardoCostina.png"))); // NOI18N
        RequestButton1.setText("FIRMA RITARDO");
        RequestButton1.setBorder(null);
        RequestButton1.setContentAreaFilled(false);
        RequestButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        RequestButton1.setIconTextGap(0);
        RequestButton1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        RequestButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RequestButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(RequestButton1);
        RequestButton1.setBounds(0, 942, 350, 100);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("ID :");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(860, 740, 53, 48);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MailIcon.png"))); // NOI18N
        jLabel12.setText(":");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(850, 800, 60, 48);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PhoneIcon.png"))); // NOI18N
        jLabel13.setText(":");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(850, 860, 60, 48);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PersonIcon.png"))); // NOI18N
        jLabel8.setText(":");
        jLabel8.setToolTipText("");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(850, 680, 60, 48);

        idText.setBackground(new java.awt.Color(255, 248, 238));
        idText.setFont(new java.awt.Font("Segoe UI", 0, 40)); // NOI18N
        idText.setForeground(new java.awt.Color(0, 0, 0));
        idText.setText(" Lorem ipsum dolor sit gravida.");
        idText.setBorder(null);
        idText.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        idText.setFocusable(false);
        jPanel1.add(idText);
        idText.setBounds(930, 740, 550, 54);

        nameText.setBackground(new java.awt.Color(255, 248, 238));
        nameText.setFont(new java.awt.Font("Segoe UI", 0, 40)); // NOI18N
        nameText.setForeground(new java.awt.Color(0, 0, 0));
        nameText.setText(" Lorem ipsum dolor sit gravida.");
        nameText.setBorder(null);
        nameText.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        nameText.setFocusable(false);
        jPanel1.add(nameText);
        nameText.setBounds(930, 680, 550, 54);

        LogoutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LogoutIcon.png"))); // NOI18N
        LogoutButton.setBorder(null);
        LogoutButton.setContentAreaFilled(false);
        LogoutButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutButtonActionPerformed(evt);
            }
        });
        jPanel1.add(LogoutButton);
        LogoutButton.setBounds(1300, 570, 75, 75);

        mailText.setBackground(new java.awt.Color(255, 248, 238));
        mailText.setFont(new java.awt.Font("Segoe UI", 0, 40)); // NOI18N
        mailText.setForeground(new java.awt.Color(0, 0, 0));
        mailText.setText(" Lorem ipsum dolor sit gravida.");
        mailText.setBorder(null);
        mailText.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mailText.setFocusable(false);
        jPanel1.add(mailText);
        mailText.setBounds(930, 800, 550, 54);

        phoneText.setBackground(new java.awt.Color(255, 248, 238));
        phoneText.setFont(new java.awt.Font("Segoe UI", 0, 40)); // NOI18N
        phoneText.setForeground(new java.awt.Color(0, 0, 0));
        phoneText.setText(" Lorem ipsum dolor sit gravida.");
        phoneText.setBorder(null);
        phoneText.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        phoneText.setFocusable(false);
        jPanel1.add(phoneText);
        phoneText.setBounds(930, 860, 550, 54);

        Cornice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cornice.png"))); // NOI18N
        jPanel1.add(Cornice);
        Cornice.setBounds(880, 165, 460, 460);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CostinaImpiegato.png"))); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(0, -10, 200, 690);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CostinaNomeAzienda.png"))); // NOI18N
        jLabel5.setText("AKKIKUSHI");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel5);
        jLabel5.setBounds(1580, 0, 340, 55);

        Propic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Propic.png"))); // NOI18N
        jPanel1.add(Propic);
        Propic.setBounds(880, 165, 460, 460);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1920, 1080);

        setBounds(0, 0, 1920, 1080);
    }// </editor-fold>//GEN-END:initComponents

    private void BankButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BankButtonActionPerformed
        // TODO add your handling code here:
        if (isClickable()) {
            OSC = new OrariStipendiControl();
            OSC.ConsultaStipendioButtonPressed(this);
        }
    }//GEN-LAST:event_BankButtonActionPerformed

    private void ScheduleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ScheduleButtonActionPerformed
        // TODO add your handling code here:
        if (isClickable()) {
            OSC = new OrariStipendiControl();
            OSC.ConsultaOrarioButtonPressed(this);
        }
    }//GEN-LAST:event_ScheduleButtonActionPerformed

    private void PasswordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordButtonActionPerformed
        // TODO add your handling code here:
        if (isClickable()) {
            CPC = new CambiaPasswordControl();
            CPC.CPButtonPressed(this);
        }

    }//GEN-LAST:event_PasswordButtonActionPerformed

    private void NotificationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NotificationButtonActionPerformed
        // TODO add your handling code here:
        if (isClickable()) {
            RicC = new RichiesteControl();
            RicC.ConsultazioneListaRichiesteButtonPressed(this);
        }
    }//GEN-LAST:event_NotificationButtonActionPerformed

    private void RequestButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RequestButtonActionPerformed
        // TODO add your handling code here:
        if (isClickable()) {
            RicC = new RichiesteControl();
            RicC.MostraRichiesteButtonPressed(this);
        }
    }//GEN-LAST:event_RequestButtonActionPerformed

    private void RequestButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RequestButton1ActionPerformed
        // TODO add your handling code here:
        if (isClickable()) {
            FirC = new FirmaControl();
            FirC.firmaRitardoButtonPressed(this);
        }

    }//GEN-LAST:event_RequestButton1ActionPerformed

    private void PermessoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PermessoActionPerformed
        // TODO add your handling code here:
        if (isClickable()) {
            RicC = new RichiesteControl();
            RicC.RichiestaPermessoButtonPressed(this);
        }
    }//GEN-LAST:event_PermessoActionPerformed

    private void FerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FerieActionPerformed
        // TODO add your handling code here:
        if (isClickable()) {
            RicC = new RichiesteControl();
            RicC.RichiestaFerieButtonPressed(this);
        }
    }//GEN-LAST:event_FerieActionPerformed

    private void CongedoParentaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CongedoParentaleActionPerformed
        // TODO add your handling code here:
        if (isClickable()) {
            RicC = new RichiesteControl();
            RicC.RichiestaCongedoParentaleButtonPressed(this);
        }
    }//GEN-LAST:event_CongedoParentaleActionPerformed

    private void LogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutButtonActionPerformed
        if (isClickable()) {
            if (LC != null) {
                LC.DisposeWindow(this);
            } else {
                this.dispose();
            }
        }
    }//GEN-LAST:event_LogoutButtonActionPerformed

    private void ComunicazioneMalattiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComunicazioneMalattiaActionPerformed
        if (isClickable()) {
            RicC = new RichiesteControl();
            RicC.ComunicazioneMalattiaButtonPressed(this);
        }
    }//GEN-LAST:event_ComunicazioneMalattiaActionPerformed

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
                new HomepageImpiegato("mar", "mar", "300001", "8", "darioromano212@gmail.com", null, null).setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BankButton;
    private javax.swing.JButton ComunicazioneMalattia;
    private javax.swing.JButton CongedoParentale;
    private javax.swing.JLabel Cornice;
    private javax.swing.JButton Ferie;
    private javax.swing.JButton LogoutButton;
    private javax.swing.JButton NotificationButton;
    private javax.swing.JButton PasswordButton;
    private javax.swing.JButton Permesso;
    private javax.swing.JLabel Propic;
    private javax.swing.JButton RequestButton;
    private javax.swing.JButton RequestButton1;
    private javax.swing.JButton ScheduleButton;
    private javax.swing.JTextField idText;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField mailText;
    private javax.swing.JTextField nameText;
    private javax.swing.JTextField phoneText;
    // End of variables declaration//GEN-END:variables

//    private CambiaPasswordControl CPC = new CambiaPasswordControl();
    private boolean clickable;

    public boolean isClickable() {
        return clickable;
    }

    public void setClickable(boolean clickable) {
        this.clickable = clickable;
    }

    public JButton getCongedoParentale() {
        return CongedoParentale;
    }

    public JButton getFerie() {
        return Ferie;
    }

    public JButton getPermesso() {
        return Permesso;
    }

    public JLabel getjLabel4() {
        return jLabel4;
    }

    public JButton getComunicazioneMalattia() {
        return ComunicazioneMalattia;
    }

}
