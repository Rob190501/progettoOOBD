package gui.homeFrame.panels.corsi;

import controller.Controller;
import eccezioni.elementiGui.CampoVuotoException;
import gui.homeFrame.HomeFrameOperatore;
import gui.homeFrame.panels.panelGenerico.PanelGenerico;



public class PanelAggiornaCorso extends PanelGenerico {
    
    public PanelAggiornaCorso(Controller controller, HomeFrameOperatore homeFrame) {
        super(controller, homeFrame);        
        initComponents();
        nascondiColonnaOggetto(tableCorsoSelezionato);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonAggiornaCorso = new javax.swing.JButton();
        buttonIndietro = new javax.swing.JButton();
        labelAggiornaCorso = new javax.swing.JLabel();
        labelCorsoSelezionato = new javax.swing.JLabel();
        scrollPaneTableCorsoSelezionato = new javax.swing.JScrollPane();
        tableCorsoSelezionato = new javax.swing.JTable();
        labelNomeCorso = new javax.swing.JLabel();
        textFieldNome = new javax.swing.JTextField();
        labelTassoPresenze = new javax.swing.JLabel();
        spinnerTassoPresenze = new javax.swing.JSpinner();
        labelDescrizione = new javax.swing.JLabel();
        textFieldDescrizione = new javax.swing.JTextField();
        labelNumeroMassimoIscritti = new javax.swing.JLabel();
        spinnerNumeroMassimoIscritti = new javax.swing.JSpinner();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(745, 566));
        setPreferredSize(new java.awt.Dimension(745, 566));

