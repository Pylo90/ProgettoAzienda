package view;

import controller.GestionePersonale.AssumiLicenziaControl;
import controller.AreaPersonale.CambiaPasswordControl;
import controller.AreaPersonale.FirmaControl;
import controller.Autenticazione.LoginControl;
//import controller.MalattiaControl;
import controller.AreaPersonale.OrariStipendiControl;
import controller.AreaPersonale.RichiesteControl;
import javax.swing.ButtonGroup;
//import controller.StraordinariControl;
import javax.swing.ImageIcon;
import model.Utente;
import org.springframework.security.crypto.bcrypt.BCrypt;

public class HomepageDatore extends javax.swing.JFrame {
    public ButtonGroup getButtonGroup1() {
        return buttonGroup1;
    }
    /**
     * Creates new form HomepageDatore
     */
    private LoginControl LC;
    CambiaPasswordControl CPC;

    public HomepageDatore(String nome, String cognome, String matricola, String tel, String mail, ImageIcon propic, LoginControl logC) {
        Utente.setMatricola(matricola);
        initComponents();
        nameText.setText(nome + " " + cognome);
        idText.setText(matricola);
        mailText.setText(mail);
        phoneText.setText(tel);
        this.propic.setIcon(propic);
        LC = logC;
        System.out.println(BCrypt.hashpw("password", BCrypt.gensalt()));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        mainPanel = new javax.swing.JPanel();
        ImpScheduleButton = new javax.swing.JButton();
        ImpSalaryButton = new javax.swing.JButton();
        switchButton = new javax.swing.JButton();
        straordButton = new javax.swing.JButton();
        passwordButton = new javax.swing.JButton();
        straordButton1 = new javax.swing.JButton();
        notificationButton = new javax.swing.JButton();
        assumiButton = new javax.swing.JButton();
        licenziaButton = new javax.swing.JButton();
        LogoutButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Cornice = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        nameText = new javax.swing.JTextField();
        idText = new javax.swing.JTextField();
        mailText = new javax.swing.JTextField();
        phoneText = new javax.swing.JTextField();
        propic = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        mainPanel.setBackground(new java.awt.Color(255, 248, 238));
        mainPanel.setFocusable(false);
        mainPanel.setMinimumSize(new java.awt.Dimension(1024, 768));
        mainPanel.setPreferredSize(new java.awt.Dimension(1920, 1080));
        mainPanel.setLayout(null);

        ImpScheduleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OrariImpiegatoButton.png"))); // NOI18N
        ImpScheduleButton.setBorder(null);
        ImpScheduleButton.setBorderPainted(false);
        buttonGroup1.add(ImpScheduleButton);
        ImpScheduleButton.setContentAreaFilled(false);
        ImpScheduleButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ImpScheduleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImpScheduleButtonActionPerformed(evt);
            }
        });
        mainPanel.add(ImpScheduleButton);
        ImpScheduleButton.setBounds(1770, 220, 100, 100);

        ImpSalaryButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SalaryImpiegatoIcon.png"))); // NOI18N
        ImpSalaryButton.setBorder(null);
        ImpSalaryButton.setBorderPainted(false);
        buttonGroup1.add(ImpSalaryButton);
        ImpSalaryButton.setContentAreaFilled(false);
        ImpSalaryButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ImpSalaryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImpSalaryButtonActionPerformed(evt);
            }
        });
        mainPanel.add(ImpSalaryButton);
        ImpSalaryButton.setBounds(1770, 100, 100, 100);

        switchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SwitchButton.png"))); // NOI18N
        switchButton.setBorder(null);
        switchButton.setBorderPainted(false);
        buttonGroup1.add(switchButton);
        switchButton.setContentAreaFilled(false);
        switchButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        switchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                switchButtonActionPerformed(evt);
            }
        });
        mainPanel.add(switchButton);
        switchButton.setBounds(1770, 580, 100, 100);

        straordButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EditButton.png"))); // NOI18N
        straordButton.setBorder(null);
        straordButton.setBorderPainted(false);
        buttonGroup1.add(straordButton);
        straordButton.setContentAreaFilled(false);
        straordButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        straordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                straordButtonActionPerformed(evt);
            }
        });
        mainPanel.add(straordButton);
        straordButton.setBounds(1770, 700, 100, 100);

        passwordButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PasswordButton.png"))); // NOI18N
        passwordButton.setBorder(null);
        passwordButton.setBorderPainted(false);
        buttonGroup1.add(passwordButton);
        passwordButton.setContentAreaFilled(false);
        passwordButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        passwordButton.setFocusable(false);
        passwordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordButtonActionPerformed(evt);
            }
        });
        mainPanel.add(passwordButton);
        passwordButton.setBounds(1770, 340, 100, 100);

        straordButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RitardiImpiegatoButton.png"))); // NOI18N
        straordButton1.setBorder(null);
        straordButton1.setBorderPainted(false);
        buttonGroup1.add(straordButton1);
        straordButton1.setContentAreaFilled(false);
        straordButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        straordButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                straordButton1ActionPerformed(evt);
            }
        });
        mainPanel.add(straordButton1);
        straordButton1.setBounds(1770, 830, 100, 100);

        notificationButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NotificationButton.png"))); // NOI18N
        notificationButton.setBorder(null);
        notificationButton.setBorderPainted(false);
        buttonGroup1.add(notificationButton);
        notificationButton.setContentAreaFilled(false);
        notificationButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        notificationButton.setFocusable(false);
        notificationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notificationButtonActionPerformed(evt);
            }
        });
        mainPanel.add(notificationButton);
        notificationButton.setBounds(1770, 460, 100, 100);

        assumiButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AssumiButton.png"))); // NOI18N
        assumiButton.setBorder(null);
        assumiButton.setBorderPainted(false);
        buttonGroup1.add(assumiButton);
        assumiButton.setContentAreaFilled(false);
        assumiButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        assumiButton.setIconTextGap(0);
        assumiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assumiButtonActionPerformed(evt);
            }
        });
        mainPanel.add(assumiButton);
        assumiButton.setBounds(1580, 100, 100, 100);

        licenziaButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LicenziaButton.png"))); // NOI18N
        licenziaButton.setBorder(null);
        licenziaButton.setBorderPainted(false);
        buttonGroup1.add(licenziaButton);
        licenziaButton.setContentAreaFilled(false);
        licenziaButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        licenziaButton.setIconTextGap(0);
        licenziaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                licenziaButtonActionPerformed(evt);
            }
        });
        mainPanel.add(licenziaButton);
        licenziaButton.setBounds(1580, 220, 100, 100);

        LogoutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LogoutIcon.png"))); // NOI18N
        LogoutButton.setBorder(null);
        LogoutButton.setBorderPainted(false);
        buttonGroup1.add(LogoutButton);
        LogoutButton.setContentAreaFilled(false);
        LogoutButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutButtonActionPerformed(evt);
            }
        });
        mainPanel.add(LogoutButton);
        LogoutButton.setBounds(1300, 570, 75, 75);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CostinaNomeAzienda.png"))); // NOI18N
        jLabel4.setText("AKKIKUSHI");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mainPanel.add(jLabel4);
        jLabel4.setBounds(1580, 0, 340, 55);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CostinaDatore.png"))); // NOI18N
        mainPanel.add(jLabel5);
        jLabel5.setBounds(1720, -110, 200, 1080);

        Cornice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cornice.png"))); // NOI18N
        mainPanel.add(Cornice);
        Cornice.setBounds(880, 165, 460, 460);
        mainPanel.add(jLabel9);
        jLabel9.setBounds(0, 0, 0, 0);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PersonIcon.png"))); // NOI18N
        jLabel8.setText(":");
        jLabel8.setToolTipText("");
        mainPanel.add(jLabel8);
        jLabel8.setBounds(850, 680, 60, 48);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("ID :");
        mainPanel.add(jLabel11);
        jLabel11.setBounds(860, 740, 53, 48);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MailIcon.png"))); // NOI18N
        jLabel12.setText(":");
        mainPanel.add(jLabel12);
        jLabel12.setBounds(850, 800, 60, 48);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PhoneIcon.png"))); // NOI18N
        jLabel13.setText(":");
        mainPanel.add(jLabel13);
        jLabel13.setBounds(850, 860, 60, 48);

        nameText.setBackground(new java.awt.Color(255, 248, 238));
        nameText.setFont(new java.awt.Font("Segoe UI", 0, 40)); // NOI18N
        nameText.setForeground(new java.awt.Color(0, 0, 0));
        nameText.setText(" Lorem ipsum dolor sit gravida.");
        nameText.setBorder(null);
        nameText.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        nameText.setFocusable(false);
        mainPanel.add(nameText);
        nameText.setBounds(930, 680, 550, 54);

        idText.setBackground(new java.awt.Color(255, 248, 238));
        idText.setFont(new java.awt.Font("Segoe UI", 0, 40)); // NOI18N
        idText.setForeground(new java.awt.Color(0, 0, 0));
        idText.setText(" Lorem ipsum dolor sit gravida.");
        idText.setBorder(null);
        idText.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        idText.setFocusable(false);
        mainPanel.add(idText);
        idText.setBounds(930, 740, 550, 54);

        mailText.setBackground(new java.awt.Color(255, 248, 238));
        mailText.setFont(new java.awt.Font("Segoe UI", 0, 40)); // NOI18N
        mailText.setForeground(new java.awt.Color(0, 0, 0));
        mailText.setText(" Lorem ipsum dolor sit gravida.");
        mailText.setBorder(null);
        mailText.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mailText.setFocusable(false);
        mainPanel.add(mailText);
        mailText.setBounds(930, 800, 550, 54);

        phoneText.setBackground(new java.awt.Color(255, 248, 238));
        phoneText.setFont(new java.awt.Font("Segoe UI", 0, 40)); // NOI18N
        phoneText.setForeground(new java.awt.Color(0, 0, 0));
        phoneText.setText(" Lorem ipsum dolor sit gravida.");
        phoneText.setBorder(null);
        phoneText.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        phoneText.setFocusable(false);
        mainPanel.add(phoneText);
        phoneText.setBounds(930, 860, 550, 54);

        propic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Propic.png"))); // NOI18N
        mainPanel.add(propic);
        propic.setBounds(880, 165, 460, 460);

        jPanel1.add(mainPanel);
        mainPanel.setBounds(0, 0, 1920, 1080);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1920, 1080);

        setBounds(0, 0, 1920, 1080);
    }// </editor-fold>//GEN-END:initComponents

    private void ImpSalaryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImpSalaryButtonActionPerformed
        // TODO add your handling code here:
            OSC.ConsultaStipendiImpiegatiButtonPressed(this);
    }//GEN-LAST:event_ImpSalaryButtonActionPerformed
    
    private void ImpScheduleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImpScheduleButtonActionPerformed
        // TODO add your handling code here:
            OSC.ConsultaOrariImpiegatiButtonPressed(this);
    }//GEN-LAST:event_ImpScheduleButtonActionPerformed
    
    private void switchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_switchButtonActionPerformed
        // TODO add your handling code here:
            RC.ScambiaOrariButtonPressed(this);
    }//GEN-LAST:event_switchButtonActionPerformed

    private void assumiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assumiButtonActionPerformed
        // TODO add your handling code here:
            ALC.assumiImpiegatoButtonPressed(this);
    }//GEN-LAST:event_assumiButtonActionPerformed
    
    private void licenziaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_licenziaButtonActionPerformed
        // TODO add your handling code here:
            ALC.licenziaImpiegatoButtonPressed(this);
    }//GEN-LAST:event_licenziaButtonActionPerformed
    
    private void LogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutButtonActionPerformed
            LC.DisposeWindow(this);
    }//GEN-LAST:event_LogoutButtonActionPerformed

    private void passwordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordButtonActionPerformed
        // TODO add your handling code here:
            CPC = new CambiaPasswordControl();
            CPC.CPButtonPressed(this);
    }//GEN-LAST:event_passwordButtonActionPerformed

    private void notificationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notificationButtonActionPerformed
            RC.ConsultazioneListaRichiesteButtonPressed(this);
    }//GEN-LAST:event_notificationButtonActionPerformed

    private void straordButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_straordButton1ActionPerformed
            OSC.consultazioneRitardiImpiegatiButtonPressed(this);
    }//GEN-LAST:event_straordButton1ActionPerformed

    private void straordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_straordButtonActionPerformed
        // TODO add your handling code here:
            ALC.ModificaInfoImpiegatoButtonPressed(this);
    }//GEN-LAST:event_straordButtonActionPerformed

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
            java.util.logging.Logger.getLogger(HomepageDatore.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomepageDatore.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomepageDatore.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomepageDatore.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new HomepageDatore(null, null, "000000", null, null, null, null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cornice;
    private javax.swing.JButton ImpSalaryButton;
    private javax.swing.JButton ImpScheduleButton;
    private javax.swing.JButton LogoutButton;
    private javax.swing.JButton assumiButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField idText;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton licenziaButton;
    private javax.swing.JTextField mailText;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTextField nameText;
    private javax.swing.JButton notificationButton;
    private javax.swing.JButton passwordButton;
    private javax.swing.JTextField phoneText;
    private javax.swing.JLabel propic;
    private javax.swing.JButton straordButton;
    private javax.swing.JButton straordButton1;
    private javax.swing.JButton switchButton;
    // End of variables declaration//GEN-END:variables

    private AssumiLicenziaControl ALC = new AssumiLicenziaControl();
    private OrariStipendiControl OSC = new OrariStipendiControl();
    private RichiesteControl RC = new RichiesteControl();

}
