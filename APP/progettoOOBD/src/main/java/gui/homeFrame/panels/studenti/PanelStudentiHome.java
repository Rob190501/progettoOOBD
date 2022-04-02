package gui.homeFrame.panels.studenti;

import controller.Controller;
import gui.homeFrame.HomeFrameOperatore;
import gui.homeFrame.panels.panelContenutiGenerico.PanelContenutiGenerico;

public class PanelStudentiHome extends PanelContenutiGenerico {
    
    public PanelStudentiHome(Controller controller, HomeFrameOperatore homeFrame) {
        super(controller, homeFrame);
        initComponents();
        nascondiTutteColonneOggetti();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelStudenti = new javax.swing.JLabel();
        scrollPaneTableStudenti = new javax.swing.JScrollPane();
        tableStudenti = new javax.swing.JTable();
        scrollPaneTableCorsiFrequentati = new javax.swing.JScrollPane();
        tableCorsiFrequentati = new javax.swing.JTable();
        scrollPaneTablePresenze = new javax.swing.JScrollPane();
        tablePresenze = new javax.swing.JTable();
        buttonNuovoStudente = new javax.swing.JButton();
        labelCorsiFrequentati = new javax.swing.JLabel();
        labelPresenze = new javax.swing.JLabel();
        buttonEliminaStudente = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(745, 566));
        setPreferredSize(new java.awt.Dimension(745, 566));

        labelStudenti.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        labelStudenti.setForeground(new java.awt.Color(153, 204, 255));
        labelStudenti.setText("Studenti");

