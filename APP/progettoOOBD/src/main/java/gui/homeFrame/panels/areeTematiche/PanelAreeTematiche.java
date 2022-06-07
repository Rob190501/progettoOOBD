package gui.homeFrame.panels.areeTematiche;

import controller.Controller;
import eccezioni.elementiGui.NessunaRigaSelezionataException;
import gui.homeFrame.HomeFrameOperatore;
import gui.homeFrame.panels.panelGenerico.PanelGenerico;



public class PanelAreeTematiche extends PanelGenerico {


    public PanelAreeTematiche(Controller controller, HomeFrameOperatore homeFrame) {
        super(controller, homeFrame);
        initComponents();
        nascondiColonnaOggetto(tableAreeTematiche);
        nascondiColonnaOggetto(tableCorsiDellArea);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelAreeTematiche = new javax.swing.JLabel();
        scrollPaneTableAreeTematiche = new javax.swing.JScrollPane();
        tableAreeTematiche = new javax.swing.JTable();
        scrollPaneTableCorsiDellArea = new javax.swing.JScrollPane();
        tableCorsiDellArea = new javax.swing.JTable();
        labelCorsiDellAreaSelezionata = new javax.swing.JLabel();
        buttonAggiornaAreaTematica = new javax.swing.JButton();
        buttonNuovaAreaTematica = new javax.swing.JButton();
        buttonRimuoviAreaTematica = new javax.swing.JButton();
        buttonCorsiDellAreaTematica = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(745, 566));

        labelAreeTematiche.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        labelAreeTematiche.setForeground(new java.awt.Color(153, 204, 255));
        labelAreeTematiche.setText("Aree Tematiche");

