package gui.homeFrame.panels.lezioni;

import controller.Controller;
import eccezioni.gui.NessunaRigaSelezionataException;
import gui.homeFrame.HomeFrameOperatore;
import gui.homeFrame.panels.panelGenerico.PanelGenerico;



public class PanelLezioni extends PanelGenerico {
    
    public PanelLezioni(Controller controller, HomeFrameOperatore homeFrame) {
        super(controller, homeFrame);
        initComponents();
        nascondiColonnaOggetto(tableLezioni);
        nascondiColonnaOggetto(tableStudentiPresenti);
        nascondiColonnaOggetto(tableCorsoDellaLezione);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelLezioni = new javax.swing.JLabel();
        scrollPaneTableLezioni = new javax.swing.JScrollPane();
        tableLezioni = new javax.swing.JTable();
        scrollPaneTableStudentiPresenti = new javax.swing.JScrollPane();
        tableStudentiPresenti = new javax.swing.JTable();
        scrollPaneTableCorsoDellaLezione = new javax.swing.JScrollPane();
        tableCorsoDellaLezione = new javax.swing.JTable();
        buttonNuovaLezione = new javax.swing.JButton();
        labelStudentiPresenti = new javax.swing.JLabel();
        labelCorsoDellaLezione = new javax.swing.JLabel();
        buttonEliminaLezione = new javax.swing.JButton();
        buttonAggiornaLezione = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(745, 566));

        labelLezioni.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        labelLezioni.setForeground(new java.awt.Color(153, 204, 255));
        labelLezioni.setText("Lezioni");

