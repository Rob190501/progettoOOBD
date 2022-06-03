package gui.homeFrame.panels.studenti;

import controller.Controller;
import eccezioni.elementiGui.NessunaRigaSelezionataException;
import gui.homeFrame.HomeFrameOperatore;
import gui.homeFrame.panels.panelGenerico.PanelGenerico;



public class PanelIscrizioni extends PanelGenerico {

    public PanelIscrizioni(Controller controller, HomeFrameOperatore homeFrame) {
        super(controller, homeFrame);
        initComponents();
        nascondiColonnaOggetto(tableStudenteSelezionato);
        nascondiColonnaOggetto(tableCorsiFrequentati);
        nascondiColonnaOggetto(tableCorsiFrequentabili);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelIscrizioni = new javax.swing.JLabel();
        scrollPaneTableCorsiFrequentabili = new javax.swing.JScrollPane();
        tableCorsiFrequentabili = new javax.swing.JTable();
        buttonIscrivi = new javax.swing.JButton();
        labelCorsiFrequentabili = new javax.swing.JLabel();
        buttonIndietro = new javax.swing.JButton();
        scrollPaneTableStudenteSelezionato = new javax.swing.JScrollPane();
        tableStudenteSelezionato = new javax.swing.JTable();
        labelStudenteSelezionato = new javax.swing.JLabel();
        scrollPaneTableCorsiFrequentati = new javax.swing.JScrollPane();
        tableCorsiFrequentati = new javax.swing.JTable();
        labelCorsiFrequentati = new javax.swing.JLabel();
        buttonDisiscrivi = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(745, 566));
        setPreferredSize(new java.awt.Dimension(745, 566));

        labelIscrizioni.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        labelIscrizioni.setForeground(new java.awt.Color(153, 204, 255));
        labelIscrizioni.setText("Iscrizioni");

