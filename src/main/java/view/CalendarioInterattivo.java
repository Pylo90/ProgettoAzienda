package view;

import controller.AreaPersonale.RichiesteControl;
import javax.swing.ButtonGroup;
//import controller.StraordinariControl;
import model.Utente;
import javax.swing.JButton;

public class CalendarioInterattivo extends javax.swing.JFrame {
    public ButtonGroup getButtonGroup1() {
        return buttonGroup1;
    }
    
    String f;

    public CalendarioInterattivo(RichiesteControl RC, String funzione) {
        this.RC = RC;
        initComponents();
        meseIndex = 0;
        setSelectedButton(jButton1);
        MonthLabel.setText(mesi[meseIndex]);
        f = funzione;
        this.setVisible(true);
        this.setAlwaysOnTop(true);
    }

    /*public CalendarioInterattivo(StraordinariControl SC, Utente UT) {
        this.SC = SC;
        this.UT = UT; //Utente serve a prendere il suo orario e annerire i giorni in cui non lavora
        initComponents();
        meseIndex = 0;
        MonthLabel.setText(mesi[meseIndex]);
    }*/

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        MonthLabel = new javax.swing.JLabel();
        nextMonthButton = new javax.swing.JButton();
        prevMonthButton = new javax.swing.JButton();
        ConfirmButton = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 248, 238));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setMinimumSize(new java.awt.Dimension(600, 700));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 700));

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/65x65ButtonBeige.png"))); // NOI18N
        jButton1.setText("1");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        buttonGroup1.add(jButton1);
        jButton1.setContentAreaFilled(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/65x65ButtonBeige.png"))); // NOI18N
        jButton2.setText("2");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        buttonGroup1.add(jButton2);
        jButton2.setContentAreaFilled(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/65x65ButtonBeige.png"))); // NOI18N
        jButton3.setText("3");
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        buttonGroup1.add(jButton3);
        jButton3.setContentAreaFilled(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 0));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/65x65ButtonBeige.png"))); // NOI18N
        jButton4.setText("4");
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        buttonGroup1.add(jButton4);
        jButton4.setContentAreaFilled(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 0, 0));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/65x65ButtonBeige.png"))); // NOI18N
        jButton5.setText("5");
        jButton5.setBorder(null);
        jButton5.setBorderPainted(false);
        buttonGroup1.add(jButton5);
        jButton5.setContentAreaFilled(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        jButton6.setForeground(new java.awt.Color(0, 0, 0));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/65x65ButtonBeige.png"))); // NOI18N
        jButton6.setText("6");
        jButton6.setBorder(null);
        jButton6.setBorderPainted(false);
        buttonGroup1.add(jButton6);
        jButton6.setContentAreaFilled(false);
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        jButton7.setForeground(new java.awt.Color(0, 0, 0));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/65x65ButtonBeige.png"))); // NOI18N
        jButton7.setText("7");
        jButton7.setBorder(null);
        jButton7.setBorderPainted(false);
        buttonGroup1.add(jButton7);
        jButton7.setContentAreaFilled(false);
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        jButton8.setForeground(new java.awt.Color(0, 0, 0));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/65x65ButtonBeige.png"))); // NOI18N
        jButton8.setText("8");
        jButton8.setBorder(null);
        jButton8.setBorderPainted(false);
        buttonGroup1.add(jButton8);
        jButton8.setContentAreaFilled(false);
        jButton8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        jButton9.setForeground(new java.awt.Color(0, 0, 0));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/65x65ButtonBeige.png"))); // NOI18N
        jButton9.setText("9");
        jButton9.setBorder(null);
        jButton9.setBorderPainted(false);
        buttonGroup1.add(jButton9);
        jButton9.setContentAreaFilled(false);
        jButton9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        jButton10.setForeground(new java.awt.Color(0, 0, 0));
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/65x65ButtonBeige.png"))); // NOI18N
        jButton10.setText("10");
        jButton10.setBorder(null);
        jButton10.setBorderPainted(false);
        buttonGroup1.add(jButton10);
        jButton10.setContentAreaFilled(false);
        jButton10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        jButton11.setForeground(new java.awt.Color(0, 0, 0));
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/65x65ButtonBeige.png"))); // NOI18N
        jButton11.setText("11");
        jButton11.setBorder(null);
        jButton11.setBorderPainted(false);
        buttonGroup1.add(jButton11);
        jButton11.setContentAreaFilled(false);
        jButton11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        jButton12.setForeground(new java.awt.Color(0, 0, 0));
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/65x65ButtonBeige.png"))); // NOI18N
        jButton12.setText("12");
        jButton12.setBorder(null);
        jButton12.setBorderPainted(false);
        buttonGroup1.add(jButton12);
        jButton12.setContentAreaFilled(false);
        jButton12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        jButton13.setForeground(new java.awt.Color(0, 0, 0));
        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/65x65ButtonBeige.png"))); // NOI18N
        jButton13.setText("13");
        jButton13.setBorder(null);
        jButton13.setBorderPainted(false);
        buttonGroup1.add(jButton13);
        jButton13.setContentAreaFilled(false);
        jButton13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        jButton14.setForeground(new java.awt.Color(0, 0, 0));
        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/65x65ButtonBeige.png"))); // NOI18N
        jButton14.setText("14");
        jButton14.setBorder(null);
        jButton14.setBorderPainted(false);
        buttonGroup1.add(jButton14);
        jButton14.setContentAreaFilled(false);
        jButton14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        jButton15.setForeground(new java.awt.Color(0, 0, 0));
        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/65x65ButtonBeige.png"))); // NOI18N
        jButton15.setText("15");
        jButton15.setBorder(null);
        jButton15.setBorderPainted(false);
        buttonGroup1.add(jButton15);
        jButton15.setContentAreaFilled(false);
        jButton15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        jButton16.setForeground(new java.awt.Color(0, 0, 0));
        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/65x65ButtonBeige.png"))); // NOI18N
        jButton16.setText("16");
        jButton16.setBorder(null);
        jButton16.setBorderPainted(false);
        buttonGroup1.add(jButton16);
        jButton16.setContentAreaFilled(false);
        jButton16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton17.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        jButton17.setForeground(new java.awt.Color(0, 0, 0));
        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/65x65ButtonBeige.png"))); // NOI18N
        jButton17.setText("17");
        jButton17.setBorder(null);
        jButton17.setBorderPainted(false);
        buttonGroup1.add(jButton17);
        jButton17.setContentAreaFilled(false);
        jButton17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton18.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        jButton18.setForeground(new java.awt.Color(0, 0, 0));
        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/65x65ButtonBeige.png"))); // NOI18N
        jButton18.setText("18");
        jButton18.setBorder(null);
        jButton18.setBorderPainted(false);
        buttonGroup1.add(jButton18);
        jButton18.setContentAreaFilled(false);
        jButton18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton19.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        jButton19.setForeground(new java.awt.Color(0, 0, 0));
        jButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/65x65ButtonBeige.png"))); // NOI18N
        jButton19.setText("19");
        jButton19.setBorder(null);
        jButton19.setBorderPainted(false);
        buttonGroup1.add(jButton19);
        jButton19.setContentAreaFilled(false);
        jButton19.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jButton20.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        jButton20.setForeground(new java.awt.Color(0, 0, 0));
        jButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/65x65ButtonBeige.png"))); // NOI18N
        jButton20.setText("20");
        jButton20.setBorder(null);
        jButton20.setBorderPainted(false);
        buttonGroup1.add(jButton20);
        jButton20.setContentAreaFilled(false);
        jButton20.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jButton21.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        jButton21.setForeground(new java.awt.Color(0, 0, 0));
        jButton21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/65x65ButtonBeige.png"))); // NOI18N
        jButton21.setText("21");
        jButton21.setBorder(null);
        jButton21.setBorderPainted(false);
        buttonGroup1.add(jButton21);
        jButton21.setContentAreaFilled(false);
        jButton21.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jButton22.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        jButton22.setForeground(new java.awt.Color(0, 0, 0));
        jButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/65x65ButtonBeige.png"))); // NOI18N
        jButton22.setText("22");
        jButton22.setBorder(null);
        jButton22.setBorderPainted(false);
        buttonGroup1.add(jButton22);
        jButton22.setContentAreaFilled(false);
        jButton22.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jButton23.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        jButton23.setForeground(new java.awt.Color(0, 0, 0));
        jButton23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/65x65ButtonBeige.png"))); // NOI18N
        jButton23.setText("23");
        jButton23.setBorder(null);
        jButton23.setBorderPainted(false);
        buttonGroup1.add(jButton23);
        jButton23.setContentAreaFilled(false);
        jButton23.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        jButton24.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        jButton24.setForeground(new java.awt.Color(0, 0, 0));
        jButton24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/65x65ButtonBeige.png"))); // NOI18N
        jButton24.setText("24");
        jButton24.setBorder(null);
        jButton24.setBorderPainted(false);
        buttonGroup1.add(jButton24);
        jButton24.setContentAreaFilled(false);
        jButton24.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        jButton25.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        jButton25.setForeground(new java.awt.Color(0, 0, 0));
        jButton25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/65x65ButtonBeige.png"))); // NOI18N
        jButton25.setText("25");
        jButton25.setBorder(null);
        jButton25.setBorderPainted(false);
        buttonGroup1.add(jButton25);
        jButton25.setContentAreaFilled(false);
        jButton25.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        jButton26.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        jButton26.setForeground(new java.awt.Color(0, 0, 0));
        jButton26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/65x65ButtonBeige.png"))); // NOI18N
        jButton26.setText("26");
        jButton26.setBorder(null);
        jButton26.setBorderPainted(false);
        buttonGroup1.add(jButton26);
        jButton26.setContentAreaFilled(false);
        jButton26.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        jButton27.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        jButton27.setForeground(new java.awt.Color(0, 0, 0));
        jButton27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/65x65ButtonBeige.png"))); // NOI18N
        jButton27.setText("27");
        jButton27.setBorder(null);
        jButton27.setBorderPainted(false);
        buttonGroup1.add(jButton27);
        jButton27.setContentAreaFilled(false);
        jButton27.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        jButton28.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        jButton28.setForeground(new java.awt.Color(0, 0, 0));
        jButton28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/65x65ButtonBeige.png"))); // NOI18N
        jButton28.setText("28");
        jButton28.setBorder(null);
        jButton28.setBorderPainted(false);
        buttonGroup1.add(jButton28);
        jButton28.setContentAreaFilled(false);
        jButton28.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        jButton29.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        jButton29.setForeground(new java.awt.Color(0, 0, 0));
        jButton29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/65x65ButtonBeige.png"))); // NOI18N
        jButton29.setText("29");
        jButton29.setBorder(null);
        jButton29.setBorderPainted(false);
        buttonGroup1.add(jButton29);
        jButton29.setContentAreaFilled(false);
        jButton29.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });

        jButton30.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        jButton30.setForeground(new java.awt.Color(0, 0, 0));
        jButton30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/65x65ButtonBeige.png"))); // NOI18N
        jButton30.setText("30");
        jButton30.setBorder(null);
        jButton30.setBorderPainted(false);
        buttonGroup1.add(jButton30);
        jButton30.setContentAreaFilled(false);
        jButton30.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });

        jButton31.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        jButton31.setForeground(new java.awt.Color(0, 0, 0));
        jButton31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/65x65ButtonBeige.png"))); // NOI18N
        jButton31.setText("31");
        jButton31.setBorder(null);
        jButton31.setBorderPainted(false);
        buttonGroup1.add(jButton31);
        jButton31.setContentAreaFilled(false);
        jButton31.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });

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
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(5);
        jTextArea2.setText("Quale giorno vuoi \nselezionare?");
        jTextArea2.setBorder(null);
        jScrollPane2.setViewportView(jTextArea2);

        MonthLabel.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        MonthLabel.setForeground(new java.awt.Color(0, 0, 0));
        MonthLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MonthLabel.setText("cottu");

        nextMonthButton.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        nextMonthButton.setForeground(new java.awt.Color(0, 0, 0));
        nextMonthButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/40x40ButtonBeige.png"))); // NOI18N
        nextMonthButton.setText("→");
        nextMonthButton.setAlignmentY(0.0F);
        nextMonthButton.setBorder(null);
        nextMonthButton.setBorderPainted(false);
        buttonGroup1.add(nextMonthButton);
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

        prevMonthButton.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        prevMonthButton.setForeground(new java.awt.Color(0, 0, 0));
        prevMonthButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/40x40ButtonBeige.png"))); // NOI18N
        prevMonthButton.setText("←");
        prevMonthButton.setAlignmentY(0.0F);
        prevMonthButton.setBorder(null);
        prevMonthButton.setBorderPainted(false);
        buttonGroup1.add(prevMonthButton);
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

        ConfirmButton.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        ConfirmButton.setForeground(new java.awt.Color(255, 255, 255));
        ConfirmButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ConfirmButton.png"))); // NOI18N
        ConfirmButton.setText("Conferma");
        ConfirmButton.setAlignmentY(0.0F);
        ConfirmButton.setBorder(null);
        ConfirmButton.setBorderPainted(false);
        buttonGroup1.add(ConfirmButton);
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

        jButton32.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        jButton32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CloseIcon.png"))); // NOI18N
        jButton32.setBorder(null);
        jButton32.setBorderPainted(false);
        buttonGroup1.add(jButton32);
        jButton32.setContentAreaFilled(false);
        jButton32.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton32.setPreferredSize(new java.awt.Dimension(65, 65));
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jButton8)
                                    .addGap(10, 10, 10)
                                    .addComponent(jButton9)
                                    .addGap(10, 10, 10)
                                    .addComponent(jButton10)
                                    .addGap(10, 10, 10)
                                    .addComponent(jButton11)
                                    .addGap(10, 10, 10)
                                    .addComponent(jButton12)
                                    .addGap(10, 10, 10)
                                    .addComponent(jButton13)
                                    .addGap(10, 10, 10)
                                    .addComponent(jButton14))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jButton15)
                                    .addGap(10, 10, 10)
                                    .addComponent(jButton16)
                                    .addGap(10, 10, 10)
                                    .addComponent(jButton17)
                                    .addGap(10, 10, 10)
                                    .addComponent(jButton18)
                                    .addGap(10, 10, 10)
                                    .addComponent(jButton19)
                                    .addGap(10, 10, 10)
                                    .addComponent(jButton20)
                                    .addGap(10, 10, 10)
                                    .addComponent(jButton21))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jButton22)
                                    .addGap(10, 10, 10)
                                    .addComponent(jButton23)
                                    .addGap(10, 10, 10)
                                    .addComponent(jButton24)
                                    .addGap(10, 10, 10)
                                    .addComponent(jButton25)
                                    .addGap(10, 10, 10)
                                    .addComponent(jButton26)
                                    .addGap(10, 10, 10)
                                    .addComponent(jButton27)
                                    .addGap(10, 10, 10)
                                    .addComponent(jButton28)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton29)
                                .addGap(10, 10, 10)
                                .addComponent(jButton30)
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ConfirmButton)
                                    .addComponent(jButton31))))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton2)
                                        .addGap(10, 10, 10)
                                        .addComponent(jButton3)
                                        .addGap(10, 10, 10)
                                        .addComponent(jButton4)
                                        .addGap(10, 10, 10)
                                        .addComponent(jButton5)
                                        .addGap(10, 10, 10)
                                        .addComponent(jButton6))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(prevMonthButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(MonthLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(nextMonthButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jButton7))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                                .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nextMonthButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prevMonthButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MonthLabel))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6)
                    .addComponent(jButton7))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton8)
                    .addComponent(jButton9)
                    .addComponent(jButton10)
                    .addComponent(jButton11)
                    .addComponent(jButton12)
                    .addComponent(jButton13)
                    .addComponent(jButton14))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton15)
                    .addComponent(jButton16)
                    .addComponent(jButton17)
                    .addComponent(jButton18)
                    .addComponent(jButton19)
                    .addComponent(jButton20)
                    .addComponent(jButton21))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton22)
                    .addComponent(jButton23)
                    .addComponent(jButton24)
                    .addComponent(jButton25)
                    .addComponent(jButton26)
                    .addComponent(jButton27)
                    .addComponent(jButton28))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton31)
                    .addComponent(jButton29)
                    .addComponent(jButton30))
                .addGap(18, 18, 18)
                .addComponent(ConfirmButton)
                .addContainerGap(52, Short.MAX_VALUE))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        setBounds(660, 50, 600, 700);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setSelectedButton(jButton1);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        setSelectedButton(jButton2);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        setSelectedButton(jButton3);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        setSelectedButton(jButton4);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        setSelectedButton(jButton5);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        setSelectedButton(jButton6);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        setSelectedButton(jButton7);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        setSelectedButton(jButton8);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        setSelectedButton(jButton9);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        setSelectedButton(jButton10);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        setSelectedButton(jButton11);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        setSelectedButton(jButton12);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        setSelectedButton(jButton13);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        setSelectedButton(jButton14);
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        setSelectedButton(jButton15);
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        setSelectedButton(jButton16);
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        setSelectedButton(jButton17);
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        setSelectedButton(jButton18);
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        setSelectedButton(jButton19);
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        setSelectedButton(jButton20);
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        setSelectedButton(jButton21);
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        setSelectedButton(jButton22);
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        setSelectedButton(jButton23);
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        setSelectedButton(jButton24);
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        setSelectedButton(jButton25);
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        setSelectedButton(jButton26);
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        setSelectedButton(jButton27);
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        setSelectedButton(jButton28);
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        setSelectedButton(jButton29);
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        setSelectedButton(jButton30);
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        setSelectedButton(jButton31);
    }//GEN-LAST:event_jButton31ActionPerformed

    private void nextMonthButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextMonthButtonActionPerformed
        meseIndex = (meseIndex + 1) % 12;
        MonthLabel.setText(mesi[meseIndex]);
    }//GEN-LAST:event_nextMonthButtonActionPerformed

    private void prevMonthButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevMonthButtonActionPerformed
        meseIndex = (((meseIndex - 1) % 12) + 12) % 12;
        MonthLabel.setText(mesi[meseIndex]);
    }//GEN-LAST:event_prevMonthButtonActionPerformed

    private void ConfirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmButtonActionPerformed
        switch (f) {
            case "RichiestaPermesso":
                RC.selectGiornoPermesso(Integer.parseInt(selectedButton.getText()), meseIndex + 1);
                RC.DisposeWindow(this);
                break;
            case "RichiestaFerie":
                RC.selectGiornoFerie(Integer.parseInt(selectedButton.getText()), meseIndex + 1, "F",null);
                RC.DisposeWindow(this);
                break;
            
            case "ScambiaOrari":
                RC.selectGiornoScambio(Integer.parseInt(selectedButton.getText()), meseIndex + 1, "1");
                RC.DisposeWindow(this);
                break;
            case "ScambiaOrari2":
                RC.selectGiornoScambio(Integer.parseInt(selectedButton.getText()), meseIndex + 1, "2");
                RC.DisposeWindow(this);
                break;
      
            case "ComunicazioneMalattia":
                RC.selectGiornoMalattia(Integer.parseInt(selectedButton.getText()), meseIndex + 1,null,"normale");
                RC.DisposeWindow(this);
                break;
            case "ComunicazioneMalattia2":
                RC.selectGiornoMalattia(Integer.parseInt(selectedButton.getText()), meseIndex + 1,null,"fine");
                RC.DisposeWindow(this);
                break;
        }
    }//GEN-LAST:event_ConfirmButtonActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        RC.DisposeWindow(this);
    }//GEN-LAST:event_jButton32ActionPerformed

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
            java.util.logging.Logger.getLogger(CalendarioInterattivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalendarioInterattivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalendarioInterattivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalendarioInterattivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
 /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalendarioInterattivo().setVisible(true);
            }
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ConfirmButton;
    private javax.swing.JLabel MonthLabel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JButton nextMonthButton;
    private javax.swing.JButton prevMonthButton;
    // End of variables declaration//GEN-END:variables
private javax.swing.JButton selectedButton;

    // Personal generator
    public JButton getSelectedButton() {
        return selectedButton;
    }

    public void setSelectedButton(JButton selectedButton) {
        if (this.selectedButton != null) {
            this.selectedButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/65x65ButtonBeige.png")));
            this.selectedButton = selectedButton;

            this.selectedButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/65x65ButtonRed.png")));
        } else {
            this.selectedButton = selectedButton;
            this.selectedButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/65x65ButtonRed.png")));
        }
    }

    public String[] mesi = new String[]{"Gennaio", "Febbraio", "Marzo", "Aprile", "Maggio", "Giugno", "Luglio", "Agosto", "Settembre", "Ottobre", "Novembre", "Dicembre"};
    int meseIndex;

    RichiesteControl RC;




}