        tableLezioni.setBackground(new java.awt.Color(255, 255, 255));
        tableLezioni.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        tableLezioni.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Oggetto", "Codice", "Titolo", "Descrizione", "Data e ora inizio", "Durata (HH:MM)"
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
        tableLezioni.setGridColor(new java.awt.Color(0, 0, 0));
        tableLezioni.setRowHeight(40);
        tableLezioni.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableLezioni.setShowGrid(true);
        tableLezioni.getTableHeader().setReorderingAllowed(false);
        tableLezioni.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                tableLezioniMouseDragged(evt);
            }
        });
        tableLezioni.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableLezioniMouseClicked(evt);
            }
        });
        scrollPaneTableLezioni.setViewportView(tableLezioni);

        tableStudentiPresenti.setBackground(new java.awt.Color(255, 255, 255));
        tableStudentiPresenti.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        tableStudentiPresenti.setModel(new javax.swing.table.DefaultTableModel(
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
        tableStudentiPresenti.setGridColor(new java.awt.Color(0, 0, 0));
        tableStudentiPresenti.setRowHeight(40);
        tableStudentiPresenti.setRowSelectionAllowed(false);
        tableStudentiPresenti.setShowGrid(true);
        tableStudentiPresenti.getTableHeader().setReorderingAllowed(false);
        scrollPaneTableStudentiPresenti.setViewportView(tableStudentiPresenti);

        tableCorsoDellaLezione.setBackground(new java.awt.Color(255, 255, 255));
        tableCorsoDellaLezione.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        tableCorsoDellaLezione.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Oggetto", "Codice", "Nome", "Descrizione", "Tasso presenze minimo", "Numero massimo iscritti"
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
        tableCorsoDellaLezione.setGridColor(new java.awt.Color(0, 0, 0));
        tableCorsoDellaLezione.setRowHeight(40);
        tableCorsoDellaLezione.setRowSelectionAllowed(false);
        tableCorsoDellaLezione.setShowGrid(true);
        tableCorsoDellaLezione.getTableHeader().setReorderingAllowed(false);
        scrollPaneTableCorsoDellaLezione.setViewportView(tableCorsoDellaLezione);

        buttonNuovaLezione.setBackground(new java.awt.Color(153, 204, 255));
        buttonNuovaLezione.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonNuovaLezione.setForeground(new java.awt.Color(255, 255, 255));
        buttonNuovaLezione.setText("Nuova lezione");
        buttonNuovaLezione.setBorder(null);
        buttonNuovaLezione.setBorderPainted(false);
        buttonNuovaLezione.setFocusPainted(false);
        buttonNuovaLezione.setOpaque(true);
        buttonNuovaLezione.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNuovaLezioneActionPerformed(evt);
            }
        });

        labelStudentiPresenti.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelStudentiPresenti.setForeground(new java.awt.Color(153, 204, 255));
        labelStudentiPresenti.setText("Studenti Presenti");

        labelCorsoDellaLezione.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelCorsoDellaLezione.setForeground(new java.awt.Color(153, 204, 255));
        labelCorsoDellaLezione.setText("Corso della lezione");

        buttonEliminaLezione.setBackground(new java.awt.Color(153, 204, 255));
        buttonEliminaLezione.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonEliminaLezione.setForeground(new java.awt.Color(255, 255, 255));
        buttonEliminaLezione.setText("Elimina lezione");
        buttonEliminaLezione.setBorder(null);
        buttonEliminaLezione.setBorderPainted(false);
        buttonEliminaLezione.setFocusPainted(false);
        buttonEliminaLezione.setOpaque(true);
        buttonEliminaLezione.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEliminaLezioneActionPerformed(evt);
            }
        });

        buttonAggiornaLezione.setBackground(new java.awt.Color(153, 204, 255));
        buttonAggiornaLezione.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonAggiornaLezione.setForeground(new java.awt.Color(255, 255, 255));
        buttonAggiornaLezione.setText("Aggiorna lezione");
        buttonAggiornaLezione.setBorder(null);
        buttonAggiornaLezione.setBorderPainted(false);
        buttonAggiornaLezione.setFocusPainted(false);
        buttonAggiornaLezione.setOpaque(true);
        buttonAggiornaLezione.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAggiornaLezioneActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(101, Short.MAX_VALUE)
                .addComponent(buttonNuovaLezione, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(buttonEliminaLezione, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(buttonAggiornaLezione, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(111, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(labelLezioni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(scrollPaneTableLezioni, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(43, 43, 43)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(scrollPaneTableStudentiPresenti, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
                                .addComponent(scrollPaneTableCorsoDellaLezione, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(labelCorsoDellaLezione, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(45, 45, 45)
                            .addComponent(labelStudentiPresenti, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGap(20, 20, 20)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(518, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonEliminaLezione, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonAggiornaLezione, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonNuovaLezione, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(19, 19, 19)
                    .addComponent(labelLezioni)
                    .addGap(20, 20, 20)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(labelStudentiPresenti)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(scrollPaneTableStudentiPresenti, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGap(18, 18, 18)
                            .addComponent(labelCorsoDellaLezione)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(scrollPaneTableCorsoDellaLezione, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addComponent(scrollPaneTableLezioni, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE))
                    .addGap(105, 105, 105)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tableLezioniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableLezioniMouseClicked
        aggiornaSelezione();
    }//GEN-LAST:event_tableLezioniMouseClicked

    private void tableLezioniMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableLezioniMouseDragged
        aggiornaSelezione();
    }//GEN-LAST:event_tableLezioniMouseDragged

    private void buttonNuovaLezioneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNuovaLezioneActionPerformed
        getHomeFrame().mostraPanelNuovaLezione();
    }//GEN-LAST:event_buttonNuovaLezioneActionPerformed

    private void buttonEliminaLezioneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEliminaLezioneActionPerformed
        try {
            controllaRigaSelezionata(tableLezioni, "lezioni");
            getController().eliminaLezione(ottieniOggettoSelezionato(tableLezioni));
        }
        catch (NessunaRigaSelezionataException e) {
            getHomeFrame().mostraEccezione(e.getMessage());
        }
    }//GEN-LAST:event_buttonEliminaLezioneActionPerformed

    private void buttonAggiornaLezioneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAggiornaLezioneActionPerformed
        try {
            controllaRigaSelezionata(tableLezioni, "lezioni");
            getController().impostaPanelAggiornaLezione(ottieniOggettoSelezionato(tableLezioni));
            getHomeFrame().mostraPanelAggiornaLezione();
        }
        catch (NessunaRigaSelezionataException e) {
            getHomeFrame().mostraEccezione(e.getMessage());
        }
    }//GEN-LAST:event_buttonAggiornaLezioneActionPerformed

    public void rimuoviLezioneSelezionata() {
        rimuoviRigaSelezionataDaJTable(tableLezioni);
    }
    
    public void aggiornaLezioneSelezionata(Object[] row) {
        sostituisciRigaSelezionata(tableLezioni, row);
    }
    
    public void svuotaTutteTable() {
        svuotaTable(tableLezioni);
        svuotaTable(tableStudentiPresenti);
        svuotaTable(tableCorsoDellaLezione);
    }
    
    public void svuotaTableAssociazioni() {
        svuotaTable(tableStudentiPresenti);
        svuotaTable(tableCorsoDellaLezione);
    }
    
    public void aggiornaSelezione() {
        if (tableLezioni.getSelectedRow() != -1) {
            Object lezioneSelezionata = ottieniOggettoSelezionato(tableLezioni);
            getController().aggiornaSelezionePanelLezioni(lezioneSelezionata);
        }
    }
    
    public void inserisciInTableLezioni(Object[] row) {
        inserisciRigaInJTable(tableLezioni, row);
    }
    
    public void inserisciInTableStudentiPresenti(Object[] row) {
        inserisciRigaInJTable(tableStudentiPresenti, row);
    }
    
    public void inserisciInTableCorsoDellaLezione(Object[] row) {
        inserisciRigaInJTable(tableCorsoDellaLezione, row);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAggiornaLezione;
    private javax.swing.JButton buttonEliminaLezione;
    private javax.swing.JButton buttonNuovaLezione;
    private javax.swing.JLabel labelCorsoDellaLezione;
    private javax.swing.JLabel labelLezioni;
    private javax.swing.JLabel labelStudentiPresenti;
    private javax.swing.JScrollPane scrollPaneTableCorsoDellaLezione;
    private javax.swing.JScrollPane scrollPaneTableLezioni;
    private javax.swing.JScrollPane scrollPaneTableStudentiPresenti;
    private javax.swing.JTable tableCorsoDellaLezione;
    private javax.swing.JTable tableLezioni;
    private javax.swing.JTable tableStudentiPresenti;
    // End of variables declaration//GEN-END:variables

}
