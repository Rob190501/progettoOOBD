package gui.home.studenti;

import controller.Controller;
import gui.home.HomeFrameOperatore;
import gui.home.PanelContenutiGenerico;
import javax.swing.table.DefaultTableModel;

public class PanelStudentiHome extends PanelContenutiGenerico {
    
    public PanelStudentiHome(Controller controller, HomeFrameOperatore homeFrame) {
        super(controller, homeFrame);
        
        controller.setPanelStudentiHome(this);
        
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

        setBackground(new java.awt.Color(255, 255, 255));

        labelStudenti.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        labelStudenti.setForeground(new java.awt.Color(153, 204, 255));
        labelStudenti.setText("Studenti");

        tableStudenti.setBackground(new java.awt.Color(255, 255, 255));
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
        tableStudenti.setRowHeight(40);
        tableStudenti.getTableHeader().setReorderingAllowed(false);
        tableStudenti.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableStudentiMouseClicked(evt);
            }
        });
        scrollPaneTableStudenti.setViewportView(tableStudenti);

        tableCorsiFrequentati.setBackground(new java.awt.Color(255, 255, 255));
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
        tableCorsiFrequentati.setRowHeight(40);
        tableCorsiFrequentati.getTableHeader().setReorderingAllowed(false);
        scrollPaneTableCorsiFrequentati.setViewportView(tableCorsiFrequentati);

        tablePresenze.setBackground(new java.awt.Color(255, 255, 255));
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
        tablePresenze.setRowHeight(40);
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
        labelCorsiFrequentati.setText("Corsi Frequentati");

        labelPresenze.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelPresenze.setForeground(new java.awt.Color(153, 204, 255));
        labelPresenze.setText("Presenze");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonNuovoStudente, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelStudenti, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(380, 380, 380))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(scrollPaneTableStudenti, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelPresenze)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(scrollPaneTableCorsiFrequentati, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addComponent(scrollPaneTablePresenze, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(labelCorsiFrequentati)
                                .addGap(189, 189, 189)))))
                .addGap(20, 20, 20))
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
                .addComponent(buttonNuovoStudente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
    }// </editor-fold>//GEN-END:initComponents
    
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
    
    public void inserisciStudenteInTableStudenti(Object[] row) {
        DefaultTableModel modelTableTuttiStudenti = (DefaultTableModel) tableStudenti.getModel();
        modelTableTuttiStudenti.addRow(row);
    }
    
    public void inserisciCorsoInTableCorsiFrequentati(Object[] row) {
        DefaultTableModel modelTableCorsiFrequentati = (DefaultTableModel) tableCorsiFrequentati.getModel();
        modelTableCorsiFrequentati.addRow(row);
    }
    
    public void inserisciLezioneInTablePresenze(Object[] row) {
        DefaultTableModel modelTablePresenze = (DefaultTableModel) tablePresenze.getModel();
        modelTablePresenze.addRow(row);
    }
    
    private void tableStudentiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableStudentiMouseClicked
        // TODO add your handling code here:
        Object studenteSelezionato = tableStudenti.getModel().getValueAt(tableStudenti.getSelectedRow(), 0);
        svuotaTable(tableCorsiFrequentati);
        getController().inserisciCorsiFrequentatiInJTable(studenteSelezionato);
        svuotaTable(tablePresenze);
        getController().inserisciPresenzeInJTable(studenteSelezionato);
    }//GEN-LAST:event_tableStudentiMouseClicked

    private void buttonNuovoStudenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNuovoStudenteActionPerformed
        // TODO add your handling code here:
        getHomeFrame().mostraCardNuovoStudente();
    }//GEN-LAST:event_buttonNuovoStudenteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
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
