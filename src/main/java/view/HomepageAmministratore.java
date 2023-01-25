package view;

import controller.GestionePersonale.AssumiLicenziaControl;
import controller.AreaPersonale.CambiaPasswordControl;
import controller.Autenticazione.LoginControl;
//import controller.MalattiaControl;
import controller.AreaPersonale.OrariStipendiControl;
import controller.AreaPersonale.RichiesteControl;
//import controller.StraordinariControl;
import java.awt.Dimension;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import model.Utente;

public class HomepageAmministratore extends javax.swing.JFrame {

    public ButtonGroup getButtonGroup1() {
        return buttonGroup1;
    }
    LoginControl lc;

    private OrariStipendiControl OSC;
    private CambiaPasswordControl CPC;
    private RichiesteControl RicC;
    //private MalattiaControl MC;
    //private StraordinariControl SC;
    private AssumiLicenziaControl ALC;
    private LoginControl LC;

    public HomepageAmministratore(String nome, String cognome, String matricola, String tel, String mail, ImageIcon propic, LoginControl logC) {
        initComponents();
        Utente.setMatricola(matricola);
        jLabel3.setVisible(false);
        permessoButton.setVisible(false);
        ferieButton.setVisible(false);
        congedoButton.setVisible(false);
        MalattiaButton.setVisible(false);
        nameText.setText(nome + " " + cognome);
        idText.setText(matricola);
        mailText.setText(mail);
        phoneText.setText(tel);
        this.Propic.setIcon(propic);
        LC = logC;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        mainPanel = new javax.swing.JPanel();
        permessoButton = new javax.swing.JButton();
        ferieButton = new javax.swing.JButton();
        MalattiaButton = new javax.swing.JButton();
        congedoButton = new javax.swing.JButton();
        assumiButton = new javax.swing.JButton();
        licenziaButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        passwordButton = new javax.swing.JButton();
        salaryButton = new javax.swing.JButton();
        notificationButton = new javax.swing.JButton();
        requestButton = new javax.swing.JButton();
        scheduleButton = new javax.swing.JButton();
        requestButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        ComunicaSciopero = new javax.swing.JButton();
        requestButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        impSalaryButton = new javax.swing.JButton();
        impScheduleButton = new javax.swing.JButton();
        switchButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        editButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        idText = new javax.swing.JTextField();
        nameText = new javax.swing.JTextField();
        LogoutButton = new javax.swing.JButton();
        mailText = new javax.swing.JTextField();
        phoneText = new javax.swing.JTextField();
        Cornice = new javax.swing.JLabel();
        Propic = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 1050));
        setUndecorated(true);
        getContentPane().setLayout(null);

        mainPanel.setBackground(new java.awt.Color(255, 248, 238));
        mainPanel.setFocusable(false);
        mainPanel.setMinimumSize(new java.awt.Dimension(1024, 768));
        mainPanel.setPreferredSize(new java.awt.Dimension(1920, 1080));
        mainPanel.setLayout(null);

        permessoButton.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        permessoButton.setForeground(new java.awt.Color(255, 248, 238));
        permessoButton.setText("Permesso");
        permessoButton.setBorder(null);
        permessoButton.setBorderPainted(false);
        buttonGroup1.add(permessoButton);
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
        mainPanel.add(permessoButton);
        permessoButton.setBounds(220, 20, 170, 50);

        ferieButton.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        ferieButton.setForeground(new java.awt.Color(255, 248, 238));
        ferieButton.setText("Ferie");
        ferieButton.setBorder(null);
        ferieButton.setBorderPainted(false);
        buttonGroup1.add(ferieButton);
        ferieButton.setContentAreaFilled(false);
        ferieButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ferieButton.setFocusable(false);
        ferieButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ferieButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ferieButtonActionPerformed(evt);
            }
        });
        mainPanel.add(ferieButton);
        ferieButton.setBounds(220, 80, 180, 48);

        MalattiaButton.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        MalattiaButton.setForeground(new java.awt.Color(255, 248, 238));
        MalattiaButton.setText("Comunica Malattia");
        MalattiaButton.setBorder(null);
        MalattiaButton.setBorderPainted(false);
        buttonGroup1.add(MalattiaButton);
        MalattiaButton.setContentAreaFilled(false);
        MalattiaButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MalattiaButton.setFocusable(false);
        MalattiaButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        MalattiaButton.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        MalattiaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MalattiaButtonActionPerformed(evt);
            }
        });
        mainPanel.add(MalattiaButton);
        MalattiaButton.setBounds(220, 200, 310, 50);

        congedoButton.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        congedoButton.setForeground(new java.awt.Color(255, 248, 238));
        congedoButton.setText("Congedo parentale");
        congedoButton.setBorder(null);
        congedoButton.setBorderPainted(false);
        buttonGroup1.add(congedoButton);
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
        mainPanel.add(congedoButton);
        congedoButton.setBounds(220, 140, 310, 50);

        assumiButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AssumiButton.png"))); // NOI18N
        assumiButton.setBorder(null);
        assumiButton.setBorderPainted(false);
        buttonGroup1.add(assumiButton);
        assumiButton.setContentAreaFilled(false);
        assumiButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        assumiButton.setIconTextGap(0);
        assumiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assumiButtonActionPerformed(evt);
            }
        });
        mainPanel.add(assumiButton);
        assumiButton.setBounds(1610, 70, 100, 100);

        licenziaButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LicenziaButton.png"))); // NOI18N
        licenziaButton.setBorder(null);
        licenziaButton.setBorderPainted(false);
        buttonGroup1.add(licenziaButton);
        licenziaButton.setContentAreaFilled(false);
        licenziaButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        licenziaButton.setIconTextGap(0);
        licenziaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                licenziaButtonActionPerformed(evt);
            }
        });
        mainPanel.add(licenziaButton);
        licenziaButton.setBounds(1610, 200, 100, 100);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SecondaCostinaHomepageImpiegato.png"))); // NOI18N
        mainPanel.add(jLabel3);
        jLabel3.setBounds(200, 0, 450, 270);

        jPanel1.setBackground(new java.awt.Color(255, 248, 238));
        jPanel1.setFocusable(false);
        jPanel1.setMaximumSize(new java.awt.Dimension(200, 875));
        jPanel1.setMinimumSize(new java.awt.Dimension(200, 875));
        jPanel1.setPreferredSize(new java.awt.Dimension(200, 875));
        jPanel1.setLayout(null);

        passwordButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PasswordButton.png"))); // NOI18N
        passwordButton.setBorder(null);
        passwordButton.setBorderPainted(false);
        buttonGroup1.add(passwordButton);
        passwordButton.setContentAreaFilled(false);
        passwordButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        passwordButton.setFocusable(false);
        passwordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordButtonActionPerformed(evt);
            }
        });
        jPanel1.add(passwordButton);
        passwordButton.setBounds(50, 290, 100, 100);

        salaryButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BankButton.png"))); // NOI18N
        salaryButton.setBorder(null);
        salaryButton.setBorderPainted(false);
        buttonGroup1.add(salaryButton);
        salaryButton.setContentAreaFilled(false);
        salaryButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salaryButton.setFocusable(false);
        salaryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salaryButtonActionPerformed(evt);
            }
        });
        jPanel1.add(salaryButton);
        salaryButton.setBounds(50, 50, 100, 100);

        notificationButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NotificationButton.png"))); // NOI18N
        notificationButton.setBorder(null);
        notificationButton.setBorderPainted(false);
        buttonGroup1.add(notificationButton);
        notificationButton.setContentAreaFilled(false);
        notificationButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        notificationButton.setFocusable(false);
        notificationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notificationButtonActionPerformed(evt);
            }
        });
        jPanel1.add(notificationButton);
        notificationButton.setBounds(50, 410, 100, 100);

        requestButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RequestIcon.png"))); // NOI18N
        requestButton.setBorder(null);
        requestButton.setBorderPainted(false);
        buttonGroup1.add(requestButton);
        requestButton.setContentAreaFilled(false);
        requestButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        requestButton.setFocusable(false);
        requestButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestButtonActionPerformed(evt);
            }
        });
        jPanel1.add(requestButton);
        requestButton.setBounds(50, 530, 100, 100);

        scheduleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ScheduleButton.png"))); // NOI18N
        scheduleButton.setBorder(null);
        scheduleButton.setBorderPainted(false);
        buttonGroup1.add(scheduleButton);
        scheduleButton.setContentAreaFilled(false);
        scheduleButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        scheduleButton.setFocusable(false);
        scheduleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scheduleButtonActionPerformed(evt);
            }
        });
        jPanel1.add(scheduleButton);
        scheduleButton.setBounds(50, 170, 100, 100);

        requestButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RitardiButton.png"))); // NOI18N
        requestButton1.setBorder(null);
        requestButton1.setBorderPainted(false);
        buttonGroup1.add(requestButton1);
        requestButton1.setContentAreaFilled(false);
        requestButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        requestButton1.setFocusable(false);
        requestButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(requestButton1);
        requestButton1.setBounds(50, 650, 100, 100);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CostinaImpiegato.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 200, 800);

        mainPanel.add(jPanel1);
        jPanel1.setBounds(0, 0, 200, 875);

        ComunicaSciopero.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        ComunicaSciopero.setForeground(new java.awt.Color(255, 255, 255));
        ComunicaSciopero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RitardoCostina-flipped.png"))); // NOI18N
        ComunicaSciopero.setText("Indici Sciopero");
        ComunicaSciopero.setToolTipText("Firma Ritardo");
        ComunicaSciopero.setBorder(null);
        ComunicaSciopero.setBorderPainted(false);
        buttonGroup1.add(ComunicaSciopero);
        ComunicaSciopero.setContentAreaFilled(false);
        ComunicaSciopero.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ComunicaSciopero.setFocusable(false);
        ComunicaSciopero.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ComunicaSciopero.setName(""); // NOI18N
        ComunicaSciopero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComunicaScioperoActionPerformed(evt);
            }
        });
        mainPanel.add(ComunicaSciopero);
        ComunicaSciopero.setBounds(1570, 940, 350, 100);

        requestButton2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        requestButton2.setForeground(new java.awt.Color(255, 255, 255));
        requestButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RitardoCostina.png"))); // NOI18N
        requestButton2.setText("Firma Ritardo");
        requestButton2.setToolTipText("Firma Ritardo");
        requestButton2.setBorder(null);
        requestButton2.setBorderPainted(false);
        buttonGroup1.add(requestButton2);
        requestButton2.setContentAreaFilled(false);
        requestButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        requestButton2.setFocusable(false);
        requestButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        requestButton2.setName(""); // NOI18N
        requestButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestButton2ActionPerformed(evt);
            }
        });
        mainPanel.add(requestButton2);
        requestButton2.setBounds(0, 942, 350, 100);

        jPanel3.setBackground(new java.awt.Color(255, 248, 238));
        jPanel3.setLayout(null);

        impSalaryButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SalaryImpiegatoIcon.png"))); // NOI18N
        impSalaryButton.setBorder(null);
        impSalaryButton.setBorderPainted(false);
        buttonGroup1.add(impSalaryButton);
        impSalaryButton.setContentAreaFilled(false);
        impSalaryButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        impSalaryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                impSalaryButtonActionPerformed(evt);
            }
        });
        jPanel3.add(impSalaryButton);
        impSalaryButton.setBounds(70, 20, 100, 100);

        impScheduleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OrariImpiegatoButton.png"))); // NOI18N
        impScheduleButton.setBorder(null);
        impScheduleButton.setBorderPainted(false);
        buttonGroup1.add(impScheduleButton);
        impScheduleButton.setContentAreaFilled(false);
        impScheduleButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        impScheduleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                impScheduleButtonActionPerformed(evt);
            }
        });
        jPanel3.add(impScheduleButton);
        impScheduleButton.setBounds(70, 150, 100, 100);

        switchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SwitchButton.png"))); // NOI18N
        switchButton.setBorder(null);
        switchButton.setBorderPainted(false);
        buttonGroup1.add(switchButton);
        switchButton.setContentAreaFilled(false);
        switchButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        switchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                switchButtonActionPerformed(evt);
            }
        });
        jPanel3.add(switchButton);
        switchButton.setBounds(70, 280, 100, 100);

        editButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EditButton.png"))); // NOI18N
        editButton.setBorder(null);
        editButton.setBorderPainted(false);
        buttonGroup1.add(editButton);
        editButton.setContentAreaFilled(false);
        editButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });
        jPanel3.add(editButton);
        editButton.setBounds(70, 410, 100, 100);

        editButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RitardiImpiegatoButton.png"))); // NOI18N
        editButton1.setBorder(null);
        editButton1.setBorderPainted(false);
        buttonGroup1.add(editButton1);
        editButton1.setContentAreaFilled(false);
        editButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(editButton1);
        editButton1.setBounds(70, 540, 100, 100);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CostinaDXAmministratore.png"))); // NOI18N
        jPanel3.add(jLabel5);
        jLabel5.setBounds(20, -185, 200, 880);

        mainPanel.add(jPanel3);
        jPanel3.setBounds(1704, 55, 230, 840);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CostinaNomeAzienda.png"))); // NOI18N
        jLabel4.setText("AKKIKUSHI");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mainPanel.add(jLabel4);
        jLabel4.setBounds(1580, 0, 340, 55);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("ID :");
        mainPanel.add(jLabel11);
        jLabel11.setBounds(800, 740, 53, 48);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MailIcon.png"))); // NOI18N
        jLabel12.setText(":");
        mainPanel.add(jLabel12);
        jLabel12.setBounds(790, 800, 60, 48);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PhoneIcon.png"))); // NOI18N
        jLabel13.setText(":");
        mainPanel.add(jLabel13);
        jLabel13.setBounds(790, 860, 60, 48);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PersonIcon.png"))); // NOI18N
        jLabel8.setText(":");
        jLabel8.setToolTipText("");
        mainPanel.add(jLabel8);
        jLabel8.setBounds(790, 680, 60, 48);

        idText.setBackground(new java.awt.Color(255, 248, 238));
        idText.setFont(new java.awt.Font("Segoe UI", 0, 40)); // NOI18N
        idText.setForeground(new java.awt.Color(0, 0, 0));
        idText.setText(" Lorem ipsum dolor sit gravida.");
        idText.setBorder(null);
        idText.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        idText.setFocusable(false);
        mainPanel.add(idText);
        idText.setBounds(870, 740, 550, 54);

        nameText.setBackground(new java.awt.Color(255, 248, 238));
        nameText.setFont(new java.awt.Font("Segoe UI", 0, 40)); // NOI18N
        nameText.setForeground(new java.awt.Color(0, 0, 0));
        nameText.setText(" Lorem ipsum dolor sit gravida.");
        nameText.setBorder(null);
        nameText.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        nameText.setFocusable(false);
        mainPanel.add(nameText);
        nameText.setBounds(870, 680, 550, 54);

        LogoutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LogoutIcon.png"))); // NOI18N
        LogoutButton.setBorder(null);
        LogoutButton.setBorderPainted(false);
        buttonGroup1.add(LogoutButton);
        LogoutButton.setContentAreaFilled(false);
        LogoutButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutButtonActionPerformed(evt);
            }
        });
        mainPanel.add(LogoutButton);
        LogoutButton.setBounds(1300, 570, 75, 75);

        mailText.setBackground(new java.awt.Color(255, 248, 238));
        mailText.setFont(new java.awt.Font("Segoe UI", 0, 40)); // NOI18N
        mailText.setForeground(new java.awt.Color(0, 0, 0));
        mailText.setText(" Lorem ipsum dolor sit gravida.");
        mailText.setBorder(null);
        mailText.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mailText.setFocusable(false);
        mainPanel.add(mailText);
        mailText.setBounds(870, 800, 550, 54);

        phoneText.setBackground(new java.awt.Color(255, 248, 238));
        phoneText.setFont(new java.awt.Font("Segoe UI", 0, 40)); // NOI18N
        phoneText.setForeground(new java.awt.Color(0, 0, 0));
        phoneText.setText(" Lorem ipsum dolor sit gravida.");
        phoneText.setBorder(null);
        phoneText.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        phoneText.setFocusable(false);
        mainPanel.add(phoneText);
        phoneText.setBounds(870, 860, 550, 54);

        Cornice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cornice.png"))); // NOI18N
        mainPanel.add(Cornice);
        Cornice.setBounds(880, 165, 460, 460);

        Propic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Propic.png"))); // NOI18N
        mainPanel.add(Propic);
        Propic.setBounds(880, 165, 460, 460);

        getContentPane().add(mainPanel);
        mainPanel.setBounds(0, 0, 1920, 1080);

        setBounds(0, 0, 1920, 1080);
    }// </editor-fold>//GEN-END:initComponents

    private void ferieButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ferieButtonActionPerformed
        // TODO add your handling code here:
        RicC = new RichiesteControl();
        RicC.RichiestaFerieButtonPressed(this);
    }//GEN-LAST:event_ferieButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        // TODO add your handling code here:
        ALC = new AssumiLicenziaControl();
        ALC.ModificaInfoImpiegatoButtonPressed(this);
    }//GEN-LAST:event_editButtonActionPerformed

    private void salaryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salaryButtonActionPerformed
        // TODO add your handling code here:
        OSC = new OrariStipendiControl();
        OSC.ConsultaStipendioButtonPressed(this);

    }//GEN-LAST:event_salaryButtonActionPerformed

    private void scheduleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scheduleButtonActionPerformed
        // TODO add your handling code here:
        OSC = new OrariStipendiControl();
        OSC.ConsultaOrarioButtonPressed(this);
    }//GEN-LAST:event_scheduleButtonActionPerformed

    private void passwordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordButtonActionPerformed
        // TODO add your handling code here:
        CPC = new CambiaPasswordControl();
        CPC.CPButtonPressed(this);
    }//GEN-LAST:event_passwordButtonActionPerformed

    private void notificationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notificationButtonActionPerformed
        // TODO add your handling code here:
        RicC = new RichiesteControl();
        RicC.ConsultazioneListaRichiesteButtonPressed(this);
    }//GEN-LAST:event_notificationButtonActionPerformed

    private void requestButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestButtonActionPerformed
        // TODO add your handling code here:
        RicC = new RichiesteControl();
        RicC.RichiesteButtonPressed(this);
    }//GEN-LAST:event_requestButtonActionPerformed

    private void assumiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assumiButtonActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        ALC.assumiImpiegatoButtonPressed(this);
    }//GEN-LAST:event_assumiButtonActionPerformed

    private void licenziaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_licenziaButtonActionPerformed
        // TODO add your handling code here:
        ALC.licenziaImpiegatoButtonPressed(this);
    }//GEN-LAST:event_licenziaButtonActionPerformed

    private void impSalaryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_impSalaryButtonActionPerformed
        // TODO add your handling code here:
        OSC = new OrariStipendiControl();
        OSC.ConsultaStipendiImpiegatiButtonPressed(this);
    }//GEN-LAST:event_impSalaryButtonActionPerformed

    private void impScheduleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_impScheduleButtonActionPerformed
        // TODO add your handling code here:
        OSC = new OrariStipendiControl();
        OSC.ConsultaOrariImpiegatiButtonPressed(this);
    }//GEN-LAST:event_impScheduleButtonActionPerformed

    private void switchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_switchButtonActionPerformed
        // TODO add your handling code here:
        RicC = new RichiesteControl();
        RicC.ScambiaOrariButtonPressed(this);
    }//GEN-LAST:event_switchButtonActionPerformed


    private void permessoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_permessoButtonActionPerformed
        // TODO add your handling code here:
        RicC = new RichiesteControl();
        RicC.RichiestaPermessoButtonPressed(this);
    }//GEN-LAST:event_permessoButtonActionPerformed

    private void congedoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_congedoButtonActionPerformed
        // TODO add your handling code here:
        RicC = new RichiesteControl();
        RicC.RichiestaCongedoParentaleButtonPressed(this);
    }//GEN-LAST:event_congedoButtonActionPerformed

    private void LogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutButtonActionPerformed
        // TODO add your handling code here:
        LC.DisposeWindow(this);
    }//GEN-LAST:event_LogoutButtonActionPerformed

    private void MalattiaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MalattiaButtonActionPerformed
        // TODO add your handling code here:
        RicC = new RichiesteControl();
        RicC.ComunicazioneMalattiaButtonPressed(this);
    }//GEN-LAST:event_MalattiaButtonActionPerformed

    private void requestButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestButton1ActionPerformed
        OSC = new OrariStipendiControl();
        OSC.consultazioneRitardiButtonPressed(this);
    }//GEN-LAST:event_requestButton1ActionPerformed

    private void editButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButton1ActionPerformed
        OSC = new OrariStipendiControl();
        OSC.consultazioneRitardiImpiegatiButtonPressed(this);

    }//GEN-LAST:event_editButton1ActionPerformed

    private void requestButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_requestButton2ActionPerformed

    private void ComunicaScioperoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComunicaScioperoActionPerformed
        // TODO add your handling code here:
        RicC = new RichiesteControl();
        RicC.ComunicazioneScioperoButtonPressed(this);
    }//GEN-LAST:event_ComunicaScioperoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomepageAmministratore(null, null, "100000", null, null, null, null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ComunicaSciopero;
    private javax.swing.JLabel Cornice;
    private javax.swing.JButton LogoutButton;
    private javax.swing.JButton MalattiaButton;
    private javax.swing.JLabel Propic;
    private javax.swing.JButton assumiButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton congedoButton;
    private javax.swing.JButton editButton;
    private javax.swing.JButton editButton1;
    private javax.swing.JButton ferieButton;
    private javax.swing.JTextField idText;
    private javax.swing.JButton impSalaryButton;
    private javax.swing.JButton impScheduleButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton licenziaButton;
    private javax.swing.JTextField mailText;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTextField nameText;
    private javax.swing.JButton notificationButton;
    private javax.swing.JButton passwordButton;
    private javax.swing.JButton permessoButton;
    private javax.swing.JTextField phoneText;
    private javax.swing.JButton requestButton;
    private javax.swing.JButton requestButton1;
    private javax.swing.JButton requestButton2;
    private javax.swing.JButton salaryButton;
    private javax.swing.JButton scheduleButton;
    private javax.swing.JButton switchButton;
    // End of variables declaration//GEN-END:variables

    public JButton getCongedoParentale() {
        return congedoButton;
    }

    public JButton getFerie() {
        return ferieButton;
    }

    public JButton getPermesso() {
        return permessoButton;
    }

    public JLabel getjLabel3() {
        return jLabel3;
    }

    public JButton getMalattiaButton() {
        return MalattiaButton;
    }

}
