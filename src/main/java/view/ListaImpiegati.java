package view;

import controller.GestionePersonale.AssumiLicenziaControl;
import controller.AreaPersonale.OrariStipendiControl;
import view.style.InfoBoxCard;
import controller.AreaPersonale.RichiesteControl;
//import controller.MalattiaControl;
//import controller.StraordinariControl;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import static java.lang.String.valueOf;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import model.DBMSBoundary;
import view.style.ScrollBarCustom;

public class ListaImpiegati extends javax.swing.JFrame implements DocumentListener {

    OrariStipendiControl OSC;
    RichiesteControl RC;
    AssumiLicenziaControl ALC;
    String funzione = null;
    int cardCount;
    boolean searchFieldPlaceholder;
    ArrayList<InfoBoxCard> infoBoxList;
    Image foto;
    ImageIcon proPicToSend;
    private ArrayList<InfoBoxCard> impiegati = new ArrayList<InfoBoxCard>();

    public ListaImpiegati(Object controller, ResultSet rs, String f) {
        if (controller instanceof OrariStipendiControl) {
            this.OSC = (OrariStipendiControl) controller;
        }
        if (controller instanceof RichiesteControl) {
            this.RC = (RichiesteControl) controller;
        }
        if (controller instanceof AssumiLicenziaControl) {
            this.ALC = (AssumiLicenziaControl) controller;
        }
        
        
        initComponents();
        this.funzione = f;
        searchField.getDocument().addDocumentListener(this);
        cardCount = 0;
        infoBoxList = new ArrayList<>();
        listScrollPane.setVerticalScrollBar(new ScrollBarCustom());
        searchFieldPlaceholder = true;
        mainPanel.requestFocus();
        try {
            while (rs.next()) {
                if (rs.getBlob("propic") != null) {
                    byte[] propicBytes = rs.getBytes("propic");
                    ImageIcon format = new ImageIcon(propicBytes);
                    foto = format.getImage();
                    Image foto2 = foto.getScaledInstance(105, 105, Image.SCALE_SMOOTH);
                    proPicToSend = new ImageIcon(foto2);
                } else {
                    proPicToSend = new javax.swing.ImageIcon(getClass().getResource("/ImagePlaceholder.png"));
                }
                addInfoPane(rs.getString("matricola"), rs.getString("nome"), rs.getString("cognome"), rs.getString("livello"), proPicToSend);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ListaImpiegati.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("cazzi");
        this.setVisible(true);
        this.setAlwaysOnTop(true);
    }

    public void addInfoPane(String matricolaImpiegato, String nomeImpiegato, String cognomeImpiegato, String livello, ImageIcon propic) {
        InfoBoxCard infoBox = new InfoBoxCard(matricolaImpiegato, nomeImpiegato, cognomeImpiegato, livello, propic, this);
        infoBoxList.add(infoBox);
        listPanel.add(infoBox);
        impiegati.add(infoBox);
        cardCount++;
        //System.out.println("Prima: " + jPanel5.getSize().height);
        listPanel.setPreferredSize(new Dimension(listPanel.getPreferredSize().width, cardCount * 123));
        //System.out.println("Dopo: " + jPanel5.getSize().height);
        listPanel.revalidate();
    }

    public void getFromInfoBox(String matricola) {
        switch (funzione) {
            case "ConsultaStipendi":
                OSC.sendSelectionSalary(matricola, this);
                break;

            case "ConsultaOrari":
                OSC.sendSelectionTimeTables(matricola,this);

                break;
            case "LicenziaImpiegato":
                ALC.SelectWorker(this, matricola);

                break;
            case "ModificaImpiegato":
                ALC.workerSelected(this, matricola);

                break;
            case "ScambiaOrari":
                RC.selectWorker(matricola, "1");
                break;
            case "ScambiaOrari2":
                RC.selectWorker(matricola, "2");
                break;
            case "ConsultaRitardi":
                OSC.sendSelectionDelay(matricola, this);
                break;

        }

    }

    public JButton getHomeButton() {
        return homeButton;
    }

    private void adaptListPanel() {
        int count = 0;
        for (int i = 0; i < infoBoxList.size(); i++) {
            if (infoBoxList.get(i).isVisible()) {
                count++;
            }
        }
        listPanel.setPreferredSize(new Dimension(listPanel.getPreferredSize().width, count * 123));
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
        setUndecorated(true);
        setResizable(false);
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

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SearchIcon.png"))); // NOI18N
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
        searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldActionPerformed(evt);
            }
        });
        jPanel3.add(searchField);
        searchField.setBounds(100, 10, 230, 80);
        jPanel3.add(jLabel2);
        jLabel2.setBounds(0, 0, 370, 100);

        listScrollPane.setBorder(null);
        listScrollPane.setHorizontalScrollBar(null);
        listScrollPane.setPreferredSize(new java.awt.Dimension(1235, 100));

        listPanel.setBackground(new java.awt.Color(255, 248, 238));
        listPanel.setPreferredSize(new java.awt.Dimension(1235, 0));
        listPanel.setRequestFocusEnabled(false);
        listPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 10));
        listScrollPane.setViewportView(listPanel);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(869, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(listScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        setBounds(0, 0, 1920, 1080);
    }// </editor-fold>//GEN-END:initComponents

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        if ( (this.OSC != null)) {
            OSC.DisposeWindow(this);
        }
        if ( (this.RC != null)) {
            RC.DisposeWindow(this);
        }
        if ( (this.ALC != null)) {
            ALC.DisposeWindow(this);
        }
        /*if (isClickable() && (this.SC != null)) {
            SC.DisposeWindow(this);
        }*/
    }//GEN-LAST:event_homeButtonActionPerformed

    private void searchFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchFieldFocusGained
        if (searchFieldPlaceholder) {
            searchField.setText("");
            searchField.setForeground(Color.BLACK);
            searchFieldPlaceholder = false;
        }
    }//GEN-LAST:event_searchFieldFocusGained

    private void searchFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchFieldFocusLost
        if (!searchFieldPlaceholder && searchField.getText().equals("")) {
            searchFieldPlaceholder = true;
            searchField.setText("Cerca");
            searchField.setForeground(Color.LIGHT_GRAY);
        }
    }//GEN-LAST:event_searchFieldFocusLost

    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchFieldActionPerformed

    public JTextField getSearchField() {
        return searchField;
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        String comName;
        String comNameRev;
        String searchText;
        for (int i = 0; i < infoBoxList.size(); i++) {
            comName = infoBoxList.get(i).getNameField().getText().toLowerCase() + " " + infoBoxList.get(i).getSurnameField().getText().toLowerCase(); //Nome Cognome
            comNameRev = infoBoxList.get(i).getSurnameField().getText().toLowerCase() + " " + infoBoxList.get(i).getNameField().getText().toLowerCase(); //Cognome Nome
            searchText = searchField.getText().toLowerCase();
            if (!searchText.equals("") && !searchFieldPlaceholder && !(comName.startsWith(searchText)) && !(comNameRev.startsWith(searchText))) {
                infoBoxList.get(i).setVisible(false);
            } else {
                infoBoxList.get(i).setVisible(true);
            }
        }
        adaptListPanel();
    }

    @Override
    public void insertUpdate(DocumentEvent e) {
        removeUpdate(e);
    }

    /**
     * TEST MAIN*
     */
    public static void main(String args[]) {
        new ListaImpiegati(null, null, null);
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



    public ArrayList<InfoBoxCard> getImpiegati() {
        return impiegati;
    }

}
