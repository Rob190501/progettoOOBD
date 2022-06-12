package gui.homeFrame.panels.corsi;

import controller.Controller;
import gui.homeFrame.HomeFrameOperatore;
import gui.homeFrame.panels.panelGenerico.PanelGenerico;



public class PanelProspettoCorso extends PanelGenerico {

    public PanelProspettoCorso(Controller controller, HomeFrameOperatore homeFrame) {
        super(controller, homeFrame);
        initComponents();
        nascondiColonnaOggetto(tableCorsoSelezionato);
        nascondiColonnaOggetto(tableStudentiIdonei);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelProspettoCorso = new javax.swing.JLabel();
        scrollPaneTableCorsoSelezionato = new javax.swing.JScrollPane();
        tableCorsoSelezionato = new javax.swing.JTable();
        scrollPaneTableStudentiIdonei = new javax.swing.JScrollPane();
        tableStudentiIdonei = new javax.swing.JTable();
        labelStudentiIdonei = new javax.swing.JLabel();
        labelCorsoSelezionato = new javax.swing.JLabel();
        buttonIndietro = new javax.swing.JButton();
        labelMedia = new javax.swing.JLabel();
        labelMinimo = new javax.swing.JLabel();
        labelMassimo = new javax.swing.JLabel();
        labelPercentualeRiempimento = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(745, 566));
        setPreferredSize(new java.awt.Dimension(745, 566));

        labelProspettoCorso.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        labelProspettoCorso.setForeground(new java.awt.Color(153, 204, 255));
        labelProspettoCorso.setText("Prospetto corso");

        tableCorsoSelezionato.setBackground(new java.awt.Color(255, 255, 255));
        tableCorsoSelezionato.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        tableCorsoSelezionato.setModel(new javax.swing.table.DefaultTableModel(
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
        tableCorsoSelezionato.setGridColor(new java.awt.Color(0, 0, 0));
        tableCorsoSelezionato.setRowHeight(40);
        tableCorsoSelezionato.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableCorsoSelezionato.setShowGrid(true);
        tableCorsoSelezionato.getTableHeader().setReorderingAllowed(false);
        scrollPaneTableCorsoSelezionato.setViewportView(tableCorsoSelezionato);

        tableStudentiIdonei.setBackground(new java.awt.Color(255, 255, 255));
        tableStudentiIdonei.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        tableStudentiIdonei.setModel(new javax.swing.table.DefaultTableModel(
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
        tableStudentiIdonei.setGridColor(new java.awt.Color(0, 0, 0));
        tableStudentiIdonei.setRowHeight(40);
        tableStudentiIdonei.setRowSelectionAllowed(false);
        tableStudentiIdonei.setShowGrid(true);
        tableStudentiIdonei.getTableHeader().setReorderingAllowed(false);
        scrollPaneTableStudentiIdonei.setViewportView(tableStudentiIdonei);

        labelStudentiIdonei.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelStudentiIdonei.setForeground(new java.awt.Color(153, 204, 255));
        labelStudentiIdonei.setText("Studenti idonei");

        labelCorsoSelezionato.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelCorsoSelezionato.setForeground(new java.awt.Color(153, 204, 255));
        labelCorsoSelezionato.setText("Corso selezionato");

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

        labelMedia.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelMedia.setForeground(new java.awt.Color(0, 0, 0));
        labelMedia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMedia.setText("Numero medio studenti presenti:");

        labelMinimo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelMinimo.setForeground(new java.awt.Color(0, 0, 0));
        labelMinimo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMinimo.setText("Numero minimo studenti presenti:");

        labelMassimo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelMassimo.setForeground(new java.awt.Color(0, 0, 0));
        labelMassimo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMassimo.setText("Numero massimo studenti presenti:");

        labelPercentualeRiempimento.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelPercentualeRiempimento.setForeground(new java.awt.Color(0, 0, 0));
        labelPercentualeRiempimento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPercentualeRiempimento.setText("Percentuale riempimento media: %");
        labelPercentualeRiempimento.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonIndietro, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelProspettoCorso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(labelMedia, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(scrollPaneTableCorsoSelezionato, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE)
                            .addComponent(labelCorsoSelezionato, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 658, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelStudentiIdonei, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 658, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(scrollPaneTableStudentiIdonei, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelMinimo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelMassimo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelPercentualeRiempimento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(19, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(labelProspettoCorso)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(labelCorsoSelezionato)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPaneTableCorsoSelezionato, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelStudentiIdonei)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPaneTableStudentiIdonei, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                .addGap(29, 29, 29)
                .addComponent(labelMedia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelMinimo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelMassimo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelPercentualeRiempimento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(buttonIndietro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonIndietroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonIndietroActionPerformed
        getHomeFrame().mostraPanelCorsi();
    }//GEN-LAST:event_buttonIndietroActionPerformed
    
    public void svuotaTutteTable() {
        svuotaTable(tableCorsoSelezionato);
        svuotaTable(tableStudentiIdonei);
    }
    
    public void inserisciInTableCorsoSelezionato(Object[] row) {
        inserisciRigaInJTable(tableCorsoSelezionato, row);
    }
    
    public void inserisciInTableStudentiIdonei(Object[] row) {
        inserisciRigaInJTable(tableStudentiIdonei, row);
    }
    
    public void setNumeroMassimoPresenze(int numeroMassimo) {
        labelMassimo.setText("Numero massimo studenti presenti: " + numeroMassimo);
    }
    
    public void setNumeroMedioPresenze(float numeroMedio) {
        labelMedia.setText("Numero medio studenti presenti: " + numeroMedio);
    }
    
    public void setNumeroMinimoPresenze(int numeroMinimo) {
        labelMinimo.setText("Numero minimo studenti presenti: " + numeroMinimo);
    }
    
    public void setPercentualeRiempimento(float percentualeRiempimento) {
        labelPercentualeRiempimento.setText("Percentuale riempimento media: " + percentualeRiempimento + "%");
    }   
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonIndietro;
    private javax.swing.JLabel labelCorsoSelezionato;
    private javax.swing.JLabel labelMassimo;
    private javax.swing.JLabel labelMedia;
    private javax.swing.JLabel labelMinimo;
    private javax.swing.JLabel labelPercentualeRiempimento;
    private javax.swing.JLabel labelProspettoCorso;
    private javax.swing.JLabel labelStudentiIdonei;
    private javax.swing.JScrollPane scrollPaneTableCorsoSelezionato;
    private javax.swing.JScrollPane scrollPaneTableStudentiIdonei;
    private javax.swing.JTable tableCorsoSelezionato;
    private javax.swing.JTable tableStudentiIdonei;
    // End of variables declaration//GEN-END:variables

}
