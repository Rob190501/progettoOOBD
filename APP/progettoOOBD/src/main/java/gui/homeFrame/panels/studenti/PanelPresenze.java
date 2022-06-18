package gui.homeFrame.panels.studenti;

import controller.Controller;
import eccezioni.gui.NessunaRigaSelezionataException;
import gui.homeFrame.HomeFrameOperatore;
import gui.homeFrame.panels.panelGenerico.PanelGenerico;

public class PanelPresenze extends PanelGenerico {

    public PanelPresenze(Controller controller, HomeFrameOperatore homeFrame) {
        super(controller, homeFrame);
        initComponents();
        nascondiColonnaOggetto(tableStudenteSelezionato);
        nascondiColonnaOggetto(tablePresenzeRegistrate);
        nascondiColonnaOggetto(tablePresenzePossibili);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelPresenze = new javax.swing.JLabel();
        scrollPaneTablePresenzePossibili = new javax.swing.JScrollPane();
        tablePresenzePossibili = new javax.swing.JTable();
        buttonIscrivi = new javax.swing.JButton();
        labelPresenzePossibili = new javax.swing.JLabel();
        buttonIndietro = new javax.swing.JButton();
        scrollPaneTableStudenteSelezionato = new javax.swing.JScrollPane();
        tableStudenteSelezionato = new javax.swing.JTable();
        labelStudenteSelezionato = new javax.swing.JLabel();
        scrollPaneTablePresenzeRegistrate = new javax.swing.JScrollPane();
        tablePresenzeRegistrate = new javax.swing.JTable();
        labelPresenzeRegistrate = new javax.swing.JLabel();
        buttonRimuoviPresenza = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(745, 566));

        labelPresenze.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        labelPresenze.setForeground(new java.awt.Color(153, 204, 255));
        labelPresenze.setText("Presenze");

        tablePresenzePossibili.setBackground(new java.awt.Color(255, 255, 255));
        tablePresenzePossibili.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        tablePresenzePossibili.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Oggetto", "Codice", "Titolo", "Descrizione", "Data inizio", "Durata (HH:MM)"
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
        tablePresenzePossibili.setGridColor(new java.awt.Color(0, 0, 0));
        tablePresenzePossibili.setRowHeight(40);
        tablePresenzePossibili.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablePresenzePossibili.setShowGrid(true);
        tablePresenzePossibili.getTableHeader().setReorderingAllowed(false);
        scrollPaneTablePresenzePossibili.setViewportView(tablePresenzePossibili);

