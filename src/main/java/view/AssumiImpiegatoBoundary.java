package view;

import controller.GestionePersonale.AssumiLicenziaControl;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import misc.MailSender;
import model.Utente;

public class AssumiImpiegatoBoundary extends javax.swing.JFrame {
    public ButtonGroup getButtonGroup1() {
        return buttonGroup1;
    }
    
    InputStream in;
    String path;

    public AssumiImpiegatoBoundary(AssumiLicenziaControl ALC) {
        this.ALC = ALC;
        initComponents();
        in = null;
        this.setVisible(true);
        this.setAlwaysOnTop(true);
    }

    ImageIcon foto;
    FileFilter imageFilter = new FileNameExtensionFilter("Image files", ImageIO.getReaderFileSuffixes());

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        ConfirmButton = new javax.swing.JButton();
        homeButton = new javax.swing.JButton();
        AssumiImpiegatoLabel = new javax.swing.JLabel();
        LivelloLabel = new javax.swing.JLabel();
        CFLabel = new javax.swing.JLabel();
        NTelefonicoLabel = new javax.swing.JLabel();
        MailLabel = new javax.swing.JLabel();
        CognomeLabel = new javax.swing.JLabel();
        NomeLabel = new javax.swing.JLabel();
        CorniceLabel = new javax.swing.JLabel();
        CostinaHome = new javax.swing.JLabel();
        LivelloComboBox = new javax.swing.JComboBox<>();
        CFTextField = new javax.swing.JTextField();
        NTelefonicoTextField = new javax.swing.JTextField();
        MailTextField = new javax.swing.JTextField();
        CognomeTextField = new javax.swing.JTextField();
        NomeTextField = new javax.swing.JTextField();
        FotoButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 248, 238));
        jPanel1.setLayout(null);

        ConfirmButton.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        ConfirmButton.setForeground(new java.awt.Color(255, 255, 255));
        ConfirmButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ConfirmButton.png"))); // NOI18N
        ConfirmButton.setText("Conferma");
        ConfirmButton.setAlignmentY(0.0F);
        ConfirmButton.setBorder(null);
        ConfirmButton.setBorderPainted(false);
        buttonGroup1.add(ConfirmButton);
        ConfirmButton.setContentAreaFilled(false);
        ConfirmButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ConfirmButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ConfirmButton.setIconTextGap(0);
        ConfirmButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        ConfirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmButtonActionPerformed(evt);
            }
        });
        jPanel1.add(ConfirmButton);
        ConfirmButton.setBounds(1330, 710, 195, 50);

        homeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeButton.png"))); // NOI18N
        homeButton.setBorder(null);
        homeButton.setBorderPainted(false);
        buttonGroup1.add(homeButton);
        homeButton.setContentAreaFilled(false);
        homeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        homeButton.setFocusPainted(false);
        homeButton.setFocusable(false);
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });
        jPanel1.add(homeButton);
        homeButton.setBounds(40, 40, 100, 100);

        AssumiImpiegatoLabel.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        AssumiImpiegatoLabel.setForeground(new java.awt.Color(0, 0, 0));
        AssumiImpiegatoLabel.setText("Assumi Impiegato");
        jPanel1.add(AssumiImpiegatoLabel);
        AssumiImpiegatoLabel.setBounds(280, 60, 517, 87);

        LivelloLabel.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        LivelloLabel.setForeground(new java.awt.Color(0, 0, 0));
        LivelloLabel.setText("Livello");
        jPanel1.add(LivelloLabel);
        LivelloLabel.setBounds(881, 432, 135, 64);

        CFLabel.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        CFLabel.setForeground(new java.awt.Color(0, 0, 0));
        CFLabel.setText("CF");
        jPanel1.add(CFLabel);
        CFLabel.setBounds(881, 614, 53, 64);

        NTelefonicoLabel.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        NTelefonicoLabel.setForeground(new java.awt.Color(0, 0, 0));
        NTelefonicoLabel.setText("N. Telefonico");
        jPanel1.add(NTelefonicoLabel);
        NTelefonicoLabel.setBounds(174, 705, 278, 64);

        MailLabel.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        MailLabel.setForeground(new java.awt.Color(0, 0, 0));
        MailLabel.setText("Mail");
        jPanel1.add(MailLabel);
        MailLabel.setBounds(174, 614, 91, 64);

        CognomeLabel.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        CognomeLabel.setForeground(new java.awt.Color(0, 0, 0));
        CognomeLabel.setText("Cognome");
        jPanel1.add(CognomeLabel);
        CognomeLabel.setBounds(174, 523, 207, 90);

        NomeLabel.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        NomeLabel.setForeground(new java.awt.Color(0, 0, 0));
        NomeLabel.setText("Nome");
        jPanel1.add(NomeLabel);
        NomeLabel.setBounds(174, 432, 140, 80);

        CorniceLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cornice400x400.png"))); // NOI18N
        CorniceLabel.setFocusable(false);
        jPanel1.add(CorniceLabel);
        CorniceLabel.setBounds(1350, 110, 400, 400);

        CostinaHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Angolo.png"))); // NOI18N
        jPanel1.add(CostinaHome);
        CostinaHome.setBounds(0, 0, 200, 195);

        LivelloComboBox.setBackground(new java.awt.Color(219, 213, 205));
        LivelloComboBox.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        LivelloComboBox.setForeground(new java.awt.Color(0, 0, 0));
        LivelloComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));
        LivelloComboBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        LivelloComboBox.setOpaque(true);
        LivelloComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LivelloComboBoxActionPerformed(evt);
            }
        });
        jPanel1.add(LivelloComboBox);
        LivelloComboBox.setBounds(1040, 440, 150, 70);

        CFTextField.setBackground(new java.awt.Color(219, 213, 205));
        CFTextField.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        CFTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CFTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(CFTextField);
        CFTextField.setBounds(960, 620, 571, 65);

        NTelefonicoTextField.setBackground(new java.awt.Color(219, 213, 205));
        NTelefonicoTextField.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        NTelefonicoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NTelefonicoTextFieldActionPerformed(evt);
            }
        });
        NTelefonicoTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                NTelefonicoTextFieldKeyPressed(evt);
            }
        });
        jPanel1.add(NTelefonicoTextField);
        NTelefonicoTextField.setBounds(470, 710, 350, 65);

        MailTextField.setBackground(new java.awt.Color(219, 213, 205));
        MailTextField.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        MailTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MailTextFieldActionPerformed(evt);
            }
        });
        MailTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                MailTextFieldKeyPressed(evt);
            }
        });
        jPanel1.add(MailTextField);
        MailTextField.setBounds(280, 620, 540, 65);

        CognomeTextField.setBackground(new java.awt.Color(219, 213, 205));
        CognomeTextField.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        CognomeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CognomeTextFieldActionPerformed(evt);
            }
        });
        CognomeTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CognomeTextFieldKeyPressed(evt);
            }
        });
        jPanel1.add(CognomeTextField);
        CognomeTextField.setBounds(400, 540, 420, 65);

        NomeTextField.setBackground(new java.awt.Color(219, 213, 205));
        NomeTextField.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        NomeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomeTextFieldActionPerformed(evt);
            }
        });
        NomeTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                NomeTextFieldKeyPressed(evt);
            }
        });
        jPanel1.add(NomeTextField);
        NomeTextField.setBounds(320, 450, 500, 65);

        FotoButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Propic400x400.png"))); // NOI18N
        FotoButton.setBorder(null);
        FotoButton.setBorderPainted(false);
        buttonGroup1.add(FotoButton);
        FotoButton.setContentAreaFilled(false);
        FotoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FotoButtonActionPerformed(evt);
            }
        });
        jPanel1.add(FotoButton);
        FotoButton.setBounds(1350, 110, 400, 400);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1920, 1080);

        setBounds(0, 0, 1920, 1080);
    }// </editor-fold>//GEN-END:initComponents

    private void NomeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomeTextFieldActionPerformed
       
    }//GEN-LAST:event_NomeTextFieldActionPerformed

    private void LivelloComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LivelloComboBoxActionPerformed
        
    }//GEN-LAST:event_LivelloComboBoxActionPerformed

    private void CFTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CFTextFieldActionPerformed
        
    }//GEN-LAST:event_CFTextFieldActionPerformed

    private void ConfirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmButtonActionPerformed
        String name = NomeTextField.getText().trim();
        String surname = CognomeTextField.getText().trim();
        String mail = MailTextField.getText().trim();       //aggiungere verifica mail
        ALC.verifyMail(mail, this);
        String cf = CFTextField.getText().trim();
        String numero = NTelefonicoTextField.getText().trim();
        int livello = LivelloComboBox.getSelectedIndex() + 1;
        ALC.sendData(name, surname, mail, cf, foto, numero, livello, path);
        ALC.disposeWindow(this);
    }//GEN-LAST:event_ConfirmButtonActionPerformed

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed

        ALC.disposeWindow(this);
    }//GEN-LAST:event_homeButtonActionPerformed

    private void NTelefonicoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NTelefonicoTextFieldActionPerformed
        
    }//GEN-LAST:event_NTelefonicoTextFieldActionPerformed

    private void NTelefonicoTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NTelefonicoTextFieldKeyPressed
        String numero = NTelefonicoTextField.getText();
        int length = numero.length();
        char c = evt.getKeyChar();
        //controllo i numeri da 0 a 9
        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') {
            if (length < 10) {                                        //il numero non deve essere più lungo di 10 righe
                NTelefonicoTextField.setEditable(true);
            } else {
                NTelefonicoTextField.setEditable(false);
            }
        } else {
            if (evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode() == KeyEvent.VK_DELETE) { //non conta spazi e cancella nei 10 char
                NTelefonicoTextField.setEditable(true);
            } else {
                NTelefonicoTextField.setEditable(false);
            }
        }
    }//GEN-LAST:event_NTelefonicoTextFieldKeyPressed

    private void NomeTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NomeTextFieldKeyPressed
        char c = evt.getKeyChar();

        if (Character.isLetter(c) || Character.isWhitespace(c) || Character.isISOControl(c)) {
            NomeTextField.setEditable(true);
        } else
            NomeTextField.setEditable(false);
    }//GEN-LAST:event_NomeTextFieldKeyPressed

    private void CognomeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CognomeTextFieldActionPerformed

    }//GEN-LAST:event_CognomeTextFieldActionPerformed

    private void CognomeTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CognomeTextFieldKeyPressed
        char c = evt.getKeyChar();

        if (Character.isLetter(c) || Character.isWhitespace(c) || Character.isISOControl(c)) {
            CognomeTextField.setEditable(true);
        } else
            CognomeTextField.setEditable(false);
    }//GEN-LAST:event_CognomeTextFieldKeyPressed

    private void MailTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MailTextFieldKeyPressed
        char c = evt.getKeyChar();

        if (Character.isWhitespace(c)) {
            MailTextField.setEditable(false);
        } else
            MailTextField.setEditable(true);
    }//GEN-LAST:event_MailTextFieldKeyPressed

    private void MailTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MailTextFieldActionPerformed
        
    }//GEN-LAST:event_MailTextFieldActionPerformed

    private void FotoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FotoButtonActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.setFileFilter(imageFilter);
        //chooser.addChoosableFileFilter(new ImageFilter()); // alternativa che ha bisogno però della classe ausiliaria ImageFilter
        //chooser.setAcceptAllFileFilterUsed(false);
        chooser.showOpenDialog(this);
        File file = chooser.getSelectedFile();
        if (file != null) {
            path = file.getAbsolutePath();
            Image im = Toolkit.getDefaultToolkit().createImage(path);
            im = im.getScaledInstance(400, 400, Image.SCALE_SMOOTH);
            ImageIcon ic = new ImageIcon(im);

            try {
                in = new FileInputStream(path);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(AssumiImpiegatoBoundary.class.getName()).log(Level.SEVERE, null, ex);
            }
           FotoButton.setIcon(ic);
        }
    }//GEN-LAST:event_FotoButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AssumiImpiegatoBoundary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AssumiImpiegatoBoundary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AssumiImpiegatoBoundary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AssumiImpiegatoBoundary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
 /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AssumiImpiegatoBoundary().setVisible(true);
            }
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AssumiImpiegatoLabel;
    private javax.swing.JLabel CFLabel;
    private javax.swing.JTextField CFTextField;
    private javax.swing.JLabel CognomeLabel;
    private javax.swing.JTextField CognomeTextField;
    private javax.swing.JButton ConfirmButton;
    private javax.swing.JLabel CorniceLabel;
    private javax.swing.JLabel CostinaHome;
    private javax.swing.JButton FotoButton;
    private javax.swing.JComboBox<String> LivelloComboBox;
    private javax.swing.JLabel LivelloLabel;
    private javax.swing.JLabel MailLabel;
    private javax.swing.JTextField MailTextField;
    private javax.swing.JLabel NTelefonicoLabel;
    private javax.swing.JTextField NTelefonicoTextField;
    private javax.swing.JLabel NomeLabel;
    private javax.swing.JTextField NomeTextField;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton homeButton;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    AssumiLicenziaControl ALC;




}
