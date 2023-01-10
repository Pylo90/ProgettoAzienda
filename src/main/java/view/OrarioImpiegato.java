/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.OrariStipendiControl;
import javax.swing.JLabel;
import javax.swing.JTable;

/**
 *
 * @author dario
 */
public class OrarioImpiegato extends javax.swing.JFrame {

    /**
     * Creates new form OrarioImpiegatoDatore
     */
    public OrarioImpiegato(OrariStipendiControl OSC) {
        this.OSC = OSC;
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

        jPanel1 = new javax.swing.JPanel();
        jButton32 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        LUNLabel = new javax.swing.JLabel();
        MARLabel = new javax.swing.JLabel();
        MERLabel = new javax.swing.JLabel();
        GIOLabel = new javax.swing.JLabel();
        VENLabel = new javax.swing.JLabel();
        SABLabel = new javax.swing.JLabel();
        DOMLabel = new javax.swing.JLabel();
        Label1 = new javax.swing.JLabel();
        Label2 = new javax.swing.JLabel();
        Label3 = new javax.swing.JLabel();
        Label4 = new javax.swing.JLabel();
        Label5 = new javax.swing.JLabel();
        Label6 = new javax.swing.JLabel();
        Label7 = new javax.swing.JLabel();
        Label8 = new javax.swing.JLabel();
        Label9 = new javax.swing.JLabel();
        Label10 = new javax.swing.JLabel();
        Label11 = new javax.swing.JLabel();
        Label12 = new javax.swing.JLabel();
        Label13 = new javax.swing.JLabel();
        Label14 = new javax.swing.JLabel();
        Label15 = new javax.swing.JLabel();
        Label16 = new javax.swing.JLabel();
        Label17 = new javax.swing.JLabel();
        Label18 = new javax.swing.JLabel();
        Label19 = new javax.swing.JLabel();
        Label20 = new javax.swing.JLabel();
        Label21 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 248, 238));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setFocusable(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(1440, 810));

        jButton32.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        jButton32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/closeIcon.png"))); // NOI18N
        jButton32.setContentAreaFilled(false);
        jButton32.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton32.setPreferredSize(new java.awt.Dimension(65, 65));
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Impiegato Selezionato: ");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setText("Matricola:");

        jLabel3.setText("jLabel2");

        LUNLabel.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        LUNLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LUNLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OrarioButton.png"))); // NOI18N
        LUNLabel.setText("LUN");
        LUNLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        MARLabel.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        MARLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        MARLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OrarioButton.png"))); // NOI18N
        MARLabel.setText("MAR");
        MARLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        MERLabel.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        MERLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        MERLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OrarioButton.png"))); // NOI18N
        MERLabel.setText("MER");
        MERLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        GIOLabel.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        GIOLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        GIOLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OrarioButton.png"))); // NOI18N
        GIOLabel.setText("GIO");
        GIOLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        VENLabel.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        VENLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        VENLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OrarioButton.png"))); // NOI18N
        VENLabel.setText("VEN");
        VENLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        SABLabel.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        SABLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        SABLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OrarioButton.png"))); // NOI18N
        SABLabel.setText("SAB");
        SABLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        DOMLabel.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        DOMLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        DOMLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OrarioButton.png"))); // NOI18N
        DOMLabel.setText("DOM");
        DOMLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        Label1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        Label1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Label1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OrarioButton.png"))); // NOI18N
        Label1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        Label2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        Label2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Label2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OrarioButton.png"))); // NOI18N
        Label2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        Label3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        Label3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Label3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OrarioButton.png"))); // NOI18N
        Label3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        Label4.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        Label4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Label4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OrarioButton.png"))); // NOI18N
        Label4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        Label5.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        Label5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Label5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OrarioButton.png"))); // NOI18N
        Label5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        Label6.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        Label6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Label6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OrarioButton.png"))); // NOI18N
        Label6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        Label7.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        Label7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Label7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OrarioButton.png"))); // NOI18N
        Label7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        Label8.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        Label8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Label8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OrarioButton.png"))); // NOI18N
        Label8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        Label9.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        Label9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Label9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OrarioButton.png"))); // NOI18N
        Label9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        Label10.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        Label10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Label10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OrarioButton.png"))); // NOI18N
        Label10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        Label11.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        Label11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Label11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OrarioButton.png"))); // NOI18N
        Label11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        Label12.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        Label12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Label12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OrarioButton.png"))); // NOI18N
        Label12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        Label13.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        Label13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Label13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OrarioButton.png"))); // NOI18N
        Label13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        Label14.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        Label14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Label14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OrarioButton.png"))); // NOI18N
        Label14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        Label15.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        Label15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Label15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OrarioButton.png"))); // NOI18N
        Label15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        Label16.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        Label16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Label16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OrarioButton.png"))); // NOI18N
        Label16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        Label17.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        Label17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Label17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OrarioButton.png"))); // NOI18N
        Label17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        Label18.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        Label18.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Label18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OrarioButton.png"))); // NOI18N
        Label18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        Label19.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        Label19.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Label19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OrarioButton.png"))); // NOI18N
        Label19.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        Label20.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        Label20.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Label20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OrarioButton.png"))); // NOI18N
        Label20.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        Label21.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        Label21.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Label21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OrarioButton.png"))); // NOI18N
        Label21.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LUNLabel)
                            .addComponent(Label1)
                            .addComponent(Label2)
                            .addComponent(Label3))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(MARLabel)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Label4)
                                .addComponent(Label5)
                                .addComponent(Label6)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(MERLabel)
                                .addGap(20, 20, 20)
                                .addComponent(GIOLabel))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Label7)
                                    .addComponent(Label8)
                                    .addComponent(Label9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Label10)
                                    .addComponent(Label11)
                                    .addComponent(Label12))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(VENLabel)
                                .addGap(20, 20, 20)
                                .addComponent(SABLabel))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Label13)
                                    .addComponent(Label14)
                                    .addComponent(Label15))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Label16)
                                    .addComponent(Label17)
                                    .addComponent(Label18))))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(DOMLabel)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Label19)
                                .addComponent(Label20)
                                .addComponent(Label21)))))
                .addContainerGap(133, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addComponent(jLabel2)
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LUNLabel)
                    .addComponent(MARLabel)
                    .addComponent(MERLabel)
                    .addComponent(GIOLabel)
                    .addComponent(VENLabel)
                    .addComponent(SABLabel)
                    .addComponent(DOMLabel))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Label1)
                        .addGap(20, 20, 20)
                        .addComponent(Label2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Label3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Label4)
                        .addGap(20, 20, 20)
                        .addComponent(Label5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Label6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Label7)
                        .addGap(20, 20, 20)
                        .addComponent(Label8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Label9))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Label10)
                        .addGap(20, 20, 20)
                        .addComponent(Label11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Label12))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Label15)
                        .addGap(20, 20, 20)
                        .addComponent(Label13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Label14))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Label16)
                        .addGap(20, 20, 20)
                        .addComponent(Label18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Label17))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Label21)
                        .addGap(20, 20, 20)
                        .addComponent(Label20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Label19)))
                .addContainerGap(240, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setBounds(240, 50, 1440, 650);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        // TODO add your handling code here:
        OSC.DisposeWindow(this);
    }//GEN-LAST:event_jButton32ActionPerformed

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
            java.util.logging.Logger.getLogger(OrarioImpiegato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrarioImpiegato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrarioImpiegato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrarioImpiegato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        new OrarioImpiegato(null).setVisible(true);
        System.out.println((-1)%(-7));
        /* Create and display the form */
 /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DOMLabel;
    private javax.swing.JLabel GIOLabel;
    private javax.swing.JLabel LUNLabel;
    private javax.swing.JLabel Label1;
    private javax.swing.JLabel Label10;
    private javax.swing.JLabel Label11;
    private javax.swing.JLabel Label12;
    private javax.swing.JLabel Label13;
    private javax.swing.JLabel Label14;
    private javax.swing.JLabel Label15;
    private javax.swing.JLabel Label16;
    private javax.swing.JLabel Label17;
    private javax.swing.JLabel Label18;
    private javax.swing.JLabel Label19;
    private javax.swing.JLabel Label2;
    private javax.swing.JLabel Label20;
    private javax.swing.JLabel Label21;
    private javax.swing.JLabel Label3;
    private javax.swing.JLabel Label4;
    private javax.swing.JLabel Label5;
    private javax.swing.JLabel Label6;
    private javax.swing.JLabel Label7;
    private javax.swing.JLabel Label8;
    private javax.swing.JLabel Label9;
    private javax.swing.JLabel MARLabel;
    private javax.swing.JLabel MERLabel;
    private javax.swing.JLabel SABLabel;
    private javax.swing.JLabel VENLabel;
    private javax.swing.JButton jButton32;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private OrariStipendiControl OSC = new OrariStipendiControl();

    public JLabel getLabel1() {
        return Label1;
    }

    public void setLabel1(JLabel Label1) {
        this.Label1 = Label1;
    }

    public JLabel getLabel10() {
        return Label10;
    }

    public void setLabel10(JLabel Label10) {
        this.Label10 = Label10;
    }

    public JLabel getLabel11() {
        return Label11;
    }

    public void setLabel11(JLabel Label11) {
        this.Label11 = Label11;
    }

    public JLabel getLabel12() {
        return Label12;
    }

    public void setLabel12(JLabel Label12) {
        this.Label12 = Label12;
    }

    public JLabel getLabel13() {
        return Label13;
    }

    public void setLabel13(JLabel Label13) {
        this.Label13 = Label13;
    }

    public JLabel getLabel14() {
        return Label14;
    }

    public void setLabel14(JLabel Label14) {
        this.Label14 = Label14;
    }

    public JLabel getLabel15() {
        return Label15;
    }

    public void setLabel15(JLabel Label15) {
        this.Label15 = Label15;
    }

    public JLabel getLabel16() {
        return Label16;
    }

    public void setLabel16(JLabel Label16) {
        this.Label16 = Label16;
    }

    public JLabel getLabel17() {
        return Label17;
    }

    public void setLabel17(JLabel Label17) {
        this.Label17 = Label17;
    }

    public JLabel getLabel18() {
        return Label18;
    }

    public void setLabel18(JLabel Label18) {
        this.Label18 = Label18;
    }

    public JLabel getLabel19() {
        return Label19;
    }

    public void setLabel19(JLabel Label19) {
        this.Label19 = Label19;
    }

    public JLabel getLabel2() {
        return Label2;
    }

    public void setLabel2(JLabel Label2) {
        this.Label2 = Label2;
    }

    public JLabel getLabel20() {
        return Label20;
    }

    public void setLabel20(JLabel Label20) {
        this.Label20 = Label20;
    }

    public JLabel getLabel21() {
        return Label21;
    }

    public void setLabel21(JLabel Label21) {
        this.Label21 = Label21;
    }

    public JLabel getLabel3() {
        return Label3;
    }

    public void setLabel3(JLabel Label3) {
        this.Label3 = Label3;
    }

    public JLabel getLabel4() {
        return Label4;
    }

    public void setLabel4(JLabel Label4) {
        this.Label4 = Label4;
    }

    public JLabel getLabel5() {
        return Label5;
    }

    public void setLabel5(JLabel Label5) {
        this.Label5 = Label5;
    }

    public JLabel getLabel6() {
        return Label6;
    }

    public void setLabel6(JLabel Label6) {
        this.Label6 = Label6;
    }

    public JLabel getLabel7() {
        return Label7;
    }

    public void setLabel7(JLabel Label7) {
        this.Label7 = Label7;
    }

    public JLabel getLabel8() {
        return Label8;
    }

    public void setLabel8(JLabel Label8) {
        this.Label8 = Label8;
    }

    public JLabel getLabel9() {
        return Label9;
    }

    public void setLabel9(JLabel Label9) {
        this.Label9 = Label9;
    }

}
