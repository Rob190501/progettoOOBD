package gui;

import controller.Controller;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;



public class HomeFrameOperatore extends javax.swing.JFrame {

    private Controller controller;
    private int mouseX;
    private int mouseY;
    private JLabel labelSelezionata;
    
    public HomeFrameOperatore(Controller controller) {
        this.controller = controller;
        
        initComponents();
        
        labelSelezionata = labelHomePage;
        
        evidenziaLabel(labelHomePage);
        
        mostraCardHomePage();
        
        setVisible(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipale = new javax.swing.JPanel();
        panelLaterale = new javax.swing.JPanel();
        labelStudenti = new javax.swing.JLabel();
        labelWIP = new javax.swing.JLabel();
        labelHomePage = new javax.swing.JLabel();
        labelCorsi = new javax.swing.JLabel();
        labelLezioni = new javax.swing.JLabel();
        labelAreeTematiche = new javax.swing.JLabel();
        panelSuperiore = new javax.swing.JPanel();
        labelMinimizza = new javax.swing.JLabel();
        labelRidimensiona = new javax.swing.JLabel();
        labelChiudi = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        panelContenuti = new javax.swing.JPanel();
        panelHomePage = new javax.swing.JPanel();
        labelBenvenutoHomePage = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        textAreaInformazioniHomePage = new javax.swing.JTextArea();
        buttonEsciHomePage = new javax.swing.JButton();
        panelStudenti = new javax.swing.JPanel();
        panelStudentiHome = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        panelStudentiWIP = new javax.swing.JPanel();
        panelAreeTematiche = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        panelCorsi = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        panelLezioni = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        panelWIP = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableStudentiWIP = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablePresenzeWIP = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestione Corsi di Formazione");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(1000, 600));
        setUndecorated(true);
        setSize(new java.awt.Dimension(1000, 600));

        panelPrincipale.setBackground(new java.awt.Color(255, 255, 255));

        panelLaterale.setBackground(new java.awt.Color(106, 141, 177));
        panelLaterale.setForeground(new java.awt.Color(204, 204, 204));

        labelStudenti.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelStudenti.setForeground(new java.awt.Color(204, 204, 204));
        labelStudenti.setText("  Studenti");
        labelStudenti.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelStudenti.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelStudentiMouseClicked(evt);
            }
        });

        labelWIP.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelWIP.setForeground(new java.awt.Color(204, 204, 204));
        labelWIP.setText("  Panel WIP");
        labelWIP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelWIP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelWIPMouseClicked(evt);
            }
        });

        labelHomePage.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelHomePage.setForeground(new java.awt.Color(204, 204, 204));
        labelHomePage.setText("  Home Page");
        labelHomePage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelHomePage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelHomePageMouseClicked(evt);
            }
        });

        labelCorsi.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelCorsi.setForeground(new java.awt.Color(204, 204, 204));
        labelCorsi.setText("  Corsi");
        labelCorsi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelCorsi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelCorsiMouseClicked(evt);
            }
        });

        labelLezioni.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelLezioni.setForeground(new java.awt.Color(204, 204, 204));
        labelLezioni.setText("  Lezioni");
        labelLezioni.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelLezioni.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelLezioniMouseClicked(evt);
            }
        });

        labelAreeTematiche.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelAreeTematiche.setForeground(new java.awt.Color(204, 204, 204));
        labelAreeTematiche.setText("  Aree Tematiche");
        labelAreeTematiche.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelAreeTematiche.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelAreeTematicheMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelLateraleLayout = new javax.swing.GroupLayout(panelLaterale);
        panelLaterale.setLayout(panelLateraleLayout);
        panelLateraleLayout.setHorizontalGroup(
            panelLateraleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLateraleLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panelLateraleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelWIP, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                    .addComponent(labelStudenti, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelHomePage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelCorsi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelLezioni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelAreeTematiche, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        panelLateraleLayout.setVerticalGroup(
            panelLateraleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLateraleLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(labelHomePage, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(labelStudenti, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelAreeTematiche, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelCorsi, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelLezioni, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelWIP, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        panelSuperiore.setBackground(new java.awt.Color(153, 204, 255));
        panelSuperiore.setPreferredSize(new java.awt.Dimension(1000, 34));
        panelSuperiore.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelSuperioreMouseDragged(evt);
            }
        });
        panelSuperiore.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelSuperioreMousePressed(evt);
            }
        });

        labelMinimizza.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelMinimizza.setForeground(new java.awt.Color(255, 255, 255));
        labelMinimizza.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMinimizza.setText("–");
        labelMinimizza.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelMinimizzaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelMinimizzaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelMinimizzaMouseExited(evt);
            }
        });

        labelRidimensiona.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelRidimensiona.setForeground(new java.awt.Color(255, 255, 255));
        labelRidimensiona.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelRidimensiona.setText("◱");
        labelRidimensiona.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelRidimensionaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelRidimensionaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelRidimensionaMouseExited(evt);
            }
        });

        labelChiudi.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelChiudi.setForeground(new java.awt.Color(255, 255, 255));
        labelChiudi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelChiudi.setText("X");
        labelChiudi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelChiudiMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelChiudiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelChiudiMouseExited(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Gestione corsi di formazione");

        javax.swing.GroupLayout panelSuperioreLayout = new javax.swing.GroupLayout(panelSuperiore);
        panelSuperiore.setLayout(panelSuperioreLayout);
        panelSuperioreLayout.setHorizontalGroup(
            panelSuperioreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSuperioreLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelMinimizza, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelRidimensiona, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelChiudi, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelSuperioreLayout.setVerticalGroup(
            panelSuperioreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelMinimizza, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
            .addComponent(labelRidimensiona, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(labelChiudi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelContenuti.setBackground(new java.awt.Color(255, 255, 255));
        panelContenuti.setLayout(new java.awt.CardLayout());

        panelHomePage.setBackground(new java.awt.Color(255, 255, 255));

        labelBenvenutoHomePage.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        labelBenvenutoHomePage.setForeground(new java.awt.Color(153, 204, 255));
        labelBenvenutoHomePage.setText("Benvenuto");

        jScrollPane3.setBorder(null);

        textAreaInformazioniHomePage.setEditable(false);
        textAreaInformazioniHomePage.setBackground(new java.awt.Color(255, 255, 255));
        textAreaInformazioniHomePage.setColumns(20);
        textAreaInformazioniHomePage.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        textAreaInformazioniHomePage.setForeground(new java.awt.Color(0, 0, 0));
        textAreaInformazioniHomePage.setRows(5);
        textAreaInformazioniHomePage.setBorder(null);
        textAreaInformazioniHomePage.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jScrollPane3.setViewportView(textAreaInformazioniHomePage);

        buttonEsciHomePage.setBackground(new java.awt.Color(255, 51, 51));
        buttonEsciHomePage.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonEsciHomePage.setForeground(new java.awt.Color(255, 255, 255));
        buttonEsciHomePage.setText("Esci");
        buttonEsciHomePage.setBorder(null);
        buttonEsciHomePage.setFocusPainted(false);
        buttonEsciHomePage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEsciHomePageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelHomePageLayout = new javax.swing.GroupLayout(panelHomePage);
        panelHomePage.setLayout(panelHomePageLayout);
        panelHomePageLayout.setHorizontalGroup(
            panelHomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHomePageLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(panelHomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelBenvenutoHomePage))
                .addContainerGap(96, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHomePageLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonEsciHomePage, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );
        panelHomePageLayout.setVerticalGroup(
            panelHomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHomePageLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(labelBenvenutoHomePage)
                .addGap(33, 33, 33)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(buttonEsciHomePage, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        panelContenuti.add(panelHomePage, "cardHomePage");

        panelStudenti.setBackground(new java.awt.Color(255, 255, 255));
        panelStudenti.setLayout(new java.awt.CardLayout());

        panelStudentiHome.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Studenti");

        javax.swing.GroupLayout panelStudentiHomeLayout = new javax.swing.GroupLayout(panelStudentiHome);
        panelStudentiHome.setLayout(panelStudentiHomeLayout);
        panelStudentiHomeLayout.setHorizontalGroup(
            panelStudentiHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelStudentiHomeLayout.createSequentialGroup()
                .addGroup(panelStudentiHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelStudentiHomeLayout.createSequentialGroup()
                        .addGap(298, 298, 298)
                        .addComponent(jButton1))
                    .addGroup(panelStudentiHomeLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(372, Short.MAX_VALUE))
        );
        panelStudentiHomeLayout.setVerticalGroup(
            panelStudentiHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelStudentiHomeLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 225, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(261, 261, 261))
        );

        panelStudenti.add(panelStudentiHome, "cardStudentiHome");

        javax.swing.GroupLayout panelStudentiWIPLayout = new javax.swing.GroupLayout(panelStudentiWIP);
        panelStudentiWIP.setLayout(panelStudentiWIPLayout);
        panelStudentiWIPLayout.setHorizontalGroup(
            panelStudentiWIPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 745, Short.MAX_VALUE)
        );
        panelStudentiWIPLayout.setVerticalGroup(
            panelStudentiWIPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 566, Short.MAX_VALUE)
        );

        panelStudenti.add(panelStudentiWIP, "cardStudentiWIP");

        panelContenuti.add(panelStudenti, "cardStudenti");

        panelAreeTematiche.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setText("aree tematicher");

        javax.swing.GroupLayout panelAreeTematicheLayout = new javax.swing.GroupLayout(panelAreeTematiche);
        panelAreeTematiche.setLayout(panelAreeTematicheLayout);
        panelAreeTematicheLayout.setHorizontalGroup(
            panelAreeTematicheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAreeTematicheLayout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(467, Short.MAX_VALUE))
        );
        panelAreeTematicheLayout.setVerticalGroup(
            panelAreeTematicheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAreeTematicheLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jLabel3)
                .addContainerGap(477, Short.MAX_VALUE))
        );

        panelContenuti.add(panelAreeTematiche, "cardAreeTematiche");

        panelCorsi.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setText("corsi");

        javax.swing.GroupLayout panelCorsiLayout = new javax.swing.GroupLayout(panelCorsi);
        panelCorsi.setLayout(panelCorsiLayout);
        panelCorsiLayout.setHorizontalGroup(
            panelCorsiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCorsiLayout.createSequentialGroup()
                .addGap(272, 272, 272)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(292, Short.MAX_VALUE))
        );
        panelCorsiLayout.setVerticalGroup(
            panelCorsiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCorsiLayout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(jLabel4)
                .addContainerGap(388, Short.MAX_VALUE))
        );

        panelContenuti.add(panelCorsi, "cardCorsi");

        panelLezioni.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setText("Lezioni");

        javax.swing.GroupLayout panelLezioniLayout = new javax.swing.GroupLayout(panelLezioni);
        panelLezioni.setLayout(panelLezioniLayout);
        panelLezioniLayout.setHorizontalGroup(
            panelLezioniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLezioniLayout.createSequentialGroup()
                .addGap(257, 257, 257)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(355, Short.MAX_VALUE))
        );
        panelLezioniLayout.setVerticalGroup(
            panelLezioniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLezioniLayout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(jLabel5)
                .addContainerGap(391, Short.MAX_VALUE))
        );

        panelContenuti.add(panelLezioni, "cardLezioni");

        panelWIP.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        tableStudentiWIP.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tableStudentiWIP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Oggetto", "Matricola", "Nome", "Cognome"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableStudentiWIP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tableStudentiWIP.getTableHeader().setReorderingAllowed(false);
        tableStudentiWIP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableStudentiWIPMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableStudentiWIP);
        if (tableStudentiWIP.getColumnModel().getColumnCount() > 0) {
            tableStudentiWIP.getColumnModel().getColumn(0).setResizable(false);
            tableStudentiWIP.getColumnModel().getColumn(1).setResizable(false);
            tableStudentiWIP.getColumnModel().getColumn(2).setResizable(false);
            tableStudentiWIP.getColumnModel().getColumn(3).setResizable(false);
        }

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        jScrollPane2.setForeground(new java.awt.Color(0, 0, 0));
        jScrollPane2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        tablePresenzeWIP.setBackground(new java.awt.Color(255, 255, 255));
        tablePresenzeWIP.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tablePresenzeWIP.setForeground(new java.awt.Color(0, 0, 0));
        tablePresenzeWIP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Oggetto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablePresenzeWIP.setGridColor(new java.awt.Color(0, 0, 0));
        tablePresenzeWIP.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tablePresenzeWIP);
        if (tablePresenzeWIP.getColumnModel().getColumnCount() > 0) {
            tablePresenzeWIP.getColumnModel().getColumn(0).setResizable(false);
        }

        javax.swing.GroupLayout panelWIPLayout = new javax.swing.GroupLayout(panelWIP);
        panelWIP.setLayout(panelWIPLayout);
        panelWIPLayout.setHorizontalGroup(
            panelWIPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelWIPLayout.createSequentialGroup()
                .addContainerGap(165, Short.MAX_VALUE)
                .addGroup(panelWIPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(211, Short.MAX_VALUE))
        );
        panelWIPLayout.setVerticalGroup(
            panelWIPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelWIPLayout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        panelContenuti.add(panelWIP, "cardWIP");

        javax.swing.GroupLayout panelPrincipaleLayout = new javax.swing.GroupLayout(panelPrincipale);
        panelPrincipale.setLayout(panelPrincipaleLayout);
        panelPrincipaleLayout.setHorizontalGroup(
            panelPrincipaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelSuperiore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelPrincipaleLayout.createSequentialGroup()
                .addComponent(panelLaterale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panelContenuti, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelPrincipaleLayout.setVerticalGroup(
            panelPrincipaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipaleLayout.createSequentialGroup()
                .addComponent(panelSuperiore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(panelPrincipaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelLaterale, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelContenuti, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipale, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipale, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void panelSuperioreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelSuperioreMousePressed
        // TODO add your handling code here:
        if (getExtendedState() == NORMAL) {
            mouseX = evt.getX();
            mouseY = evt.getY();
        }
    }//GEN-LAST:event_panelSuperioreMousePressed

    private void panelSuperioreMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelSuperioreMouseDragged
        // TODO add your handling code here:
        if (getExtendedState() == NORMAL) {
            int x = evt.getXOnScreen();
            int y = evt.getYOnScreen();
        
            setLocation(x - mouseX, y - mouseY);
        }
    }//GEN-LAST:event_panelSuperioreMouseDragged
    
    private void labelMinimizzaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMinimizzaMouseClicked
        // TODO add your handling code here:
        setState(ICONIFIED);
    }//GEN-LAST:event_labelMinimizzaMouseClicked

    private void labelMinimizzaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMinimizzaMouseEntered
        // TODO add your handling code here:
        labelMinimizza.setForeground(new java.awt.Color(255, 204, 0));
    }//GEN-LAST:event_labelMinimizzaMouseEntered

    private void labelMinimizzaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMinimizzaMouseExited
        // TODO add your handling code here:
        labelMinimizza.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_labelMinimizzaMouseExited

    private void labelRidimensionaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelRidimensionaMouseClicked
        // TODO add your handling code here:
        if (getExtendedState() == MAXIMIZED_BOTH) {
            setExtendedState(JFrame.NORMAL);
        }
        else {
            setExtendedState(MAXIMIZED_BOTH);
        }
    }//GEN-LAST:event_labelRidimensionaMouseClicked

    private void labelRidimensionaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelRidimensionaMouseEntered
        // TODO add your handling code here:
        labelRidimensiona.setForeground(new java.awt.Color(3, 172, 3));
    }//GEN-LAST:event_labelRidimensionaMouseEntered

    private void labelRidimensionaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelRidimensionaMouseExited
        // TODO add your handling code here:
        labelRidimensiona.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_labelRidimensionaMouseExited

    private void labelChiudiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelChiudiMouseClicked
        // TODO add your handling code here:
        controller.terminaEsecuzione();
    }//GEN-LAST:event_labelChiudiMouseClicked

    private void labelChiudiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelChiudiMouseEntered
        // TODO add your handling code here:
        labelChiudi.setForeground(new java.awt.Color(255, 0, 0));
    }//GEN-LAST:event_labelChiudiMouseEntered

    private void labelChiudiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelChiudiMouseExited
        // TODO add your handling code here:
        labelChiudi.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_labelChiudiMouseExited

    private void mostraCardHomePage() {
        CardLayout card = (CardLayout) panelContenuti.getLayout();
        textAreaInformazioniHomePage.setText(informazioniHomePage());
        card.show(panelContenuti, "cardHomePage");
    }
    
    private void mostraCardStudenti() {
        CardLayout card = (CardLayout) panelContenuti.getLayout();
        card.show(panelContenuti, "cardStudenti");
    }
    
    private void mostraCardAreeTematiche() {
        CardLayout card = (CardLayout) panelContenuti.getLayout();
        card.show(panelContenuti, "cardAreeTematiche");
    }
    
    private void mostraCardCorsi() {
        CardLayout card = (CardLayout) panelContenuti.getLayout();
        card.show(panelContenuti, "cardCorsi");
    }
    
    private void mostraCardLezioni() {
        CardLayout card = (CardLayout) panelContenuti.getLayout();
        card.show(panelContenuti, "cardLezioni");
    }
    
    private void mostraCardWIP() {
        CardLayout card = (CardLayout) panelContenuti.getLayout();
        card.show(panelContenuti, "cardWIP");
    }
    
    private void richiediStudentiPerJTable(JTable tableStudenti) {
        controller.inserisciStudentiInJTable(tableStudenti);
        
        if(tableStudenti.getColumnCount() > 3) {
            tableStudenti.removeColumn(tableStudenti.getColumnModel().getColumn(0));
        }
    }
    
    private String informazioniHomePage(){
        String informazioni = "Studenti registrati: " + controller.getListaStudenti().size() + System.lineSeparator() + System.lineSeparator() +
                              "Aree Tematiche registrate: " + controller.getListaAreeTematiche().size() + System.lineSeparator() + System.lineSeparator() +
                              "Corsi registrati: " + controller.getListaCorsi().size() + System.lineSeparator() + System.lineSeparator() +
                              "Lezioni registrate: " + controller.getListaLezioni().size();
        return informazioni;
    }
    
    private void richiediPresenzePerJTable(JTable tableStudenti, JTable tablePresenze) {
        controller.inserisciPresenzeInJTable(tableStudenti, tablePresenze);
    }
    
    private void tableStudentiWIPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableStudentiWIPMouseClicked
        // TODO add your handling code here:
        richiediPresenzePerJTable(tableStudentiWIP, tablePresenzeWIP);
    }//GEN-LAST:event_tableStudentiWIPMouseClicked
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        CardLayout card = (CardLayout) panelStudenti.getLayout();
        
        card.show(panelStudenti, "cardStudentiWIP");
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void aggiornaLabelSelezionata(JLabel nuovaLabelSelezionata) {
        deselezionaLabel(labelSelezionata);
        evidenziaLabel(nuovaLabelSelezionata);
        labelSelezionata = nuovaLabelSelezionata;
    }
    
    private void evidenziaLabel(JLabel label) {
        label.setText(label.getText().replace("  ", "| "));
        label.setFont(new Font("Segoe UI", 1, 24));
        label.setForeground(new Color(255, 255, 255));
    }
    
    private void deselezionaLabel(JLabel label) {
        label.setText(label.getText().replace("| ", "  "));
        label.setFont(new Font("Segoe UI", 1, 24));
        label.setForeground(new Color(204, 204, 204));
    }
    
    private void labelStudentiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelStudentiMouseClicked
        // TODO add your handling code here:
        aggiornaLabelSelezionata(labelStudenti);
        mostraCardStudenti();
    }//GEN-LAST:event_labelStudentiMouseClicked

    private void labelWIPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelWIPMouseClicked
        // TODO add your handling code here:
        aggiornaLabelSelezionata(labelWIP);
        mostraCardWIP();
        richiediStudentiPerJTable(tableStudentiWIP);
    }//GEN-LAST:event_labelWIPMouseClicked

    private void labelHomePageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelHomePageMouseClicked
        // TODO add your handling code here:
        mostraCardHomePage();
        aggiornaLabelSelezionata(labelHomePage);
    }//GEN-LAST:event_labelHomePageMouseClicked

    private void labelCorsiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCorsiMouseClicked
        // TODO add your handling code here:
        mostraCardCorsi();
        aggiornaLabelSelezionata(labelCorsi);
    }//GEN-LAST:event_labelCorsiMouseClicked

    private void labelLezioniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelLezioniMouseClicked
        // TODO add your handling code here:
        mostraCardLezioni();
        aggiornaLabelSelezionata(labelLezioni);
    }//GEN-LAST:event_labelLezioniMouseClicked

    private void labelAreeTematicheMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAreeTematicheMouseClicked
        // TODO add your handling code here:
        mostraCardAreeTematiche();
        aggiornaLabelSelezionata(labelAreeTematiche);
    }//GEN-LAST:event_labelAreeTematicheMouseClicked

    private void buttonEsciHomePageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEsciHomePageActionPerformed
        // TODO add your handling code here:
        controller.esciDaOperatore();
    }//GEN-LAST:event_buttonEsciHomePageActionPerformed
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonEsciHomePage;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelAreeTematiche;
    private javax.swing.JLabel labelBenvenutoHomePage;
    private javax.swing.JLabel labelChiudi;
    private javax.swing.JLabel labelCorsi;
    private javax.swing.JLabel labelHomePage;
    private javax.swing.JLabel labelLezioni;
    private javax.swing.JLabel labelMinimizza;
    private javax.swing.JLabel labelRidimensiona;
    private javax.swing.JLabel labelStudenti;
    private javax.swing.JLabel labelWIP;
    private javax.swing.JPanel panelAreeTematiche;
    private javax.swing.JPanel panelContenuti;
    private javax.swing.JPanel panelCorsi;
    private javax.swing.JPanel panelHomePage;
    private javax.swing.JPanel panelLaterale;
    private javax.swing.JPanel panelLezioni;
    private javax.swing.JPanel panelPrincipale;
    private javax.swing.JPanel panelStudenti;
    private javax.swing.JPanel panelStudentiHome;
    private javax.swing.JPanel panelStudentiWIP;
    private javax.swing.JPanel panelSuperiore;
    private javax.swing.JPanel panelWIP;
    private javax.swing.JTable tablePresenzeWIP;
    private javax.swing.JTable tableStudentiWIP;
    private javax.swing.JTextArea textAreaInformazioniHomePage;
    // End of variables declaration//GEN-END:variables
}
