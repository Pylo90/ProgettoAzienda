package view;

import controller.AreaPersonale.FirmaControl;
import controller.GestioneCalendario.AvvisoChiusuraControl;

public class FirmaBoundary extends javax.swing.JFrame {

    /**
     * Creates new form FirmaBoundary
     */
    public FirmaBoundary() {
        initComponents();
        new Thread(new AvvisoChiusuraControl()).start();
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
        jLabel1 = new javax.swing.JLabel();
        FirmaEntrata = new javax.swing.JButton();
        FirmaUscita = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 248, 238));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 248, 238));
        jPanel1.setPreferredSize(new java.awt.Dimension(1920, 1080));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 64)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LogoFIrma.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(410, 100, 1300, 400);

        FirmaEntrata.setFont(new java.awt.Font("Segoe UI", 0, 64)); // NOI18N
        FirmaEntrata.setForeground(new java.awt.Color(255, 255, 255));
        FirmaEntrata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SignButton.png"))); // NOI18N
        FirmaEntrata.setText("FIRMA ENTRATA");
        FirmaEntrata.setAlignmentY(0.0F);
        FirmaEntrata.setBorder(null);
        FirmaEntrata.setBorderPainted(false);
        FirmaEntrata.setContentAreaFilled(false);
        FirmaEntrata.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        FirmaEntrata.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        FirmaEntrata.setIconTextGap(0);
        FirmaEntrata.setMargin(new java.awt.Insets(0, 0, 0, 0));
        FirmaEntrata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirmaEntrataActionPerformed(evt);
            }
        });
        jPanel1.add(FirmaEntrata);
        FirmaEntrata.setBounds(200, 540, 700, 300);

        FirmaUscita.setFont(new java.awt.Font("Segoe UI", 0, 64)); // NOI18N
        FirmaUscita.setForeground(new java.awt.Color(255, 255, 255));
        FirmaUscita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SignButton.png"))); // NOI18N
        FirmaUscita.setText("FIRMA USCITA");
        FirmaUscita.setAlignmentY(0.0F);
        FirmaUscita.setBorder(null);
        FirmaUscita.setBorderPainted(false);
        FirmaUscita.setContentAreaFilled(false);
        FirmaUscita.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        FirmaUscita.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        FirmaUscita.setIconTextGap(0);
        FirmaUscita.setMargin(new java.awt.Insets(0, 0, 0, 0));
        FirmaUscita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirmaUscitaActionPerformed(evt);
            }
        });
        jPanel1.add(FirmaUscita);
        FirmaUscita.setBounds(1020, 540, 700, 300);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FirmaEntrataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirmaEntrataActionPerformed
        FC.firmaINButtonPressed();
    }//GEN-LAST:event_FirmaEntrataActionPerformed

    private void FirmaUscitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirmaUscitaActionPerformed
        FC.firmaOUTButtonPressed();
    }//GEN-LAST:event_FirmaUscitaActionPerformed

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
            java.util.logging.Logger.getLogger(FirmaBoundary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FirmaBoundary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FirmaBoundary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FirmaBoundary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FirmaBoundary().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton FirmaEntrata;
    private javax.swing.JButton FirmaUscita;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
    FirmaControl FC = new FirmaControl();
}
