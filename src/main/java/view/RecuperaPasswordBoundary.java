package view;

import controller.Autenticazione.RecuperaPasswordControl;

/**
 *
 * @author Davide
 */
public class RecuperaPasswordBoundary extends javax.swing.JFrame {
    RecuperaPasswordControl rc;
    
    public RecuperaPasswordBoundary(RecuperaPasswordControl rc) {
        initComponents();
        this.rc = rc;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        mainPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        homeButton = new javax.swing.JButton();
        HomeCostina = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextPane6 = new javax.swing.JTextPane();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextPane7 = new javax.swing.JTextPane();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextPane8 = new javax.swing.JTextPane();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTextPane9 = new javax.swing.JTextPane();
        surnameField = new javax.swing.JTextField();
        matField = new javax.swing.JTextField();
        pinField = new javax.swing.JTextField();
        nameField = new javax.swing.JTextField();
        confirmButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));
        setUndecorated(true);
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        mainPanel.setBackground(new java.awt.Color(255, 248, 238));

        jPanel1.setBackground(new java.awt.Color(255, 248, 238));
        jPanel1.setLayout(null);

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
        jPanel1.add(homeButton);
        homeButton.setBounds(40, 40, 100, 100);

        HomeCostina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Angolo.png"))); // NOI18N
        jPanel1.add(HomeCostina);
        HomeCostina.setBounds(0, 0, 200, 195);

        jScrollPane1.setBorder(null);

        jTextPane1.setEditable(false);
        jTextPane1.setBackground(new java.awt.Color(255, 248, 238));
        jTextPane1.setBorder(null);
        jTextPane1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jTextPane1.setForeground(new java.awt.Color(0, 0, 0));
        jTextPane1.setText("Recupera password");
        jTextPane1.setFocusable(false);
        jScrollPane1.setViewportView(jTextPane1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(210, 60, 420, 70);

        jPanel2.setBackground(new java.awt.Color(255, 248, 238));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jPanel3.setBackground(new java.awt.Color(255, 248, 238));
        jPanel3.setPreferredSize(new java.awt.Dimension(730, 315));

        jScrollPane6.setBorder(null);

        jTextPane6.setBackground(new java.awt.Color(255, 248, 238));
        jTextPane6.setBorder(null);
        jTextPane6.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jTextPane6.setForeground(new java.awt.Color(0, 0, 0));
        jTextPane6.setText("Nome:");
        jTextPane6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextPane6.setFocusable(false);
        jTextPane6.setName("Nome"); // NOI18N
        jScrollPane6.setViewportView(jTextPane6);

        jScrollPane7.setBorder(null);

        jTextPane7.setBackground(new java.awt.Color(255, 248, 238));
        jTextPane7.setBorder(null);
        jTextPane7.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jTextPane7.setForeground(new java.awt.Color(0, 0, 0));
        jTextPane7.setText("Cognome:");
        jTextPane7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextPane7.setFocusable(false);
        jTextPane7.setMinimumSize(new java.awt.Dimension(111, 65));
        jTextPane7.setName("Cognome"); // NOI18N
        jScrollPane7.setViewportView(jTextPane7);

        jScrollPane8.setBorder(null);

        jTextPane8.setBackground(new java.awt.Color(255, 248, 238));
        jTextPane8.setBorder(null);
        jTextPane8.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jTextPane8.setForeground(new java.awt.Color(0, 0, 0));
        jTextPane8.setText("Matricola:");
        jTextPane8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextPane8.setFocusable(false);
        jTextPane8.setPreferredSize(new java.awt.Dimension(158, 60));
        jScrollPane8.setViewportView(jTextPane8);

        jScrollPane9.setBorder(null);

        jTextPane9.setBackground(new java.awt.Color(255, 248, 238));
        jTextPane9.setBorder(null);
        jTextPane9.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jTextPane9.setForeground(new java.awt.Color(0, 0, 0));
        jTextPane9.setText("Pin:");
        jTextPane9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextPane9.setFocusable(false);
        jTextPane9.setPreferredSize(new java.awt.Dimension(62, 60));
        jScrollPane9.setViewportView(jTextPane9);

        surnameField.setBackground(new java.awt.Color(219, 213, 205));
        surnameField.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        surnameField.setBorder(null);
        surnameField.setPreferredSize(new java.awt.Dimension(64, 65));

        matField.setBackground(new java.awt.Color(219, 213, 205));
        matField.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        matField.setBorder(null);
        matField.setPreferredSize(new java.awt.Dimension(64, 65));

        pinField.setBackground(new java.awt.Color(219, 213, 205));
        pinField.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        pinField.setBorder(null);

        nameField.setBackground(new java.awt.Color(219, 213, 205));
        nameField.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        nameField.setBorder(null);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(surnameField, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pinField))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(matField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nameField)))
                .addGap(0, 2, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane6)
                    .addComponent(nameField, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(surnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane8)
                    .addComponent(matField, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane9)
                    .addComponent(pinField, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel2.add(jPanel3, new java.awt.GridBagConstraints());

        confirmButton.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        confirmButton.setForeground(new java.awt.Color(255, 255, 255));
        confirmButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ConfirmButton.png"))); // NOI18N
        confirmButton.setText("Conferma");
        confirmButton.setBorder(null);
        confirmButton.setBorderPainted(false);
        confirmButton.setContentAreaFilled(false);
        confirmButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        confirmButton.setFocusable(false);
        confirmButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        confirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(25, 0, 0, 0);
        jPanel2.add(confirmButton, gridBagConstraints);

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1526, Short.MAX_VALUE)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 269, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(269, Short.MAX_VALUE))
        );

        getContentPane().add(mainPanel);

        setBounds(0, 0, 1920, 1080);
    }// </editor-fold>//GEN-END:initComponents

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed
        rc.submitForm();
    }//GEN-LAST:event_confirmButtonActionPerformed

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        rc.disposeWindow(this);
        rc.showLoginForm();
    }//GEN-LAST:event_homeButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        new RecuperaPasswordControl().showRecuperaPassowrd();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel HomeCostina;
    private javax.swing.JButton confirmButton;
    private javax.swing.JButton homeButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane6;
    private javax.swing.JTextPane jTextPane7;
    private javax.swing.JTextPane jTextPane8;
    private javax.swing.JTextPane jTextPane9;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTextField matField;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField pinField;
    private javax.swing.JTextField surnameField;
    // End of variables declaration//GEN-END:variables
}
