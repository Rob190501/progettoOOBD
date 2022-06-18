package gui.homeFrame.panels.corsi;

import controller.Controller;
import eccezioni.gui.NessunaRigaSelezionataException;
import gui.homeFrame.HomeFrameOperatore;
import gui.homeFrame.panels.panelGenerico.PanelGenerico;



public class PanelCorsi extends PanelGenerico {

    public PanelCorsi(Controller controller, HomeFrameOperatore homeFrame) {
        super(controller, homeFrame);
        initComponents();
        nascondiColonnaOggetto(tableCorsi);
        nascondiColonnaOggetto(tableLezioniDelCorso);
        nascondiColonnaOggetto(tableStudentiDelCorso);
        nascondiColonnaOggetto(tableAreeDelCorso);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelCorsi = new javax.swing.JLabel();
        scrollPaneTableCorsi = new javax.swing.JScrollPane();
        tableCorsi = new javax.swing.JTable();
        scrollPaneTableLezioniDelCorso = new javax.swing.JScrollPane();
        tableLezioniDelCorso = new javax.swing.JTable();
        scrollPaneTableStudentiIscritti = new javax.swing.JScrollPane();
        tableStudentiDelCorso = new javax.swing.JTable();
        buttonNuovoCorso = new javax.swing.JButton();
        labelLezioniDelCorso = new javax.swing.JLabel();
        labelStudentiIscritti = new javax.swing.JLabel();
        labelStudentiIscritti1 = new javax.swing.JLabel();
        scrollPaneTableAreeDelCorso = new javax.swing.JScrollPane();
        tableAreeDelCorso = new javax.swing.JTable();
        buttonEliminaCorso = new javax.swing.JButton();
        buttonAggiornaCorso = new javax.swing.JButton();
        buttonProspettoCorso = new javax.swing.JButton();
        buttonRicercaCorso = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(745, 566));
        setPreferredSize(new java.awt.Dimension(745, 566));

        labelCorsi.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        labelCorsi.setForeground(new java.awt.Color(153, 204, 255));
        labelCorsi.setText("Corsi");

