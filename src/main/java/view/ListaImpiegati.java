package view;

import view.style.InfoBoxCard;
import controller.RecuperaPasswordControl;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;
import view.style.ScrollBarCustom;

/*
* PER VERIFICARE IL FUNZIONAMENTO DELLA PAGINA PREMERE IL TASTO HOME
* VERRANNO AGGIUNTE DELLE CARD IMPIEGATO ALLA LISTA
*/

/*
* TODO - IMPLEMENTARE LA RICERCA
*
*/

/**
 *
 * @author Davide
 */
public class ListaImpiegati extends javax.swing.JFrame {
    int cardCount;
    boolean searchFieldPlaceholder;
    
    public ListaImpiegati() {
        initComponents();
        cardCount = 0;
        listScrollPane.setVerticalScrollBar(new ScrollBarCustom());
        searchFieldPlaceholder = true;
        mainPanel.requestFocus();
    }

    private void addInfoPane() {
        listPanel.add(new InfoBoxCard());
        cardCount++;
        //System.out.println("Prima: " + jPanel5.getSize().height);
        listPanel.setPreferredSize(new Dimension(listPanel.getPreferredSize().width, cardCount*123));
        //System.out.println("Dopo: " + jPanel5.getSize().height);
        listPanel.revalidate();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        homeButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        searchField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        listScrollPane = new javax.swing.JScrollPane();
        listPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));
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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Angolo.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 200, 195);

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBar(null);

        jTextPane1.setEditable(false);
        jTextPane1.setBackground(new java.awt.Color(255, 248, 238));
        jTextPane1.setBorder(null);
        jTextPane1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jTextPane1.setForeground(new java.awt.Color(0, 0, 0));
        jTextPane1.setText("Lista Impiegati");
        jTextPane1.setFocusable(false);
        jScrollPane1.setViewportView(jTextPane1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(210, 60, 420, 70);

        jPanel4.setBackground(new java.awt.Color(255, 248, 238));
        jPanel4.setLayout(new java.awt.GridBagLayout());

        jPanel2.setBackground(new java.awt.Color(255, 248, 238));
        jPanel2.setPreferredSize(new java.awt.Dimension(1235, 826));

        jPanel3.setBackground(new java.awt.Color(255, 248, 238));
        jPanel3.setLayout(null);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cercaIcon.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(20, 20, 70, 60);

        searchField.setBackground(new java.awt.Color(219, 213, 205));
        searchField.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        searchField.setForeground(java.awt.Color.lightGray);
        searchField.setText("Cerca");
        searchField.setBorder(null);
        searchField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                searchFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                searchFieldFocusLost(evt);
            }
        });
        searchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                searchFieldKeyTyped(evt);
            }
        });
        jPanel3.add(searchField);
        searchField.setBounds(100, 10, 230, 80);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cercaBox.png"))); // NOI18N
        jPanel3.add(jLabel2);
        jLabel2.setBounds(0, 0, 370, 100);

        listScrollPane.setBorder(null);
        listScrollPane.setHorizontalScrollBar(null);
        listScrollPane.setPreferredSize(new java.awt.Dimension(1225, 100));

        listPanel.setBackground(new java.awt.Color(255, 248, 238));
        listPanel.setPreferredSize(new java.awt.Dimension(1201, 0));
        listPanel.setRequestFocusEnabled(false);
        listPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 10));
        listScrollPane.setViewportView(listPanel);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(849, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(listScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1235, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(719, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addGap(0, 117, Short.MAX_VALUE)
                    .addComponent(listScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 709, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel4.add(jPanel2, new java.awt.GridBagConstraints());

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 1614, Short.MAX_VALUE)
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 922, Short.MAX_VALUE))
        );

        getContentPane().add(mainPanel);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        addInfoPane(); //DEBUG - DA SOSTITUIRE CON L'INVOCAZIONE DELLA CONTROLLER PER CREARE PAGINA HOME
    }//GEN-LAST:event_homeButtonActionPerformed

    private void searchFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFieldKeyTyped
        System.out.println("Test");
    }//GEN-LAST:event_searchFieldKeyTyped

    private void searchFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchFieldFocusGained
        if (searchFieldPlaceholder) {
            searchField.setText("");
            searchField.setForeground(Color.BLACK);
            searchFieldPlaceholder = false;
        }
    }//GEN-LAST:event_searchFieldFocusGained

    private void searchFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchFieldFocusLost
        if (!searchFieldPlaceholder && searchField.getText().equals("")) {
            searchField.setText("Matricola");
            searchField.setForeground(Color.GRAY);
            searchFieldPlaceholder = true;
        }
    }//GEN-LAST:event_searchFieldFocusLost

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        new ListaImpiegati().setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton homeButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JPanel listPanel;
    private javax.swing.JScrollPane listScrollPane;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTextField searchField;
    // End of variables declaration//GEN-END:variables
}


class InfoBox extends JPanel {
    
}