        tableStudenti.setBackground(new java.awt.Color(255, 255, 255));
        tableStudenti.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        tableStudenti.setModel(new javax.swing.table.DefaultTableModel(
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
        tableStudenti.setGridColor(new java.awt.Color(0, 0, 0));
        tableStudenti.setRowHeight(40);
        tableStudenti.setShowGrid(true);
        tableStudenti.getTableHeader().setReorderingAllowed(false);
        tableStudenti.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableStudentiMouseClicked(evt);
            }
        });
        scrollPaneTableStudenti.setViewportView(tableStudenti);

        tableCorsiFrequentati.setBackground(new java.awt.Color(255, 255, 255));
        tableCorsiFrequentati.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(0, 0, 0)));
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
        tableCorsiFrequentati.setGridColor(new java.awt.Color(0, 0, 0));
        tableCorsiFrequentati.setRowHeight(40);
        tableCorsiFrequentati.setShowGrid(true);
        tableCorsiFrequentati.getTableHeader().setReorderingAllowed(false);
        scrollPaneTableCorsiFrequentati.setViewportView(tableCorsiFrequentati);

        tablePresenze.setBackground(new java.awt.Color(255, 255, 255));
        tablePresenze.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(0, 0, 0)));
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
        tablePresenze.setGridColor(new java.awt.Color(0, 0, 0));
        tablePresenze.setRowHeight(40);
        tablePresenze.setShowGrid(true);
        tablePresenze.getTableHeader().setReorderingAllowed(false);
        scrollPaneTablePresenze.setViewportView(tablePresenze);

        buttonNuovoStudente.setBackground(new java.awt.Color(153, 204, 255));
        buttonNuovoStudente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonNuovoStudente.setForeground(new java.awt.Color(255, 255, 255));
        buttonNuovoStudente.setText("Nuovo studente");
        buttonNuovoStudente.setBorder(null);
        buttonNuovoStudente.setBorderPainted(false);
        buttonNuovoStudente.setFocusPainted(false);
        buttonNuovoStudente.setOpaque(true);
        buttonNuovoStudente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNuovoStudenteActionPerformed(evt);
            }
        });

        labelCorsiFrequentati.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelCorsiFrequentati.setForeground(new java.awt.Color(153, 204, 255));
        labelCorsiFrequentati.setText("Corsi frequentati");

        labelPresenze.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelPresenze.setForeground(new java.awt.Color(153, 204, 255));
        labelPresenze.setText("Presenze");

        buttonEliminaStudente.setBackground(new java.awt.Color(153, 204, 255));
        buttonEliminaStudente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonEliminaStudente.setForeground(new java.awt.Color(255, 255, 255));
        buttonEliminaStudente.setText("Elimina studente");
        buttonEliminaStudente.setBorder(null);
        buttonEliminaStudente.setBorderPainted(false);
        buttonEliminaStudente.setFocusPainted(false);
        buttonEliminaStudente.setOpaque(true);
        buttonEliminaStudente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEliminaStudenteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelStudenti, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(400, 400, 400))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttonNuovoStudente, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(scrollPaneTableStudenti, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelPresenze)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(scrollPaneTableCorsiFrequentati, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
                                        .addComponent(scrollPaneTablePresenze, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(labelCorsiFrequentati, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttonEliminaStudente, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(labelStudenti)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelCorsiFrequentati)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(scrollPaneTableCorsiFrequentati, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(labelPresenze)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(scrollPaneTablePresenze, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(scrollPaneTableStudenti, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonNuovoStudente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonEliminaStudente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    private void tableStudentiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableStudentiMouseClicked
        // TODO add your handling code here:
        svuotaTableSecondarie();
        Object studenteSelezionato = ottieniOggettoSelezionato(tableStudenti);
        getController().inserisciCorsiFrequentatiInJTable(studenteSelezionato);
        getController().inserisciPresenzeInJTable(studenteSelezionato);
    }//GEN-LAST:event_tableStudentiMouseClicked

    private void buttonNuovoStudenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNuovoStudenteActionPerformed
        // TODO add your handling code here:
        getHomeFrame().mostraCardNuovoStudente();
    }//GEN-LAST:event_buttonNuovoStudenteActionPerformed

    private void buttonEliminaStudenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEliminaStudenteActionPerformed
        // TODO add your handling code here:
        Object studenteSelezionato = ottieniOggettoSelezionato(tableStudenti);
        getController().eliminaStudente(studenteSelezionato);
        rimuoviRigaDaTable(tableStudenti);
    }//GEN-LAST:event_buttonEliminaStudenteActionPerformed

    private void nascondiTutteColonneOggetti() {
        nascondiColonnaOggetto(tableStudenti);
        nascondiColonnaOggetto(tableCorsiFrequentati);
        nascondiColonnaOggetto(tablePresenze);
    }
    
    public void svuotaTutteTable() {
        svuotaTable(tableStudenti);
        svuotaTable(tableCorsiFrequentati);
        svuotaTable(tablePresenze);
    }
    
    public void svuotaTableSecondarie() {
        svuotaTable(tableCorsiFrequentati);
        svuotaTable(tablePresenze);
    }
    
    public void inserisciRigaInTableStudenti(Object[] row) {
        inserisciRigaInTable(tableStudenti, row);
    }
    
    public void inserisciRigaInTableCorsiFrequentati(Object[] row) {
        inserisciRigaInTable(tableCorsiFrequentati, row);
    }
    
    public void inserisciRigaInTablePresenze(Object[] row) {
        inserisciRigaInTable(tablePresenze, row);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonEliminaStudente;
    private javax.swing.JButton buttonNuovoStudente;
    private javax.swing.JLabel labelCorsiFrequentati;
    private javax.swing.JLabel labelPresenze;
    private javax.swing.JLabel labelStudenti;
    private javax.swing.JScrollPane scrollPaneTableCorsiFrequentati;
    private javax.swing.JScrollPane scrollPaneTablePresenze;
    private javax.swing.JScrollPane scrollPaneTableStudenti;
    private javax.swing.JTable tableCorsiFrequentati;
    private javax.swing.JTable tablePresenze;
    private javax.swing.JTable tableStudenti;
    // End of variables declaration//GEN-END:variables
}