        tableAreeTematiche.setBackground(new java.awt.Color(255, 255, 255));
        tableAreeTematiche.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        tableAreeTematiche.setModel(new javax.swing.table.DefaultTableModel(
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
        tableAreeTematiche.setGridColor(new java.awt.Color(0, 0, 0));
        tableAreeTematiche.setRowHeight(40);
        tableAreeTematiche.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableAreeTematiche.setShowGrid(true);
        tableAreeTematiche.getTableHeader().setReorderingAllowed(false);
        tableAreeTematiche.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                tableAreeTematicheMouseDragged(evt);
            }
        });
        tableAreeTematiche.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableAreeTematicheMouseClicked(evt);
            }
        });
        scrollPaneTableAreeTematiche.setViewportView(tableAreeTematiche);

        tableCorsiDellArea.setBackground(new java.awt.Color(255, 255, 255));
        tableCorsiDellArea.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        tableCorsiDellArea.setModel(new javax.swing.table.DefaultTableModel(
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
        tableCorsiDellArea.setGridColor(new java.awt.Color(0, 0, 0));
        tableCorsiDellArea.setRowHeight(40);
        tableCorsiDellArea.setRowSelectionAllowed(false);
        tableCorsiDellArea.setShowGrid(true);
        tableCorsiDellArea.getTableHeader().setReorderingAllowed(false);
        scrollPaneTableCorsiDellArea.setViewportView(tableCorsiDellArea);

        labelCorsiDellAreaSelezionata.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelCorsiDellAreaSelezionata.setForeground(new java.awt.Color(153, 204, 255));
        labelCorsiDellAreaSelezionata.setText("Corsi dell'area selezionata");

        buttonAggiornaAreaTematica.setBackground(new java.awt.Color(153, 204, 255));
        buttonAggiornaAreaTematica.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonAggiornaAreaTematica.setForeground(new java.awt.Color(255, 255, 255));
        buttonAggiornaAreaTematica.setText("Aggiorna area tematica");
        buttonAggiornaAreaTematica.setBorder(null);
        buttonAggiornaAreaTematica.setBorderPainted(false);
        buttonAggiornaAreaTematica.setFocusPainted(false);
        buttonAggiornaAreaTematica.setOpaque(true);
        buttonAggiornaAreaTematica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAggiornaAreaTematicaActionPerformed(evt);
            }
        });

        buttonNuovaAreaTematica.setBackground(new java.awt.Color(153, 204, 255));
        buttonNuovaAreaTematica.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonNuovaAreaTematica.setForeground(new java.awt.Color(255, 255, 255));
        buttonNuovaAreaTematica.setText("Nuova area tematica");
        buttonNuovaAreaTematica.setBorder(null);
        buttonNuovaAreaTematica.setBorderPainted(false);
        buttonNuovaAreaTematica.setFocusPainted(false);
        buttonNuovaAreaTematica.setOpaque(true);
        buttonNuovaAreaTematica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNuovaAreaTematicaActionPerformed(evt);
            }
        });

        buttonRimuoviAreaTematica.setBackground(new java.awt.Color(153, 204, 255));
        buttonRimuoviAreaTematica.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        buttonRimuoviAreaTematica.setForeground(new java.awt.Color(255, 255, 255));
        buttonRimuoviAreaTematica.setText("Elimina area tematica");
        buttonRimuoviAreaTematica.setBorder(null);
        buttonRimuoviAreaTematica.setBorderPainted(false);
        buttonRimuoviAreaTematica.setFocusPainted(false);
        buttonRimuoviAreaTematica.setOpaque(true);
        buttonRimuoviAreaTematica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRimuoviAreaTematicaActionPerformed(evt);
            }
        });

        buttonCorsiDellAreaTematica.setBackground(new java.awt.Color(153, 204, 255));
        buttonCorsiDellAreaTematica.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonCorsiDellAreaTematica.setForeground(new java.awt.Color(255, 255, 255));
        buttonCorsiDellAreaTematica.setText("Corsi dell'area tematica");
        buttonCorsiDellAreaTematica.setBorder(null);
        buttonCorsiDellAreaTematica.setBorderPainted(false);
        buttonCorsiDellAreaTematica.setFocusPainted(false);
        buttonCorsiDellAreaTematica.setOpaque(true);
        buttonCorsiDellAreaTematica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCorsiDellAreaTematicaActionPerformed(evt);
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
                        .addComponent(labelCorsiDellAreaSelezionata, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(scrollPaneTableCorsiDellArea, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scrollPaneTableAreeTematiche, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(labelAreeTematiche, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttonNuovaAreaTematica, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                .addComponent(buttonRimuoviAreaTematica, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                                .addComponent(buttonAggiornaAreaTematica, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                                .addComponent(buttonCorsiDellAreaTematica, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(labelAreeTematiche)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPaneTableAreeTematiche, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(labelCorsiDellAreaSelezionata)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPaneTableCorsiDellArea, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonAggiornaAreaTematica, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonNuovaAreaTematica, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonRimuoviAreaTematica, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonCorsiDellAreaTematica, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tableAreeTematicheMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableAreeTematicheMouseClicked
        aggiornaSelezione();
    }//GEN-LAST:event_tableAreeTematicheMouseClicked

    private void tableAreeTematicheMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableAreeTematicheMouseDragged
        aggiornaSelezione();
    }//GEN-LAST:event_tableAreeTematicheMouseDragged

    private void buttonNuovaAreaTematicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNuovaAreaTematicaActionPerformed
        getHomeFrame().mostraPanelNuovaAreaTematica();
    }//GEN-LAST:event_buttonNuovaAreaTematicaActionPerformed

    private void buttonRimuoviAreaTematicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRimuoviAreaTematicaActionPerformed
        try {
            controllaRigaSelezionata(tableAreeTematiche, "aree tematiche");
            getController().eliminaAreaTematica(ottieniOggettoSelezionato(tableAreeTematiche));
        }
        catch (NessunaRigaSelezionataException e) {
            getHomeFrame().mostraEccezione(e.getMessage());
        }
    }//GEN-LAST:event_buttonRimuoviAreaTematicaActionPerformed

    private void buttonAggiornaAreaTematicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAggiornaAreaTematicaActionPerformed
        try {
            controllaRigaSelezionata(tableAreeTematiche, "aree tematiche");
            getController().impostaPanelAggiornaAreaTematica(ottieniOggettoSelezionato(tableAreeTematiche));
            getHomeFrame().mostraPanelAggiornaAreaTematica();
        }
        catch (NessunaRigaSelezionataException e) {
            getHomeFrame().mostraEccezione(e.getMessage());
        }
    }//GEN-LAST:event_buttonAggiornaAreaTematicaActionPerformed

    private void buttonCorsiDellAreaTematicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCorsiDellAreaTematicaActionPerformed
        try {
            controllaRigaSelezionata(tableAreeTematiche, "aree tematiche");
            getController().impostaPanelCorsiDellArea(ottieniOggettoSelezionato(tableAreeTematiche));
            getHomeFrame().mostraPanelCorsiDellArea();
        }
        catch (NessunaRigaSelezionataException e) {
            getHomeFrame().mostraEccezione(e.getMessage());
        }
    }//GEN-LAST:event_buttonCorsiDellAreaTematicaActionPerformed
    
    public void svuotaTutteTable() {
        svuotaTable(tableAreeTematiche);
        svuotaTable(tableCorsiDellArea);
    }
    
    public void svuotaTableAssociazioni() {
        svuotaTable(tableCorsiDellArea);
    }
    
    public void aggiornaSelezione() {
        if(tableAreeTematiche.getSelectedRow() != -1) {
            Object areaSelezionata = ottieniOggettoSelezionato(tableAreeTematiche);
            getController().aggiornaSelezionePanelAreeTematiche(areaSelezionata);
        }
    }
    
    public void aggiornaAreaTematicaSelezionata(Object[] row) {
        sostituisciRigaSelezionata(tableAreeTematiche, row);
    }
    
    public void inserisciInTableAreeTematiche(Object[] row) {
        inserisciRigaInJTable(tableAreeTematiche, row);
    }
    
    public void inserisciInTableCorsiDellArea(Object[] row) {
        inserisciRigaInJTable(tableCorsiDellArea, row);
    }
    
    public void rimuoviAreaTematicaSelezionata() {
        rimuoviRigaSelezionataDaJTable(tableAreeTematiche);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAggiornaAreaTematica;
    private javax.swing.JButton buttonCorsiDellAreaTematica;
    private javax.swing.JButton buttonNuovaAreaTematica;
    private javax.swing.JButton buttonRimuoviAreaTematica;
    private javax.swing.JLabel labelAreeTematiche;
    private javax.swing.JLabel labelCorsiDellAreaSelezionata;
    private javax.swing.JScrollPane scrollPaneTableAreeTematiche;
    private javax.swing.JScrollPane scrollPaneTableCorsiDellArea;
    private javax.swing.JTable tableAreeTematiche;
    private javax.swing.JTable tableCorsiDellArea;
    // End of variables declaration//GEN-END:variables

}
