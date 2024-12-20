package view;

//import controller.StraordinariControl;
import javax.swing.JButton;
import model.Utente;

public class CalendarioOreInterattivo extends javax.swing.JFrame {

    /**
     * Creates new form CalendarioOreServizio
     */
    javax.swing.JButton selectedHour;
    javax.swing.JButton selectedTurn;

    public CalendarioOreInterattivo() {
        initComponents();
        setSelectedTurn(Turno1Button);
        setSelectedHour(Hour1);

    }
    
    /*public CalendarioOreInterattivo(StraordinariControl SC, Utente UT, int giorno, boolean ora) {
        this.ora = ora;
        this.giorno = giorno;
        this.SC = SC;
        this.UT = UT; //Utente serve a prendere il suo orario e annerire le ore del giorno in cui non lavora
        initComponents();
        setSelectedTurn(Turno1Button);
        setSelectedHour(Hour1);
        if(ora == false){
            ConfirmButton2.setVisible(false);
        }
    }
    
    public CalendarioOreInterattivo(StraordinariControl SC, Utente UT, int giorno, boolean ora, int inizioStraordinario) {
        this.inizioStraordinario = inizioStraordinario;
        this.ora = ora;
        this.giorno = giorno;
        this.SC = SC;
        this.UT = UT; //Utente serve a prendere il suo orario e annerire le ore del giorno in cui non lavora
        initComponents();
        setSelectedTurn(Turno1Button);
        setSelectedHour(Hour1);
        if(ora == false){
            ConfirmButton2.setVisible(false);
        }
    }*/
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        ConfirmButton1 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        Turno1Button = new javax.swing.JButton();
        Turno2Button = new javax.swing.JButton();
        Turno3Button = new javax.swing.JButton();
        Hour1 = new javax.swing.JButton();
        Hour2 = new javax.swing.JButton();
        Hour3 = new javax.swing.JButton();
        Hour4 = new javax.swing.JButton();
        Hour5 = new javax.swing.JButton();
        Hour6 = new javax.swing.JButton();
        Hour7 = new javax.swing.JButton();
        Hour8 = new javax.swing.JButton();
        ConfirmButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 248, 238));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 645));

        jScrollPane2.setBackground(new java.awt.Color(255, 248, 238));
        jScrollPane2.setBorder(null);
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane2.setEnabled(false);
        jScrollPane2.setHorizontalScrollBar(null);
        jScrollPane2.setOpaque(false);
        jScrollPane2.setPreferredSize(new java.awt.Dimension(343, 98));
        jScrollPane2.setVerifyInputWhenFocusTarget(false);

        jTextArea2.setEditable(false);
        jTextArea2.setBackground(new java.awt.Color(255, 248, 238));
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jTextArea2.setForeground(new java.awt.Color(0, 0, 0));
        jTextArea2.setRows(5);
        jTextArea2.setText("Quale ora vuoi \nselezionare?");
        jTextArea2.setBorder(null);
        jScrollPane2.setViewportView(jTextArea2);

        ConfirmButton1.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        ConfirmButton1.setForeground(new java.awt.Color(255, 255, 255));
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

        jButton32.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        jButton32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CloseIcon.png"))); // NOI18N
        jButton32.setContentAreaFilled(false);
        jButton32.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton32.setPreferredSize(new java.awt.Dimension(65, 65));
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });

        Turno1Button.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Turno1Button.setForeground(new java.awt.Color(0, 0, 0));
        Turno1Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TurnoButton.png"))); // NOI18N
        Turno1Button.setText("Turno I");
        Turno1Button.setContentAreaFilled(false);
        Turno1Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Turno1Button.setPreferredSize(new java.awt.Dimension(130, 65));
        Turno1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Turno1ButtonActionPerformed(evt);
            }
        });

        Turno2Button.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Turno2Button.setForeground(new java.awt.Color(0, 0, 0));
        Turno2Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TurnoButton.png"))); // NOI18N
        Turno2Button.setText("Turno II");
        Turno2Button.setContentAreaFilled(false);
        Turno2Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Turno2Button.setPreferredSize(new java.awt.Dimension(130, 65));
        Turno2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Turno2ButtonActionPerformed(evt);
            }
        });

        Turno3Button.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Turno3Button.setForeground(new java.awt.Color(0, 0, 0));
        Turno3Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TurnoButton.png"))); // NOI18N
        Turno3Button.setText("Turno III");
        Turno3Button.setContentAreaFilled(false);
        Turno3Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Turno3Button.setPreferredSize(new java.awt.Dimension(130, 65));
        Turno3Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Turno3ButtonActionPerformed(evt);
            }
        });

        Hour1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Hour1.setForeground(new java.awt.Color(0, 0, 0));
        Hour1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OrarioButton.png"))); // NOI18N
        Hour1.setText("0:00-1:00");
        Hour1.setContentAreaFilled(false);
        Hour1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Hour1.setPreferredSize(new java.awt.Dimension(195, 65));
        Hour1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Hour1ActionPerformed(evt);
            }
        });

        Hour2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Hour2.setForeground(new java.awt.Color(0, 0, 0));
        Hour2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OrarioButton.png"))); // NOI18N
        Hour2.setContentAreaFilled(false);
        Hour2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Hour2.setLabel("1:00-2:00");
        Hour2.setPreferredSize(new java.awt.Dimension(195, 65));
        Hour2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Hour2ActionPerformed(evt);
            }
        });

        Hour3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Hour3.setForeground(new java.awt.Color(0, 0, 0));
        Hour3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OrarioButton.png"))); // NOI18N
        Hour3.setContentAreaFilled(false);
        Hour3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Hour3.setLabel("2:00-3:00");
        Hour3.setPreferredSize(new java.awt.Dimension(195, 65));
        Hour3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Hour3ActionPerformed(evt);
            }
        });

        Hour4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Hour4.setForeground(new java.awt.Color(0, 0, 0));
        Hour4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OrarioButton.png"))); // NOI18N
        Hour4.setContentAreaFilled(false);
        Hour4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Hour4.setLabel("3:00-4:00");
        Hour4.setPreferredSize(new java.awt.Dimension(195, 65));
        Hour4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Hour4ActionPerformed(evt);
            }
        });

        Hour5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Hour5.setForeground(new java.awt.Color(0, 0, 0));
        Hour5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OrarioButton.png"))); // NOI18N
        Hour5.setText("4:00-5:00");
        Hour5.setContentAreaFilled(false);
        Hour5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Hour5.setPreferredSize(new java.awt.Dimension(195, 65));
        Hour5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Hour5ActionPerformed(evt);
            }
        });

        Hour6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Hour6.setForeground(new java.awt.Color(0, 0, 0));
        Hour6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OrarioButton.png"))); // NOI18N
        Hour6.setText("5:00-6:00");
        Hour6.setContentAreaFilled(false);
        Hour6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Hour6.setPreferredSize(new java.awt.Dimension(195, 65));
        Hour6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Hour6ActionPerformed(evt);
            }
        });

        Hour7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Hour7.setForeground(new java.awt.Color(0, 0, 0));
        Hour7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OrarioButton.png"))); // NOI18N
        Hour7.setText("6:00-7:00");
        Hour7.setContentAreaFilled(false);
        Hour7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Hour7.setPreferredSize(new java.awt.Dimension(195, 65));
        Hour7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Hour7ActionPerformed(evt);
            }
        });

        Hour8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Hour8.setForeground(new java.awt.Color(0, 0, 0));
        Hour8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OrarioButton.png"))); // NOI18N
        Hour8.setText("7:00-8:00");
        Hour8.setContentAreaFilled(false);
        Hour8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Hour8.setPreferredSize(new java.awt.Dimension(195, 65));
        Hour8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Hour8ActionPerformed(evt);
            }
        });

        ConfirmButton2.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        ConfirmButton2.setForeground(new java.awt.Color(255, 255, 255));
        ConfirmButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ConfirmButton.png"))); // NOI18N
        ConfirmButton2.setText("Annulla");
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(Turno1Button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(Turno2Button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(Turno3Button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Hour1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Hour2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Hour3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Hour4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ConfirmButton1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Hour5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Hour6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Hour7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Hour8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(37, 37, 37))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(333, 333, 333)
                .addComponent(ConfirmButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(Turno1Button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Turno2Button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Turno3Button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Hour5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(Hour6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(Hour7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(Hour8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Hour1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(Hour2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(Hour3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(Hour4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ConfirmButton1)
                    .addComponent(ConfirmButton2))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
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

        setBounds(660, 50, 600, 645);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        // TODO add your handling code here:
        
        //SC.DisposeWindow(this);
    }//GEN-LAST:event_jButton32ActionPerformed

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
        
        if(ora == false){
            inizio = hour;
            //SC.startingHourSelected(UT, giorno, ora, inizio);
        } else {
            inizio = inizioStraordinario;
            fineStraordinario = hour;
            //SC.endingHourSelected(UT, giorno, inizio, fineStraordinario);
        }
        
        //SC.DisposeWindow(this);
    }//GEN-LAST:event_ConfirmButton1ActionPerformed

    private void Turno1ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Turno1ButtonActionPerformed
        // TODO add your handling code here:
        setSelectedTurn(Turno1Button);
        Hour1.setText("0:00-1:00");
        Hour2.setText("1:00-2:00");
        Hour3.setText("2:00-3:00");
        Hour4.setText("3:00-4:00");
        Hour5.setText("4:00-5:00");
        Hour6.setText("5:00-6:00");
        Hour7.setText("6:00-7:00");
        Hour8.setText("7:00-8:00");
    }//GEN-LAST:event_Turno1ButtonActionPerformed

    private void Turno2ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Turno2ButtonActionPerformed
        // TODO add your handling code here:
        setSelectedTurn(Turno2Button);
        Hour1.setText("8:00-9:00");
        Hour2.setText("9:00-10:00");
        Hour3.setText("10:00-11:00");
        Hour4.setText("11:00-12:00");
        Hour5.setText("12:00-13:00");
        Hour6.setText("13:00-14:00");
        Hour7.setText("14:00-15:00");
        Hour8.setText("15:00-16:00");

    }//GEN-LAST:event_Turno2ButtonActionPerformed

    private void Turno3ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Turno3ButtonActionPerformed
        // TODO add your handling code here:
        setSelectedTurn(Turno3Button);
        Hour1.setText("16:00-17:00");
        Hour2.setText("17:00-18:00");
        Hour3.setText("18:00-19:00");
        Hour4.setText("19:00-20:00");
        Hour5.setText("20:00-21:00");
        Hour6.setText("21:00-22:00");
        Hour7.setText("22:00-23:00");
        Hour8.setText("23:00-24:00");
    }//GEN-LAST:event_Turno3ButtonActionPerformed

    private void Hour1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Hour1ActionPerformed
        // TODO add your handling code here:
        setSelectedHour(Hour1);
    }//GEN-LAST:event_Hour1ActionPerformed

    private void Hour2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Hour2ActionPerformed
        // TODO add your handling code here:
        setSelectedHour(Hour2);

    }//GEN-LAST:event_Hour2ActionPerformed

    private void Hour3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Hour3ActionPerformed
        // TODO add your handling code here:
        setSelectedHour(Hour3);

    }//GEN-LAST:event_Hour3ActionPerformed

    private void Hour4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Hour4ActionPerformed
        // TODO add your handling code here:
        setSelectedHour(Hour4);

    }//GEN-LAST:event_Hour4ActionPerformed

    private void Hour5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Hour5ActionPerformed
        // TODO add your handling code here:
        setSelectedHour(Hour5);

    }//GEN-LAST:event_Hour5ActionPerformed

    private void Hour6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Hour6ActionPerformed
        // TODO add your handling code here:
        setSelectedHour(Hour6);

    }//GEN-LAST:event_Hour6ActionPerformed

    private void Hour7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Hour7ActionPerformed
        // TODO add your handling code here:
        setSelectedHour(Hour7);

    }//GEN-LAST:event_Hour7ActionPerformed

    private void Hour8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Hour8ActionPerformed
        // TODO add your handling code here:
        setSelectedHour(Hour8);

    }//GEN-LAST:event_Hour8ActionPerformed

    private void ConfirmButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmButton2ActionPerformed
        // TODO add your handling code here:
        /*CI = new CalendarioInterattivo(SC, UT);
        SC.daySelected(CI, UT, giorno);
        SC.DisposeWindow(this);*/
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
            java.util.logging.Logger.getLogger(CalendarioOreInterattivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalendarioOreInterattivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalendarioOreInterattivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalendarioOreInterattivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalendarioOreInterattivo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ConfirmButton1;
    private javax.swing.JButton ConfirmButton2;
    private javax.swing.JButton Hour1;
    private javax.swing.JButton Hour2;
    private javax.swing.JButton Hour3;
    private javax.swing.JButton Hour4;
    private javax.swing.JButton Hour5;
    private javax.swing.JButton Hour6;
    private javax.swing.JButton Hour7;
    private javax.swing.JButton Hour8;
    private javax.swing.JButton Turno1Button;
    private javax.swing.JButton Turno2Button;
    private javax.swing.JButton Turno3Button;
    private javax.swing.JButton jButton32;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables

    public JButton getSelectedHour() {
        return selectedHour;
    }

    public void setSelectedHour(JButton selectedHour) {
        if (this.selectedHour != null) {
            this.selectedHour.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OrarioButton.png")));
            this.selectedHour = selectedHour;
            this.selectedHour.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OrarioButtonSelezionato.png")));

        } else {
            this.selectedHour = selectedHour;
            this.selectedHour.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OrarioButtonSelezionato.png")));

        }
    }

    public JButton getSelectedTurn() {
        return selectedTurn;
    }

    public void setSelectedTurn(JButton selectedTurn) {
        if (this.selectedTurn != null) {
            this.selectedTurn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TurnoButton.png")));
            this.selectedTurn = selectedTurn;
            this.selectedTurn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TurnoButtonSelezionato.png")));

        } else {
            this.selectedTurn = selectedTurn;
            this.selectedTurn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TurnoButtonSelezionato.png")));

        }
    }
    
    int inizio;
    int inizioStraordinario;
    int fineStraordinario;
    boolean ora;
    int giorno;
    //StraordinariControl SC;
    CalendarioInterattivo CI;
    Utente UT;

}
