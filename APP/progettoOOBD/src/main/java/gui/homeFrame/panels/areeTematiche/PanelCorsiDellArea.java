package gui.homeFrame.panels.areeTematiche;

import controller.Controller;
import eccezioni.gui.NessunaRigaSelezionataException;
import gui.homeFrame.HomeFrameOperatore;
import gui.homeFrame.panels.panelGenerico.PanelGenerico;



public class PanelCorsiDellArea extends PanelGenerico {

    public PanelCorsiDellArea(Controller controller, HomeFrameOperatore homeFrame) {
        super(controller, homeFrame);
        initComponents();
        nascondiColonnaOggetto(tableAreaTematicaSelezionata);
        nascondiColonnaOggetto(tableCorsiRegistrati);
        nascondiColonnaOggetto(tableCorsiRegistrabili);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelCorsiDellArea = new javax.swing.JLabel();
        scrollPaneTableCorsiRegistrabili = new javax.swing.JScrollPane();
        tableCorsiRegistrabili = new javax.swing.JTable();
        buttonRegistra = new javax.swing.JButton();
        labelCorsiRegistrabili = new javax.swing.JLabel();
        buttonIndietro = new javax.swing.JButton();
        scrollPaneTableAreaTematicaSelezionata = new javax.swing.JScrollPane();
        tableAreaTematicaSelezionata = new javax.swing.JTable();
        labelAreaTematicaSelezionata = new javax.swing.JLabel();
        scrollPaneTableCorsiRegistrati = new javax.swing.JScrollPane();
        tableCorsiRegistrati = new javax.swing.JTable();
        labelCorsiRegistrati = new javax.swing.JLabel();
        buttonRimuovi = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(745, 566));
        setPreferredSize(new java.awt.Dimension(745, 566));

        labelCorsiDellArea.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        labelCorsiDellArea.setForeground(new java.awt.Color(153, 204, 255));
        labelCorsiDellArea.setText("Corsi dell'Area Tematica");