        buttonIscrivi.setBackground(new java.awt.Color(153, 204, 255));
        buttonIscrivi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonIscrivi.setForeground(new java.awt.Color(255, 255, 255));
        buttonIscrivi.setText("Registra presenza");
        buttonIscrivi.setBorder(null);
        buttonIscrivi.setBorderPainted(false);
        buttonIscrivi.setFocusPainted(false);
        buttonIscrivi.setOpaque(true);
        buttonIscrivi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonIscriviActionPerformed(evt);
            }
        });

        labelPresenzePossibili.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelPresenzePossibili.setForeground(new java.awt.Color(153, 204, 255));
        labelPresenzePossibili.setText("Presenze possibili");

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

        tableStudenteSelezionato.setBackground(new java.awt.Color(255, 255, 255));
        tableStudenteSelezionato.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        tableStudenteSelezionato.setModel(new javax.swing.table.DefaultTableModel(
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
        tableStudenteSelezionato.setGridColor(new java.awt.Color(0, 0, 0));
        tableStudenteSelezionato.setRowHeight(40);
        tableStudenteSelezionato.setRowSelectionAllowed(false);
        tableStudenteSelezionato.setShowGrid(true);
        tableStudenteSelezionato.getTableHeader().setReorderingAllowed(false);
        scrollPaneTableStudenteSelezionato.setViewportView(tableStudenteSelezionato);

        labelStudenteSelezionato.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelStudenteSelezionato.setForeground(new java.awt.Color(153, 204, 255));
        labelStudenteSelezionato.setText("Studente selezionato");

        tablePresenzeRegistrate.setBackground(new java.awt.Color(255, 255, 255));
        tablePresenzeRegistrate.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        tablePresenzeRegistrate.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Oggetto", "Codice", "Titolo", "Descrizione", "Data inizio", "Durata (HH:MM)"
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
        tablePresenzeRegistrate.setGridColor(new java.awt.Color(0, 0, 0));
        tablePresenzeRegistrate.setRowHeight(40);
        tablePresenzeRegistrate.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablePresenzeRegistrate.setShowGrid(true);
        tablePresenzeRegistrate.getTableHeader().setReorderingAllowed(false);
        scrollPaneTablePresenzeRegistrate.setViewportView(tablePresenzeRegistrate);

        labelPresenzeRegistrate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelPresenzeRegistrate.setForeground(new java.awt.Color(153, 204, 255));
        labelPresenzeRegistrate.setText("Presenze registrate");

        buttonRimuoviPresenza.setBackground(new java.awt.Color(153, 204, 255));
        buttonRimuoviPresenza.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonRimuoviPresenza.setForeground(new java.awt.Color(255, 255, 255));
        buttonRimuoviPresenza.setText("Rimuovi presenza");
        buttonRimuoviPresenza.setBorder(null);
        buttonRimuoviPresenza.setBorderPainted(false);
        buttonRimuoviPresenza.setFocusPainted(false);
        buttonRimuoviPresenza.setOpaque(true);
        buttonRimuoviPresenza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRimuoviPresenzaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(303, Short.MAX_VALUE)
                .addComponent(buttonRimuoviPresenza, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(295, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelPresenze, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttonIndietro, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttonIscrivi, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(scrollPaneTableStudenteSelezionato, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelPresenzeRegistrate, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(scrollPaneTablePresenzeRegistrate, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(scrollPaneTablePresenzePossibili, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(labelPresenzePossibili, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(labelStudenteSelezionato, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(60, 60, 60)))
                    .addGap(21, 21, 21)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(517, Short.MAX_VALUE)
                .addComponent(buttonRimuoviPresenza, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(19, 19, 19)
                    .addComponent(labelPresenze)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(labelStudenteSelezionato)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(scrollPaneTableStudenteSelezionato, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelPresenzePossibili)
                        .addComponent(labelPresenzeRegistrate))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(scrollPaneTablePresenzePossibili, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                        .addComponent(scrollPaneTablePresenzeRegistrate, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(buttonIscrivi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buttonIndietro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(19, 19, 19)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonIndietroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonIndietroActionPerformed
        getHomeFrame().mostraPanelStudenti();
    }//GEN-LAST:event_buttonIndietroActionPerformed

    private void buttonRimuoviPresenzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRimuoviPresenzaActionPerformed
        try {
            controllaRigaSelezionata(tablePresenzeRegistrate, "presenze registrate");
            getController().rimuoviPresenza(ottieniPrimoOggetto(tableStudenteSelezionato), ottieniOggettoSelezionato(tablePresenzeRegistrate));
        }
        catch (NessunaRigaSelezionataException e) {
            getHomeFrame().mostraEccezione(e.getMessage());
        }
    }//GEN-LAST:event_buttonRimuoviPresenzaActionPerformed

    private void buttonIscriviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonIscriviActionPerformed
        try {
            controllaRigaSelezionata(tablePresenzePossibili, "presenze possibili");
            getController().registraPresenza(ottieniPrimoOggetto(tableStudenteSelezionato), ottieniOggettoSelezionato(tablePresenzePossibili));
        }
        catch (NessunaRigaSelezionataException e) {
            getHomeFrame().mostraEccezione(e.getMessage());
        }
    }//GEN-LAST:event_buttonIscriviActionPerformed

    public void svuotaTutteTable() {
        svuotaTable(tableStudenteSelezionato);
        svuotaTable(tablePresenzeRegistrate);
        svuotaTable(tablePresenzePossibili);
    }
    
    public void svuotaTableAssociazioni() {
        svuotaTable(tablePresenzeRegistrate);
        svuotaTable(tablePresenzePossibili);
    }
    
    public void inserisciStudenteSelezionato(Object[] studenteSelezionato) {
        inserisciRigaInJTable(tableStudenteSelezionato, studenteSelezionato);
    }
    
    public void inserisciInTablePresenzeRegistrate(Object[] row) {
        inserisciRigaInJTable(tablePresenzeRegistrate, row);
    }
    
    public void inserisciInTablePresenzePossibili(Object[] row) {
        inserisciRigaInJTable(tablePresenzePossibili, row);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonIndietro;
    private javax.swing.JButton buttonIscrivi;
    private javax.swing.JButton buttonRimuoviPresenza;
    private javax.swing.JLabel labelPresenze;
    private javax.swing.JLabel labelPresenzePossibili;
    private javax.swing.JLabel labelPresenzeRegistrate;
    private javax.swing.JLabel labelStudenteSelezionato;
    private javax.swing.JScrollPane scrollPaneTablePresenzePossibili;
    private javax.swing.JScrollPane scrollPaneTablePresenzeRegistrate;
    private javax.swing.JScrollPane scrollPaneTableStudenteSelezionato;
    private javax.swing.JTable tablePresenzePossibili;
    private javax.swing.JTable tablePresenzeRegistrate;
    private javax.swing.JTable tableStudenteSelezionato;
    // End of variables declaration//GEN-END:variables
}
