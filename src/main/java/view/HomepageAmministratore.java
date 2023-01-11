package view;

import controller.LoginControl;
import java.awt.Dimension;
/**
 *
 * @author Davide
 */
public class HomepageAmministratore extends javax.swing.JFrame {

    LoginControl lc;
    
    public HomepageAmministratore(LoginControl lc) {
        initComponents();
        this.lc = lc;
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
        passwordButton = new javax.swing.JButton();
        salaryButton = new javax.swing.JButton();
        notificationButton = new javax.swing.JButton();
        requestButton = new javax.swing.JButton();
        scheduleButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        requestPanel = new javax.swing.JPanel();
        congedoButton = new javax.swing.JButton();
        permessoButton = new javax.swing.JButton();
        ferieButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        ritardoLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        impSalaryButton = new javax.swing.JButton();
        impScheduleButton = new javax.swing.JButton();
        healthButton = new javax.swing.JButton();
        switchButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        straordButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        scioperoLabel = new javax.swing.JLabel();
        assumiButton = new javax.swing.JButton();
        licenziaButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jButton18 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        nameText = new javax.swing.JTextField();
        idText = new javax.swing.JTextField();
        mailText = new javax.swing.JTextField();
        phoneText = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 1050));

        mainPanel.setBackground(new java.awt.Color(255, 248, 238));
        mainPanel.setFocusable(false);
        mainPanel.setMinimumSize(new java.awt.Dimension(1024, 768));
        mainPanel.setPreferredSize(new java.awt.Dimension(1920, 1080));

        jPanel1.setBackground(new java.awt.Color(255, 248, 238));
        jPanel1.setFocusable(false);
        jPanel1.setMaximumSize(new java.awt.Dimension(200, 875));
        jPanel1.setMinimumSize(new java.awt.Dimension(200, 875));
        jPanel1.setPreferredSize(new java.awt.Dimension(200, 875));
        jPanel1.setLayout(null);

        passwordButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PasswordButton.png"))); // NOI18N
        passwordButton.setBorderPainted(false);
        passwordButton.setContentAreaFilled(false);
        passwordButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        passwordButton.setFocusable(false);
        passwordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordButtonActionPerformed(evt);
            }
        });
        jPanel1.add(passwordButton);
        passwordButton.setBounds(50, 290, 100, 107);

        salaryButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BankButton.png"))); // NOI18N
        salaryButton.setBorderPainted(false);
        salaryButton.setContentAreaFilled(false);
        salaryButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salaryButton.setFocusable(false);
        salaryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salaryButtonActionPerformed(evt);
            }
        });
        jPanel1.add(salaryButton);
        salaryButton.setBounds(50, 50, 100, 107);

        notificationButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NotificationButton.png"))); // NOI18N
        notificationButton.setBorderPainted(false);
        notificationButton.setContentAreaFilled(false);
        notificationButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        notificationButton.setFocusable(false);
        notificationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notificationButtonActionPerformed(evt);
            }
        });
        jPanel1.add(notificationButton);
        notificationButton.setBounds(50, 410, 100, 107);

        requestButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RequestIcon.png"))); // NOI18N
        requestButton.setBorderPainted(false);
        requestButton.setContentAreaFilled(false);
        requestButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        requestButton.setFocusable(false);
        requestButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestButtonActionPerformed(evt);
            }
        });
        jPanel1.add(requestButton);
        requestButton.setBounds(50, 530, 100, 107);

        scheduleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ScheduleButton.png"))); // NOI18N
        scheduleButton.setBorderPainted(false);
        scheduleButton.setContentAreaFilled(false);
        scheduleButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        scheduleButton.setFocusable(false);
        scheduleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scheduleButtonActionPerformed(evt);
            }
        });
        jPanel1.add(scheduleButton);
        scheduleButton.setBounds(50, 170, 100, 107);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/costinaHomepageImpiegato.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 200, 678);

        requestPanel.setBackground(new java.awt.Color(255, 248, 238));
        requestPanel.setMaximumSize(new java.awt.Dimension(450, 220));
        requestPanel.setMinimumSize(new java.awt.Dimension(0, 0));
        requestPanel.setPreferredSize(new java.awt.Dimension(450, 220));
        requestPanel.setLayout(null);

        congedoButton.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        congedoButton.setForeground(new java.awt.Color(255, 248, 238));
        congedoButton.setText("Congedo parentale");
        congedoButton.setBorder(null);
        congedoButton.setBorderPainted(false);
        congedoButton.setContentAreaFilled(false);
        congedoButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        congedoButton.setFocusable(false);
        congedoButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        congedoButton.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        congedoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                congedoButtonActionPerformed(evt);
            }
        });
        requestPanel.add(congedoButton);
        congedoButton.setBounds(30, 150, 310, 50);

        permessoButton.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        permessoButton.setForeground(new java.awt.Color(255, 248, 238));
        permessoButton.setText("Permesso");
        permessoButton.setBorder(null);
        permessoButton.setBorderPainted(false);
        permessoButton.setContentAreaFilled(false);
        permessoButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        permessoButton.setFocusPainted(false);
        permessoButton.setFocusable(false);
        permessoButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        permessoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                permessoButtonActionPerformed(evt);
            }
        });
        requestPanel.add(permessoButton);
        permessoButton.setBounds(30, 10, 170, 50);

        ferieButton.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        ferieButton.setForeground(new java.awt.Color(255, 248, 238));
        ferieButton.setText("Ferie");
        ferieButton.setBorder(null);
        ferieButton.setBorderPainted(false);
        ferieButton.setContentAreaFilled(false);
        ferieButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ferieButton.setFocusable(false);
        ferieButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ferieButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ferieButtonActionPerformed(evt);
            }
        });
        requestPanel.add(ferieButton);
        ferieButton.setBounds(30, 80, 180, 48);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SecondaCostinaHomepageImpiegato.png"))); // NOI18N
        requestPanel.add(jLabel3);
        jLabel3.setBounds(0, 0, 450, 220);

        ritardoLabel.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        ritardoLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        ritardoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RitardoCostina.png"))); // NOI18N
        ritardoLabel.setText("Firma ritardo");
        ritardoLabel.setToolTipText("");
        ritardoLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ritardoLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ritardoLabel.setIconTextGap(0);
        ritardoLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ritardoLabelMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/costinaDestra.png"))); // NOI18N
        jLabel4.setText("Nome Azienda");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jPanel3.setBackground(new java.awt.Color(255, 248, 238));
        jPanel3.setLayout(null);

        impSalaryButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salaryImpiegatoButton.png"))); // NOI18N
        impSalaryButton.setBorder(null);
        impSalaryButton.setContentAreaFilled(false);
        impSalaryButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        impSalaryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                impSalaryButtonActionPerformed(evt);
            }
        });
        jPanel3.add(impSalaryButton);
        impSalaryButton.setBounds(50, 20, 100, 100);

        impScheduleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OrariImpiegatoButton.png"))); // NOI18N
        impScheduleButton.setBorder(null);
        impScheduleButton.setContentAreaFilled(false);
        impScheduleButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        impScheduleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                impScheduleButtonActionPerformed(evt);
            }
        });
        jPanel3.add(impScheduleButton);
        impScheduleButton.setBounds(50, 150, 100, 100);

        healthButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MalattiaButton.png"))); // NOI18N
        healthButton.setBorder(null);
        healthButton.setContentAreaFilled(false);
        healthButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        healthButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                healthButtonActionPerformed(evt);
            }
        });
        jPanel3.add(healthButton);
        healthButton.setBounds(50, 280, 100, 100);

        switchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SwitchButton.png"))); // NOI18N
        switchButton.setBorder(null);
        switchButton.setContentAreaFilled(false);
        switchButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        switchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                switchButtonActionPerformed(evt);
            }
        });
        jPanel3.add(switchButton);
        switchButton.setBounds(50, 410, 100, 100);

        editButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EditButton.png"))); // NOI18N
        editButton.setBorder(null);
        editButton.setContentAreaFilled(false);
        editButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });
        jPanel3.add(editButton);
        editButton.setBounds(50, 540, 100, 100);

        straordButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/StraordinariButton.png"))); // NOI18N
        straordButton.setBorder(null);
        straordButton.setContentAreaFilled(false);
        straordButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        straordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                straordButtonActionPerformed(evt);
            }
        });
        jPanel3.add(straordButton);
        straordButton.setBounds(50, 670, 100, 100);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/costinaHomepageImpiegato-flipped.png"))); // NOI18N
        jPanel3.add(jLabel5);
        jLabel5.setBounds(0, -60, 200, 880);

        scioperoLabel.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        scioperoLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        scioperoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RitardoCostina-flipped.png"))); // NOI18N
        scioperoLabel.setText("Indici sciopero");
        scioperoLabel.setToolTipText("");
        scioperoLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        scioperoLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        scioperoLabel.setIconTextGap(0);
        scioperoLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                scioperoLabelMouseClicked(evt);
            }
        });

        assumiButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AssumiButton.png"))); // NOI18N
        assumiButton.setBorder(null);
        assumiButton.setContentAreaFilled(false);
        assumiButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        assumiButton.setIconTextGap(0);
        assumiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assumiButtonActionPerformed(evt);
            }
        });

        licenziaButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LicenziaButton.png"))); // NOI18N
        licenziaButton.setBorder(null);
        licenziaButton.setContentAreaFilled(false);
        licenziaButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        licenziaButton.setIconTextGap(0);
        licenziaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                licenziaButtonActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(255, 248, 238));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagePlaceholder.png"))); // NOI18N

        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LogoutIcon.png"))); // NOI18N
        jButton18.setBorder(null);
        jButton18.setContentAreaFilled(false);
        jButton18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(255, 248, 238));
        jPanel5.setFocusable(false);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PersonIcon.png"))); // NOI18N
        jLabel8.setText(":");
        jLabel8.setToolTipText("");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel9.setText("ID :");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MailIcon.png"))); // NOI18N
        jLabel10.setText(":");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PhoneIcon.png"))); // NOI18N
        jLabel11.setText(":");

        nameText.setBackground(new java.awt.Color(255, 248, 238));
        nameText.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        nameText.setText(" Lorem ipsum dolor sit gravida.");
        nameText.setBorder(null);
        nameText.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        nameText.setFocusable(false);

        idText.setBackground(new java.awt.Color(255, 248, 238));
        idText.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        idText.setText(" Lorem ipsum dolor sit gravida.");
        idText.setBorder(null);
        idText.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        idText.setFocusable(false);

        mailText.setBackground(new java.awt.Color(255, 248, 238));
        mailText.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        mailText.setText(" Lorem ipsum dolor sit gravida.");
        mailText.setBorder(null);
        mailText.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mailText.setFocusable(false);

        phoneText.setBackground(new java.awt.Color(255, 248, 238));
        phoneText.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        phoneText.setText(" Lorem ipsum dolor sit gravida.");
        phoneText.setBorder(null);
        phoneText.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        phoneText.setFocusable(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(17, 17, 17)
                                .addComponent(mailText))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(17, 17, 17)
                                .addComponent(phoneText))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(idText)))
                        .addContainerGap())
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(nameText))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(idText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(mailText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(phoneText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton18))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addGap(0, 0, 0)
                .addComponent(jButton18)
                .addGap(0, 0, 0)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ritardoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(requestPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(assumiButton)
                            .addComponent(licenziaButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(scioperoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ritardoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scioperoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70))
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(requestPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 819, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(assumiButton)
                        .addGap(30, 30, 30)
                        .addComponent(licenziaButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(mainPanel, java.awt.BorderLayout.CENTER);

        setBounds(0, 0, 1920, 1080);
    }// </editor-fold>//GEN-END:initComponents

    private void ferieButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ferieButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ferieButtonActionPerformed

    private void straordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_straordButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_straordButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editButtonActionPerformed

    private void salaryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salaryButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salaryButtonActionPerformed

    private void scheduleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scheduleButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_scheduleButtonActionPerformed

    private void passwordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordButtonActionPerformed

    private void notificationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notificationButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_notificationButtonActionPerformed

    private void requestButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestButtonActionPerformed
        if (requestPanel.getSize().getWidth() > 0)
            requestPanel.setSize(new Dimension(0, 220));
        else
            requestPanel.setSize(new Dimension(450, 220));
    }//GEN-LAST:event_requestButtonActionPerformed

    private void assumiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assumiButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_assumiButtonActionPerformed

    private void licenziaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_licenziaButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_licenziaButtonActionPerformed

    private void impSalaryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_impSalaryButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_impSalaryButtonActionPerformed

    private void impScheduleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_impScheduleButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_impScheduleButtonActionPerformed

    private void healthButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_healthButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_healthButtonActionPerformed

    private void switchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_switchButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_switchButtonActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton18ActionPerformed

    private void ritardoLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ritardoLabelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ritardoLabelMouseClicked

    private void scioperoLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_scioperoLabelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_scioperoLabelMouseClicked

    private void permessoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_permessoButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_permessoButtonActionPerformed

    private void congedoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_congedoButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_congedoButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        new LoginControl().createAdminPage();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assumiButton;
    private javax.swing.JButton congedoButton;
    private javax.swing.JButton editButton;
    private javax.swing.JButton ferieButton;
    private javax.swing.JButton healthButton;
    private javax.swing.JTextField idText;
    private javax.swing.JButton impSalaryButton;
    private javax.swing.JButton impScheduleButton;
    private javax.swing.JButton jButton18;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton licenziaButton;
    private javax.swing.JTextField mailText;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTextField nameText;
    private javax.swing.JButton notificationButton;
    private javax.swing.JButton passwordButton;
    private javax.swing.JButton permessoButton;
    private javax.swing.JTextField phoneText;
    private javax.swing.JButton requestButton;
    private javax.swing.JPanel requestPanel;
    private javax.swing.JLabel ritardoLabel;
    private javax.swing.JButton salaryButton;
    private javax.swing.JButton scheduleButton;
    private javax.swing.JLabel scioperoLabel;
    private javax.swing.JButton straordButton;
    private javax.swing.JButton switchButton;
    // End of variables declaration//GEN-END:variables
}