        tableCorsiRegistrabili.setBackground(new java.awt.Color(255, 255, 255));
        tableCorsiRegistrabili.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        tableCorsiRegistrabili.setModel(new javax.swing.table.DefaultTableModel(
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
        tableCorsiRegistrabili.setGridColor(new java.awt.Color(0, 0, 0));
        tableCorsiRegistrabili.setRowHeight(40);
        tableCorsiRegistrabili.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableCorsiRegistrabili.setShowGrid(true);
        tableCorsiRegistrabili.getTableHeader().setReorderingAllowed(false);
        scrollPaneTableCorsiRegistrabili.setViewportView(tableCorsiRegistrabili);

        buttonRegistra.setBackground(new java.awt.Color(153, 204, 255));
        buttonRegistra.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonRegistra.setForeground(new java.awt.Color(255, 255, 255));
        buttonRegistra.setText("Registra");
        buttonRegistra.setBorder(null);
        buttonRegistra.setBorderPainted(false);
        buttonRegistra.setFocusPainted(false);
        buttonRegistra.setOpaque(true);
        buttonRegistra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRegistraActionPerformed(evt);
            }
        });

        labelCorsiRegistrabili.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelCorsiRegistrabili.setForeground(new java.awt.Color(153, 204, 255));
        labelCorsiRegistrabili.setText("Corsi registrabili");

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

        tableAreaTematicaSelezionata.setBackground(new java.awt.Color(255, 255, 255));
        tableAreaTematicaSelezionata.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        tableAreaTematicaSelezionata.setModel(new javax.swing.table.DefaultTableModel(
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
        tableAreaTematicaSelezionata.setGridColor(new java.awt.Color(0, 0, 0));
        tableAreaTematicaSelezionata.setRowHeight(40);
        tableAreaTematicaSelezionata.setRowSelectionAllowed(false);
        tableAreaTematicaSelezionata.setShowGrid(true);
        tableAreaTematicaSelezionata.getTableHeader().setReorderingAllowed(false);
        scrollPaneTableAreaTematicaSelezionata.setViewportView(tableAreaTematicaSelezionata);

        labelAreaTematicaSelezionata.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelAreaTematicaSelezionata.setForeground(new java.awt.Color(153, 204, 255));
        labelAreaTematicaSelezionata.setText("Area tematica selezionata");

        tableCorsiRegistrati.setBackground(new java.awt.Color(255, 255, 255));
        tableCorsiRegistrati.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        tableCorsiRegistrati.setModel(new javax.swing.table.DefaultTableModel(
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
        tableCorsiRegistrati.setGridColor(new java.awt.Color(0, 0, 0));
        tableCorsiRegistrati.setRowHeight(40);
        tableCorsiRegistrati.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableCorsiRegistrati.setShowGrid(true);
        tableCorsiRegistrati.getTableHeader().setReorderingAllowed(false);
        scrollPaneTableCorsiRegistrati.setViewportView(tableCorsiRegistrati);

        labelCorsiRegistrati.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelCorsiRegistrati.setForeground(new java.awt.Color(153, 204, 255));
        labelCorsiRegistrati.setText("Corsi registrati");

        buttonRimuovi.setBackground(new java.awt.Color(153, 204, 255));
        buttonRimuovi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonRimuovi.setForeground(new java.awt.Color(255, 255, 255));
        buttonRimuovi.setText("Rimuovi");
        buttonRimuovi.setBorder(null);
        buttonRimuovi.setBorderPainted(false);
        buttonRimuovi.setFocusPainted(false);
        buttonRimuovi.setOpaque(true);
        buttonRimuovi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRimuoviActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttonIndietro, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(130, 130, 130)
                                .addComponent(buttonRimuovi, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttonRegistra, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(scrollPaneTableAreaTematicaSelezionata, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(scrollPaneTableCorsiRegistrati, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addGap(26, 26, 26))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelCorsiRegistrati, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(scrollPaneTableCorsiRegistrabili, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(labelCorsiRegistrabili, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelCorsiDellArea, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(21, 21, 21))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelAreaTematicaSelezionata, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 81, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(labelCorsiDellArea)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelAreaTematicaSelezionata)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPaneTableAreaTematicaSelezionata, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCorsiRegistrabili)
                    .addComponent(labelCorsiRegistrati))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPaneTableCorsiRegistrabili, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                    .addComponent(scrollPaneTableCorsiRegistrati, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonRegistra, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonIndietro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonRimuovi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonIndietroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonIndietroActionPerformed
        getHomeFrame().mostraPanelAreeTematiche();
    }//GEN-LAST:event_buttonIndietroActionPerformed

    private void buttonRegistraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRegistraActionPerformed
        try {
            controllaRigaSelezionata(tableCorsiRegistrabili, "corsi registrabili");
            getController().registraAreaDelCorso(ottieniPrimoOggetto(tableAreaTematicaSelezionata), ottieniOggettoSelezionato(tableCorsiRegistrabili));
        }
        catch (NessunaRigaSelezionataException e) {
            getHomeFrame().mostraEccezione(e.getMessage());
        }
    }//GEN-LAST:event_buttonRegistraActionPerformed

    private void buttonRimuoviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRimuoviActionPerformed
        try {
            controllaRigaSelezionata(tableCorsiRegistrati, "corsi registrati");
            getController().rimuoviAreaDelCorso(ottieniPrimoOggetto(tableAreaTematicaSelezionata), ottieniOggettoSelezionato(tableCorsiRegistrati));
        }
        catch (NessunaRigaSelezionataException e) {
            getHomeFrame().mostraEccezione(e.getMessage());
        }
    }//GEN-LAST:event_buttonRimuoviActionPerformed
    
    public void svuotaTutteTable() {
        svuotaTable(tableAreaTematicaSelezionata);
        svuotaTable(tableCorsiRegistrati);
        svuotaTable(tableCorsiRegistrabili);
    }
    
    public void svuotaTableAssociazioni() {
        svuotaTable(tableCorsiRegistrati);
        svuotaTable(tableCorsiRegistrabili);
    }
    
    public void inserisciAreaTematicaSelezionata(Object[] studenteSelezionato) {
        inserisciRigaInJTable(tableAreaTematicaSelezionata, studenteSelezionato);
    }
    
    public void inserisciInTableCorsiRegistrabili(Object[] row) {
        inserisciRigaInJTable(tableCorsiRegistrabili, row);
    }
    
    public void inserisciInTableCorsiRegistrati(Object[] row) {
        inserisciRigaInJTable(tableCorsiRegistrati, row);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonIndietro;
    private javax.swing.JButton buttonRegistra;
    private javax.swing.JButton buttonRimuovi;
    private javax.swing.JLabel labelAreaTematicaSelezionata;
    private javax.swing.JLabel labelCorsiDellArea;
    private javax.swing.JLabel labelCorsiRegistrabili;
    private javax.swing.JLabel labelCorsiRegistrati;
    private javax.swing.JScrollPane scrollPaneTableAreaTematicaSelezionata;
    private javax.swing.JScrollPane scrollPaneTableCorsiRegistrabili;
    private javax.swing.JScrollPane scrollPaneTableCorsiRegistrati;
    private javax.swing.JTable tableAreaTematicaSelezionata;
    private javax.swing.JTable tableCorsiRegistrabili;
    private javax.swing.JTable tableCorsiRegistrati;
    // End of variables declaration//GEN-END:variables

}