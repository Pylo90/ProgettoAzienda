package view;

import controller.OrariStipendiControl;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author Monica Salluzzo
 */
public class StipendioImpiegato extends javax.swing.JFrame {

    /**
     * Creates new form StipendioImpiegatoDatore
     */
    int meseIndex;
    int annoIndex;
    public String[] mesi = new String[]{"Gennaio", "Febbraio", "Marzo", "Aprile", "Maggio", "Giugno", "Luglio", "Agosto", "Settembre", "Ottobre", "Novembre", "Dicembre"};

    public StipendioImpiegato(OrariStipendiControl OSC) {
        this.OSC = OSC;
        initComponents();
        meseIndex = 0;
        MonthLabel.setText(mesi[meseIndex]);
        annoIndex = 2023;

        jLabel3.setVisible(false);
        jLabel17.setVisible(false);
    }

    public StipendioImpiegato(OrariStipendiControl OSC, String nome, String cognome, String matricola) {
        this.OSC = OSC;
        initComponents();
        jLabel3.setText("Impiegato Selezionato: " + nome + " " + cognome);
        jLabel17.setText("Matricola: " + matricola);
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
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        prevMonthButton = new javax.swing.JButton();
        nextMonthButton = new javax.swing.JButton();
        MonthLabel = new javax.swing.JLabel();
        prevYearButton = new javax.swing.JButton();
        YearLabel = new javax.swing.JLabel();
        nextYearButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 248, 238));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setPreferredSize(new java.awt.Dimension(1440, 810));
        jPanel1.setLayout(null);

        jButton1.setBackground(new java.awt.Color(255, 248, 238));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/closeIcon.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setPreferredSize(new java.awt.Dimension(59, 59));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(1344, 51, 45, 45);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Impiegato Selezionato: ");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(125, 50, 373, 48);

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(118, 58, 0, 0);

        jLabel6.setBackground(new java.awt.Color(255, 248, 238));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 34)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Stipendio 104");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(160, 370, 206, 46);

        jLabel16.setBackground(new java.awt.Color(255, 248, 238));
        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 34)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("+200.00€");
        jLabel16.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(jLabel16);
        jLabel16.setBounds(935, 590, 340, 46);

        jLabel7.setBackground(new java.awt.Color(255, 248, 238));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 34)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Stipendio Malattia");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(160, 435, 274, 46);

        jLabel8.setBackground(new java.awt.Color(255, 248, 238));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 34)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Stipendio Congedo Parentale");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(160, 500, 439, 46);

        jLabel9.setBackground(new java.awt.Color(255, 248, 238));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 34)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("+200.00€");
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(jLabel9);
        jLabel9.setBounds(935, 175, 340, 46);

        jLabel10.setBackground(new java.awt.Color(255, 248, 238));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 34)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("+200.00€");
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(jLabel10);
        jLabel10.setBounds(935, 243, 340, 46);

        jLabel11.setBackground(new java.awt.Color(255, 248, 238));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 34)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("+200.00€");
        jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(jLabel11);
        jLabel11.setBounds(935, 310, 340, 46);

        jLabel12.setBackground(new java.awt.Color(255, 248, 238));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 34)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("+200.00€");
        jLabel12.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(jLabel12);
        jLabel12.setBounds(935, 377, 340, 46);

        jLabel13.setBackground(new java.awt.Color(255, 248, 238));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 34)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("+200.00€");
        jLabel13.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(jLabel13);
        jLabel13.setBounds(935, 444, 340, 46);

        jLabel14.setBackground(new java.awt.Color(255, 248, 238));
        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 34)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("+200.00€");
        jLabel14.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(jLabel14);
        jLabel14.setBounds(935, 511, 340, 46);

        jSeparator1.setBackground(new java.awt.Color(38, 38, 38));
        jSeparator1.setForeground(new java.awt.Color(38, 38, 38));
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(160, 570, 1120, 3);

        jLabel15.setBackground(new java.awt.Color(255, 248, 238));
        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 34)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Totale");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(160, 590, 93, 46);

        jLabel4.setBackground(new java.awt.Color(255, 248, 238));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 34)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Stipendio Base");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(160, 175, 220, 46);

        jLabel2.setBackground(new java.awt.Color(255, 248, 238));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 34)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Stipendio Bonus");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(160, 240, 243, 46);

        jLabel5.setBackground(new java.awt.Color(255, 248, 238));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 34)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Stipendio Straordinari");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(160, 305, 327, 46);

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Matricola:");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(125, 100, 157, 48);

        prevMonthButton.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        prevMonthButton.setForeground(new java.awt.Color(0, 0, 0));
        prevMonthButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/40x40ButtonBeige.png"))); // NOI18N
        prevMonthButton.setText("←");
        prevMonthButton.setAlignmentY(0.0F);
        prevMonthButton.setBorder(null);
        prevMonthButton.setBorderPainted(false);
        prevMonthButton.setContentAreaFilled(false);
        prevMonthButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        prevMonthButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        prevMonthButton.setIconTextGap(0);
        prevMonthButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        prevMonthButton.setPreferredSize(new java.awt.Dimension(45, 45));
        prevMonthButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevMonthButtonActionPerformed(evt);
            }
        });
        jPanel1.add(prevMonthButton);
        prevMonthButton.setBounds(160, 680, 45, 45);

        nextMonthButton.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        nextMonthButton.setForeground(new java.awt.Color(0, 0, 0));
        nextMonthButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/40x40ButtonBeige.png"))); // NOI18N
        nextMonthButton.setText("→");
        nextMonthButton.setAlignmentY(0.0F);
        nextMonthButton.setBorder(null);
        nextMonthButton.setBorderPainted(false);
        nextMonthButton.setContentAreaFilled(false);
        nextMonthButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        nextMonthButton.setDisplayedMnemonicIndex(0);
        nextMonthButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        nextMonthButton.setIconTextGap(0);
        nextMonthButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        nextMonthButton.setPreferredSize(new java.awt.Dimension(45, 45));
        nextMonthButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextMonthButtonActionPerformed(evt);
            }
        });
        jPanel1.add(nextMonthButton);
        nextMonthButton.setBounds(349, 680, 45, 45);

        MonthLabel.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        MonthLabel.setForeground(new java.awt.Color(0, 0, 0));
        MonthLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MonthLabel.setText("cottu");
        jPanel1.add(MonthLabel);
        MonthLabel.setBounds(161, 680, 228, 43);

        prevYearButton.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        prevYearButton.setForeground(new java.awt.Color(0, 0, 0));
        prevYearButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/40x40ButtonBeige.png"))); // NOI18N
        prevYearButton.setText("←");
        prevYearButton.setAlignmentY(0.0F);
        prevYearButton.setBorder(null);
        prevYearButton.setBorderPainted(false);
        prevYearButton.setContentAreaFilled(false);
        prevYearButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        prevYearButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        prevYearButton.setIconTextGap(0);
        prevYearButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        prevYearButton.setPreferredSize(new java.awt.Dimension(45, 45));
        prevYearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevYearButtonActionPerformed(evt);
            }
        });
        jPanel1.add(prevYearButton);
        prevYearButton.setBounds(470, 680, 45, 45);

        YearLabel.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        YearLabel.setForeground(new java.awt.Color(0, 0, 0));
        YearLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        YearLabel.setText("cottu");
        jPanel1.add(YearLabel);
        YearLabel.setBounds(470, 680, 228, 43);

        nextYearButton.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        nextYearButton.setForeground(new java.awt.Color(0, 0, 0));
        nextYearButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/40x40ButtonBeige.png"))); // NOI18N
        nextYearButton.setText("→");
        nextYearButton.setAlignmentY(0.0F);
        nextYearButton.setBorder(null);
        nextYearButton.setBorderPainted(false);
        nextYearButton.setContentAreaFilled(false);
        nextYearButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        nextYearButton.setDisplayedMnemonicIndex(0);
        nextYearButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        nextYearButton.setIconTextGap(0);
        nextYearButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        nextYearButton.setPreferredSize(new java.awt.Dimension(45, 45));
        nextYearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextYearButtonActionPerformed(evt);
            }
        });
        jPanel1.add(nextYearButton);
        nextYearButton.setBounds(650, 680, 45, 45);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1440, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 810, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        setBounds(240, 50, 1440, 810);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        OSC.DisposeWindow(this);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void prevMonthButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevMonthButtonActionPerformed
        // TODO add your handling code here:
        meseIndex = (((meseIndex - 1) % 12) + 12) % 12;
        MonthLabel.setText(mesi[meseIndex]);
    }//GEN-LAST:event_prevMonthButtonActionPerformed

    private void nextMonthButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextMonthButtonActionPerformed
        meseIndex = (meseIndex + 1) % 12;
        MonthLabel.setText(mesi[meseIndex]);
    }//GEN-LAST:event_nextMonthButtonActionPerformed

    private void prevYearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevYearButtonActionPerformed
        annoIndex = annoIndex - 1;
        YearLabel.setText(String.valueOf(annoIndex));
    }//GEN-LAST:event_prevYearButtonActionPerformed

    private void nextYearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextYearButtonActionPerformed
        // TODO add your handling code here:
        annoIndex = annoIndex + 1;
        YearLabel.setText(String.valueOf(annoIndex));


    }//GEN-LAST:event_nextYearButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    /*public static void main(String args[]) {
        /* Set the Nimbus look and feel */
    //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
    /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StipendioImpiegatoDatore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StipendioImpiegatoDatore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StipendioImpiegatoDatore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StipendioImpiegatoDatore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StipendioImpiegatoDatore().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MonthLabel;
    private javax.swing.JLabel YearLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton nextMonthButton;
    private javax.swing.JButton nextYearButton;
    private javax.swing.JButton prevMonthButton;
    private javax.swing.JButton prevYearButton;
    // End of variables declaration//GEN-END:variables

    private OrariStipendiControl OSC = new OrariStipendiControl();

}