        tableCorsi.setBackground(new java.awt.Color(255, 255, 255));
        tableCorsi.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        tableCorsi.setModel(new javax.swing.table.DefaultTableModel(
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
        tableCorsi.setGridColor(new java.awt.Color(0, 0, 0));
        tableCorsi.setRowHeight(40);
        tableCorsi.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableCorsi.setShowGrid(true);
        tableCorsi.getTableHeader().setReorderingAllowed(false);
        tableCorsi.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                tableCorsiMouseDragged(evt);
            }
        });
        tableCorsi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableCorsiMouseClicked(evt);
            }
        });
        scrollPaneTableCorsi.setViewportView(tableCorsi);

        tableLezioniDelCorso.setBackground(new java.awt.Color(255, 255, 255));
        tableLezioniDelCorso.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        tableLezioniDelCorso.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Oggetto", "Codice", "Titolo", "Descrizione", "Data e ora inizio", "Durata"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
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
        tableLezioniDelCorso.setGridColor(new java.awt.Color(0, 0, 0));
        tableLezioniDelCorso.setRowHeight(40);
        tableLezioniDelCorso.setRowSelectionAllowed(false);
        tableLezioniDelCorso.setShowGrid(true);
        tableLezioniDelCorso.getTableHeader().setReorderingAllowed(false);
        scrollPaneTableLezioniDelCorso.setViewportView(tableLezioniDelCorso);

        tableStudentiDelCorso.setBackground(new java.awt.Color(255, 255, 255));
        tableStudentiDelCorso.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        tableStudentiDelCorso.setModel(new javax.swing.table.DefaultTableModel(
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
        tableStudentiDelCorso.setGridColor(new java.awt.Color(0, 0, 0));
        tableStudentiDelCorso.setRowHeight(40);
        tableStudentiDelCorso.setRowSelectionAllowed(false);
        tableStudentiDelCorso.setShowGrid(true);
        tableStudentiDelCorso.getTableHeader().setReorderingAllowed(false);
        scrollPaneTableStudentiIscritti.setViewportView(tableStudentiDelCorso);

        buttonNuovoCorso.setBackground(new java.awt.Color(153, 204, 255));
        buttonNuovoCorso.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonNuovoCorso.setForeground(new java.awt.Color(255, 255, 255));
        buttonNuovoCorso.setText("Nuovo corso");
        buttonNuovoCorso.setBorder(null);
        buttonNuovoCorso.setBorderPainted(false);
        buttonNuovoCorso.setFocusPainted(false);
        buttonNuovoCorso.setOpaque(true);
        buttonNuovoCorso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNuovoCorsoActionPerformed(evt);
            }
        });

        labelLezioniDelCorso.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelLezioniDelCorso.setForeground(new java.awt.Color(153, 204, 255));
        labelLezioniDelCorso.setText("Lezioni del corso");

        labelStudentiIscritti.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelStudentiIscritti.setForeground(new java.awt.Color(153, 204, 255));
        labelStudentiIscritti.setText("Studenti iscritti");

        labelStudentiIscritti1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelStudentiIscritti1.setForeground(new java.awt.Color(153, 204, 255));
        labelStudentiIscritti1.setText("Aree tematiche");

        scrollPaneTableAreeDelCorso.setPreferredSize(new java.awt.Dimension(452, 108));

        tableAreeDelCorso.setBackground(new java.awt.Color(255, 255, 255));
        tableAreeDelCorso.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        tableAreeDelCorso.setModel(new javax.swing.table.DefaultTableModel(
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
        tableAreeDelCorso.setGridColor(new java.awt.Color(0, 0, 0));
        tableAreeDelCorso.setRowHeight(40);
        tableAreeDelCorso.setRowSelectionAllowed(false);
        tableAreeDelCorso.setShowGrid(true);
        tableAreeDelCorso.getTableHeader().setReorderingAllowed(false);
        scrollPaneTableAreeDelCorso.setViewportView(tableAreeDelCorso);

        buttonEliminaCorso.setBackground(new java.awt.Color(153, 204, 255));
        buttonEliminaCorso.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonEliminaCorso.setForeground(new java.awt.Color(255, 255, 255));
        buttonEliminaCorso.setText("Elimina corso");
        buttonEliminaCorso.setBorder(null);
        buttonEliminaCorso.setBorderPainted(false);
        buttonEliminaCorso.setFocusPainted(false);
        buttonEliminaCorso.setOpaque(true);
        buttonEliminaCorso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEliminaCorsoActionPerformed(evt);
            }
        });

        buttonAggiornaCorso.setBackground(new java.awt.Color(153, 204, 255));
        buttonAggiornaCorso.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonAggiornaCorso.setForeground(new java.awt.Color(255, 255, 255));
        buttonAggiornaCorso.setText("Aggiorna corso");
        buttonAggiornaCorso.setBorder(null);
        buttonAggiornaCorso.setBorderPainted(false);
        buttonAggiornaCorso.setFocusPainted(false);
        buttonAggiornaCorso.setOpaque(true);
        buttonAggiornaCorso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAggiornaCorsoActionPerformed(evt);
            }
        });

        buttonProspettoCorso.setBackground(new java.awt.Color(153, 204, 255));
        buttonProspettoCorso.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonProspettoCorso.setForeground(new java.awt.Color(255, 255, 255));
        buttonProspettoCorso.setText("Prospetto corso");
        buttonProspettoCorso.setBorder(null);
        buttonProspettoCorso.setBorderPainted(false);
        buttonProspettoCorso.setFocusPainted(false);
        buttonProspettoCorso.setOpaque(true);
        buttonProspettoCorso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonProspettoCorsoActionPerformed(evt);
            }
        });

        buttonRicercaCorso.setBackground(new java.awt.Color(153, 204, 255));
        buttonRicercaCorso.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonRicercaCorso.setForeground(new java.awt.Color(255, 255, 255));
        buttonRicercaCorso.setText("Ricerca corso");
        buttonRicercaCorso.setBorder(null);
        buttonRicercaCorso.setBorderPainted(false);
        buttonRicercaCorso.setFocusPainted(false);
        buttonRicercaCorso.setOpaque(true);
        buttonRicercaCorso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRicercaCorsoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelCorsi, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
                    .addComponent(scrollPaneTableCorsi, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelStudentiIscritti, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scrollPaneTableStudentiIscritti, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(scrollPaneTableLezioniDelCorso, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(labelLezioniDelCorso, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
                    .addComponent(scrollPaneTableAreeDelCorso, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(labelStudentiIscritti1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonNuovoCorso, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(buttonEliminaCorso, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(buttonAggiornaCorso, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(buttonProspettoCorso, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonRicercaCorso, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(labelCorsi)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelLezioniDelCorso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(scrollPaneTableLezioniDelCorso, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelStudentiIscritti)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scrollPaneTableStudentiIscritti, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelStudentiIscritti1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scrollPaneTableAreeDelCorso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(scrollPaneTableCorsi, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonNuovoCorso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonEliminaCorso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonAggiornaCorso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonProspettoCorso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonRicercaCorso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tableCorsiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableCorsiMouseClicked
        aggiornaSelezione();
    }//GEN-LAST:event_tableCorsiMouseClicked

    private void tableCorsiMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableCorsiMouseDragged
        aggiornaSelezione();
    }//GEN-LAST:event_tableCorsiMouseDragged

    private void buttonNuovoCorsoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNuovoCorsoActionPerformed
        getHomeFrame().mostraPanelNuovoCorso();
    }//GEN-LAST:event_buttonNuovoCorsoActionPerformed

    private void buttonEliminaCorsoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEliminaCorsoActionPerformed
        try {
            controllaRigaSelezionata(tableCorsi, "corsi");
            getController().eliminaCorso(ottieniOggettoSelezionato(tableCorsi));
        }
        catch (NessunaRigaSelezionataException e) {
            getHomeFrame().mostraEccezione(e.getMessage());
        }
    }//GEN-LAST:event_buttonEliminaCorsoActionPerformed

    private void buttonAggiornaCorsoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAggiornaCorsoActionPerformed
        try {
            controllaRigaSelezionata(tableCorsi, "corsi");
            getController().impostaPanelAggiornaCorso(ottieniOggettoSelezionato(tableCorsi));
            getHomeFrame().mostraPanelAggiornaCorso();
        }
        catch (NessunaRigaSelezionataException e) {
            getHomeFrame().mostraEccezione(e.getMessage());
        }
    }//GEN-LAST:event_buttonAggiornaCorsoActionPerformed

    private void buttonProspettoCorsoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonProspettoCorsoActionPerformed
        try {
            controllaRigaSelezionata(tableCorsi, "corsi");
            getController().impostaPanelProspettoCorso(ottieniOggettoSelezionato(tableCorsi));
            getHomeFrame().mostraPanelProspettoCorso();
        }
        catch (NessunaRigaSelezionataException e) {
            getHomeFrame().mostraEccezione(e.getMessage());
        }
    }//GEN-LAST:event_buttonProspettoCorsoActionPerformed

    private void buttonRicercaCorsoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRicercaCorsoActionPerformed
        getHomeFrame().mostraPanelRicercaCorso();
    }//GEN-LAST:event_buttonRicercaCorsoActionPerformed
    
    public void svuotaTutteTable() {
        svuotaTable(tableCorsi);
        svuotaTable(tableLezioniDelCorso);
        svuotaTable(tableStudentiDelCorso);
        svuotaTable(tableAreeDelCorso);
    }
    
    public void svuotaTableAssociazioni() {
        svuotaTable(tableLezioniDelCorso);
        svuotaTable(tableStudentiDelCorso);
        svuotaTable(tableAreeDelCorso);
    }
    
    public void aggiornaCorsoSelezionato(Object[] row) {
        sostituisciRigaSelezionata(tableCorsi, row);
    }
    
    public void aggiornaSelezione() {
        if(tableCorsi.getSelectedRow() != -1) {
            Object corsoSelezionato = ottieniOggettoSelezionato(tableCorsi);
            getController().aggiornaSelezionePanelCorsi(corsoSelezionato);
        }
    }
    
    public void rimuoviCorsoSelezionato() {
        rimuoviRigaSelezionataDaJTable(tableCorsi);
    }
    
    public void inserisciInTableCorsi(Object[] row) {
        inserisciRigaInJTable(tableCorsi, row);
    }
    
    public void inserisciInTableLezioniDelCorso(Object[] row) {
        inserisciRigaInJTable(tableLezioniDelCorso, row);
    }
    
    public void inserisciInTableStudentiDelCorso(Object[] row) {
        inserisciRigaInJTable(tableStudentiDelCorso, row);
    }
    
    public void inserisciInTableAreeDelCorso(Object[] row) {
        inserisciRigaInJTable(tableAreeDelCorso, row);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAggiornaCorso;
    private javax.swing.JButton buttonEliminaCorso;
    private javax.swing.JButton buttonNuovoCorso;
    private javax.swing.JButton buttonProspettoCorso;
    private javax.swing.JButton buttonRicercaCorso;
    private javax.swing.JLabel labelCorsi;
    private javax.swing.JLabel labelLezioniDelCorso;
    private javax.swing.JLabel labelStudentiIscritti;
    private javax.swing.JLabel labelStudentiIscritti1;
    private javax.swing.JScrollPane scrollPaneTableAreeDelCorso;
    private javax.swing.JScrollPane scrollPaneTableCorsi;
    private javax.swing.JScrollPane scrollPaneTableLezioniDelCorso;
    private javax.swing.JScrollPane scrollPaneTableStudentiIscritti;
    private javax.swing.JTable tableAreeDelCorso;
    private javax.swing.JTable tableCorsi;
    private javax.swing.JTable tableLezioniDelCorso;
    private javax.swing.JTable tableStudentiDelCorso;
    // End of variables declaration//GEN-END:variables

}
