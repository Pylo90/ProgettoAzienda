/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import com.mysql.cj.protocol.Resultset;
import controller.GestionePersonale.AssumiLicenziaControl;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import model.Utente;

/**
 *
 * @author Utente
 */
public class ModificaInfoImpiegato extends javax.swing.JFrame {

    /**
     * Creates new form ModificaInfoImpiegato
     */
    ResultSet r;
    InputStream in;
    String matricola = null;
    Image foto;
    ImageIcon oldPic;
    ImageIcon newPic;

    public ModificaInfoImpiegato(AssumiLicenziaControl ALC, ResultSet r) {
        this.ALC = ALC;
        initComponents();
        this.setVisible(true);
        this.setAlwaysOnTop(true);

        try {
            // TODO add your handling code here:
            if (r.next()) {
                matricola = r.getString("matricola");
                jTextField1.setText(r.getString("nome"));
                jTextField4.setText(r.getString("cognome"));
                jTextField5.setText(r.getString("email"));
                jTextField6.setText(r.getString("CF"));
                jTextField7.setText(r.getString("tel"));
                jComboBox1.setSelectedIndex(Integer.valueOf(r.getString("livello")) - 1);
                if (r.getBlob("propic") != null) {
                    byte[] propicBytes = r.getBytes("propic");
                    ImageIcon format = new ImageIcon(propicBytes);
                    foto = format.getImage();
                    Image foto2 = foto.getScaledInstance(400, 400, Image.SCALE_SMOOTH);
                    jButton2.setIcon(new ImageIcon(foto2));
                    oldPic = new ImageIcon(foto);

                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(ModificaInfoImpiegato.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    FileFilter imageFilter = new FileNameExtensionFilter("Image files", ImageIO.getReaderFileSuffixes());

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Cornice = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        ConfirmButton = new javax.swing.JButton();
        homeButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 248, 238));
        jPanel2.setLayout(null);
        jPanel2.add(Cornice);
        Cornice.setBounds(1350, 110, 400, 400);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Modifica Info Impiegato");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(280, 60, 517, 87);

        jComboBox1.setBackground(new java.awt.Color(219, 213, 205));
        jComboBox1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox1);
        jComboBox1.setBounds(1040, 440, 150, 70);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Livello");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(881, 432, 135, 64);

        jTextField6.setBackground(new java.awt.Color(219, 213, 205));
        jTextField6.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(0, 0, 0));
        jTextField6.setText("jTextField6");
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField6);
        jTextField6.setBounds(960, 620, 571, 65);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("CF");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(881, 614, 53, 64);