        tableCorsiFrequentabili.setBackground(new java.awt.Color(255, 255, 255));
        tableCorsiFrequentabili.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        tableCorsiFrequentabili.setModel(new javax.swing.table.DefaultTableModel(
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
        tableCorsiFrequentabili.setGridColor(new java.awt.Color(0, 0, 0));
        tableCorsiFrequentabili.setRowHeight(40);
        tableCorsiFrequentabili.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableCorsiFrequentabili.setShowGrid(true);
        tableCorsiFrequentabili.getTableHeader().setReorderingAllowed(false);
        scrollPaneTableCorsiFrequentabili.setViewportView(tableCorsiFrequentabili);

        buttonIscrivi.setBackground(new java.awt.Color(153, 204, 255));
        buttonIscrivi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonIscrivi.setForeground(new java.awt.Color(255, 255, 255));
        buttonIscrivi.setText("Iscrivi");
        buttonIscrivi.setBorder(null);
        buttonIscrivi.setBorderPainted(false);
        buttonIscrivi.setFocusPainted(false);
        buttonIscrivi.setOpaque(true);
        buttonIscrivi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonIscriviActionPerformed(evt);
            }
        });

        labelCorsiFrequentabili.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelCorsiFrequentabili.setForeground(new java.awt.Color(153, 204, 255));
        labelCorsiFrequentabili.setText("Corsi frequentabili");

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
        tableCorsiFrequentati.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableCorsiFrequentati.setShowGrid(true);
        tableCorsiFrequentati.getTableHeader().setReorderingAllowed(false);
        scrollPaneTableCorsiFrequentati.setViewportView(tableCorsiFrequentati);

        labelCorsiFrequentati.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelCorsiFrequentati.setForeground(new java.awt.Color(153, 204, 255));
        labelCorsiFrequentati.setText("Corsi frequentati");

        buttonDisiscrivi.setBackground(new java.awt.Color(153, 204, 255));
        buttonDisiscrivi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonDisiscrivi.setForeground(new java.awt.Color(255, 255, 255));
        buttonDisiscrivi.setText("Disiscrivi");
        buttonDisiscrivi.setBorder(null);
        buttonDisiscrivi.setBorderPainted(false);
        buttonDisiscrivi.setFocusPainted(false);
        buttonDisiscrivi.setOpaque(true);
        buttonDisiscrivi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDisiscriviActionPerformed(evt);
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
                                .addComponent(labelIscrizioni, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttonIndietro, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(130, 130, 130)
                                .addComponent(buttonDisiscrivi, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttonIscrivi, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(scrollPaneTableStudenteSelezionato, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelCorsiFrequentati, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(scrollPaneTableCorsiFrequentati, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(scrollPaneTableCorsiFrequentabili, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(labelCorsiFrequentabili, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(21, 21, 21))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelStudenteSelezionato, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 81, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(labelIscrizioni)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelStudenteSelezionato)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPaneTableStudenteSelezionato, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCorsiFrequentabili)
                    .addComponent(labelCorsiFrequentati))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPaneTableCorsiFrequentabili, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                    .addComponent(scrollPaneTableCorsiFrequentati, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonIscrivi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonIndietro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonDisiscrivi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonIndietroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonIndietroActionPerformed
        getHomeFrame().mostraPanelStudenti();
    }//GEN-LAST:event_buttonIndietroActionPerformed

    private void buttonIscriviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonIscriviActionPerformed
        try {
            controllaRigaSelezionata(tableCorsiFrequentabili, "corsi frequentabili");
            getController().iscriviAlCorso(ottieniPrimoOggetto(tableStudenteSelezionato), ottieniOggettoSelezionato(tableCorsiFrequentabili));
        }
        catch (NessunaRigaSelezionataException e) {
            getHomeFrame().mostraEccezione(e.getMessage());
        }
    }//GEN-LAST:event_buttonIscriviActionPerformed

    private void buttonDisiscriviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDisiscriviActionPerformed
        try {
            controllaRigaSelezionata(tableCorsiFrequentati, "corsi frequentati");
            getController().disiscriviDalCorso(ottieniPrimoOggetto(tableStudenteSelezionato), ottieniOggettoSelezionato(tableCorsiFrequentati));
        }
        catch (NessunaRigaSelezionataException e) {
            getHomeFrame().mostraEccezione(e.getMessage());
        }
    }//GEN-LAST:event_buttonDisiscriviActionPerformed
    
    public void svuotaTutteTable() {
        svuotaTable(tableStudenteSelezionato);
        svuotaTable(tableCorsiFrequentati);
        svuotaTable(tableCorsiFrequentabili);
    }
    
    public void svuotaTableAssociazioni() {
        svuotaTable(tableCorsiFrequentati);
        svuotaTable(tableCorsiFrequentabili);
    }
    
    public void inserisciStudenteSelezionato(Object[] studenteSelezionato) {
        inserisciRigaInJTable(tableStudenteSelezionato, studenteSelezionato);
    }
    
    public void inserisciInTableCorsiFrequentabili(Object[] row) {
        inserisciRigaInJTable(tableCorsiFrequentabili, row);
    }
    
    public void inserisciInTableCorsiFrequentati(Object[] row) {
        inserisciRigaInJTable(tableCorsiFrequentati, row);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonDisiscrivi;
    private javax.swing.JButton buttonIndietro;
    private javax.swing.JButton buttonIscrivi;
    private javax.swing.JLabel labelCorsiFrequentabili;
    private javax.swing.JLabel labelCorsiFrequentati;
    private javax.swing.JLabel labelIscrizioni;
    private javax.swing.JLabel labelStudenteSelezionato;
    private javax.swing.JScrollPane scrollPaneTableCorsiFrequentabili;
    private javax.swing.JScrollPane scrollPaneTableCorsiFrequentati;
    private javax.swing.JScrollPane scrollPaneTableStudenteSelezionato;
    private javax.swing.JTable tableCorsiFrequentabili;
    private javax.swing.JTable tableCorsiFrequentati;
    private javax.swing.JTable tableStudenteSelezionato;
    // End of variables declaration//GEN-END:variables

}