        buttonAggiornaCorso.setBackground(new java.awt.Color(153, 204, 255));
        buttonAggiornaCorso.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonAggiornaCorso.setForeground(new java.awt.Color(255, 255, 255));
        buttonAggiornaCorso.setText("Aggiorna corso");
        buttonAggiornaCorso.setToolTipText("");
        buttonAggiornaCorso.setBorder(null);
        buttonAggiornaCorso.setBorderPainted(false);
        buttonAggiornaCorso.setFocusPainted(false);
        buttonAggiornaCorso.setOpaque(true);
        buttonAggiornaCorso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAggiornaCorsoActionPerformed(evt);
            }
        });

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

        labelAggiornaCorso.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        labelAggiornaCorso.setForeground(new java.awt.Color(153, 204, 255));
        labelAggiornaCorso.setText("Aggiorna corso");

        labelCorsoSelezionato.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelCorsoSelezionato.setForeground(new java.awt.Color(153, 204, 255));
        labelCorsoSelezionato.setText("Corso selezionato");

        tableCorsoSelezionato.setBackground(new java.awt.Color(255, 255, 255));
        tableCorsoSelezionato.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        tableCorsoSelezionato.setModel(new javax.swing.table.DefaultTableModel(
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
        tableCorsoSelezionato.setGridColor(new java.awt.Color(0, 0, 0));
        tableCorsoSelezionato.setRowHeight(40);
        tableCorsoSelezionato.setRowSelectionAllowed(false);
        tableCorsoSelezionato.setShowGrid(true);
        tableCorsoSelezionato.getTableHeader().setReorderingAllowed(false);
        scrollPaneTableCorsoSelezionato.setViewportView(tableCorsoSelezionato);

        labelNomeCorso.setBackground(new java.awt.Color(255, 255, 255));
        labelNomeCorso.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelNomeCorso.setForeground(new java.awt.Color(153, 204, 255));
        labelNomeCorso.setText("Nome corso");

        textFieldNome.setBackground(new java.awt.Color(255, 255, 255));
        textFieldNome.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        textFieldNome.setForeground(new java.awt.Color(0, 0, 0));
        textFieldNome.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 5, 0, new java.awt.Color(153, 204, 255)));
        textFieldNome.setSelectionColor(new java.awt.Color(51, 153, 255));

        labelTassoPresenze.setBackground(new java.awt.Color(255, 255, 255));
        labelTassoPresenze.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelTassoPresenze.setForeground(new java.awt.Color(153, 204, 255));
        labelTassoPresenze.setText("Tasso presenze minime");

        spinnerTassoPresenze.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        spinnerTassoPresenze.setModel(new javax.swing.SpinnerNumberModel());
        spinnerTassoPresenze.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 5, 0, new java.awt.Color(153, 204, 255)));
        spinnerTassoPresenze.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        spinnerTassoPresenze.setEditor(new javax.swing.JSpinner.NumberEditor(spinnerTassoPresenze, ""));

        labelDescrizione.setBackground(new java.awt.Color(255, 255, 255));
        labelDescrizione.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelDescrizione.setForeground(new java.awt.Color(153, 204, 255));
        labelDescrizione.setText("Descrizione");

        textFieldDescrizione.setBackground(new java.awt.Color(255, 255, 255));
        textFieldDescrizione.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        textFieldDescrizione.setForeground(new java.awt.Color(0, 0, 0));
        textFieldDescrizione.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 5, 0, new java.awt.Color(153, 204, 255)));
        textFieldDescrizione.setSelectionColor(new java.awt.Color(51, 153, 255));

        labelNumeroMassimoIscritti.setBackground(new java.awt.Color(255, 255, 255));
        labelNumeroMassimoIscritti.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelNumeroMassimoIscritti.setForeground(new java.awt.Color(153, 204, 255));
        labelNumeroMassimoIscritti.setText("Numero massimo iscritti");

        spinnerNumeroMassimoIscritti.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        spinnerNumeroMassimoIscritti.setModel(new javax.swing.SpinnerNumberModel());
        spinnerNumeroMassimoIscritti.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 5, 0, new java.awt.Color(153, 204, 255)));
        spinnerNumeroMassimoIscritti.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        spinnerNumeroMassimoIscritti.setEditor(new javax.swing.JSpinner.NumberEditor(spinnerNumeroMassimoIscritti, ""));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelAggiornaCorso, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCorsoSelezionato, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scrollPaneTableCorsoSelezionato, javax.swing.GroupLayout.PREFERRED_SIZE, 712, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelNomeCorso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelTassoPresenze, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textFieldNome)
                            .addComponent(spinnerTassoPresenze, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonIndietro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonAggiornaCorso, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(labelDescrizione, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelNumeroMassimoIscritti, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(textFieldDescrizione)
                                .addComponent(spinnerNumeroMassimoIscritti, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(labelAggiornaCorso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(labelCorsoSelezionato)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPaneTableCorsoSelezionato, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelNomeCorso)
                        .addGap(18, 18, 18)
                        .addComponent(textFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(labelTassoPresenze)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spinnerNumeroMassimoIscritti, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spinnerTassoPresenze, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelDescrizione)
                        .addGap(18, 18, 18)
                        .addComponent(textFieldDescrizione, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(labelNumeroMassimoIscritti)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonAggiornaCorso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonIndietro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAggiornaCorsoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAggiornaCorsoActionPerformed
        try {
            controllaCampi();
            getController().aggiornaCorso(ottieniPrimoOggetto(tableCorsoSelezionato),
                                          textFieldNome.getText(),
                                          textFieldDescrizione.getText(),
                                          (int) spinnerTassoPresenze.getValue(),
                                          (int) spinnerNumeroMassimoIscritti.getValue());
            getHomeFrame().mostraPanelCorsi();
        }
        catch(CampoVuotoException e) {
            getHomeFrame().mostraEccezione(e.getMessage());
        }
    }//GEN-LAST:event_buttonAggiornaCorsoActionPerformed

    private void buttonIndietroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonIndietroActionPerformed
        getHomeFrame().mostraPanelCorsi();
    }//GEN-LAST:event_buttonIndietroActionPerformed
    
    public void inserisciCorsoSelezionato(Object[] studenteSelezionato) {
        inserisciRigaInJTable(tableCorsoSelezionato, studenteSelezionato);
    }
    
    public void setNome(String nome) {
        textFieldNome.setText(nome);
    }
    
    public void setDescrizione(String descrizione) {
        textFieldDescrizione.setText(descrizione);
    }
    
    public void setTassoPresenzeMinimo(int tasso) {
        spinnerTassoPresenze.setValue(tasso);
    }
    
    public void setNumeroMassimoIscritti(int numeroMassimo) {
        spinnerNumeroMassimoIscritti.setValue(numeroMassimo);
    }
    
    private void controllaCampi() throws CampoVuotoException {
        if (textFieldNome.getText().equals("") || textFieldDescrizione.getText().equals("")) {
            throw new CampoVuotoException();
        }
    }
    
    public void svuotaCampi() {
        textFieldNome.setText("");
        textFieldDescrizione.setText("");
        spinnerTassoPresenze.setValue(0);
        spinnerNumeroMassimoIscritti.setValue(0);
        svuotaTable(tableCorsoSelezionato);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAggiornaCorso;
    private javax.swing.JButton buttonIndietro;
    private javax.swing.JLabel labelAggiornaCorso;
    private javax.swing.JLabel labelCorsoSelezionato;
    private javax.swing.JLabel labelDescrizione;
    private javax.swing.JLabel labelNomeCorso;
    private javax.swing.JLabel labelNumeroMassimoIscritti;
    private javax.swing.JLabel labelTassoPresenze;
    private javax.swing.JScrollPane scrollPaneTableCorsoSelezionato;
    private javax.swing.JSpinner spinnerNumeroMassimoIscritti;
    private javax.swing.JSpinner spinnerTassoPresenze;
    private javax.swing.JTable tableCorsoSelezionato;
    private javax.swing.JTextField textFieldDescrizione;
    private javax.swing.JTextField textFieldNome;
    // End of variables declaration//GEN-END:variables

}
