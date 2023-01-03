package view;

import java.awt.Color;
import controller.FirmaControl;


/**
 *
 * @author Davide
 */
public class FirmaForm extends javax.swing.JFrame {
    
    boolean nameFieldPlaceHolder;
    boolean surnameFieldPlaceHolder;
    boolean matFieldPlaceHolder;
    FirmaControl fc;
    
    public FirmaForm(FirmaControl fc) {
        initComponents();
        nameFieldPlaceHolder = surnameFieldPlaceHolder = matFieldPlaceHolder = true;
        mainPanel.requestFocus();
        this.fc = fc;
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
        nameField = new javax.swing.JTextField();
        surnameField = new javax.swing.JTextField();
        matField = new javax.swing.JTextField();
        confirmButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setPreferredSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(new java.awt.GridLayout());

        mainPanel.setBackground(new java.awt.Color(255, 248, 238));
        mainPanel.setLayout(new java.awt.GridBagLayout());

        nameField.setBackground(new java.awt.Color(219, 213, 205));
        nameField.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        nameField.setForeground(java.awt.Color.gray);
        nameField.setText("Nome");
        nameField.setBorder(null);
        nameField.setPreferredSize(new java.awt.Dimension(700, 70));
        nameField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nameFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nameFieldFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 20, 0);
        mainPanel.add(nameField, gridBagConstraints);

        surnameField.setBackground(new java.awt.Color(219, 213, 205));
        surnameField.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        surnameField.setForeground(java.awt.Color.gray);
        surnameField.setText("Cognome");
        surnameField.setBorder(null);
        surnameField.setPreferredSize(new java.awt.Dimension(700, 70));
        surnameField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                surnameFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                surnameFieldFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 20, 0);
        mainPanel.add(surnameField, gridBagConstraints);

        matField.setBackground(new java.awt.Color(219, 213, 205));
        matField.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        matField.setForeground(java.awt.Color.gray);
        matField.setText("Matricola");
        matField.setBorder(null);
        matField.setPreferredSize(new java.awt.Dimension(700, 70));
        matField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                matFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                matFieldFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 20, 0);
        mainPanel.add(matField, gridBagConstraints);

        confirmButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InvioButton.png"))); // NOI18N
        confirmButton.setBorder(null);
        confirmButton.setContentAreaFilled(false);
        confirmButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        confirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(0, 700, 0, 0);
        mainPanel.add(confirmButton, gridBagConstraints);

        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InvioButton-flipped.png"))); // NOI18N
        backButton.setBorder(null);
        backButton.setContentAreaFilled(false);
        backButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backButton.setFocusPainted(false);
        backButton.setFocusable(false);
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(0, 550, 0, 0);
        mainPanel.add(backButton, gridBagConstraints);

        getContentPane().add(mainPanel);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed
        fc.submitBadgeIn();
    }//GEN-LAST:event_confirmButtonActionPerformed

    private void nameFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameFieldFocusGained
        if (nameFieldPlaceHolder) {
            nameField.setText("");
            nameField.setForeground(Color.BLACK);
            nameFieldPlaceHolder = false;
        }
    }//GEN-LAST:event_nameFieldFocusGained

    private void nameFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameFieldFocusLost
        if (!nameFieldPlaceHolder && nameField.getText().equals("")) {
            nameField.setText("Nome");
            nameField.setForeground(Color.GRAY);
            nameFieldPlaceHolder = true;
        }
    }//GEN-LAST:event_nameFieldFocusLost

    private void surnameFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_surnameFieldFocusGained
        if (surnameFieldPlaceHolder) {
            surnameField.setText("");
            surnameField.setForeground(Color.BLACK);
            surnameFieldPlaceHolder = false;
        }
    }//GEN-LAST:event_surnameFieldFocusGained

    private void surnameFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_surnameFieldFocusLost
        if (!surnameFieldPlaceHolder && surnameField.getText().equals("")) {
            surnameField.setText("Cognome");
            surnameField.setForeground(Color.GRAY);
            surnameFieldPlaceHolder = true;
        }
    }//GEN-LAST:event_surnameFieldFocusLost

    private void matFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_matFieldFocusGained
        if (matFieldPlaceHolder) {
            matField.setText("");
            matField.setForeground(Color.BLACK);
            matFieldPlaceHolder = false;
        }
    }//GEN-LAST:event_matFieldFocusGained

    private void matFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_matFieldFocusLost
        if (!matFieldPlaceHolder && matField.getText().equals("")) {
            matField.setText("Matricola");
            matField.setForeground(Color.GRAY);
            matFieldPlaceHolder = true;
        }
    }//GEN-LAST:event_matFieldFocusLost

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        //SHOW FIRMABOUNDARY
    }//GEN-LAST:event_backButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        new FirmaControl().showFirmaForm();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton confirmButton;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTextField matField;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField surnameField;
    // End of variables declaration//GEN-END:variables
}