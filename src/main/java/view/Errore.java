package view;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Utente
 */
public class Errore extends javax.swing.JFrame{

    /**
     * Creates new form Errore
     */
    public Errore() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ConfirmButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        ConfirmButton2 = new javax.swing.JButton();

        ConfirmButton1.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        ConfirmButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ConfirmButton.png"))); // NOI18N
        ConfirmButton1.setText("Conferma");
        ConfirmButton1.setAlignmentY(0.0F);
        ConfirmButton1.setBorder(null);
        ConfirmButton1.setBorderPainted(false);
        ConfirmButton1.setContentAreaFilled(false);
        ConfirmButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ConfirmButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ConfirmButton1.setIconTextGap(0);
        ConfirmButton1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        ConfirmButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmButton1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 248, 238));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setText("ERRORE!");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(225, 24, 139, 48);

        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jTextField1.setText("testo errore");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(230, 180, 130, 33);

        ConfirmButton2.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        ConfirmButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ConfirmButton.png"))); // NOI18N
        ConfirmButton2.setText("Conferma");
        ConfirmButton2.setAlignmentY(0.0F);
        ConfirmButton2.setBorder(null);
        ConfirmButton2.setBorderPainted(false);
        ConfirmButton2.setContentAreaFilled(false);
        ConfirmButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ConfirmButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ConfirmButton2.setIconTextGap(0);
        ConfirmButton2.setMargin(new java.awt.Insets(0, 0, 0, 0));
        ConfirmButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(ConfirmButton2);
        ConfirmButton2.setBounds(202, 320, 195, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setBounds(660, 50, 600, 400);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void ConfirmButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmButton1ActionPerformed
        // TODO add your handling code here:
        int hour =0;
        if(selectedTurn==Turno1Button) hour+=0;
        if(selectedTurn==Turno2Button) hour+=8;
        if(selectedTurn==Turno3Button) hour+=16;

        if(selectedHour==Hour1) hour+=1;
        if(selectedHour==Hour2) hour+=2;
        if(selectedHour==Hour3) hour+=3;
        if(selectedHour==Hour4) hour+=4;
        if(selectedHour==Hour5) hour+=5;
        if(selectedHour==Hour6) hour+=6;
        if(selectedHour==Hour7) hour+=7;
        if(selectedHour==Hour8) hour+=8;

        this.dispose();
    }//GEN-LAST:event_ConfirmButton1ActionPerformed

    private void ConfirmButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmButton2ActionPerformed
        // TODO add your handling code here:
        int hour =0;
        if(selectedTurn==Turno1Button) hour+=0;
        if(selectedTurn==Turno2Button) hour+=8;
        if(selectedTurn==Turno3Button) hour+=16;

        if(selectedHour==Hour1) hour+=1;
        if(selectedHour==Hour2) hour+=2;
        if(selectedHour==Hour3) hour+=3;
        if(selectedHour==Hour4) hour+=4;
        if(selectedHour==Hour5) hour+=5;
        if(selectedHour==Hour6) hour+=6;
        if(selectedHour==Hour7) hour+=7;
        if(selectedHour==Hour8) hour+=8;

        this.dispose();
    }//GEN-LAST:event_ConfirmButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Errore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Errore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Errore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Errore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Errore().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ConfirmButton1;
    private javax.swing.JButton ConfirmButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
