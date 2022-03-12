package gui;

import controller.Controller;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;



public class HomeFrameOperatore extends javax.swing.JFrame {

    private Controller controller;
    private int mouseX;
    private int mouseY;
    private JLabel labelSelezionata;
    
    public HomeFrameOperatore(Controller controller) {
        this.controller = controller;
        
        initComponents();
        
        nascondiTutteColonneOggetto();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTotale = new javax.swing.JPanel();
        panelMenu = new javax.swing.JPanel();
        labelMenuHomePage = new javax.swing.JLabel();
        labelMenuStudenti = new javax.swing.JLabel();
        labelMenuAreeTematiche = new javax.swing.JLabel();
        labelMenuCorsi = new javax.swing.JLabel();
        labelMenuLezioni = new javax.swing.JLabel();
        panelSuperiore = new javax.swing.JPanel();
        labelTitolo = new javax.swing.JLabel();
        labelMinimizza = new javax.swing.JLabel();
        labelRidimensiona = new javax.swing.JLabel();
        labelChiudi = new javax.swing.JLabel();
        panelContenuti = new javax.swing.JPanel();
        panelHomePage = new javax.swing.JPanel();
        labelHomePage = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        textAreaInformazioniHomePage = new javax.swing.JTextArea();
        buttonEsciHomePage = new javax.swing.JButton();
        panelStudenti = new javax.swing.JPanel();
        panelStudentiHome = new javax.swing.JPanel();
        labelStudenti = new javax.swing.JLabel();
        scrollPaneTableTuttiStudenti = new javax.swing.JScrollPane();
        tableStudentiPrincipale = new javax.swing.JTable();
        scrollPaneTableCorsiFrequentati = new javax.swing.JScrollPane();
        tableCorsiFrequentati = new javax.swing.JTable();
        scrollPaneTablePresenze = new javax.swing.JScrollPane();
        tablePresenze = new javax.swing.JTable();
        buttonCorsiDegliStudenti = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        panelCorsiDegliStudenti = new javax.swing.JPanel();
        buttonTornaStudentiHome = new javax.swing.JButton();
        labelCorsiDegliStudenti = new javax.swing.JLabel();
        scrollPaneTableStudenti1 = new javax.swing.JScrollPane();
        tableStudenti1 = new javax.swing.JTable();
        panelAreeTematiche = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        panelCorsi = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        panelLezioni = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestione Corsi di Formazione");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(1000, 600));
        setUndecorated(true);
        setSize(new java.awt.Dimension(1000, 600));

        panelTotale.setBackground(new java.awt.Color(255, 255, 255));

        panelMenu.setBackground(new java.awt.Color(106, 141, 177));
        panelMenu.setForeground(new java.awt.Color(204, 204, 204));

        labelMenuHomePage.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelMenuHomePage.setForeground(new java.awt.Color(204, 204, 204));
        labelMenuHomePage.setText("  Home Page");
        labelMenuHomePage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelMenuHomePage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelMenuHomePageMouseClicked(evt);
            }
        });

        labelMenuStudenti.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelMenuStudenti.setForeground(new java.awt.Color(204, 204, 204));
        labelMenuStudenti.setText("  Studenti");
        labelMenuStudenti.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelMenuStudenti.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelMenuStudentiMouseClicked(evt);
            }
        });

        labelMenuAreeTematiche.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelMenuAreeTematiche.setForeground(new java.awt.Color(204, 204, 204));
        labelMenuAreeTematiche.setText("  Aree Tematiche");
        labelMenuAreeTematiche.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelMenuAreeTematiche.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelMenuAreeTematicheMouseClicked(evt);
            }
        });

        labelMenuCorsi.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelMenuCorsi.setForeground(new java.awt.Color(204, 204, 204));
        labelMenuCorsi.setText("  Corsi");
        labelMenuCorsi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelMenuCorsi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelMenuCorsiMouseClicked(evt);
            }
        });

        labelMenuLezioni.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelMenuLezioni.setForeground(new java.awt.Color(204, 204, 204));
        labelMenuLezioni.setText("  Lezioni");
        labelMenuLezioni.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelMenuLezioni.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelMenuLezioniMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelMenuAreeTematiche, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                    .addComponent(labelMenuStudenti, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelMenuHomePage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelMenuCorsi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelMenuLezioni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(labelMenuHomePage, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(labelMenuStudenti, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelMenuAreeTematiche, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelMenuCorsi, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelMenuLezioni, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        labelTitolo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelTitolo.setForeground(new java.awt.Color(255, 255, 255));
        labelTitolo.setText("Gestione corsi di formazione");

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

        javax.swing.GroupLayout panelSuperioreLayout = new javax.swing.GroupLayout(panelSuperiore);
        panelSuperiore.setLayout(panelSuperioreLayout);
        panelSuperioreLayout.setHorizontalGroup(
            panelSuperioreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSuperioreLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitolo)
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
            .addComponent(labelTitolo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelContenuti.setBackground(new java.awt.Color(255, 255, 255));
        panelContenuti.setLayout(new java.awt.CardLayout());

        panelHomePage.setBackground(new java.awt.Color(255, 255, 255));

        labelHomePage.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        labelHomePage.setForeground(new java.awt.Color(153, 204, 255));
        labelHomePage.setText("Home Page");

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
        buttonEsciHomePage.setBorderPainted(false);
        buttonEsciHomePage.setFocusPainted(false);
        buttonEsciHomePage.setOpaque(true);
        buttonEsciHomePage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEsciHomePageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelHomePageLayout = new javax.swing.GroupLayout(panelHomePage);
        panelHomePage.setLayout(panelHomePageLayout);
        panelHomePageLayout.setHorizontalGroup(
            panelHomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHomePageLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonEsciHomePage, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
            .addGroup(panelHomePageLayout.createSequentialGroup()
                .addGroup(panelHomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelHomePageLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelHomePageLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(labelHomePage)))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        panelHomePageLayout.setVerticalGroup(
            panelHomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHomePageLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(labelHomePage)
                .addGap(47, 47, 47)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(buttonEsciHomePage, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        panelContenuti.add(panelHomePage, "cardHomePage");

        panelStudenti.setBackground(new java.awt.Color(255, 255, 255));
        panelStudenti.setLayout(new java.awt.CardLayout());

        panelStudentiHome.setBackground(new java.awt.Color(255, 255, 255));

        labelStudenti.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        labelStudenti.setForeground(new java.awt.Color(153, 204, 255));
        labelStudenti.setText("Studenti");

        tableStudentiPrincipale.setBackground(new java.awt.Color(255, 255, 255));
        tableStudentiPrincipale.setModel(new javax.swing.table.DefaultTableModel(
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
        tableStudentiPrincipale.setRowHeight(40);
        tableStudentiPrincipale.getTableHeader().setReorderingAllowed(false);
        tableStudentiPrincipale.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableStudentiPrincipaleMouseClicked(evt);
            }
        });
        scrollPaneTableTuttiStudenti.setViewportView(tableStudentiPrincipale);
        if (tableStudentiPrincipale.getColumnModel().getColumnCount() > 0) {
            tableStudentiPrincipale.getColumnModel().getColumn(0).setResizable(false);
        }

        tableCorsiFrequentati.setBackground(new java.awt.Color(255, 255, 255));
        tableCorsiFrequentati.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Oggetto", "Codice", "Nome", "Descrizione"
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
        tableCorsiFrequentati.setRowHeight(40);
        tableCorsiFrequentati.getTableHeader().setReorderingAllowed(false);
        scrollPaneTableCorsiFrequentati.setViewportView(tableCorsiFrequentati);
        if (tableCorsiFrequentati.getColumnModel().getColumnCount() > 0) {
            tableCorsiFrequentati.getColumnModel().getColumn(0).setResizable(false);
        }

        tablePresenze.setBackground(new java.awt.Color(255, 255, 255));
        tablePresenze.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Oggetto", "Codice", "Titolo", "Data", "Corso"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablePresenze.setRowHeight(40);
        tablePresenze.getTableHeader().setReorderingAllowed(false);
        scrollPaneTablePresenze.setViewportView(tablePresenze);
        if (tablePresenze.getColumnModel().getColumnCount() > 0) {
            tablePresenze.getColumnModel().getColumn(0).setResizable(false);
        }

        buttonCorsiDegliStudenti.setBackground(new java.awt.Color(153, 204, 255));
        buttonCorsiDegliStudenti.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonCorsiDegliStudenti.setForeground(new java.awt.Color(255, 255, 255));
        buttonCorsiDegliStudenti.setText("Corsi degli studenti");
        buttonCorsiDegliStudenti.setBorder(null);
        buttonCorsiDegliStudenti.setBorderPainted(false);
        buttonCorsiDegliStudenti.setFocusPainted(false);
        buttonCorsiDegliStudenti.setOpaque(true);
        buttonCorsiDegliStudenti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCorsiDegliStudentiActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 204, 255));
        jLabel1.setText("Corsi Frequentati");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 204, 255));
        jLabel2.setText("Presenze");

        javax.swing.GroupLayout panelStudentiHomeLayout = new javax.swing.GroupLayout(panelStudentiHome);
        panelStudentiHome.setLayout(panelStudentiHomeLayout);
        panelStudentiHomeLayout.setHorizontalGroup(
            panelStudentiHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelStudentiHomeLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelStudentiHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelStudentiHomeLayout.createSequentialGroup()
                        .addGroup(panelStudentiHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonCorsiDegliStudenti, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelStudenti, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(380, 380, 380))
                    .addGroup(panelStudentiHomeLayout.createSequentialGroup()
                        .addComponent(scrollPaneTableTuttiStudenti, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                        .addGroup(panelStudentiHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelStudentiHomeLayout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(panelStudentiHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelStudentiHomeLayout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelStudentiHomeLayout.createSequentialGroup()
                                        .addGroup(panelStudentiHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(scrollPaneTableCorsiFrequentati, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                            .addComponent(scrollPaneTablePresenze, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE))
                                        .addGap(20, 20, 20))))
                            .addGroup(panelStudentiHomeLayout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jLabel1)
                                .addGap(0, 209, Short.MAX_VALUE))))))
        );
        panelStudentiHomeLayout.setVerticalGroup(
            panelStudentiHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelStudentiHomeLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(labelStudenti)
                .addGap(20, 20, 20)
                .addGroup(panelStudentiHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelStudentiHomeLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(scrollPaneTableCorsiFrequentati, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(scrollPaneTablePresenze, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(scrollPaneTableTuttiStudenti, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE))
                .addGap(56, 56, 56)
                .addComponent(buttonCorsiDegliStudenti, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        panelStudenti.add(panelStudentiHome, "cardStudentiHome");

        panelCorsiDegliStudenti.setBackground(new java.awt.Color(255, 255, 255));

        buttonTornaStudentiHome.setBackground(new java.awt.Color(153, 204, 255));
        buttonTornaStudentiHome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonTornaStudentiHome.setForeground(new java.awt.Color(255, 255, 255));
        buttonTornaStudentiHome.setText("Indietro");
        buttonTornaStudentiHome.setBorder(null);
        buttonTornaStudentiHome.setBorderPainted(false);
        buttonTornaStudentiHome.setFocusPainted(false);
        buttonTornaStudentiHome.setOpaque(true);
        buttonTornaStudentiHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTornaStudentiHomeActionPerformed(evt);
            }
        });

        labelCorsiDegliStudenti.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        labelCorsiDegliStudenti.setForeground(new java.awt.Color(153, 204, 255));
        labelCorsiDegliStudenti.setText("Corsi degli Studenti");

        tableStudenti1.setBackground(new java.awt.Color(255, 255, 255));
        tableStudenti1.setModel(new javax.swing.table.DefaultTableModel(
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
        tableStudenti1.getTableHeader().setReorderingAllowed(false);
        scrollPaneTableStudenti1.setViewportView(tableStudenti1);
        if (tableStudenti1.getColumnModel().getColumnCount() > 0) {
            tableStudenti1.getColumnModel().getColumn(0).setResizable(false);
        }

        javax.swing.GroupLayout panelCorsiDegliStudentiLayout = new javax.swing.GroupLayout(panelCorsiDegliStudenti);
        panelCorsiDegliStudenti.setLayout(panelCorsiDegliStudentiLayout);
        panelCorsiDegliStudentiLayout.setHorizontalGroup(
            panelCorsiDegliStudentiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCorsiDegliStudentiLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonTornaStudentiHome, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(panelCorsiDegliStudentiLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(labelCorsiDegliStudenti, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(382, Short.MAX_VALUE))
            .addGroup(panelCorsiDegliStudentiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelCorsiDegliStudentiLayout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(scrollPaneTableStudenti1, javax.swing.GroupLayout.DEFAULT_SIZE, 705, Short.MAX_VALUE)
                    .addGap(20, 20, 20)))
        );
        panelCorsiDegliStudentiLayout.setVerticalGroup(
            panelCorsiDegliStudentiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCorsiDegliStudentiLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(labelCorsiDegliStudenti)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 444, Short.MAX_VALUE)
                .addComponent(buttonTornaStudentiHome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
            .addGroup(panelCorsiDegliStudentiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelCorsiDegliStudentiLayout.createSequentialGroup()
                    .addGap(96, 96, 96)
                    .addComponent(scrollPaneTableStudenti1, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)
                    .addGap(96, 96, 96)))
        );

        panelStudenti.add(panelCorsiDegliStudenti, "cardCorsiDegliStudenti");

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

        javax.swing.GroupLayout panelTotaleLayout = new javax.swing.GroupLayout(panelTotale);
        panelTotale.setLayout(panelTotaleLayout);
        panelTotaleLayout.setHorizontalGroup(
            panelTotaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelSuperiore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelTotaleLayout.createSequentialGroup()
                .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panelContenuti, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelTotaleLayout.setVerticalGroup(
            panelTotaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTotaleLayout.createSequentialGroup()
                .addComponent(panelSuperiore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(panelTotaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelContenuti, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTotale, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTotale, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    @Override
    public void setVisible(boolean b) {
        if(b) {
            riempiTablePrincipali();
            setLabelSelezionata(labelMenuHomePage);
            mostraCardHomePage();
        }
        
        super.setVisible(b);
    }
    
    
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
        controller.informazioniHomePage();
        CardLayout card = (CardLayout) panelContenuti.getLayout();
        card.show(panelContenuti, "cardHomePage");
    }
    
    private void mostraCardStudenti() {
        CardLayout card = (CardLayout) panelContenuti.getLayout();
        card.show(panelContenuti, "cardStudenti");
    }
    
    private void mostraCardStudentiHome() {
        CardLayout card = (CardLayout) panelStudenti.getLayout();
        card.show(panelStudenti, "cardStudentiHome");
    }
    
    private void mostraCardCorsiDegliStudenti() {
        CardLayout card = (CardLayout) panelStudenti.getLayout();
        card.show(panelStudenti, "cardCorsiDegliStudenti");
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
    
    private void setLabelSelezionata(JLabel nuovaLabelSelezionata) {
        evidenziaLabel(nuovaLabelSelezionata);
        labelSelezionata = nuovaLabelSelezionata;
    }
            
    private void aggiornaLabelSelezionata(JLabel nuovaLabelSelezionata) {
        deselezionaLabel(labelSelezionata);
        setLabelSelezionata(nuovaLabelSelezionata);
    }
    
    
    
    private void labelMenuStudentiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMenuStudentiMouseClicked
        // TODO add your handling code here:
        aggiornaLabelSelezionata(labelMenuStudenti);
        mostraCardStudenti();
    }//GEN-LAST:event_labelMenuStudentiMouseClicked

    private void labelMenuHomePageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMenuHomePageMouseClicked
        // TODO add your handling code here:
        aggiornaLabelSelezionata(labelMenuHomePage);
        mostraCardHomePage();
    }//GEN-LAST:event_labelMenuHomePageMouseClicked

    private void labelMenuCorsiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMenuCorsiMouseClicked
        // TODO add your handling code here:
        aggiornaLabelSelezionata(labelMenuCorsi);
        mostraCardCorsi();
    }//GEN-LAST:event_labelMenuCorsiMouseClicked

    private void labelMenuLezioniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMenuLezioniMouseClicked
        // TODO add your handling code here:
        aggiornaLabelSelezionata(labelMenuLezioni);
        mostraCardLezioni();
    }//GEN-LAST:event_labelMenuLezioniMouseClicked

    private void labelMenuAreeTematicheMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMenuAreeTematicheMouseClicked
        // TODO add your handling code here:
        aggiornaLabelSelezionata(labelMenuAreeTematiche);
        mostraCardAreeTematiche();
    }//GEN-LAST:event_labelMenuAreeTematicheMouseClicked

    private void buttonEsciHomePageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEsciHomePageActionPerformed
        // TODO add your handling code here:
        controller.esciDaOperatore();
    }//GEN-LAST:event_buttonEsciHomePageActionPerformed

    private void buttonCorsiDegliStudentiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCorsiDegliStudentiActionPerformed
        // TODO add your handling code here:
        mostraCardCorsiDegliStudenti();
    }//GEN-LAST:event_buttonCorsiDegliStudentiActionPerformed

    private void buttonTornaStudentiHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTornaStudentiHomeActionPerformed
        // TODO add your handling code here:
        mostraCardStudentiHome();
    }//GEN-LAST:event_buttonTornaStudentiHomeActionPerformed

    private void tableStudentiPrincipaleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableStudentiPrincipaleMouseClicked
        // TODO add your handling code here:
        Object studenteSelezionato = tableStudentiPrincipale.getModel().getValueAt(tableStudentiPrincipale.getSelectedRow(), 0);
        svuotaTable(tableCorsiFrequentati);
        controller.inserisciCorsiFrequentatiInJTable(studenteSelezionato);
        svuotaTable(tablePresenze);
        controller.inserisciPresenzeInJTable(studenteSelezionato);
    }//GEN-LAST:event_tableStudentiPrincipaleMouseClicked
    
    
    
    public void impostaInformazioniHomePage(int numeroStudenti, int numeroAreeTematiche, int numeroCorsi, int numeroLezioni){
        String informazioni = "Studenti registrati: " + numeroStudenti + System.lineSeparator() + System.lineSeparator() +
                              "Aree Tematiche registrate: " + numeroAreeTematiche + System.lineSeparator() + System.lineSeparator() +
                              "Corsi registrati: " + numeroCorsi + System.lineSeparator() + System.lineSeparator() +
                              "Lezioni registrate: " + numeroLezioni;
        textAreaInformazioniHomePage.setText(informazioni);
    }
    
    private void nascondiColonnaOggetto(JTable table) {
        if(table.getColumnName(0).equals("Oggetto")) {
            table.removeColumn(table.getColumnModel().getColumn(0));
        }
    }
    
    private void nascondiTutteColonneOggetto() {
        nascondiColonneOggettiCardStudenti();
        //nascondiColonneOggettiCardAreeTematiche();
        //nascondiColonneOggettiCardCorsi();
        //nascondiColonneOggettiCardLezioni();
    }
    
    private void nascondiColonneOggettiCardStudenti() {
        nascondiColonnaOggetto(tableStudentiPrincipale);
        nascondiColonnaOggetto(tableCorsiFrequentati);
        nascondiColonnaOggetto(tablePresenze);
    }
    
    private void svuotaTable(JTable table) {
        DefaultTableModel modelTablePresenze = (DefaultTableModel) table.getModel();
        modelTablePresenze.setRowCount(0);
    }
    
    private void riempiTablePrincipali() {
        svuotaTable(tableStudentiPrincipale);
        controller.inserisciTuttiStudentiInJTable();
        //controller.inserisciTutteLeAreeTematicheInJTable();
        //controller.inserisciTuttiICorsiInJTable();
        //controller.inserisciTutteLeLezioniInJTable();
    }
    
    
    
    public void inserisciStudenteInTableStudentiPrincipale(Object[] row) {
        DefaultTableModel modelTableTuttiStudenti = (DefaultTableModel) tableStudentiPrincipale.getModel();
        modelTableTuttiStudenti.addRow(row);
    }
    
    public void inserisciCorsoInTableCorsiFrequentati(Object[] row) {
        DefaultTableModel modelTableCorsiFrequentati = (DefaultTableModel) tableCorsiFrequentati.getModel();
        modelTableCorsiFrequentati.addRow(row);
    }
    
    public void inserisciLezioneInTablePresenze(Object[] row) {
        DefaultTableModel modelTablePresenze = (DefaultTableModel) tablePresenze.getModel();
        modelTablePresenze.addRow(row);
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCorsiDegliStudenti;
    private javax.swing.JButton buttonEsciHomePage;
    private javax.swing.JButton buttonTornaStudentiHome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelChiudi;
    private javax.swing.JLabel labelCorsiDegliStudenti;
    private javax.swing.JLabel labelHomePage;
    private javax.swing.JLabel labelMenuAreeTematiche;
    private javax.swing.JLabel labelMenuCorsi;
    private javax.swing.JLabel labelMenuHomePage;
    private javax.swing.JLabel labelMenuLezioni;
    private javax.swing.JLabel labelMenuStudenti;
    private javax.swing.JLabel labelMinimizza;
    private javax.swing.JLabel labelRidimensiona;
    private javax.swing.JLabel labelStudenti;
    private javax.swing.JLabel labelTitolo;
    private javax.swing.JPanel panelAreeTematiche;
    private javax.swing.JPanel panelContenuti;
    private javax.swing.JPanel panelCorsi;
    private javax.swing.JPanel panelCorsiDegliStudenti;
    private javax.swing.JPanel panelHomePage;
    private javax.swing.JPanel panelLezioni;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panelStudenti;
    private javax.swing.JPanel panelStudentiHome;
    private javax.swing.JPanel panelSuperiore;
    private javax.swing.JPanel panelTotale;
    private javax.swing.JScrollPane scrollPaneTableCorsiFrequentati;
    private javax.swing.JScrollPane scrollPaneTablePresenze;
    private javax.swing.JScrollPane scrollPaneTableStudenti1;
    private javax.swing.JScrollPane scrollPaneTableTuttiStudenti;
    private javax.swing.JTable tableCorsiFrequentati;
    private javax.swing.JTable tablePresenze;
    private javax.swing.JTable tableStudenti1;
    private javax.swing.JTable tableStudentiPrincipale;
    private javax.swing.JTextArea textAreaInformazioniHomePage;
    // End of variables declaration//GEN-END:variables
}
