package gui.homeFrame.panels.corsi;

import controller.Controller;
import gui.homeFrame.HomeFrameOperatore;
import gui.homeFrame.panels.panelGenerico.PanelGenerico;


public class PanelCorsi extends PanelGenerico {

    
    public PanelCorsi(Controller controller, HomeFrameOperatore homeFrame) {
        super(controller, homeFrame);
        initComponents();
        nascondiTutteColonneOggetto();
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
                "Oggetto", "Codice", "Titolo", "Descrizione", "Data inizio", "Ora inizio", "Durata"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonNuovoCorso, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
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
                        .addGap(20, 20, 20))))
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
                        .addComponent(scrollPaneTableLezioniDelCorso, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelStudentiIscritti)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scrollPaneTableStudentiIscritti, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelStudentiIscritti1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scrollPaneTableAreeDelCorso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(scrollPaneTableCorsi, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addComponent(buttonNuovoCorso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tableCorsiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableCorsiMouseClicked
        // TODO add your handling code here:
        svuotaTableSecondarie();
        Object corsoSelezionato = ottieniOggettoSelezionato(tableCorsi);
        getController().inserisciLezioniDelCorso(corsoSelezionato);
        getController().inserisciStudentiDelCorso(corsoSelezionato);
        getController().inserisciAreeDelCorsoInJTable(corsoSelezionato);
    }//GEN-LAST:event_tableCorsiMouseClicked

    private void tableCorsiMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableCorsiMouseDragged
        // TODO add your handling code here:
        tableCorsiMouseClicked(evt);
    }//GEN-LAST:event_tableCorsiMouseDragged

    private void nascondiTutteColonneOggetto() {
        nascondiColonnaOggetto(tableCorsi);
        nascondiColonnaOggetto(tableLezioniDelCorso);
        nascondiColonnaOggetto(tableStudentiDelCorso);
        nascondiColonnaOggetto(tableAreeDelCorso);
    }
    
    public void svuotaTutteTable() {
        svuotaTable(tableCorsi);
        svuotaTable(tableLezioniDelCorso);
        svuotaTable(tableStudentiDelCorso);
        svuotaTable(tableAreeDelCorso);
    }
    
    public void svuotaTableSecondarie() {
        svuotaTable(tableLezioniDelCorso);
        svuotaTable(tableStudentiDelCorso);
        svuotaTable(tableAreeDelCorso);
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
    private javax.swing.JButton buttonNuovoCorso;
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