        jTextField7.setBackground(new java.awt.Color(219, 213, 205));
        jTextField7.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(0, 0, 0));
        jTextField7.setText("jTextField7");
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        jTextField7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField7KeyPressed(evt);
            }
        });
        jPanel2.add(jTextField7);
        jTextField7.setBounds(470, 710, 350, 65);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("N. Telefonico");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(174, 705, 278, 64);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Mail");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(174, 614, 91, 64);

        jTextField5.setBackground(new java.awt.Color(219, 213, 205));
        jTextField5.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(0, 0, 0));
        jTextField5.setText("jTextField5");
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField5KeyPressed(evt);
            }
        });
        jPanel2.add(jTextField5);
        jTextField5.setBounds(280, 620, 540, 65);

        jTextField4.setBackground(new java.awt.Color(219, 213, 205));
        jTextField4.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(0, 0, 0));
        jTextField4.setText("jTextField4");
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField4KeyPressed(evt);
            }
        });
        jPanel2.add(jTextField4);
        jTextField4.setBounds(400, 540, 420, 65);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Cognome");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(174, 523, 207, 90);

        jTextField1.setBackground(new java.awt.Color(219, 213, 205));
        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(0, 0, 0));
        jTextField1.setText("jTextField1");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });
        jPanel2.add(jTextField1);
        jTextField1.setBounds(320, 450, 500, 65);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nome");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(174, 432, 140, 80);

        ConfirmButton.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        ConfirmButton.setForeground(new java.awt.Color(255, 255, 255));
        ConfirmButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ConfirmButton.png"))); // NOI18N
        ConfirmButton.setText("Conferma");
        ConfirmButton.setAlignmentY(0.0F);
        ConfirmButton.setBorder(null);
        ConfirmButton.setBorderPainted(false);
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
        jPanel2.add(ConfirmButton);
        ConfirmButton.setBounds(1330, 710, 195, 50);

        homeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeButton.png"))); // NOI18N
        homeButton.setBorder(null);
        homeButton.setBorderPainted(false);
        homeButton.setContentAreaFilled(false);
        homeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        homeButton.setFocusPainted(false);
        homeButton.setFocusable(false);
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });
        jPanel2.add(homeButton);
        homeButton.setBounds(40, 40, 100, 100);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FotoButton.png"))); // NOI18N
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(1350, 110, 400, 400);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Angolo.png"))); // NOI18N
        jPanel2.add(jLabel11);
        jLabel11.setBounds(0, 0, 200, 195);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 1920, 1080);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1920, 1080);

        setBounds(0, 0, 1920, 1080);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        //
    }//GEN-LAST:event_jComboBox1ActionPerformed


    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        //
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        //
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void ConfirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmButtonActionPerformed

        String name = jTextField1.getText().trim();
        String surname = jTextField4.getText().trim();
        String mail = jTextField5.getText().trim();
        ALC.verifyMail(mail, this);
        String cf = jTextField6.getText().trim();
        //String passw = jTextField2.getText().trim();
        String numero = jTextField7.getText().trim();
        int livello = jComboBox1.getSelectedIndex();
        boolean updatePropic;
        if (newPic != null) {
            updatePropic = true;
        } else {
            updatePropic = false;
        }
        ALC.submitForm(name, surname, mail, cf, numero, livello,in, matricola, updatePropic);
        ALC.disposeWindow(this);
    }//GEN-LAST:event_ConfirmButtonActionPerformed

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        ALC.disposeWindow(this);
    }//GEN-LAST:event_homeButtonActionPerformed

    private void jTextField7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7KeyPressed
        // TODO add your handling code here:
        String numero = jTextField7.getText();
        int length = numero.length();
        char c = evt.getKeyChar();
        //controllo i numeri da 0 a 9
        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') {
            if (length < 10) {                                        //il numero non deve essere più lungo di 10 righe
                jTextField7.setEditable(true);
            } else {
                jTextField7.setEditable(false);
            }
        } else {
            if (evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode() == KeyEvent.VK_DELETE) { //non conta spazi e cancella nei 10 char
                jTextField7.setEditable(true);
            } else {
                jTextField7.setEditable(false);
            }
        }
    }//GEN-LAST:event_jTextField7KeyPressed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        //
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        //
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        //
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();

        if (Character.isLetter(c) || Character.isWhitespace(c) || Character.isISOControl(c)) {
            jTextField1.setEditable(true);
        } else
            jTextField1.setEditable(false);
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jTextField4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();

        if (Character.isLetter(c) || Character.isWhitespace(c) || Character.isISOControl(c)) {
            jTextField4.setEditable(true);
        } else
            jTextField4.setEditable(false);
    }//GEN-LAST:event_jTextField4KeyPressed

    private void jTextField5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();

        if (Character.isWhitespace(c)) {
            jTextField5.setEditable(false);
        } else
            jTextField5.setEditable(true);
    }//GEN-LAST:event_jTextField5KeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.setFileFilter(imageFilter);
        //chooser.addChoosableFileFilter(new ImageFilter()); // alternativa che ha bisogno però della classe ausiliaria ImageFilter
        //chooser.setAcceptAllFileFilterUsed(false);
        chooser.showOpenDialog(this);
        File file = chooser.getSelectedFile();
        if (file != null) {
            String path = file.getAbsolutePath();
            Image im = Toolkit.getDefaultToolkit().createImage(path);
            im = im.getScaledInstance(400, 400, Image.SCALE_SMOOTH);
            ImageIcon ic = new ImageIcon(im);

            try {
                in = new FileInputStream(path);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(AssumiImpiegatoBoundary.class.getName()).log(Level.SEVERE, null, ex);
            }
            jButton2.setIcon(ic);
            newPic = ic;
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(ModificaInfoImpiegato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificaInfoImpiegato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificaInfoImpiegato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificaInfoImpiegato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
 /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificaInfoImpiegato().setVisible(true);
            }
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ConfirmButton;
    private javax.swing.JLabel Cornice;
    private javax.swing.JButton homeButton;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables

    Utente UT;
    AssumiLicenziaControl ALC = new AssumiLicenziaControl();

    private boolean clickable;

    public boolean isClickable() {
        return clickable;
    }

    public void setClickable(boolean clickable) {
        this.clickable = clickable;
    }

}
