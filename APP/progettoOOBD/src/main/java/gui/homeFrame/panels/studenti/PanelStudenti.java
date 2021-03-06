package gui.homeFrame.panels.studenti;

import controller.Controller;
import eccezioni.gui.NessunaRigaSelezionataException;
import gui.homeFrame.HomeFrameOperatore;
import gui.homeFrame.panels.panelGenerico.PanelGenerico;



public class PanelStudenti extends PanelGenerico {
    
    public PanelStudenti(Controller controller, HomeFrameOperatore homeFrame) {
        super(controller, homeFrame);
        initComponents();
        nascondiColonnaOggetto(tableStudenti);
        nascondiColonnaOggetto(tableCorsiFrequentati);
        nascondiColonnaOggetto(tablePresenze);
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
        buttonIscrizioni = new javax.swing.JButton();
        buttonPresenze = new javax.swing.JButton();
        buttonAggiornaStudente = new javax.swing.JButton();

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
        tableStudenti.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableStudenti.setShowGrid(true);
        tableStudenti.getTableHeader().setReorderingAllowed(false);
        tableStudenti.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                tableStudentiMouseDragged(evt);
            }
        });
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
                "Oggetto", "Codice", "Nome", "Descrizione", "Tasso presenze minime", "Numero massimo iscritti"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        tableCorsiFrequentati.setGridColor(new java.awt.Color(0, 0, 0));
        tableCorsiFrequentati.setRowHeight(40);
        tableCorsiFrequentati.setRowSelectionAllowed(false);
        tableCorsiFrequentati.setShowGrid(true);
        tableCorsiFrequentati.getTableHeader().setReorderingAllowed(false);
        scrollPaneTableCorsiFrequentati.setViewportView(tableCorsiFrequentati);

        tablePresenze.setBackground(new java.awt.Color(255, 255, 255));
        tablePresenze.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        tablePresenze.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Oggetto", "Codice", "Titolo", "Descrizione", "Data e ora inizio", "Durata"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        tablePresenze.setGridColor(new java.awt.Color(0, 0, 0));
        tablePresenze.setRowHeight(40);
        tablePresenze.setRowSelectionAllowed(false);
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

        buttonIscrizioni.setBackground(new java.awt.Color(153, 204, 255));
        buttonIscrizioni.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonIscrizioni.setForeground(new java.awt.Color(255, 255, 255));
        buttonIscrizioni.setText("Iscrizioni");
        buttonIscrizioni.setBorder(null);
        buttonIscrizioni.setBorderPainted(false);
        buttonIscrizioni.setFocusPainted(false);
        buttonIscrizioni.setOpaque(true);
        buttonIscrizioni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonIscrizioniActionPerformed(evt);
            }
        });

        buttonPresenze.setBackground(new java.awt.Color(153, 204, 255));
        buttonPresenze.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonPresenze.setForeground(new java.awt.Color(255, 255, 255));
        buttonPresenze.setText("Presenze");
        buttonPresenze.setBorder(null);
        buttonPresenze.setBorderPainted(false);
        buttonPresenze.setFocusPainted(false);
        buttonPresenze.setOpaque(true);
        buttonPresenze.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPresenzeActionPerformed(evt);
            }
        });

        buttonAggiornaStudente.setBackground(new java.awt.Color(153, 204, 255));
        buttonAggiornaStudente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonAggiornaStudente.setForeground(new java.awt.Color(255, 255, 255));
        buttonAggiornaStudente.setText("Aggiorna studente");
        buttonAggiornaStudente.setBorder(null);
        buttonAggiornaStudente.setBorderPainted(false);
        buttonAggiornaStudente.setFocusPainted(false);
        buttonAggiornaStudente.setOpaque(true);
        buttonAggiornaStudente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAggiornaStudenteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(labelStudenti, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(400, 400, 400))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(scrollPaneTableStudenti, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttonNuovoStudente, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                                .addComponent(buttonEliminaStudente, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(labelCorsiFrequentati, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(scrollPaneTableCorsiFrequentati, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(scrollPaneTablePresenze, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelPresenze)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(buttonIscrizioni, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                                        .addComponent(buttonPresenze, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(20, 20, 20))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonAggiornaStudente, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
                    .addComponent(scrollPaneTableStudenti, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonNuovoStudente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonEliminaStudente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonIscrizioni, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonPresenze, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonAggiornaStudente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    private void tableStudentiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableStudentiMouseClicked
        aggiornaSelezione();
    }//GEN-LAST:event_tableStudentiMouseClicked

    private void buttonNuovoStudenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNuovoStudenteActionPerformed
        getHomeFrame().mostraPanelNuovoStudente();
    }//GEN-LAST:event_buttonNuovoStudenteActionPerformed

    private void buttonEliminaStudenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEliminaStudenteActionPerformed
        try {
            controllaRigaSelezionata(tableStudenti, "studenti");
            getController().eliminaStudente(ottieniOggettoSelezionato(tableStudenti));
        }
        catch (NessunaRigaSelezionataException e) {
            getHomeFrame().mostraEccezione(e.getMessage());
        }
    }//GEN-LAST:event_buttonEliminaStudenteActionPerformed

    private void buttonIscrizioniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonIscrizioniActionPerformed
        try {
            controllaRigaSelezionata(tableStudenti, "studenti");
            getController().impostaPanelIscrizioni(ottieniOggettoSelezionato(tableStudenti));
            getHomeFrame().mostraPanelIscrizioni();
        }
        catch (NessunaRigaSelezionataException e) {
            getHomeFrame().mostraEccezione(e.getMessage());
        }
    }//GEN-LAST:event_buttonIscrizioniActionPerformed

    private void tableStudentiMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableStudentiMouseDragged
        aggiornaSelezione();
    }//GEN-LAST:event_tableStudentiMouseDragged

    private void buttonAggiornaStudenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAggiornaStudenteActionPerformed
        try {
            controllaRigaSelezionata(tableStudenti, "studenti");
            getController().impostaPanelAggiornaStudente(ottieniOggettoSelezionato(tableStudenti));
            getHomeFrame().mostraPanelAggiornaStudente();
        }
        catch (NessunaRigaSelezionataException e) {
            getHomeFrame().mostraEccezione(e.getMessage());
        }
    }//GEN-LAST:event_buttonAggiornaStudenteActionPerformed

    private void buttonPresenzeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPresenzeActionPerformed
        try {
            controllaRigaSelezionata(tableStudenti, "studenti");
            getController().impostaPanelPresenze(ottieniOggettoSelezionato(tableStudenti));
            getHomeFrame().mostraPanelPresenze();
        }
        catch (NessunaRigaSelezionataException e) {
            getHomeFrame().mostraEccezione(e.getMessage());
        }
    }//GEN-LAST:event_buttonPresenzeActionPerformed
    
    public void rimuoviStudenteSelezionato() {
        rimuoviRigaSelezionataDaJTable(tableStudenti);
    }
    
    public void aggiornaStudenteSelezionato(Object[] row) {
        sostituisciRigaSelezionata(tableStudenti, row);
    }
    
    public void svuotaTutteTable() {
        svuotaTable(tableStudenti);
        svuotaTable(tableCorsiFrequentati);
        svuotaTable(tablePresenze);
    }
    
    public void svuotaTableAssociazioni() {
        svuotaTable(tableCorsiFrequentati);
        svuotaTable(tablePresenze);
    }
    
    public void aggiornaSelezione() {
        if(tableStudenti.getSelectedRow() != -1) {
            getController().aggiornaSelezionePanelStudenti(ottieniOggettoSelezionato(tableStudenti));
        }
    }
    
    public void inserisciInTableStudenti(Object[] row) {
        inserisciRigaInJTable(tableStudenti, row);
    }
    
    public void inserisciInTableCorsiFrequentati(Object[] row) {
        inserisciRigaInJTable(tableCorsiFrequentati, row);
    }
    
    public void inserisciInTablePresenze(Object[] row) {
        inserisciRigaInJTable(tablePresenze, row);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAggiornaStudente;
    private javax.swing.JButton buttonEliminaStudente;
    private javax.swing.JButton buttonIscrizioni;
    private javax.swing.JButton buttonNuovoStudente;
    private javax.swing.JButton buttonPresenze;
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
