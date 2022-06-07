package gui.homeFrame.panels.corsi;

import controller.Controller;
import gui.homeFrame.HomeFrameOperatore;
import gui.homeFrame.panels.panelGenerico.PanelGenerico;



public class PanelProspettoCorso extends PanelGenerico {

    public PanelProspettoCorso(Controller controller, HomeFrameOperatore homeFrame) {
        super(controller, homeFrame);
        initComponents();
        nascondiColonnaOggetto(tableCorsoSelezionato);
        nascondiColonnaOggetto(tableStudentiIdonei);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelProspettoCorso = new javax.swing.JLabel();
        scrollPaneTableCorsoSelezionato = new javax.swing.JScrollPane();
        tableCorsoSelezionato = new javax.swing.JTable();
        scrollPaneTableStudentiIdonei = new javax.swing.JScrollPane();
        tableStudentiIdonei = new javax.swing.JTable();
        labelStudentiIdonei = new javax.swing.JLabel();
        labelCorsoSelezionato = new javax.swing.JLabel();
        scrollPaneTextAreaInformazioniCorso = new javax.swing.JScrollPane();
        textAreaInformazioniCorso = new javax.swing.JTextArea();
        buttonIndietro = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(745, 566));
        setPreferredSize(new java.awt.Dimension(745, 566));

        labelProspettoCorso.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        labelProspettoCorso.setForeground(new java.awt.Color(153, 204, 255));
        labelProspettoCorso.setText("Prospetto corso");

        tableCorsoSelezionato.setBackground(new java.awt.Color(255, 255, 255));
        tableCorsoSelezionato.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        tableCorsoSelezionato.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Oggetto", "Codice", "Nome", "Descrizione", "Tasso presenze minime", "Numero massimo iscritti"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableCorsoSelezionato.setGridColor(new java.awt.Color(0, 0, 0));
        tableCorsoSelezionato.setRowHeight(40);
        tableCorsoSelezionato.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableCorsoSelezionato.setShowGrid(true);
        tableCorsoSelezionato.getTableHeader().setReorderingAllowed(false);
        scrollPaneTableCorsoSelezionato.setViewportView(tableCorsoSelezionato);

        tableStudentiIdonei.setBackground(new java.awt.Color(255, 255, 255));
        tableStudentiIdonei.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        tableStudentiIdonei.setModel(new javax.swing.table.DefaultTableModel(
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
        tableStudentiIdonei.setGridColor(new java.awt.Color(0, 0, 0));
        tableStudentiIdonei.setRowHeight(40);
        tableStudentiIdonei.setRowSelectionAllowed(false);
        tableStudentiIdonei.setShowGrid(true);
        tableStudentiIdonei.getTableHeader().setReorderingAllowed(false);
        scrollPaneTableStudentiIdonei.setViewportView(tableStudentiIdonei);

        labelStudentiIdonei.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelStudentiIdonei.setForeground(new java.awt.Color(153, 204, 255));
        labelStudentiIdonei.setText("Studenti idonei");

        labelCorsoSelezionato.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelCorsoSelezionato.setForeground(new java.awt.Color(153, 204, 255));
        labelCorsoSelezionato.setText("Corso selezionato");

        scrollPaneTextAreaInformazioniCorso.setBorder(null);

        textAreaInformazioniCorso.setEditable(false);
        textAreaInformazioniCorso.setBackground(new java.awt.Color(255, 255, 255));
        textAreaInformazioniCorso.setColumns(20);
        textAreaInformazioniCorso.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        textAreaInformazioniCorso.setForeground(new java.awt.Color(0, 0, 0));
        textAreaInformazioniCorso.setRows(5);
        textAreaInformazioniCorso.setBorder(null);
        textAreaInformazioniCorso.setMargin(new java.awt.Insets(0, 0, 0, 0));
        scrollPaneTextAreaInformazioniCorso.setViewportView(textAreaInformazioniCorso);

        buttonIndietro.setBackground(new java.awt.Color(153, 204, 255));
        buttonIndietro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonIndietro.setForeground(new java.awt.Color(255, 255, 255));
        buttonIndietro.setText("Indietro");
        buttonIndietro.setBorder(null);
        buttonIndietro.setBorderPainted(false);
        buttonIndietro.setFocusPainted(false);
        buttonIndietro.setOpaque(true);
        buttonIndietro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonIndietroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelProspettoCorso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(scrollPaneTextAreaInformazioniCorso, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scrollPaneTableCorsoSelezionato, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE)
                            .addComponent(labelCorsoSelezionato, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 658, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelStudentiIdonei, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 658, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(scrollPaneTableStudentiIdonei, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap(19, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonIndietro, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(labelProspettoCorso)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(labelCorsoSelezionato)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPaneTableCorsoSelezionato, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelStudentiIdonei)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPaneTableStudentiIdonei, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(scrollPaneTextAreaInformazioniCorso, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(buttonIndietro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonIndietroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonIndietroActionPerformed
        getHomeFrame().mostraPanelCorsi();
    }//GEN-LAST:event_buttonIndietroActionPerformed
    
    public void svuotaTutteTable() {
        svuotaTable(tableCorsoSelezionato);
        svuotaTable(tableStudentiIdonei);
    }
    
    public void inserisciInTableCorsoSelezionato(Object[] row) {
        inserisciRigaInJTable(tableCorsoSelezionato, row);
    }
    
    public void inserisciInTableStudentiIdonei(Object[] row) {
        inserisciRigaInJTable(tableStudentiIdonei, row);
    }
    
    public void impostaInformazioniCorso(int numeroMedio, int numeroMinimo, int numeroMassimo, int riempimentoMedio) {
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonIndietro;
    private javax.swing.JLabel labelCorsoSelezionato;
    private javax.swing.JLabel labelProspettoCorso;
    private javax.swing.JLabel labelStudentiIdonei;
    private javax.swing.JScrollPane scrollPaneTableCorsoSelezionato;
    private javax.swing.JScrollPane scrollPaneTableStudentiIdonei;
    private javax.swing.JScrollPane scrollPaneTextAreaInformazioniCorso;
    private javax.swing.JTable tableCorsoSelezionato;
    private javax.swing.JTable tableStudentiIdonei;
    private javax.swing.JTextArea textAreaInformazioniCorso;
    // End of variables declaration//GEN-END:variables

}
