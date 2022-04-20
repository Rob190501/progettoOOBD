package gui.homeFrame.panels.studenti;

import controller.Controller;
import eccezioni.elementiGui.NessunaRigaSelezionataException;
import gui.homeFrame.HomeFrameOperatore;
import gui.homeFrame.panels.panelGenerico.PanelGenerico;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class PanelNuovaIscrizione extends PanelGenerico {

    public PanelNuovaIscrizione(Controller controller, HomeFrameOperatore homeFrame) {
        super(controller, homeFrame);
        initComponents();
        nascondiTutteColonneOggetto();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelNuovaIscrizione = new javax.swing.JLabel();
        scrollPaneTableCorsiFrequentabili = new javax.swing.JScrollPane();
        tableCorsiFrequentabili = new javax.swing.JTable();
        buttonFrequenta = new javax.swing.JButton();
        labelCorsiFrequentabili = new javax.swing.JLabel();
        buttonIndietro = new javax.swing.JButton();
        scrollPaneTableStudenteSelezionato = new javax.swing.JScrollPane();
        tableStudenteSelezionato = new javax.swing.JTable();
        labelStudenteSelezionato = new javax.swing.JLabel();
        scrollPaneTableCorsiFrequentati = new javax.swing.JScrollPane();
        tableCorsiFrequentati = new javax.swing.JTable();
        labelCorsiFrequentati = new javax.swing.JLabel();
        buttonBasta = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(745, 566));
        setPreferredSize(new java.awt.Dimension(745, 566));

        labelNuovaIscrizione.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        labelNuovaIscrizione.setForeground(new java.awt.Color(153, 204, 255));
        labelNuovaIscrizione.setText("Nuova iscrizione");

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

        buttonFrequenta.setBackground(new java.awt.Color(153, 204, 255));
        buttonFrequenta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonFrequenta.setForeground(new java.awt.Color(255, 255, 255));
        buttonFrequenta.setText("Frequenta");
        buttonFrequenta.setBorder(null);
        buttonFrequenta.setBorderPainted(false);
        buttonFrequenta.setFocusPainted(false);
        buttonFrequenta.setOpaque(true);
        buttonFrequenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFrequentaActionPerformed(evt);
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

        buttonBasta.setBackground(new java.awt.Color(153, 204, 255));
        buttonBasta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonBasta.setForeground(new java.awt.Color(255, 255, 255));
        buttonBasta.setText("basta");
        buttonBasta.setBorder(null);
        buttonBasta.setBorderPainted(false);
        buttonBasta.setFocusPainted(false);
        buttonBasta.setOpaque(true);
        buttonBasta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBastaActionPerformed(evt);
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
                                .addComponent(labelNuovaIscrizione, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttonIndietro, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(130, 130, 130)
                                .addComponent(buttonBasta, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttonFrequenta, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addComponent(labelNuovaIscrizione)
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
                    .addComponent(buttonFrequenta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonIndietro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonBasta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonIndietroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonIndietroActionPerformed
        // TODO add your handling code here:
        getHomeFrame().mostraCardStudenti();
    }//GEN-LAST:event_buttonIndietroActionPerformed

    private void buttonFrequentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFrequentaActionPerformed
        // TODO add your handling code here:
        try {
            if(tableCorsiFrequentabili.getSelectedRow() == -1) {
                throw new NessunaRigaSelezionataException("Corsi frequentabili");
            }
            Object studenteSelezionato = ((DefaultTableModel)tableStudenteSelezionato.getModel()).getValueAt(0, 0);
            Object corsoSelezionato = ottieniOggettoSelezionato(tableCorsiFrequentabili);
            getController().iscriviAlCorso(studenteSelezionato, corsoSelezionato);
            getController().aggiornaPanelNuovaIscrizione( ((DefaultTableModel)tableStudenteSelezionato.getModel()).getValueAt(0, 0) );
        }
        catch (NessunaRigaSelezionataException e) {
            getHomeFrame().mostraEccezione(e.getMessage());
        }
    }//GEN-LAST:event_buttonFrequentaActionPerformed

    private void buttonBastaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBastaActionPerformed
        // TODO add your handling code here:
        try {
            if(tableCorsiFrequentati.getSelectedRow() == -1) {
                throw new NessunaRigaSelezionataException("Corsi frequentabili");
            }
            Object studenteSelezionato = ((DefaultTableModel)tableStudenteSelezionato.getModel()).getValueAt(0, 0);
            Object corsoSelezionato = ottieniOggettoSelezionato(tableCorsiFrequentati);
            getController().disiscriviDalCorso(studenteSelezionato, corsoSelezionato);
            getController().aggiornaPanelNuovaIscrizione( ((DefaultTableModel)tableStudenteSelezionato.getModel()).getValueAt(0, 0) );
        }
        catch (NessunaRigaSelezionataException e) {
            getHomeFrame().mostraEccezione(e.getMessage());
        }
    }//GEN-LAST:event_buttonBastaActionPerformed
    
    public void nascondiTutteColonneOggetto() {
        nascondiColonnaOggetto(tableStudenteSelezionato);
        nascondiColonnaOggetto(tableCorsiFrequentati);
        nascondiColonnaOggetto(tableCorsiFrequentabili);
    }
    
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
    
    public void impostaModel(TableModel model) {
        tableCorsiFrequentati.setModel(model);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBasta;
    private javax.swing.JButton buttonFrequenta;
    private javax.swing.JButton buttonIndietro;
    private javax.swing.JLabel labelCorsiFrequentabili;
    private javax.swing.JLabel labelCorsiFrequentati;
    private javax.swing.JLabel labelNuovaIscrizione;
    private javax.swing.JLabel labelStudenteSelezionato;
    private javax.swing.JScrollPane scrollPaneTableCorsiFrequentabili;
    private javax.swing.JScrollPane scrollPaneTableCorsiFrequentati;
    private javax.swing.JScrollPane scrollPaneTableStudenteSelezionato;
    private javax.swing.JTable tableCorsiFrequentabili;
    private javax.swing.JTable tableCorsiFrequentati;
    private javax.swing.JTable tableStudenteSelezionato;
    // End of variables declaration//GEN-END:variables
}
